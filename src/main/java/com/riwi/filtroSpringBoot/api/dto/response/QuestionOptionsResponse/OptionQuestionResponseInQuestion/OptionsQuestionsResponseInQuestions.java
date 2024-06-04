package com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse.OptionQuestionResponseInQuestion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OptionsQuestionsResponseInQuestions {

    private int idOptionQuestion;
    private String text;
    private boolean active;
    private int idQuestion;
    
}
