package com.example.sprinweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprinweb.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
