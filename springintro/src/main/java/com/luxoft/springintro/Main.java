package com.luxoft.springintro;

import com.luxoft.springintro.components.ConsolePrinter;
import com.luxoft.springintro.components.GoodbyeMessage;
import com.luxoft.springintro.components.Message;

public class Main {
    public static void main(String[] args) {

        Message message = new GoodbyeMessage();
        ConsolePrinter consolePrinter = new ConsolePrinter(message);

        consolePrinter.print();
    }
}
