package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}