package com.dataguard.erp.api;

import com.dataguard.erp.audit.AuditRule;
import com.dataguard.erp.audit.AuditRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rules")
public class AuditRuleController {

    private final AuditRuleService service;

    public AuditRuleController(AuditRuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<AuditRule> findAll() {
        return service.findAll();
    }

    @PostMapping
    public AuditRule create(@RequestBody AuditRule rule) {
        return service.save(rule);
    }
}
