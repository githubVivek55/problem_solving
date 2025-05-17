package com.vwake.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessing {
    public static void main(String[] args) {
        parallelRun();
        sequentialRun();
    }

    private static void parallelRun() {
        CompletableFuture<Void> orderValidation = CompletableFuture.runAsync(() -> {
            simulateDelay(1000);
            System.out.println("Order Validated");
        });
        CompletableFuture<Void> paymentProcessing = CompletableFuture.runAsync(() -> {
            simulateDelay(2000);
            System.out.println("payment processing");
        });
        CompletableFuture<Void> inventoryUpdate = CompletableFuture.runAsync(() -> {
            simulateDelay(3000);
            System.out.println("Inventory Update");
        });
        CompletableFuture<Void> confirmationEmail = CompletableFuture.runAsync(() -> {
            simulateDelay(4000);
            System.out.println("Confirmation Email");
        });

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(orderValidation, paymentProcessing, inventoryUpdate, confirmationEmail);

        allTasks.join();

        System.out.println("Parallel Order successfully processed");
    }

    private static void sequentialRun() {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> orderValidation = CompletableFuture.runAsync(() -> {
                    simulateDelay(1000);
                    System.out.println("Order Validated");
                }, executorService)
                .thenRunAsync(() -> {
                    simulateDelay(2000);
                    System.out.println("payment processing");
                }, executorService)
                .thenRunAsync(() -> {
                    simulateDelay(3000);
                    System.out.println("Inventory Update");
                }, executorService)
                .thenRunAsync(() -> {
                    simulateDelay(4000);
                    System.out.println("Confirmation Email");
                }, executorService);

        orderValidation.join();
        System.out.println("Sequential order processed");
        executorService.shutdown();
    }

    private static void simulateDelay(int millie) {
        try {
            Thread.sleep(millie);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
