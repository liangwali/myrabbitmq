package com.lwl.rabbitmaq;

import com.lwl.rabbitmaq.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmaqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void contextLoads() {
       // rabbitTemplate.convertAndSend("exchange.direct","US.news","Springboot来的信息");

        rabbitTemplate.convertAndSend("exchange.direct","China",new Book("小妖的金色城堡","忘记了"));
    }

    @Test
    public void senMsg(){
        rabbitTemplate.convertAndSend("exchange.fanout","",new Book("像我这样的人","去去去"));
    }

    @Test
    public void say(){
        Object object = rabbitTemplate.receiveAndConvert("China");
        System.out.println(object.getClass());
        System.out.println(object);
    }

    @Test
    public void testAmqpAdmin(){
       // amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.exchange"));

       // amqpAdmin.declareQueue(new Queue("amqpAdmin.queue1",true));


       // amqpAdmin.declareBinding(new Binding("amqpAdmin.queue1",Binding.DestinationType.QUEUE,
        //        "amqpAdmin.exchange","amqpAdmin.qq",null));

        //System.out.println("创建完成了");

        amqpAdmin.deleteQueue("amqpAdmin.queue1");

        System.out.println("删除成功");


    }

}
