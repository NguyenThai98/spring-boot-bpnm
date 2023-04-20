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
public class CamundaSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CamundaSpringBootApplication.class, args);
	}
	@Autowired
	private WorkFlowService service;
	@Override
	public void run(String... args) throws Exception {
		Map<String,Object> vars = new HashMap<>();
		vars.put(BpnmVariableContains.FINISHED, false);
		if(args[0].equals("1")){
			service.startProessByIdKey("OderHomestayProcess",vars );
		}else{
			service.takeCompleProcess(args[0], Map.of(BpnmVariableContains.FINISHED, true));
		}



	}
}
