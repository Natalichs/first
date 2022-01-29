import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"fb","ggg","ttt","ggg","ttt","yyy","tttt","fb","ggg","ttt"};
        System.out.println(repeat(arr));

        Phonebook book = new Phonebook();
        book.add("Liza",89998524565l);
        book.add("Liza",82228524565l);
        book.add("Vlad",85998524565l);
        book.add("Kate",80003338877l);
        book.add("Liza",89998524565l);
        book.add("Anatoliy",85468524565l);
        book.add("Anatoliy",89998524565l);
        book.getNumber("Liza");
        System.out.println(book);

    }

    //метод выводящий мапу с подсчетом повторений
    public static Map<String,Integer> repeat(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for(String s:arr){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        return map;
    }
}
