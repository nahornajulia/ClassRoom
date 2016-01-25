  /*
    1. Think about how it can be done. 
    + 2. Create ClassRoom Class
    + 3. Create Desk class. Classroom Should contain desks
      3.1     
    + 4. Create Pupil class. Desk should contain pupils. Pupil should have a name
    + 5. Create pretty printing of Desk
    -------------------------
    |                       |
    |                       |
    -------------------------
    /pupil1/       /empty/
    
    
    */
package classroom;

import java.util.List;

/*
 *
 * @author ynahorna
 */
public class ClassRoom {

    private int roomId;
    static int roomCounter = 1;
    List<Desk> desks;
    
    public ClassRoom(){
        this.roomId = roomCounter++;
    }
   
    
    public List<Desk> getDesk(List<Desk> desks){
        return desks;
    }
    
    public void printClassNumber(){
        System.out.println("**********************");
         System.out.printf("*  Class number #%1s   *\n", roomId);
      System.out.println("**********************");
    }
    
    
    public void classFullfiment(Desk d){
         if(desks.size() >= 0 && desks.size() < 9){
             desks.add(d);
         }
         
    }
    
    public void addPupils(Pupil p){
        for(int i = 1; i < desks.size(); i++){
            if(desks.size() < 2){
                desks.get(i).sitDownPupil(p);
            } else {
               throw InsuffisientSpaceinClassroomException();
            }
        }
    }
}

//Add boolean flag
//add break
//throw exeception
//make Exector print empty class, and add pupils - print,  and so on