package com.example.pojo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class QuestionInfo {
    int qid;
    String question;
    String correctAnswer;
    ArrayList<AnswerInfo> answers =new ArrayList<AnswerInfo>();
}
