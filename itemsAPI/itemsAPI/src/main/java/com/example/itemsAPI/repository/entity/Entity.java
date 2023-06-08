package com.example.itemsAPI.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers to Create, Read, Update, Delete
public abstract class Entity implements JpaRepository<item, Integer> {
}