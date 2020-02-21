package com.simplejava.type;

public class IntegerTypeRef extends TypeRef {
    private String name;

    public IntegerTypeRef(String name) {
        this.name = name;
    }

    public static IntegerTypeRef charRef() {
        return new IntegerTypeRef("char");
    }

    public static IntegerTypeRef shortRef() {
        return new IntegerTypeRef("short");
    }

    public static IntegerTypeRef intRef() {
        return new IntegerTypeRef("int");
    }

    public static IntegerTypeRef longRef() {
        return new IntegerTypeRef("long");
    }

    @Override
    public String toString() {
        return name;
    }
}
