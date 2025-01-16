package org.sid.orderservice.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${order.kafka.topic}")
    private String topic;

    public OrderKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
    }
}

