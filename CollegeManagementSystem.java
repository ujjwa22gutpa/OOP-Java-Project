class College {
    private String name;
    private int rollNo;
    private int marks;

    College(String name, int rollNo, int marks) {
        if(name == " ") return;
       else  this.name = name;

       if(rollNo<0) return;
       else  this.rollNo = rollNo;
       if(marks<0 || marks>100) return;
       else this.marks = marks;
    }

    // void setName( String name){
    // this.name=name;
    // }
    // String getName() {
    //     return name;
    // }
    // void setRollNo(int rollNo){
    // if(rollNo<0){
    // System.out.println("Invalid roll number");
    // return;
    // }else this.rollNo=rollNo;

    // }
    // int getRollNo() {
    //     return rollNo;
    // }

    // void setMarks( int marks){
    // if(marks<0 || marks >100){
    // System.out.println("plase enter the valid marks ");
    // return;
    // }else this.marks=marks;
    // }
    // int getMarks() {
    //     return marks;
    // }
    // int [] getEverything (){
    // return new int[] {name,};
    // }

    void display(){
        System.out.println(name+"  "+rollNo+" "+marks);
    }
}

class CollegeManagementSystem {
    public static void main(String[] args) {
        // College s1=new College();
        // s1.setName("ujjwal");
        // System.out.println(s1.getName());
        // s1.setRollNo(2207190);
        // System.out.println(s1.getRollNo());
        // s1.setMarks(99);
        // System.out.println(s1.getMarks());

        College s1 = new College("ujjwal", 2207100, 99);
        College s2 = new College("Krishna", 14466456, 98);
        // System.out.println(s1.getMarks() + "  " + s1.getName() + "   " + s1.getRollNo());
        // System.out.println(s2.getMarks() + "  " + s2.getName() + "   " + s2.getRollNo());

        s1.display();
        s2.display();

    }
}