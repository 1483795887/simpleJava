package com.simplejava.utils;

import java.io.PrintStream;

public class ErrorHandler {
    private PrintStream printStream;
    private int errors;
    private int warnings;

    public ErrorHandler(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void error(String err) {
        printStream.println(err);
        errors++;
    }

    public void warning(String warn) {
        printStream.println(warn);
        warnings++;
    }
}
