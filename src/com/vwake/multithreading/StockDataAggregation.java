package com.vwake.multithreading;


import java.util.Random;
import java.util.concurrent.CompletableFuture;

/**
 *A financial application retrieves stock prices from three different
 * APIs and needs to compute the average stock price. If any API fails,
 * the system should return a default value for that source
 *
 */
public class StockDataAggregation {
    private static CompletableFuture<Double> fetchStockPrices(String api){
        return CompletableFuture.supplyAsync(()->{
            simulateDelay(new Random().nextInt(2000)+500);
            if (new Random().nextBoolean()){
                throw new RuntimeException("API fail to retrieve data");
            }
            double price = 100 + new Random().nextDouble()*10;
            return price;
        }).exceptionally(throwable -> {
            System.out.println("Exception occur while fetching data");
            return 100.0;
        });
    }

    private static void simulateDelay(int millie){
        try{
            Thread.sleep(millie);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CompletableFuture<Double> apiOne = fetchStockPrices("api1");
        CompletableFuture<Double> apiTwo = fetchStockPrices("api2");
        CompletableFuture<Double> apiThree = fetchStockPrices("api3");

        CompletableFuture<Double> result = apiOne.thenCombine(apiTwo, Double::sum)
                .thenCombine(apiThree,(sum,price)->(sum+price)/3);

        System.out.println("Avg result of all stock "+result.join());
    }
}
