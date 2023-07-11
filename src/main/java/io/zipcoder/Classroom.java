package io.zipcoder;

public class Classroom {

    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom( Student[] students){
//        Student[] theArray = new Student[students.length];
//        for( int i = 0; i < students.length; i++){
//            theArray[i] = students[i];
//        }
        this.students = students;
    }

    public Classroom (){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;

        for (int i =0; i< this.students.length; i++){
            sum = students[i].getAverageExamScore();
        }
        return sum / this.students.length;
    }

    public void addStudent(Student student){
        Student[] theArray = new Student[students.length + 1];
        theArray[students.length-1] = student;
        this.students = theArray;
    }

    public void removeStudent(String firstName, String lastName){

    }
}
