package com.company.BContest20;

import java.util.HashMap;
import java.util.Map;

public class Cashier {
    int counter;
    int n;
    int discount;
    int[] products;
    int[] prices;
    Map<Integer, Integer> productPriceMap;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.counter = 0;
        this.n = n;
        this.discount = discount;
        this.products = products;
        this.prices = prices;
        productPriceMap = new HashMap<>();

        for (int i = 0; i < products.length; i++) {
            int product = products[i];
            productPriceMap.put(product, prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        counter++;
        double bill = 0;
        for (int productNumber = 0; productNumber < product.length; productNumber++) {
            bill += amount[productNumber] * this.productPriceMap.get(product[productNumber]);
        }
        if(counter == n) {
            bill = bill - (discount * bill) / 100;
            counter = 0;
        }
        return bill;
    }

}
