package jjad.springframework.jms.listener;

import jakarta.jms.Message;
import jjad.springframework.jms.config.JmsConfig;
import jjad.springframework.jms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers,
                       Message message){

        System.out.println("I got a message!!!!!");
        System.out.println(helloWorldMessage);

    }

}
