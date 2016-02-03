package classroom;

import java.util.LinkedList;
import java.util.List;

/*
 *
 * @author ynahorna
 */
public class ClassRoom {

    private int roomId;
    static int roomCounter = 1;
    List<Desk> desks;

    public ClassRoom() {
        this.roomId = roomCounter++;
        desks = new LinkedList<>();
    }

    public List<Desk> getDesk(List<Desk> desks) {
        return desks;
    }

    public void printClassNumber() {
        System.out.println("**********************");
        System.out.printf("*  Class number #%1s   *\n", roomId);
        System.out.println("**********************");
    }

    public void classFullfiment(Desk d) {
        if (desks.size() < 9) {
            desks.add(d);
        }

    }

    public void addPupils(Pupil p) throws InsuffisientSpaceinClassroomException {
        boolean isSit = false;
        for (int i = 0; i < desks.size(); i++) {
            if (desks.get(i).getPupils().size() < 2) {
                desks.get(i).sitDownPupil(p);
                isSit = true;
                break;
            }
        }
        if (!isSit) {
            throw new InsuffisientSpaceinClassroomException("Error");
        }
    }

    @Override
    public String toString() {
        String a = "**********************\n"
                + "*  Class number #" + roomId + "   *\n"
                + "**********************\n";
        for (Desk result : desks) {
            a = a + result.toString();
        }
        return a;
    }

}
