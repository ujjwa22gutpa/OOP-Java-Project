package JavaProjects;
import java.util.Scanner;

class College {
    private String name;
    private int rollNo;
    private int marks;

    College(String name, int rollNo, int marks) {
        if (name == null || name.trim().isEmpty())
            System.out.println("do not enter the empty string");
        else
            this.name = name;

        if (rollNo < 0)
            System.out.println("please enter the correct rollNo");
        else
            this.rollNo = rollNo;

        if (marks < 0 || marks > 100)
            System.out.println("please enter the valid marks");
        else
            this.marks = marks;
    }

    void setName(String name) {
        if (name == null || name.trim().isEmpty())
            System.out.println("do not enter the empty string");
        else
            this.name = name;
    }

    void setRoll(int rollNo) {
        if (rollNo < 0)
            System.out.println("please enter the correct rollNo");
        else
            this.rollNo = rollNo;
    }

    void setMarks(int marks) {
        if (marks < 0 || marks > 100)
            System.out.println("please enter the valid marks");
        else
            this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    int getMarks() {
        return marks;
    }

    void display() {
        System.out.println(name + "  " + rollNo + " " + marks);
    }
}

class CollegeManagementSystemEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College[] students = new College[3];
        // Inserting the data of students

        for (int i = 0; i < students.length; i++) {
            System.out.println("enter the name, rollNo and marks");
            String name = sc.nextLine();
            int rollNo = sc.nextInt();
            int marks = sc.nextInt();
            sc.nextLine();
            students[i] = new College(name, rollNo, marks);
        }

        // Printing the data of students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Data of Student" + i);
            students[i].display();
        }
        // Searching the data of students
        System.out.println("enter the roll number to search");
        Boolean findRollNo = false;
        int SearchRollNo = sc.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getRollNo() == SearchRollNo) {
                students[i].display();
                findRollNo = true;
                break;
            }
        }
        if (!findRollNo)
            System.out.println("rollNo did'nt find");

        // Updating the values
        System.out.println("enter the roll no you want to update");
        Boolean UpdateRollNo = false;
        int UpdateRoll = sc.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (UpdateRoll == students[i].getRollNo()) {
                students[i].setName("updated");
                students[i].display();
                UpdateRollNo = true;
                break;
            }
        }
        if (!UpdateRollNo)
            System.out.println("updated rollNo is not found");

        // Deleting the values
        System.out.println("Enter the student roll no you want to delete");
        int deleteRollNo = sc.nextInt();
        Boolean deleteRoll = false;
        for (int i = 0; i < students.length; i++) {
            if (deleteRollNo == students[i].getRollNo()) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                deleteRoll = true;
                break;
            }
        }
        if (deleteRoll)
            System.out.println("Student has been deleted");
        else
            System.out.println("Student has not been deleted");

    }

}