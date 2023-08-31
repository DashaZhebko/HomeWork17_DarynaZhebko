public class User {
    private String name;
    private int day;
    private int month;
    private int year;
    private long phoneNumber;
    private String email;
    private String surname;
    private double weight;
    private int pressureUp;
    private int pressureDown;
    private int steps;
    public static final int B_YEAR = 2020;
    private int age;

    public User(String name,  String surname, int day, int month, int year, long phoneNumber, String email,double weight, int pressureUp, int pressureDown, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        age = B_YEAR - year;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.surname = surname;
        this.weight = weight;
        this.pressureUp = pressureUp;
        this.pressureDown = pressureDown;
        this.steps = steps;

    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPressureUp() {
        return pressureUp;
    }

    public void setPressureUp(int pressureUp) {
        this.pressureUp = pressureUp;
    }

    public int getPressureDown() {
        return pressureDown;
    }

    public void setPressureDown(int pressureDown) {
        this.pressureDown = pressureDown;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void  printAccountInfo(){

        System.out.println("User: "+ name + " " + surname + '\n' +
                "Email - " + email + '\n' +
                "Phone number - " + phoneNumber + '\n' +
                "Date of birth - " + day + "." + month + "." + year + '\n' +
                "Weight -" + weight + '\n' +
                "Pressure - " + pressureUp + "/" + pressureDown + '\n' +
                "Steps - " + steps+ '\n' +
                "Age - " + age
        );
        System.out.println("----------------------------------------------------------------------");
    }

}
