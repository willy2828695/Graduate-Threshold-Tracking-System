
package Persona;

public class Person {
    
    String id;
    String name;
    public Person (String id, String name){
        
        this.id = id;
        this.name = name;
    }
    public String getPersonId(){
        return id;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }

    public String personinfo(){
        return name + " - " + "ID:"+id;
    }
    
}
