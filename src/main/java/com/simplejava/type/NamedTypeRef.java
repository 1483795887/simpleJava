package com.simplejava.type;

abstract public class NamedTypeRef extends TypeRef {
    private String name;

    public NamedTypeRef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
