package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ola","Ela", "Ola","Karol","Ela");
        Set<String> uniqulsNames = new HashSet<>();
        for(String name: names){
            uniqulsNames.add(name);
        }
        for(String name:uniqulsNames){
            System.out.println(name);;
        }
        System.out.println(uniqulsNames.contains("Ala"));
    }
}
