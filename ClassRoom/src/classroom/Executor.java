package classroom;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ynahorna
 */
public class Executor {

    public static void main(String[] args) {
      
        ClassRoom cr = new ClassRoom();
           cr.printClassNumber();
           
        List<Desk> desks = new LinkedList<>();
        for (int i = 1; i < 6; i++){
            desks.add(new Desk());
        }
        
          Pupil pupil1 = new Pupil("John", Boolean.FALSE, 5);
          Pupil pupil2 = new Pupil("Rosa", Boolean.TRUE, 2);
          Pupil pupil3 = new Pupil("Monika", Boolean.TRUE, 3);
          Pupil pupil4 = new Pupil("Rachel", Boolean.TRUE, 4);
          Pupil pupil5 = new Pupil("Joye", Boolean.FALSE, 4);
          Pupil pupil6 = new Pupil("Chendler", Boolean.FALSE, 4);
          Pupil pupil7 = new Pupil("Ross", Boolean.FALSE, 4);
          Pupil pupil8 = new Pupil("Kerry", Boolean.TRUE, 5);
         
          
          
          
          
           
    }
}
