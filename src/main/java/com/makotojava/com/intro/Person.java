package com.makotojava.com.intro;

import java.util.Locale;
import java.util.logging.Logger;

/**
 * Created by aronwong on 8/3/17.
 */
public class Person {

    Logger l = Logger.getLogger(Person.class.getName());
    //    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;
    public Person() {
    }
    public Person(String firstName,String lastName, int age, int height, int weight, String eyeColor, String gender) {
//        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname() {
        return getFirstName().concat(" ").concat(getLastName());
    }

    @Override
    public String toString() {
        return "Person{" +
//             "name='" + name + '\'' +
                getFullname() +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

/*    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        int ret;
        if (gender.equals("MALE"))
            ret = height + 2;
        else {
            ret = height;
            Logger.getLogger("Person").info("Being honest about height...");
        }
        return ret;

/*        int ret = height;
        if (Locale.getDefault().equals(Locale.US))
            ret /= 2.54;
        return ret;*/
//        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
