
package CourseSchedule;

import CourseCatalog.Course;
import Persona.Faculty.FacultyAssignment;
import Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist; // cretaing a list of available seats for the course
    FacultyAssignment facultyassignment;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
     
    public void AssignAsTeacher_courseoffer(FacultyProfile fp) {
        // public FacultyAssignment(FacultyProfile fp, CourseOffer co)
        facultyassignment = new FacultyAssignment(fp, this); // "this": course offer instance
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {
            // create a new seat instance and add it to the seatlist
            seatlist.add(new Seat(this, i));
        }
        // public Seat (CourseOffer co, int n) 
        // constructor for Seat, using "this" to link the seat to the course offer
    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public int countRemainingSeats() {
        int count = 0;
        for (Seat seat : seatlist) {
            // empty seat shows False, expression adding ! is True
            if (!seat.isOccupied()) {
                count++;
            }
        }
        return count;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    public Course getSubjectCourse(){
        return course;
    }
    public int getCreditHours(){
        return course.getCredits();
    }

    public int getRegisteredStudents() {
        int count = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                count++;
            }
        }
        return count;
    }

    public String getCourseofferinfo(){
        String info = "Course information:\n"+course.getCourseinfo()+"\n";
        info += "Professor:"+facultyassignment.getFacultyProfile()+"\n";
        info += "Number of students enrolled:"+getRegisteredStudents()+"\n";
        info += "Remain seats:"+countRemainingSeats()+"\n";
        return info;
    }

}
