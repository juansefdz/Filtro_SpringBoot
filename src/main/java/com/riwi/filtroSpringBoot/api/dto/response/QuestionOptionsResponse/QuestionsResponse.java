package com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse;

import java.util.List;

import com.riwi.filtroSpringBoot.domain.entities.OptionQuestion;
import com.riwi.filtroSpringBoot.domain.entities.Survey;

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

    private List <OptionQuestion> optionQuestions;
}
