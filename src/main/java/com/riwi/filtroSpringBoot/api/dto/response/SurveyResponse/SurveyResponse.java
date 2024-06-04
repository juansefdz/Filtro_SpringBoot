package com.riwi.filtroSpringBoot.api.dto.response.SurveyResponse;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SurveyResponse {

    private String title;
    private String description;
    private Date creationDate;
    private boolean active;
    
}
