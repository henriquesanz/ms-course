package com.hp.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
