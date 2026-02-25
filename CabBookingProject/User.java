package CabBookingProject;

class User {
    private String name;
    private long phoneNum;

    User(String name, long phoneNum) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("plaese enter the valid name");
        } else
            this.name = name;

        if (phoneNum < 1000000000 || phoneNum > 9999999999L)
            throw new IllegalArgumentException("please enter the 10 digit Number");
        else
            this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    void Display() {
        System.out.println(getName() + "  " + getPhoneNum());
    }
}


