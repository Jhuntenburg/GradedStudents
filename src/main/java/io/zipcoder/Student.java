package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScores;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        StringBuilder examScores = new StringBuilder();
        for (int i = 0; i < examScores.length(); i++) {

        }
        return examScores.append("Exam " + i + 1 + " -> " + this.examScores);
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);

    }

    public void setExamScore(int examNumber, double newScore){
        this.examScores.set(examNumber, newScore);

    }
    public double getAverageExamScore(){
        double sum = 0.0;
        for( int i = 0; i < this.examScores.size(); i++){
            sum += this.examScores.get(i);

        }
        return sum / this.examScores.size();
    }
    @Override
    public String toString(){
        return "Student Name: " + firstName + " " + lastName + "\n"+
                "> Average Score: " + getAverageExamScore() +"\n" +
                "> Exam Scores: \n"+
                getExamScores();
    }



}
