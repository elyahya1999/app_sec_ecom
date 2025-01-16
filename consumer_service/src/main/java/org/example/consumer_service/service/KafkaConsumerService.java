package org.example.consumer_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"inventory_topic", "order_topic"}, groupId = "group_id")
    public void consume(String message) {
        System.out.println("Message reçu: " + message);
        // Traitez le message ici
    }
}

