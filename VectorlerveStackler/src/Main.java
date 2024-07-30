
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        
        /* ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        } */
        
         /* Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("İlk element : " + vector.firstElement());
        System.out.println("Son element : " + vector.lastElement());
        */
         
         Stack<String> stack = new Stack<String>();
         
         stack.push("Java");
         stack.push("Python");
         stack.push("Python");
         stack.push("Php");
         /*for (String s : stack) {
             System.out.println(s);
        } */
         
         //System.out.println(stack.peek()); //son eleman
         System.out.println(stack.empty()); // stack bos mu kontrolü
         
         ListIterator<String> iterator = stack.listIterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
        }
    }
}
