package map_mapowanie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HasMapDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, String> emails=new HashMap<>();
        emails.put("Ala","ala@sda.pl");
        emails.put("Ola","ola@op.pl");
        System.out.println("Wpisz nazwę użytkownika: ");
        String name =scanner.nextLine();
        System.out.println("Wpisz jego adres email:");
        String email = scanner.nextLine();
        emails.put(name, email);
        for(Map.Entry<String, String> pair: emails.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
