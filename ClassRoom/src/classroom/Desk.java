/*
 + 1. add getters and setters 
 + 2. add constructor
 3. add cheking if there is proper number of students t the desk
 4. toStrign with students
    
 */
package classroom;

import java.util.Set;

/**
 *
 * @author ynahorna
 */
public class Desk {

    private final int deskNumber;
    private static int counter = 1; 
    private Set<Pupil> pupils;

    
    public Desk(){
        this.deskNumber = counter++;
        printDesk();
    }
    
    
    public Set<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(Set<Pupil> pupils) {
        if(pupils.size() <= 2){
        this.pupils = pupils;
        }
    }
    
    
    public void printDesk() {
        String pupil1 = "empty", pupil2 = "empty";
        

        System.out.println("------" + "Desk #" + deskNumber + " ---------");
        System.out.printf("|   %7s %7s   |\n", pupil1, pupil2);
        System.out.println("-----------------------\n");
    }
   
     //add Pupil with validation
   
    public void sitDownPupil(Pupil p){
         if(pupils.size() >= 0 && pupils.size() < 2){
             pupils.add(p);
         }
    }

}











