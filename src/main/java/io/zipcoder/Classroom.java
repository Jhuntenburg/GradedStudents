package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

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
        for (int i = 0; i < students.length; i++) {
            theArray[i] = students[i] ;

        }
        theArray[students.length-1] = student;
        this.students = theArray;
    }

    public void removeStudent(String firstName, String lastName){
        ArrayList<Student> theArray = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
           String fName = student.getFirstName();
           String lName = student.getLastName();
           if(fName.equals(firstName) && lName.equals(lastName)){
               theArray.remove(student);
           }

        }
        theArray.add(null);

        this.students =theArray.toArray(new Student[students.length]);
    }

    public Student[] getStudentsByScore(){
        ArrayList<Student> sortingStudents = new ArrayList<>();
        
        for( Student s : students){
            int idx = 0;
            double currentStudentScore = s.getAverageExamScore();
            double otherStudentScore;
            
            while (idx < sortingStudents.size()){
                otherStudentScore =sortingStudents.get(idx).getAverageExamScore();
                
                if(currentStudentScore > otherStudentScore){
                    break;
                } else if (currentStudentScore == otherStudentScore) {
                    if(s.getLastName().compareTo(sortingStudents.get(idx).getLastName()) > 0){
                        break;
                    } else if (s.getLastName().compareTo(sortingStudents.get(idx).getLastName()) == 0) {
                        if(s.getFirstName().compareTo(sortingStudents.get(idx).getFirstName()) > 0){
                            break;
                        }
                    }
                }
                idx++;
            }
            sortingStudents.add(idx,s);
        }
        return sortingStudents.toArray(new Student[students.length]);
    }


}
