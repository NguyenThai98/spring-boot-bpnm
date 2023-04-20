package com.camunda.spring.workflow.ActivityImpl;

import com.camunda.spring.workflow.contains.BpnmVariableContains;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Map;

/**
 * Date: 4/20/2023<br/>
 * Time: 11:05 AM<br/>
 */
public abstract class ActivityDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Map<String, Object> vars = execution.getVariables();
        String service = String.valueOf(vars.get(BpnmVariableContains.SERVICE_NAME));
        ActivityHandler.handlerService(service);
    }
}
