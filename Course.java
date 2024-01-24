package School;

public class Course {

    // Declarations
    private String department;
    private String courseNum;
    private String creditHours;


    public Course (String department, String courseNum, String creditHours){
        this.department = department;
        this.courseNum = courseNum;
        this.creditHours = creditHours;
    }

    // Get
    public String getDepartment(){
        return department;
    }
    public String getCourseNum(){
        return courseNum;
    }
    public String getCreditHours(){
        return creditHours;
    }

    // Set
    public void setDepartment(String department){
        this.department = department;
    }
    public void setCourseNum(String courseNum){
        this.courseNum = courseNum;
    }
    public void setCreditHours(String creditHours){
        this.creditHours = creditHours;
    }

    public String toString() {
        return department + " " + courseNum + ": " + creditHours;
    }
}
