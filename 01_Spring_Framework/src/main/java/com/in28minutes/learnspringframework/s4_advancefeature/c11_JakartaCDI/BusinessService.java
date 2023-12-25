package com.in28minutes.learnspringframework.s4_advancefeature.c11_JakartaCDI;


import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
public class BusinessService {
    private DataService dataService;
    public DataService getDataService() {
        System.out.println("Setter Injection");
        return dataService;
    }

    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

}
