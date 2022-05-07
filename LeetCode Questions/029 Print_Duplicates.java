// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String str = "geeksforgeeks";
        Map<Character,  Integer> mp = new HashMap<Character, Integer>();
        char[] ck=str.toCharArray();
        for(char x: ck) {
            Character y = Character.valueOf(x);
            mp.put(y, mp.getOrDefault(y,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : mp.entrySet())
            System.out.println(entry.getKey()+"="+entry.getValue());
    }
}
