
package Department;

import CourseSchedule.CourseSchedule;
import java.lang.*;
import java.util.HashMap;

public class Calendar {
    
    HashMap<String, CourseSchedule> mastercatalog; 
    
    public Calendar(){
    mastercatalog = new HashMap<String, CourseSchedule>();    
    }
    
    public void addCourseSchedule(String semester, CourseSchedule cs){
        
        mastercatalog.put(semester, cs);
        
    }
    
    
    
}
