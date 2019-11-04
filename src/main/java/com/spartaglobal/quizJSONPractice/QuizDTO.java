package com.spartaglobal.quizJSONPractice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class QuizDTO {

    private JSONObject quiz;
    private JSONObject quizRoot;

    public QuizDTO(String fileName){

        QuizJSONReader quizJSONReader = new QuizJSONReader(fileName);
        quiz = quizJSONReader.getQuizDetails();
        quizRoot = (JSONObject) quiz.get("quiz");
    }

    public Map<String, JSONObject> mapOfSubjects() {
        Map<String,JSONObject> mapSub = new HashMap<>();
        for(Object keyName: quizRoot.keySet()){
            mapSub.put((String) keyName, (JSONObject) quizRoot.get(keyName));}
        return mapSub;
    }

    public JSONObject getSportQuestion(String questionName){
        return (JSONObject) mapOfSubjects().get("sport").get(questionName);
    }

    public JSONArray getOptions(String option){
        return (JSONArray) getSportQuestion("q1").get(option);
    }

    public String getAnswer(String answer){
        return (String) getSportQuestion("q1").get(answer);
    }

    public JSONObject getMathsQuestion(String questionName){
        return (JSONObject) mapOfSubjects().get("maths").get(questionName);
    }

    public JSONArray getMathsOptions(String questionName){
        return (JSONArray) getMathsQuestion(questionName).get("options");
    }

    public String getMathsAnswers(String questionName){
        return (String) getMathsQuestion(questionName).get("answer");
    }
}
