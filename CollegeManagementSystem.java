class College{
    private String name;
    private int rollNo;
    private int marks;


    void setName( String name){
        this.name=name;
    }

    String getName(){
        return name;
    }
    void setRollNo(int rollNo){
        if(rollNo<0){
            System.out.println("Invalid roll number");
            return;
        }else  this.rollNo=rollNo;
       
    }
    int getRollNo(){
        return rollNo;
    }

    void setMarks( int marks){
        if(marks<0 || marks >100){
            System.out.println("plase enter the valid marks ");
            return;
        }else this.marks=marks;
    }

    int getMarks(){
        return marks;
    }
}

class CollegeManagementSystem{
    public static void main(String[] args) {
        College s1=new College();
        s1.setName("ujjwal");
         System.out.println(s1.getName());
         s1.setRollNo(2207190);
         System.out.println(s1.getRollNo());
         s1.setMarks(99);
         System.out.println(s1.getMarks());
    }
}