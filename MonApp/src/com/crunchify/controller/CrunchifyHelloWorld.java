package com.crunchify.controller;
 
import java.io.IOException;
import java.util.Date;

import org.apache.catalina.core.ApplicationContext;
//import org.springframework.amqp.core.AmqpAdmin;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
//import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.ui.Model;
/*
 * author: Crunchify.com
 * 
 */




import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;





//import com.rabbitmq.client.ConnectionFactory;

//@Controller
//public class CrunchifyHelloWorld {
//
//	private final static String QUEUE_NAME = "hello";
//	@RequestMapping("/welcome")
//	//@ResponseBody
//	public String helloWorld() throws Exception {
//		ConnectionFactory factory = new ConnectionFactory();
//	    factory.setHost("localhost");
//	    Connection connection = factory.newConnection();
//	    Channel channel = connection.createChannel();
//
//	    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//	    String message = "Hello World!";
//	    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
//	    System.out.println(" [x] Sent '" + message + "'");
//	    
//	    channel.close();
//	    connection.close();
//	    return null;
//	}
//}

@Controller
public class CrunchifyHelloWorld {

	@RequestMapping("/welcome")
	@ResponseBody
	public String helloWorld(Model model) {
		System.out.println("test");
		String message = "ANAS";
		//model.addAttribute("message", message);
		return message;
	}
}
//@Controller
//public class CrunchifyHelloWorld {
// 
//	@RequestMapping("/welcome")
//	@ResponseBody
//	public ModelAndView helloWorld() {
//		System.out.println("test");
//		String message = "<br><div align='center'>"
//				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from CrunchifyHelloWorld.java **********<br><br>";
//		return new ModelAndView("welcome", "message", message);
//	}
//}