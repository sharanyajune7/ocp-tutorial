package com.example.springconfigsecretsdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Component
@ResponseBody
@RequestMapping("/api")
public class SampleController {

     @RequestMapping("/rest")
	public String healthCheck() {
		return "OK";
	}

    ///////////////////////////////////////////

    @Value("${spring.application.name:}")
    private String app_name;

    @Value("${server.port:}")
    private String port;

    @RequestMapping("/app_name")
	public String spring_app_name() {
		return app_name + " application is running on " + port  + " port";
	}

    ///////////////////////////////////////////

    @Value("${oc_config.secret1:}")
    private String oc_secret1;
    @Value("${oc_config.secret2:}")
    private String oc_secret2;

    @RequestMapping("/oc_secrets")
	public String custom_var_name() {
		return oc_secret1 + "and" + oc_secret2 + " are secret values returned from oc config file";
	}

    ///////////////////////////////////////////

	
    
}
