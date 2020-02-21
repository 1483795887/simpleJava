package com.simplejava.ast;

import com.simplejava.parser.Token;

public class Location {
    private String source;
    private Token t;

    public Location(String source, Token t) {
        this.source = source;
        this.t = t;
    }

    @Override
    public String toString() {
        return "(" + source + " " + t.beginLine + ":" + t.beginColumn + ")";
    }
}
