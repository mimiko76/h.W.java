import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new HashSet<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "1234567890");
        phoneBook.add("Петров", "9876543210");
        phoneBook.add("Сидоров", "5555555555");
        phoneBook.add("Иванов", "1111111111");
        
        System.out.println("Номера телефонов для фамилии Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов для фамилии Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов для фамилии Сидоров: " + phoneBook.get("Сидоров"));
    }
}
