package com.camunda.spring.workflow.ActivityImpl.listener;

import com.camunda.spring.cache.CacheThreadLocal;
import com.camunda.spring.workflow.contains.BpnmVariableContains;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

/**
 * Date: 4/20/2023<br/>
 * Time: 2:50 PM<br/>
 */
public class LogEndProcess implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("LogEndProcess: " + delegateTask.getVariables());
        System.out.println(BpnmVariableContains.CURRENT_PROCESS_ID + ": " + delegateTask.getId());
    }
}
