package com.xueguoxue.myaop.dao;

import com.xueguoxue.myaop.domain.OperationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationLogDao extends JpaRepository<OperationLog, Long> {
}
