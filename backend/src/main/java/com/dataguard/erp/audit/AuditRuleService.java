package com.dataguard.erp.audit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditRuleService {

    private final AuditRuleRepository repository;

    public AuditRuleService(AuditRuleRepository repository) {
        this.repository = repository;
    }

    public List<AuditRule> findAll() {
        return repository.findAll();
    }

    public AuditRule save(AuditRule rule) {
        return repository.save(rule);
    }
}
