package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {



    @Test
    public void testGetFirstName() {
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        // Create an instance of the class
        Student student = new Student("John", "Jones", examScores);

        // Given
        String expectedFirstName = "John";
        student.setFirstName(expectedFirstName);

        // When
        String actualFirstName = student.getFirstName();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }
    @Test
    public void testSetFirstName() {
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        // Create an instance of the class
        Student student = new Student("John", "Jones", examScores);

        // Given
        String expectedFirstName = "John";
        student.setFirstName(expectedFirstName);

        // When
        String actualFirstName = student.getFirstName();

        // Then
        Assert.assertEquals(expectedFirstName, actualFirstName);

    }
    @Test
    public void testGetLastName() {
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        // Create an instance of the class
        Student student = new Student("John", "Jones", examScores);
        //Given
        String expectedLastName = "Jones";
        student.setLastName(expectedLastName);
//        When
        String actualLastName = student.getLastName();
//        Then
        Assert.assertEquals(expectedLastName,actualLastName);
    }
    @Test
    public void testSetLastName() {
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        // Create an instance of the class
        Student student = new Student("John", "Jones", examScores);
        //Given
        String expectedLastName = "Jones";
        student.setLastName(expectedLastName);
//        When
        String actualLastName = student.getLastName();
//        Then
        Assert.assertEquals(expectedLastName,actualLastName);
    }
    @Test
    public void testGetNumberOfExamsTaken() {

    }

    public void testGetExamScores() {
    }

    public void testAddExamScore() {
    }

    public void testSetExamScore() {
    }

    public void testGetAverageExamScore() {
    }

    public void testTestToString() {
    }
}