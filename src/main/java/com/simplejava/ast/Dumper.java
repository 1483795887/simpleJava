package com.simplejava.ast;

import java.io.PrintStream;
import java.util.List;

public class Dumper {
    private PrintStream printStream;
    private int indent;

    public Dumper(PrintStream printStream) {
        this.printStream = printStream;
        indent = 0;
    }

    public void printClass(Object object, Location location) {
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

    public void printMember(String name, List<? extends Dumpable> objects) {
        printIndent();
        indent++;
        for (Dumpable dumpable : objects) {
            printStream.println(name + ":");
            dumpable.dump(this);
        }
        indent--;
    }

    public void printMember(String name, Dumpable dumpable) {
        printIndent();
        if (dumpable == null) {
            printStream.println(name + ":null");
        } else {
            printStream.println(name + ":");
            indent++;
            dumpable.dump(this);
            indent--;
        }
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
