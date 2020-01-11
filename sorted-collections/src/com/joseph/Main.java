package com.joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StockItem one = new StockItem("test1", 20.00);
        StockItem two = new StockItem("test2", 30.00);
        StockItem three = new StockItem("test1", 10.00);

        StockList list = new StockList();
        list.addStock(one);
        list.addStock(two);
        list.addStock(three);
    }
}
