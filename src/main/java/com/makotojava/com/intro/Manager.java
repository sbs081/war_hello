package com.makotojava.com.intro;

import java.math.BigDecimal;

/**
 * Created by aronwong on 8/16/17.
 */
public class Manager extends Employee {
    public Manager(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
        super(firstName, lastName, age, height, weight, eyeColor, gender);
    }

    public void processStockOptions(int numberOfOptions, BigDecimal price) {
        logger.info("I can't believe I got " + price + " options at $" +
                price.toPlainString() + "!");
    }


    @Override
    public float getManagerPrice() {
        return this.getPrice() + 300;
    }
}
