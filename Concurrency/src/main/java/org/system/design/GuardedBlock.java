package org.system.design;

import java.util.Random;

public class GuardedBlock {

    private static class Event {
        String message;
        boolean empty = true;

        public synchronized String consumeMessage() {
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException ex) {

                }
            }

            empty = true;
            notifyAll();
            return this.message;
        }

        public synchronized void addMessage(String message) {
            while (!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }

            empty = false;
            this.message = message;
            notifyAll();
        }
    }

    private static class Producer implements Runnable {
        private Event event;

        public Producer(Event event) {
            this.event = event;
        }

        @Override
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            Random random = new Random();

            for (int i = 0; i < importantInfo.length; i++) {
                event.addMessage(importantInfo[i]);
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException e) {

                }
            }
            event.addMessage("DONE");
        }
    }

    private static class Consumer implements Runnable {
        private Event event;

        public Consumer(Event event) {
            this.event = event;
        }

        @Override
        public void run() {
            Random random = new Random();
            for (String message = event.consumeMessage(); !message.equals("DONE"); message = event.consumeMessage()) {
                System.out.format("MESSAGE RECEIVED: %s%n", message);
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        Event event = new Event();
        (new Thread(new Producer(event))).start();
        (new Thread(new Consumer(event))).start();
    }
}
