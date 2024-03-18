
package College;

import Department.Department;
import java.util.ArrayList;


public class College {
    ArrayList<Department> departments;
    String name;
    
    public College(String n){
        departments = new ArrayList();
        this.name=n;
    }
    
    public Department newDepartment(String n){
        Department newDepartment = new Department(n);
        departments.add(newDepartment);
        return newDepartment;
    }
}
