package com.camunda.spring.rest;

import com.camunda.spring.cache.CacheThreadLocal;
import com.camunda.spring.utils.ReponseCtl;
import com.camunda.spring.workflow.contains.BpnmProcessContains;
import com.camunda.spring.workflow.contains.BpnmVariableContains;
import com.camunda.spring.workflow.service.WorkFlowService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/workflow")
public class WorkflowCtl {

    private final WorkFlowService service;

    public WorkflowCtl(WorkFlowService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ReponseCtl<String> create(){
        Map<String,Object> vars = new HashMap<>();
        vars.put(BpnmVariableContains.FINISHED, false);
        service.startProessByIdKey(BpnmProcessContains.SERVICE_ROOMORDER, vars);
        return new ReponseCtl.Builder().
                status(HttpStatus.CREATED.name())
                .code(HttpStatus.CREATED.value())
                .data(CacheThreadLocal.get(BpnmVariableContains.CURRENT_PROCESS_ID,true)).build();
    }

    @PostMapping("/takeflow")
    public ReponseCtl<String> takeflow(){
        Map<String,Object> vars = new HashMap<>();
        vars.put(BpnmVariableContains.FINISHED, true);
        service.takeCompleProcess(BpnmProcessContains.SERVICE_ROOMORDER, Map.of());
        return new ReponseCtl.Builder().
                status(HttpStatus.CREATED.name())
                .code(HttpStatus.CREATED.value())
                .data("OK").build();
    }
}
