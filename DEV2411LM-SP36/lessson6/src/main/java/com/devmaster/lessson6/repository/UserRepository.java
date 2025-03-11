package com.devmaster.lessson6.repository;

import com.devmaster.lessson6.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Bổ sung code nếu cần
}
