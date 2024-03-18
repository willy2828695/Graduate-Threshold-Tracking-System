
package Department;

import CourseSchedule.CourseSchedule;


public class DepartmentAccount {
  Department department;
    public DepartmentAccount(Department d){
        department = d;
    }
        
    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = department.getCourseSchedule(semester);

        return css.calculateTotalRevenues();

    }
}
