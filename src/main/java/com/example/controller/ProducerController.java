package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.KafkaProducer.KafkaProducerApplication;

@RestController
public class ProducerController {

	// Logging
	private static final Logger logger = LogManager.getLogger(ProducerController.class.getName());

	/** KafkaProducerApplication */
	@Autowired
	private KafkaProducerApplication kafkaProducerApplication;

	/**
	 * Used to send the request to Kafka Producer
	 * 
	 * @param request
	 */
	@RequestMapping(method=RequestMethod.GET, path="/getKafkaProducer")
	public void getKafkaProducer(HttpServletRequest httpRequest){
		logger.info("getKafkaProducer of ProducerController ");
		kafkaProducerApplication.produceMsg();
	}

}
