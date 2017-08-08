package com.makotojava.com.intro;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-storage-hive.xml"})
public class PersistenceUnitTestConfig {

    public Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
