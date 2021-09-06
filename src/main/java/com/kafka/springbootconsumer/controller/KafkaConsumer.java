package com.kafka.springbootconsumer.controller;

import org.apache.avro.generic.GenericData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer{

	//@Autowired
	//CustomerRepository customerRepository;

	@KafkaListener(topics= {"CustomerTopic"}, groupId="customer-group")
	public String saveData(GenericData.Record customer) {
		System.out.println("Data at Consumer: "+customer);
		return "Success";
	}

}
