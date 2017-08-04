package com.makotojava.com.intro;


import com.makotojava.com.intro.mapper.PersonMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by aronwong on 8/3/17.
 */
public class PersonTest extends PersistenceUnitTestConfig{
    @Test
    public void testPerson() {
        Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE"); //使用参数的方法调用
        Logger l = Logger.getLogger(Person.class.getName()); //静态方法调用
        l.info("Name: " + p.getFullname());
        l.info("Age:" + p.getAge());
        l.info("Height (cm):" + p.getHeight());
        l.info("Weight (kg):" + p.getWeight());
        l.info("Eye Color:" + p.getEyeColor());
        l.info("Gender:" + p.getGender());
        Assert.assertEquals("Joe Q Author", p.getFullname());
        Assert.assertEquals(42, p.getAge());
        Assert.assertEquals(175, p.getHeight());
        Assert.assertEquals(82, p.getWeight());
        Assert.assertEquals("Brown", p.getEyeColor());
        Assert.assertEquals("MALE", p.getGender());
    }

    @Test
    public void testToString() {
        Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE");

        Logger l = Logger.getLogger(PersonTest.class.getName());

        l.info("toString(): " + p.toString());

        Assert.assertEquals("Joe Q Author", p.getFullname());
    }

    @Autowired
    private PersonMapper personMapper;
    @Test
    public void testInsertPerson() {
        Person p = new Person("Joe Q", "Author", 42, 173, 82, "Brown", "MALE"); //使用参数的方法调用
        personMapper.insertPerson(p);
    }

    @Test
    public void deletePerson() {
        Map p = new HashMap();
        p.put("age",42);
        personMapper.deletePerson(p);
    }


}