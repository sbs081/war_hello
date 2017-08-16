package com.makotojava.com.intro;

import java.util.Locale;
import java.util.logging.Logger;

/**
 * Created by aronwong on 8/3/17.
 */
public class Person {
    public static final String GENDER_MALE = "MALE";
    public static final String GENDER_FEMALE = "FEMALE";
    Logger l = Logger.getLogger(Person.class.getName());
    //    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;
    public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
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

    public static void main(String[] args) {
        Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", GENDER_MALE);
        Person q = new Person("Elsa Q", 42, 173, 82, "Marry", GENDER_FEMALE);
        // . . .
    }

    public void printAudit(StringBuilder buffer) {
        buffer.append("Name=");
        buffer.append(getFullname());
        buffer.append(",");
        buffer.append("Age=");
        buffer.append(getAge());
        buffer.append(",");
        buffer.append("Height=");
        buffer.append(getHeight());
        buffer.append(",");
        buffer.append("Weight=");
        buffer.append(getWeight());
        buffer.append(",");
        buffer.append("EyeColor=");
        buffer.append(getEyeColor());
        buffer.append(",");
        buffer.append("Gender=");
        buffer.append(getGender());
    }

    public void printAudit(Logger l) {
        StringBuilder sb = new StringBuilder();
        printAudit(sb);
        l.info(sb.toString());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (weight != person.weight) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        if (!eyeColor.equals(person.eyeColor)) return false;
        return gender.equals(person.gender);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        result = 31 * result + eyeColor.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }
}
