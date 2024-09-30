package Ex6;

public class Company {
    private String name, address;
    private double income, benefit, cost;
    
    //method
    public Company(){

    }
    public Company(String name, String address, double income, double cost) {
        this.name = name;
        this.address = address;
        this.income = income;
        this.cost = cost;
    }
    //setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public double getBenefit() {
        return income - cost;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return "[Company name "+name+", Address "+address+", Benefit: "+getBenefit()+"]";
    }
}
