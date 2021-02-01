package com.estudo.michel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.michel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	

}
