/*

Create an ArrayList of Student objects that have names, and ID numbers.

Create a method that loops through each object and returns true if all IDs
have a length of 10

*/

// class Student
public class Student {

    // private fields
    private String name;
    private String id;

    // constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // getter for student Id
    public String getId() {
        return id;
    }


    // a method that loops through each object and return true if all IDs have length of 10
    public static boolean hasAllObjectsLengthOfTen(Student[] students) {
        // iterate over the the student array
        for (int i = 0; i < students.length; i++) {
            // return false if the i-th ID length is not 10
            if (students[i].getId().length() != 10) {
                return false;
            }
        }
        // otherwise all ID's have a length of ten and we true is returned by the method
        return true;
    }


    // main method
    public static void main(String[] args) {
        // create some students with names and ID's
        Student student1 = new Student("Alberto", "1234567891");
        Student student2 = new Student("John", "3436445456");
        Student student3 = new Student("Clara", "3456965435");
        Student student4 = new Student("Robert", "3258241345");
        Student student5 = new Student("Raymond", "349112357");
        ///////////////////////////////////////////////////////////////////
        Student student6 = new Student("Alberto", "1234567891");
        Student student7 = new Student("John", "3436445456");
        Student student8 = new Student("Clara", "3456965435");
        Student student9 = new Student("Robert", "3258241345");
        Student student10 = new Student("Raymond", "4349112357");
        // an array of students with odd numbered digits IDs
        Student[] studentsOdd = {student1, student2, student3, student4, student5};
        // an array of students with even numbered digits IDs
        Student[] studentsEven = {student6, student7, student8, student9, student10};
        // invoke methods and print to console
        System.out.println(hasAllObjectsLengthOfTen(studentsOdd));
        System.out.println(hasAllObjectsLengthOfTen(studentsEven));
    }

}
