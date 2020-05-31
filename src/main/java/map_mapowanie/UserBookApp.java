package map_mapowanie;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class UserBookApp {
    public static void main(String[] args) {
        //komparator decyduje o unikalności kluczy
        //najpierw wybieramy klucze najkrótsze, a jeśli są tej samej długości
        //to decyduje kolejność alfabetyczna
        //komparator zdefiniowany jako obiekt klasy anonimowej

        Map<String, User> users = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.length() < t1.length()) {
                    return -1;
                }
                if (s.length() > t1.length()) {
                    return 1;
                }
                return s.compareTo(t1);
            }
        });
        users.put("Ala", new User("Ala", "ala@op.pl", LocalDate.of(200, 10, 10)));
        users.put("Robert", new User("Robert", "rob@wp.pl", LocalDate.of(1987, 05, 10)));
        users.put("Adam", new User("Adam", "adam@wp", LocalDate.of(2001, 03, 23)));
        for (Map.Entry<String, User> pair : users.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
