package Ex2;
import java.lang. StringBuffer;
public class stringb {
    public static void main(String[] args) {
        //method append(1)
        StringBuffer a = new StringBuffer("Hello");
        a.append(" java");
        System.out.println(a);
        //method insert(2)
        a.insert(3, "java");
        System.out.println(a);
        //method replace(3)
        a.replace(1, 3, "java");
        System.out.println(a);
        //method delete(4)
        a.delete(3, 4);
        System.out.println(a);
        //method reverse(5)
        a.reverse();
        System.out.println(a);
        //method length(6)
        System.out.println(a.length());
        //method charAt(7)
        System.out.println(a.charAt(5));
        //method subString(8)
        System.out.println(a.substring(2));
        System.out.println(a.substring(3, 4));
        //method capacity(9)
        System.out.println(a.capacity());
        //method toString(10)
        String h = a.toString();
        System.out.println(h);
        
    }
    
}