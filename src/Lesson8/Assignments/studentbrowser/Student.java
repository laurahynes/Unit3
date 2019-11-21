package Lesson8.Assignments.studentbrowser;

public class Student {

    //instance variables
    //these are the properties of a student
    private String name;

    //turn this into an array///////////////
    private int marks[];

    //constructor methods - 3 ways you can make a student
    public Student() {
        this("", new int[]{0, 0, 0});
    }

    //Additonal Constructor
    public Student(String nm, int t[]) {
        name = nm;
        marks = t;
    }

    //Another constructor
    public Student(Student s) {
        this(s.name, s.marks);
    }

    /*
    other methods
    these give our object more abilities
     */
    public void setName(String nm) {
        name = nm;
    }

    public void setMark(int whichmark, int number) {
        //user sends in 1,2 or 3 to modify a mark
        marks[whichmark - 1] = number;
    }

    public int getAverage() {
        int average = (marks[0] + marks[1] + marks[2]) / 3;
        return average;
    }

    public int getMark(int whichmark) {
        return marks[whichmark - 1];
    }

    public int getHighscore() {
        int high = marks[0];
        if (marks[1] > high) {
            high = marks[1];
        }
        if (marks[2] > high) {
            high = marks[2];
        }
        return high;
    }

    public String toString() {
        String result = "Name: " + name;
        for (int i = 0; i < 3; i++) {
            result += "\nMark " + (i + 1) + ":\t" + marks[i];
        }
        result += "\n~~~~~~~~~~~~~~~~~~";
        result += "\nAverage:\t" + getAverage();
        return result;
    }

    public String getName() {
        return name;
    }

    //validate data
    public String validateData() {
        String message = null;
        //check if name is entered
        if (name.equals("")) {
            message += "\nName is required\nPlease re-enter all data";
        }

        for (int i = 0; i < 3; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                message += "\nAt least one mark is out of range, please re-enter all data";
                break; //leaves for loop right away
            }
        }
        return message;
    }
}
