package com.simplejava.ast;

import com.simplejava.type.TypeNode;

import java.io.PrintStream;

public class Dumper {
    private PrintStream printStream;
    private int indent;

    public Dumper(PrintStream printStream) {
        this.printStream = printStream;
        indent = 0;
    }

    void printClass(Object object, Location location) {
        printIndent();
        printStream.println("<" + object.getClass().getSimpleName() + ">" + location.toString());
    }

    public void printMember(String name, long value) {
        printPair(name, value);
    }

    public void printMember(String name, String value) {
        printPair(name, value);
    }

    public void printMember(String name, TypeNode typeNode) {
        printPair(name, typeNode.getTypeRef().toString());
    }

    private void printIndent() {
        for (int i = 0; i < indent; i++) {
            printStream.print('\t');
        }
    }

    private void printPair(String name, Object object) {
        printIndent();
        printStream.println(name + ":" + object.toString());
    }
}
