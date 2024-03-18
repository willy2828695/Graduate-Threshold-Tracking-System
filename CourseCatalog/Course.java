
package CourseCatalog;

public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour

    public Course(String n, String numb, int cd) {
        name = n;
        number = numb;
        credits = cd;

    }

    public String getCOurseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    
}
    public String getCourseinfo(){
        return number + " - " + name + " - " + credits + " credits";
    }
    
}
