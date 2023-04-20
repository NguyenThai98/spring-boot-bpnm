package com.camunda.spring.workflow.ActivityImpl.listener;

import com.camunda.spring.workflow.contains.BpnmVariableContains;
import com.camunda.spring.workflow.service.WorkFlowService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Date: 4/20/2023<br/>
 * Time: 2:56 PM<br/>
 */
public class AssignedSaleEndProcess implements TaskListener {


    @Autowired
    WorkFlowService workFlowService;

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("AssignedSaleEndProcess: " + delegateTask.getVariables());
        System.out.println("currentProcessId: " + delegateTask.getId());

    }
}
