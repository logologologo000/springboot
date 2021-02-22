package com.example.demo.repository;
import com.example.demo.model.GunEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GunRepository extends JpaRepository<GunEntity,Integer>{}
