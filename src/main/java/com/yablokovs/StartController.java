package com.yablokovs;


import com.yablokovs.service.Facade;
import com.yablokovs.service.FacadeImpl;
import com.yablokovs.service.FacadeInterFace;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    Facade facade;

    @GetMapping(path = "/start")
    public ResponseEntity<String> getCompanyAndApplicantData() {

        Map<String, Facade> beansOfType = applicationContext.getBeansOfType(Facade.class);

        Map<String, Object> systemEnvironment = ((AnnotationConfigServletWebServerApplicationContext) applicationContext).getEnvironment().getSystemEnvironment();
        // Facade facade = applicationContext.getBean(Facade.class);

        return new ResponseEntity<>(facade.callResult(), HttpStatus.OK);
    }
}
