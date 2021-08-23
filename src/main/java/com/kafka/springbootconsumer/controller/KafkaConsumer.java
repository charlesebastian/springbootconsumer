package com.kafka.springbootconsumer.controller;

import com.kafka.springbootconsumer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.springbootconsumer.repository.CustomerRepository;

@Service
public class KafkaConsumer{

	@Autowired
	CustomerRepository customerRepository;

	@KafkaListener(topics= {"CustomerTopic"}, groupId="customer-group")
	public String saveData(String customer) {

		//Customer c = new Customer();
		System.out.println("Data at Consumer: "+customer);
		//customerRepository.save(c);
		return "Data reached successfully at Consumer";
	}

}
