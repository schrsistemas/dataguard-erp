package com.dataguard.erp.audit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRuleRepository extends JpaRepository<AuditRule, Long> {
}
