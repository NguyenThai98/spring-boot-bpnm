package com.camunda.spring;

import com.camunda.spring.workflow.contains.BpnmVariableContains;
import com.camunda.spring.workflow.service.WorkFlowService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CamundaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaSpringBootApplication.class, args);
	}

}
