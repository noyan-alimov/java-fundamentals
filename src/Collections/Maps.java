package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();
        Person mike = new Person("mike@mail.com", "Mike");
        Person john = new Person("john@mail.com", "John");
        Person sally = new Person("sally@mail.com", "Sally");
        Person maria = new Person("maria@mail.com", "Maria");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(mike);
        people.add(john);
        people.add(sally);
        people.add(maria);

        for (Person person : people) {
            mapOfPeople.put(person.getEmail(), person);
        }

        for (String email : mapOfPeople.keySet()) {
            System.out.println(email);
        }

        for (Person person : mapOfPeople.values()) {
            System.out.println(person);
        }

        System.out.println(mapOfPeople.get("john@mail.com"));
        System.out.println(mapOfPeople.containsKey("maria@mail.com"));
    }
}
