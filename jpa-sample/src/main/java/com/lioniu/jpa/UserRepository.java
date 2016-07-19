package com.lioniu.jpa;

import com.lioniu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yongliuli on 16/7/19.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
