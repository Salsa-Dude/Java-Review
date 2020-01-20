package com.joseph;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        // LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
        // HashMap provided the advantage of quick insertion, search and deletion
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item in list
            StockItem inStock = list.get(item.getName());
            System.out.println(inStock);

            // if there is already a stock key available in list, adjust the quantity
            if(inStock != null) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }

        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }

        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List \n";
        double totalCost = 0.0;

        // The Map.Entry interface enables you to work with a map entry.
        // The entrySet( ) method declared by the Map interface returns a Set containing the map entries.
        // Each of these set elements is a Map.Entry object.
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            // getValue() - Returns the value corresponding to this entry.
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items:";
            s = s + String.format("%.2f", itemValue) + "\n";

            totalCost += itemValue;

        }

        return s + " Total stock value " + totalCost;
    }
}
