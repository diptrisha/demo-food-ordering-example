package com.RestuarantFinder.demo.repository;

import com.RestuarantFinder.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
