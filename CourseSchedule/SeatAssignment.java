
package CourseSchedule;

import CourseCatalog.Course;

public class SeatAssignment {
    float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    Seat seat;
    boolean like; //true means like and false means not like
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike(){
        return like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    public Seat getSeat(){
        return seat;
    }
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }

    
    // assign a grade 
    public void assignGrade(float grade) {
            this.grade = grade;
    }
    
    
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }
    
    
    
}
