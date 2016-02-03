package classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ynahorna
 */
public class Desk {

    private final int deskNumber;
    private static int counter = 1;
    private Set<Pupil> pupils;

    public Desk() {
        this.deskNumber = counter++;
        pupils = new TreeSet<>();
    }

    public Desk(Pupil p1, Pupil p2) {
        this();
        pupils.add(p1);
        pupils.add(p2);
    }

    public Set<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(Set<Pupil> pupils) {
        if (pupils.size() <= 2) {
            this.pupils = pupils;
        }
    }

    public void printDesk() {
        String pupil1 = "empty", pupil2 = "empty";

        System.out.println("------" + "Desk #" + deskNumber + " ---------");
        System.out.printf("|   %7s %7s   |\n", pupil1, pupil2);
        System.out.println("-----------------------\n");
    }

    @Override
    public String toString() {

        List<Pupil> p = new ArrayList<>(pupils);
        String pupNam = "empty";
        String pupNam2 = "empty";

        if (p.size() > 0 && p.get(0) != null) {
            pupNam = p.get(0).getName();
        }
        if (p.size() > 1 && p.get(1) != null) {
            pupNam2 = p.get(1).getName();
        }

        return String.format("------" + "Desk #%1d ---------\n|   %7s %7s   |\n-----------------------\n", deskNumber, pupNam, pupNam2);

    }

    public void sitDownPupil(Pupil p) {
        if (pupils.size() >= 0 && pupils.size() < 2) {
            pupils.add(p);
        }
    }

}
