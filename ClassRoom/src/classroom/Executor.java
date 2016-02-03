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

    public static void main(String[] args) throws InsuffisientSpaceinClassroomException {

        Pupil pupil1 = new Pupil("John", Boolean.FALSE, 5);
        Pupil pupil2 = new Pupil("Rosa", Boolean.TRUE, 2);
        Pupil pupil3 = new Pupil("Monika", Boolean.TRUE, (float) 3.6);
        Pupil pupil4 = new Pupil("Rachel", Boolean.TRUE, 4);
        Pupil pupil5 = new Pupil("Joye", Boolean.FALSE, 4);
        Pupil pupil6 = new Pupil("Chendler", Boolean.FALSE, (float) 4.1);
        Pupil pupil7 = new Pupil("Ross", Boolean.FALSE, 4);
        Pupil pupil8 = new Pupil("Kerry", Boolean.TRUE, (float) 4.7);

        ClassRoom cr = new ClassRoom();
        cr.classFullfiment(new Desk());
        cr.classFullfiment(new Desk(pupil4, pupil7));
        cr.addPupils(pupil8);
        cr.addPupils(pupil3);
        System.out.println(pupil6);
        System.out.println(cr);
        

    }
}
