
class collgeStudents {
    private String name;
    private int age;
    private int marks;

    collgeStudents(String name, int age, int marks) {
        if (name == null || name.trim().isEmpty())
            // System.out.println();
            throw new IllegalArgumentException("please enter the valid name");
        else
            this.name = name;

        if (age < 0)
            throw new IllegalArgumentException("Enter the valid age");
        else
            this.age = age;

        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Enter the valid marks");
        else
            this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

class topperStudents extends collgeStudents {
    private int Rank;

    topperStudents(String name, int age, int marks, int Rank) {
        super(name, age, marks);
        if (Rank < 1 || Rank > 10)
            throw new IllegalArgumentException("Enter the valid Rank");
        else
            this.Rank = Rank;
    }

    public int getRank() {
        return Rank;
    }

    void displayTopper() {
        System.out.println(getName() + " " + getAge() + " " + getMarks() + " " + Rank);
    }
}

class sportsStudents extends topperStudents {
    private String sports;

    sportsStudents(String name, int age, int marks, String sports,int Rank) {
        super(name, age, marks,Rank);
        if (sports == null || sports.trim().isEmpty())
            throw new IllegalArgumentException("Enter the sports name");
        else
            this.sports = sports;
    }

    public String getSports() {
        return sports;
    }

    void displaySports() {
        System.out.println(getName() + " " + getAge() + " " + getMarks() + " " + sports);
    }
}

public class CollegeManagementInheritance {
    public static void main(String[] args) {

        try {
            sportsStudents s1 = new sportsStudents("Krishna", 24, 98, "cricket",1);
            s1.displaySports();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid Input: " + e.getMessage());
        }
    }
}
