package classroom;

/*
 *
 * @author ynahorna
 */

public class Pupil {
    
    String name;
    Boolean isAgirl;
    float averageMark;
 
    public String getName(){
        return name;
    }
  
    public void setName(String name){
        this.name = name;
    }
    
    public Boolean getGender(){
        return isAgirl;
    }
    
    public void setGender(Boolean isAgirl){
        this.isAgirl = isAgirl;
    }
    
    public float getAverageMark(){
        return averageMark;
    }
    
    public void setAverageMark(float averageMark){
        this.averageMark = averageMark;
    }
    
}
