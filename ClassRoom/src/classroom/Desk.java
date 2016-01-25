    
    /*
     1. add getters and setters 
     2. add constructor
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
    
    
    static int number = 1;
    Set<Pupil> pupils;

    public Set<Pupil> getPupils(){
        return pupils;
    }
    
    

    public void printDesk() {
        String pupil1 = "empty";
        String pupil2 = "empty";
        
        System.out.println("------" + "Desk #"+ number + " ---------");
        System.out.printf("|   %6s %7s    |\n", pupil1, pupil2);
        System.out.println("-----------------------\n");
    }

}
