package com.makotojava.com.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * Created by aronwong on 8/16/17.
 */
public class ManagerTest {

    public static final Logger logger = Logger.getLogger(Employee.class.getName());

    public static void calculateAndAwardStockOptions(StockOptionRecipient soe) {
        BigDecimal reallyCheapPrice = BigDecimal.valueOf(0.01);
        int numberOfOptions = 10000;
    }

    @Test
    public void testCalculateAndAwardStockOptions() {
        Manager manager = new Manager("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");
        StockOptionRecipient soe = manager;// perfectly valid
        manager.setPrice(1000);
        float managerPrice = soe.getManagerPrice();
        calculateAndAwardStockOptions(soe);
        calculateAndAwardStockOptions(new Manager("Joe Q", "Author", 42, 173, 82, "Brown", "MALE"));// works too
        logger.info("managerPrice" + managerPrice);
    }

    //匿名内部类
    public void testInterface() {
        StockOptionRecipient soe = new StockOptionRecipient() {
            @Override
            public float getManagerPrice() {
                return 0;
            }
        };
    }

    //内部类
    public class subClass {
    }

}