package com.spartaglobal.quizJSONPractice;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        QuizDTO quizDTO = new QuizDTO("resources/quiz.json");
       // System.out.println(quizDTO.mapOfSubjects());
       // System.out.println(quizDTO.getSportQuestion("q1"));
//        System.out.println(quizDTO.getMathsQuestion("q2"));
//        System.out.println(quizDTO.getMathsQuestion("q1"));
       // System.out.println(quizDTO.getMathsOptions("q1"));
        System.out.println(quizDTO.getMathsAnswers("q1"));
    }
}
