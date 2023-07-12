package io.zipcoder;

import java.util.Arrays;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    List<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = Arrays.asList(testScores); //should this be test scores likein the readme?

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
            examScores.append("Exam " + (i + 1 ) + " -> " + this.examScores);

        }            return examScores.toString();

    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);

    }

    public void setExamScore(int examNumber, double newScore){
        this.examScores.set(examNumber, newScore);

    }
    public double getAverageExamScore(){
        double sum = 0.0;
        for(int i = 0; i < this.examScores.size(); i++){
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
