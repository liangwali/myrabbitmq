package com.lwl.rabbitmaq.service;


import com.lwl.rabbitmaq.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @RabbitListener(queues = "China")

   // public void receive(Book book){
     //   System.out.println("收到信息了："+book);
   // }

    public void receive1(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }

}
