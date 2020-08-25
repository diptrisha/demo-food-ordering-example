package com.RestuarantFinder.demo.repository;

import com.RestuarantFinder.demo.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
