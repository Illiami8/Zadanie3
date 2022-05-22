package Zadanie;

import Person.Person;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person1 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person3 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person4 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person5 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person6 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person7 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person8 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person9 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));
        Person person10 = new Person(RandomStringUtils.random(8, true, false), RandomUtils.nextInt(1000, 2000));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        print(persons);


    }

    public static int summa(List<Person> persons) {
//        int sum = 0;
//        for (Person person : persons) {
//            sum += person.getSalary();
//        }
//        return sum;
       return persons. stream()

                .mapToInt(person -> person.getSalary())
                .sum();

    }

    public static void print(ArrayList list) {
        System.out.println(list);
    }
}

