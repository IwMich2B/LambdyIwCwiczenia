package pl.accenture;

import java.util.function.Predicate;

public class Person {
    private String name;
    private int age;
    private Gender sex;

    public Person(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person : " +
                "name " + name + '\'' +
                ", age " + age +
                ", sex " + sex;
    }

    static Predicate<Person> czyToAgnieszkaPredecate = p -> p.getName().equals("Agnieszka");
}
