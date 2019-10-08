package com.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class ExamDTO {
    private  String question;
    private  String correctAnswer;
    private List<String> answers;//我希望的是只获取到纯洁的String类型的数组,而不是一大串带有不需要的字段的数据.
//这里不可以使用 List<AnswerInfo> answers;
}
