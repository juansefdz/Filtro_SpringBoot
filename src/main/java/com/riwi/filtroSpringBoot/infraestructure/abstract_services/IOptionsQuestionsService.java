package com.riwi.filtroSpringBoot.infraestructure.abstract_services;

import com.riwi.filtroSpringBoot.api.dto.request.OptionsQuestionRequest;
import com.riwi.filtroSpringBoot.api.dto.response.QuestionOptionsResponse.OptionsQuestionsResponse;


public interface IOptionsQuestionsService extends CrudService<OptionsQuestionRequest, OptionsQuestionsResponse, Integer>{
    
}
