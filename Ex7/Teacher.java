package Ex7;

public class Teacher extends Person {
    private String institutionName, courses;

   public Teacher() {

   }
    public Teacher(String name, int age, String address) {
     setName(name);
     setAddress(address);
     setAge(age);
   }
   public Teacher(String school, String courses) {
    institutionName = school;
    this.courses = courses;
   }
   //setter
    public String getInstitutionName() {
        return institutionName;
    }
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
    public String getCourses() {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }
    public String toString() {
        return "[Name: "+getName()+", Age: "+getAge()+", Address: "+getAddress()+"]" +"\n"+"[School: "+ getInstitutionName() + ", Course: "+getCourses()+"]";
    }

}
