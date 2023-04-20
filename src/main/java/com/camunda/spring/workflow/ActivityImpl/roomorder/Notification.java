package com.camunda.spring.workflow.ActivityImpl.roomorder;

import com.camunda.spring.workflow.ActivityImpl.ActivityDelegate;
import com.camunda.spring.workflow.contains.BpnmVariableContains;
import org.camunda.bpm.engine.delegate.DelegateExecution;

/**
 * Date: 4/20/2023<br/>
 * Time: 2:28 PM<br/>
 */
public class Notification extends ActivityDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Notification: " + execution.getVariables());
        execution.setVariable(BpnmVariableContains.ASSIGNEE, null);
    }
}
