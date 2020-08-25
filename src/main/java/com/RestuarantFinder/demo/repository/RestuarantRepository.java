package com.RestuarantFinder.demo.repository;

import com.RestuarantFinder.demo.models.Restuarant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestuarantRepository extends JpaRepository<Restuarant, Integer> {
}
