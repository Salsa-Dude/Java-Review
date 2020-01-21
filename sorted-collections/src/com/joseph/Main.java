package com.joseph;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.75, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        // keySet - The method returns a set having the keys of the hash map.

        for(String s : stockList.items().keySet()) {
            System.out.println(s);
        }

        Basket josephBasket = new Basket("Joseph");
        sellItem(josephBasket, "car", 1);
        System.out.println(josephBasket);

        sellItem(josephBasket, "car", 1);
        System.out.println(josephBasket);

        sellItem(josephBasket, "car", 1);
        sellItem(josephBasket, "snapper", 5);
        System.out.println(josephBasket);

        sellItem(josephBasket, "juice", 4);
        sellItem(josephBasket, "cup", 12);
        sellItem(josephBasket, "bread", 1);
        System.out.println(josephBasket);

        System.out.println(stockList);



    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);

        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }
}
