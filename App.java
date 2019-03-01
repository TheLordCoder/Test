import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("banana");
        list.add("strawbery");
        
        for(String value: list) {
        	System.out.println(value);
        }
        
        Person person = new Person("John", 5);
        System.out.println(person.toString());
        
    }
}