package com.xueguoxue.myaop.service;


import com.xueguoxue.myaop.dao.OperationLogDao;
import com.xueguoxue.myaop.dao.UserDao;
import com.xueguoxue.myaop.domain.OperationLog;
import com.xueguoxue.myaop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DemoService {

    @Autowired
    private OperationLogDao operationLogDao;

    @Autowired
    private UserDao userDao;

    @Transactional
    public void addUser(String name)
    {
        OperationLog operationLog = new OperationLog();
        operationLog.setContent("create user:" + name);
        operationLogDao.save(operationLog);

        User user = new User();
        user.setCompany("xueguoxue company");
        user.setName(name);
        userDao.save(user);
    }
}
