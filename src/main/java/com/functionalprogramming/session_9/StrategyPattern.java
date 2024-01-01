package com.functionalprogramming.session_9;

import java.util.Arrays;
import java.util.List;

import static com.functionalprogramming.session_9.StockFilters.*;


public class StrategyPattern {

    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", 318.65, 10);
        Stock stock2 = new Stock("MSFT", 166.86, 45);
        Stock stock3 = new Stock("Google", 99, 12);
        Stock stock4 = new Stock("AMZ", 1866.74, 45);
        Stock stock5 = new Stock("GOOGL", 1480.20, 3);
        List<Stock> stocks = Arrays.asList(stock, stock2, stock3, stock4, stock5);

        bySymbol(stocks, "GOOGL").forEach(System.out::println);
        System.out.println ("-------------------");
        byPriceAbove(stocks, 100.0).forEach(System.out::println);
        System.out.println ("-------------------");

        filter(stocks, stock1 -> stock1.getPrice() > 100.0).forEach(System.out::println);
        System.out.println ("-------------------");
        filter (stocks, stock1 -> stock1.getSymbol ().equals ("GOOGL")).forEach (System.out::println);

    }

}
