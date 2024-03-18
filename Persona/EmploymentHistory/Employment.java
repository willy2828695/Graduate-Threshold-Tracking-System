
package Persona.EmploymentHistory;

import CourseSchedule.CourseOffer;
import Employer.EmployerProfile;
import java.util.ArrayList;


public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int weight;
    String quality;
    String job;
    Employment nextemplyment;  //next job so they are in a sequence 
    
    EmployerProfile employer;
    public Employment(String j){
        
         relevantcourseoffers = new ArrayList();
        
    }

}
