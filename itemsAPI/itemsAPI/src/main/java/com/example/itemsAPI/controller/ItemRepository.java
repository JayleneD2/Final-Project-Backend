package com.example.itemsAPI.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface itemRepository extends JpaRepository<item, Long> {
    // You can define custom query methods here if needed
}
