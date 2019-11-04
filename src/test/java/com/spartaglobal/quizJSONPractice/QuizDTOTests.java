package com.spartaglobal.quizJSONPractice;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class QuizDTOTests {
    private String fileLocal = "resources/quiz.json";
    private  QuizDTO quizDTO = new QuizDTO(fileLocal);

    @Test
    public void testSportAnswer(){
      Assert.assertEquals("Houston Rocket",quizDTO.getAnswer("answer"));
    }

    @Test
    public void testSportOptions() {
        List<String> testList = List.of("New York Bulls","Los Angeles Kings","Golden State Warriros","Houston Rocket");
        Assert.assertEquals(testList,quizDTO.getOptions("options"));
    }

    @Test
    public void testSportQuestion(){
        String testString = "Which one is correct team name in NBA?";
        Assert.assertEquals(testString,quizDTO.getSportQuestion("q1").get("question"));
    }

    @Test
    public void testMathsQuestion1(){
        String testString = "5 + 7 = ?";
        Assert.assertEquals(testString,quizDTO.getMathsQuestion("q1").get("question"));
    }
    @Test
    public void testMathsQuestion2(){
        String testString = "12 - 8 = ?";
        Assert.assertEquals(testString,quizDTO.getMathsQuestion("q2").get("question"));
    }

    @Test
    public void testMathsQuestion1Options(){
        List<String> testList = List.of("10","11","12","13");
        Assert.assertEquals(testList,quizDTO.getMathsOptions("q1"));
    }
    @Test
    public void testMathsQuestion2Options(){
        List<String> testList = List.of("1","2","3","4");
        Assert.assertEquals(testList,quizDTO.getMathsOptions("q2"));
    }

    @Test
    public void testMathQuestion1Answer(){
        Assert.assertTrue(quizDTO.getMathsAnswers("q1").contains("12"));
    }
    @Test
    public void testMathQuestion2Answer(){
        Assert.assertTrue(quizDTO.getMathsAnswers("q2").contains("4"));
    }


}
