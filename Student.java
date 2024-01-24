package School;

public class Student {
    static int nextID = 1000000;
    private String name;
    private int id;

    // Constructors
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Student(String name) {
        this.name = name;
        this.id = nextID;
        nextID += 1;
    }

    // Get
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    // Set
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    // Methods
    public boolean precedesByID(Student student2){
        return id < student2.getID();
    }

    // String
    public String toString(){
        return "Name: " + name + "\nID: " + id;
    }
}
