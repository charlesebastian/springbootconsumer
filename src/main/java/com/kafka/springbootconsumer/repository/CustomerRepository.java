package com.kafka.springbootconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kafka.springbootconsumer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
