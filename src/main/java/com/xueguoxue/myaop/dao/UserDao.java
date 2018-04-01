package com.xueguoxue.myaop.dao;

import com.xueguoxue.myaop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User, Long> {
}
