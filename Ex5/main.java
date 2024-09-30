package Ex5;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Truong", 18, "24ITE114", "Hue");
        System.out.println(student1.getInfo());

        student1.setMarkMath(5.0);
        student1.setMarkChemestry(10.0);
        student1.setMarkPhysic(7);
        System.out.println(student1.average());
        student1.fullInfo();

        
    }
}