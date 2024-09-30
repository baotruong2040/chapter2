package Ex5;

public class Student {
   private String name, adress, id;
   private int age;
   private double marksOfMath, marksOfChemistry, marksOfPhysic;
    public Student(String ten, int age,String id, String adress) {
        this.name = ten;
        this.age = age;
        this.id = id;
        this.adress = adress;
    }
    public String getInfo() {

        return "["+id +"-" +name +"-"+age+"-"+ adress+"]";
    }
    public void setMarkMath(double mark) {
        marksOfMath = mark;
    }

    public void setMarkChemestry(double mark) {
        marksOfChemistry = mark;
    }
    public void setMarkPhysic(double mark) {
        marksOfPhysic = mark;
    }
    
    public double average() {
        return (marksOfChemistry+marksOfMath+marksOfPhysic)/3;
    }
    public void fullInfo() {
        System.out.println("ID: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: "+adress);
        System.out.println("Diem toan: "+marksOfMath);
        System.out.println("Diem hoa: "+marksOfChemistry);
        System.out.println("Diem li: "+marksOfPhysic);
        System.out.println("Trung binh: "+average());
    }
    
}
    

