package com.spartaglobal.quizJSONPractice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class QuizJSONReader {

    private JSONObject quizDetails;

    public QuizJSONReader(String fileName) {
        try {
            //A simple file reader object
            FileReader quizJSON = new FileReader(fileName);
            //Deserialising string to object
            JSONParser jsonParser = new JSONParser();
            Object quizObject = jsonParser.parse(quizJSON);
            //JSON simple needs a cast from Object to the JSON simple object of JSONObject
            quizDetails = (JSONObject) quizObject;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
    public JSONObject getQuizDetails() {
        return quizDetails;
    }
}
