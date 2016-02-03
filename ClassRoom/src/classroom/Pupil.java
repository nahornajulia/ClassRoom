package classroom;

import java.util.Objects;

/*
 *
 * @author ynahorna
 */
public class Pupil implements Comparable<Pupil> {

    private String name;
    private Boolean isAgirl;
    private float averageMark;

    public Pupil(String name, Boolean isAgirl, float averageMark) {
        this.name = name;
        this.isAgirl = isAgirl;
        this.averageMark = averageMark;
    }

    public Pupil(String name, float averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        String gender = " - ";
        if (isAgirl == true) {
            gender = gender + "girl.";
        } else {
            gender = gender + "boy.";
        }
        return String.format("Pupil's name: " + name + gender + " Average mark: " + averageMark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return isAgirl;
    }

    public void setGender(Boolean isAgirl) {
        this.isAgirl = isAgirl;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Pupil o) {
        return name.compareTo(o.getName());
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.isAgirl);
        hash = 73 * hash + Float.floatToIntBits(this.averageMark);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pupil other = (Pupil) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.isAgirl, other.isAgirl)) {
            return false;
        }
        if (Float.floatToIntBits(this.averageMark) != Float.floatToIntBits(other.averageMark)) {
            return false;
        }
        return true;
    }
}
