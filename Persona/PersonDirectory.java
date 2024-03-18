
package Persona;

import java.util.ArrayList;


public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson(String id, String name) {

        Person p = new Person(id, name);
        personlist.add(p);
        return p;                                                                                                                                                        
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }
    
}
