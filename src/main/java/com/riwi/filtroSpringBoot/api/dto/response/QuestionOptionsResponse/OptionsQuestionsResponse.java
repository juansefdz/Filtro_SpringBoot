package com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse;


import com.riwi.filtroSpringBoot.domain.entities.Question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OptionsQuestionsResponse {

    private int idOptionQuestion;
    private String text;
    private String type;
    private boolean active;

    private Question question;
    
}
