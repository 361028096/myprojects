package com.run.practice.suggest151.part1;

import java.text.NumberFormat;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class Client {
    // 简单折扣计算
    public void calPrice(int price,int discount) {
        float knockdownPrice = price * discount / 100.0F;
        System.out.println("简单折扣后的价格是：" + formateCurrency(knockdownPrice));
    }

    // 负责多折扣计算
    public void calPrice(int price, int... discounts) {
        float knockdownPrice = price;
        for (int discount : discounts) {
            knockdownPrice = knockdownPrice * discount / 100;
        }
        System.out.println("复杂折扣后的价格是：" + formateCurrency(knockdownPrice));
    }

    // 格式化成本的货币形式
    private String formateCurrency(float price) {
        return NumberFormat.getCurrencyInstance().format(price/100);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.calPrice(49900,75);
        client.calPrice(49900,75,0);
    }

}
