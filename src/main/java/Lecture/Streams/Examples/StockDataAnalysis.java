package Lecture.Streams.Examples;

import java.util.*;
import java.util.stream.Collectors;


public class StockDataAnalysis {
    public static void main(String[] args) {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("Apple", 123.45, 2000000000000L));
        stocks.add(new Stock("Microsoft", 78.90, 1500000000000L));
        stocks.add(new Stock("Amazon", 3456.78, 2500000000000L));
        stocks.add(new Stock("Google", 2100.00, 1800000000000L));

        long minMarketCap = 2000000000000L;

        List<String> highValueCompanies = stocks.stream()
                .filter(stock -> stock.getMarketCap() > minMarketCap)
                .map(Stock::getCompanyName)
                .collect(Collectors.toList());

        System.out.println("Companies with market cap greater than " + minMarketCap + ": " + highValueCompanies);
    }
}

class Stock {
    private String companyName;
    private double stockPrice;
    private long marketCap;

    public Stock(String companyName, double stockPrice, long marketCap) {
        this.companyName = companyName;
        this.stockPrice = stockPrice;
        this.marketCap = marketCap;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public long getMarketCap() {
        return marketCap;
    }
}
