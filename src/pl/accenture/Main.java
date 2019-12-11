package pl.accenture;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Agnieszka",20,Gender.SEX_K),
                new Person("Wojtek",33,Gender.SEX_M),
                new Person("Kasia",21,Gender.SEX_K),
                new Person("Marek",13,Gender.SEX_M),
                new Person("Bartek",17,Gender.SEX_M),
                new Person("Ola",25,Gender.SEX_K));
        Person p1 = new Person("Agnieszka",20,Gender.SEX_K);
        Person p2 = new Person("Wojtek",33,Gender.SEX_M);
        Person p3 = new Person("Kasia",21,Gender.SEX_K);
        Person p4 = new Person("Marek",13,Gender.SEX_M);
        Person p5 = new Person("Bartek",17,Gender.SEX_M);
        Person p6 = new Person("Ola",25,Gender.SEX_K);


        //Chcę pobrac wszystkie kobiety
//        Predicate<Person> personPredicate = person -> person.getSex().equals(Gender.SEX_K);
//        System.out.println(personPredicate);
List<Person> pobieramWszystkieKobiety = personList.stream()
        .filter(p -> p.getSex().equals(Gender.SEX_K))
        .collect(Collectors.toList());
        System.out.println(pobieramWszystkieKobiety);
        // write your code here
        // chce pobrac imiona wszystkich mezczyzn
        List<String> imionawszystkichMezczyzn = personList.stream().filter(person -> person.getSex().equals(Gender.SEX_M)).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(imionawszystkichMezczyzn);
        List<String> osobyPelnolettnie = personList.stream().filter(person -> person.getAge()>18).map(person -> person.getName()).collect(Collectors.toList());

        System.out.println("Osoby które ukończyły 18 lat" + osobyPelnolettnie);

        List<String> pobieramImie2 = personList.stream().filter(Person.czyToAgnieszkaPredecate).map(person -> person.getName()).collect(Collectors.toList());
        System.out.println("Osoba pobrana: " + pobieramImie2);
        System.out.println("cwiczenia na mapach");
        Map<Integer,Person> personMap = Map.of(1,p1,2,p2,3,p3,4,p4,5,p5,6,p6);
        personMap.forEach((k,v)-> System.out.println("Klucz : " + k + "  Vartosc: " + v));
        System.out.println("Same wartosci");
        personMap.forEach((k,v)-> System.out.println("Klucze :" + k));
        personMap.forEach((k,v)-> System.out.println("Vartosci :" + v));
        }


}
