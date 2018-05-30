package collection;
 
import java.util.HashSet;
 
public class TestCollection {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
 
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
 
        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);
 
    }
}