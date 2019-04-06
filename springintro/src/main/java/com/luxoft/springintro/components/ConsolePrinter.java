package com.luxoft.springintro.components;

import org.springframework.stereotype.Component;

@Component("printer")
public class ConsolePrinter implements Printer {

    private Message message;

    public ConsolePrinter(Message message) {
		super();
		this.message = message;
	}

	public void print() {
        System.out.println(message.getMessage());
    }
}
