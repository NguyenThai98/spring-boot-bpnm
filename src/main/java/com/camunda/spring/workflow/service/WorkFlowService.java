package com.camunda.spring.workflow.service;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Date: 4/20/2023<br/>
 * Time: 10:35 AM<br/>
 */
@Service
public class WorkFlowService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;
    public void startProessByIdKey(String key, Map<String, Object> variables){
        runtimeService.startProcessInstanceByKey(key, variables);
    }

    public void takeCompleProcess(String taskId, Map<String, Object> variables){
        taskService.complete(taskId,variables);
    }
}
