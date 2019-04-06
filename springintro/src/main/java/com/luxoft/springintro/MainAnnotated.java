package com.luxoft.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.luxoft.springintro.components.GoodbyeMessage;
import com.luxoft.springintro.components.Message;
import com.luxoft.springintro.components.Printer;

@ComponentScan(basePackages = "com.luxoft.springintro")
public class MainAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainAnnotated.class);
        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print();
    }

    @Bean
    public Message adios() {
        return new GoodbyeMessage();
    }
}
