import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private String name;
    private Long number;
    private Map<String, HashSet<Long>> phoneBook = new HashMap<>();

    //добавление номера в телефонную книгу
    public void add(String name, Long number){
        if(phoneBook.containsKey(name))
            phoneBook.get(name).add(number);
        else{
            HashSet<Long> set = new HashSet<>();
            set.add(number);
            phoneBook.put(name, set);
        }

    }

    //получение и вывод номеров по имени
    public void getNumber(String name){
        if(phoneBook.containsKey(name)){
            System.out.println("номера для " + name + " : " + phoneBook.get(name));
        }
        else
            System.out.println( name + " нет в телефонной книге");

    }

    //переопределение метода вывод всей телефонной книги
    @Override
    public String toString() {
        return "Phonebook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
