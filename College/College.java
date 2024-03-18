/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
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
