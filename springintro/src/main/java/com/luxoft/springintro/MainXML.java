package com.luxoft.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luxoft.springintro.components.Printer;

public class MainXML {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Printer printer = ctx.getBean("printer", Printer.class);

        printer.print();

    }
}
