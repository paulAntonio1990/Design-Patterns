package com.exam.behavioral.command.withUndo;

import java.util.Stack;

public class Operator {

    Stack<Command> comenzi;

    public Operator() {
        comenzi = new Stack<>();
    }

    public void invoca(Command command) {
        comenzi.push(command);
        command.executa();
    }

    public void undo() {
        if (!comenzi.isEmpty()) {
            comenzi.pop().anuleaza();
        }
    }
}
