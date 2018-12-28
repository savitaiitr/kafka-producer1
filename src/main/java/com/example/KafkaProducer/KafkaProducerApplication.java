package com.example.KafkaProducer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerApplication {


	// Logging
	private static final Logger logger = LogManager.getLogger(KafkaProducerApplication.class.getName());

	public void produceMsg() {
		
		String topicName = "SampleMessages";
		String key = "SampleKey";
		String value = "SampleValue";
		
		Properties prop = new Properties();
		//prop.put("bootstrap.servers","localhost:9092");
		prop.put("bootstrap.servers","10.131.126.77:9092");
		prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		Producer<String,String> prod = new KafkaProducer<>(prop);
		
		ProducerRecord<String,String> record = new  ProducerRecord<>(topicName,key,value);
		
		prod.send(record);
		prod.close();
		
		logger.info("KafkaProducerApplication complete");
	}

}

