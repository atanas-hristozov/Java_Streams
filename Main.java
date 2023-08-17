import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Atanas", 110));
        people.add(new Person("Ivan", 70));
        people.add(new Person("Georgi", 230));
        people.add(new Person("Tedi", 150));
        people.add(new Person("Petar", 16));
        people.add(new Person("Dragan", 60));
        people.add(new Person("Kiro", 130));
        people.add(new Person("Veselina", 10));

        List<Person> hundredBillions = people.stream().filter(person -> person.billions > 100).collect(Collectors.toList());
        hundredBillions.forEach(person -> System.out.println(person.name));
        System.out.println("************");

        List<Person> sortAlphabetically = people.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
        sortAlphabetically.forEach(person -> System.out.println(person.name));
        System.out.println("************");

        List<Person> hundredBillionsSorted = people.stream().filter(person -> person.billions > 100)
                .sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
        hundredBillionsSorted.forEach(person -> System.out.println(person.name));
        System.out.println("************");
    }
    static class Person{
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }
}