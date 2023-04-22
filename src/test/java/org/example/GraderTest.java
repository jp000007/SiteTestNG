package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        Assertions.assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        Assertions.assertEquals('D', grader.determineLetterGrade(69));
    }
    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        Assertions.assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        Assertions.assertEquals('B', grader.determineLetterGrade(89));
    }
    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        Assertions.assertEquals('A', grader.determineLetterGrade(99));
    }
    @Test
    void negativeOneShouldReturnIllegalArg(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () ->{grader.determineLetterGrade(-1);});

    }

}