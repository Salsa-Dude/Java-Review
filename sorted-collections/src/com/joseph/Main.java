package com.joseph;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);
    }
}
