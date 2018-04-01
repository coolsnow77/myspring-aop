package com.xueguoxue.myaop.dao;

import com.xueguoxue.myaop.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionDao extends MongoRepository<Action, String> {
}
