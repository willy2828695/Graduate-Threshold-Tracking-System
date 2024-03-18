/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment; //links back to studentprofile
    CourseOffer courseoffer; // links to the specipic course in the semester
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    // SeatAssignment indicates the return type of the method
    // return an instance of SeatAssignment
    public SeatAssignment newSeatAssignment(CourseLoad cl){
        
    //     public SeatAssignment(CourseLoad cl, Seat s){
    //     seat = s;
    //     courseload = cl;
    // } // this is the constructor for SeatAssignment
        seatassignment = new SeatAssignment(cl, this); 
        // create a new seat assignment and link it to the seat by "this", which is the current seat instance
        occupied = true;   
        return seatassignment;
    }

    
    public CourseOffer getCourseOffer(){
        return courseoffer;
    }
    public int getCourseCredits(){
        return courseoffer.getCreditHours();
    }
}
