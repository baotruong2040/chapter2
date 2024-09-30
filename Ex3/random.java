package Ex3;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. nextInt()
        int randomInt = random.nextInt();
        System.out.println("Random int: " + randomInt);

        // 2. nextInt(int bound)
        int randomIntBound = random.nextInt(100);
        System.out.println("Random int with bound 100: " + randomIntBound);

        // 3. nextDouble()
        double randomDouble = random.nextDouble();
        System.out.println("Random double: " + randomDouble);

        // 4. nextFloat()
        float randomFloat = random.nextFloat();
        System.out.println("Random float: " + randomFloat);

        // 5. nextBoolean()
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);

        // 6. nextLong()
        long randomLong = random.nextLong();
        System.out.println("Random long: " + randomLong);

        // 7. nextBytes(byte[] bytes)
        byte[] randomBytes = new byte[10];
        random.nextBytes(randomBytes);
        System.out.print("Random bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 8. doubles()
        random.doubles().limit(5).forEach(d -> System.out.println("Random double stream: " + d));

        // 9. ints()
        random.ints().limit(5).forEach(i -> System.out.println("Random int stream: " + i));

        // 10. longs()
        random.longs().limit(5).forEach(l -> System.out.println("Random long stream: " + l));
    }
}
