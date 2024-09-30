import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        try (Scanner k = new Scanner(System.in)) {
            String h = k.nextLine();
            boolean nextBoolean = k.nextBoolean();
            byte nextBytes = k.nextByte();
            double nextDouble = k.nextDouble();
            float nextFloat = k.nextFloat();
            int nextInt = k.nextInt();
            System.out.print("input String");
            
            long nextLong = k.nextLong();
            
            
            System.out.println("Long"+nextLong);
            System.out.println("Boolean"+nextBoolean);
            System.out.println("Bytes"+nextBytes);
            System.out.println("Double"+nextDouble);
            System.out.println("Float"+nextFloat);
            System.out.println("Int"+nextInt);
            System.out.println("String"+h);
        }
    }
}
