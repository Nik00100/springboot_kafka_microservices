package ru.kirillov.emailservice.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.kirillov.basedomains.dto.OrderEvent;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}"
    , id = "${spring.kafka.consumer.group-id}")
    private void consume(OrderEvent event) {
        LOGGER.info(String.format("OrderEvent received in stock service => %s", event.toString()));

        // save order data to DB

    }
}
