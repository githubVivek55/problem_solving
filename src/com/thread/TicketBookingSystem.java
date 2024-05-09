package com.thread;

public class TicketBookingSystem {
    private int availableTicket = 3;

    public synchronized void bookTickets(int numOfTicket) {
        if (numOfTicket <= availableTicket) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableTicket -= numOfTicket;
            System.out.println(Thread.currentThread().getName() + " booked " + numOfTicket + " tickets");
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't book ticket");
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                ticketBookingSystem.bookTickets(2);
            }
        };

        Thread thread1 = new Thread(task, "Customer1");
        Thread thread2 = new Thread(task, "Customer2");

        thread1.start();
        thread2.start();

    }
}
