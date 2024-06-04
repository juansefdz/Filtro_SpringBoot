package com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse;

import java.util.List;

import com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse.OptionQuestionResponseInQuestion.OptionsQuestionsResponseInQuestions;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionsResponse {
    
    private int idQuestion;
    private String text;
    private String type;
    private boolean active;

    private List <OptionsQuestionsResponseInQuestions> optionQuestions;
}
