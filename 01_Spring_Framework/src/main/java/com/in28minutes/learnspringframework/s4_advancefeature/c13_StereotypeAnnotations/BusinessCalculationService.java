package com.in28minutes.learnspringframework.s4_advancefeature.c13_StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    DataService dataService;

    public BusinessCalculationService(@Qualifier("MySQLQualifier") DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }
}
