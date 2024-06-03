package eu.miraiworks.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "plasius", groupId = "foo", containerFactory = "factory")
    void listener(Message data){
        System.out.println("Listener received: " + data);
    }

}
