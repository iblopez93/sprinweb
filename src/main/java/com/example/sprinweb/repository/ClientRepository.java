package com.example.sprinweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprinweb.models.ClientModel;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
