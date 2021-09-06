package com.kafka.springbootconsumer;

import static org.mockito.Mockito.when;

import com.kafka.springbootconsumer.controller.KafkaConsumer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
//import com.kafka.springbootconsumer.entity.Customers;
//import com.kafka.springbootconsumer.repository.CustomerRepository;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaConsumerTest {

	@Autowired
	KafkaConsumer consumer;

	//@MockBean
	//private CustomerRepository customerRepository;

	/*
	@Test
	public void saveData() throws Exception{

		Customers customer = new Customers("1","admin","admin","India","9496762599","admin@test.com");
		//when(customerRepository.save(customer)).thenReturn(customer);
		//consumer.saveData(customer);
		Assert.assertNotNull(customer);
		Assert.assertNotNull(customer.getCustomerId());
		Assert.assertNotNull(customer.getCustomerId());
		Assert.assertNotNull(customer.getFirstName());
		Assert.assertNotNull(customer.getLastName());
		Assert.assertNotNull(customer.getAddress(),"India");
		Assert.assertNotNull(customer.getPhone());
		Assert.assertNotNull(customer.getEmail());
	}
	*/
	/*
	@Test
	public void testEntity(){
		Customer customer = new Customer();
		customer.setCustomerId(1L);
		customer.setFirstName("admin");
		customer.setLastName("admin");
		customer.setAddress("adminaddress");
		customer.setPhone(9496L);
		customer.setEmail("admin@test.com");
		Assert.assertNotNull(customer);

	}

	 */
}
