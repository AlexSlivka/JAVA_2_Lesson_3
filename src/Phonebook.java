import java.util.*;


public class Phonebook {
    static Map<String, TreeSet<Integer>> mapPhone = new HashMap<>();


    public static void add(String name, Integer phone) {
        TreeSet<Integer> phones = mapPhone.get(name);
        if (phones == null){
            phones = new TreeSet<>();
            phones.add(phone);
            mapPhone.put(name, phones);
        } else {
            phones.add(phone);
        }

    }

    public static TreeSet<Integer> get(String name){
        TreeSet<Integer> phoneNumbers = mapPhone.get(name);
        if (phoneNumbers == null){
            System.out.println("Нет такой записи в телефонной книге!");
        } else {
            System.out.println("Телефоны: " + phoneNumbers);}
        return phoneNumbers;
    }

    public static void main(String[] args) {
        Phonebook.add("Alex", 576988);
        Phonebook.add("Alex", 576587988);
        Phonebook.add("John", 587988);
        Phonebook.add("Jo", 58977988);
        System.out.println(mapPhone);
        Phonebook.get("Alex");

    }

}
