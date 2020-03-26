/*
    Create an ArrayList of Student objects that have names, and ID numbers.

	Create a method that loops through each object and returns true if all IDs have a length of 10

 */

public class Challenge3 {

    public static void main(String[] args) {

        Student student1 = new Student("Alberto", "1234567891");
        Student student2 = new Student("John",    "3436445456");
        Student student3 = new Student("Clara",   "3456965435");
        Student student4 = new Student("Robert",  "3258241345");
        Student student5 = new Student("Raymond", "349112357");

        Student[] students = {student1, student2, student3, student4, student5 };

        System.out.println(hasIdLength(students));
    }

    public static boolean hasIdLength(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId().length() != 10) {
                return false;
            }
        }
        return true;
    }
}
