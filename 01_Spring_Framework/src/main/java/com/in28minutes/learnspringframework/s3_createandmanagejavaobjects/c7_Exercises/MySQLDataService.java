package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c7_Exercises;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLQualifier")
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {2,4,6,8,10};
    }
}
