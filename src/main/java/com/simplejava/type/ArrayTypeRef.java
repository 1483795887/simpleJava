package com.simplejava.type;

public class ArrayTypeRef extends TypeRef {
    private static long UNDEFINED_LENGTH = -1;
    private TypeRef baseTypeRef;
    private long length;

    public ArrayTypeRef(TypeRef baseTypeRef, long length) {
        this.baseTypeRef = baseTypeRef;
        this.length = length;
    }

    public ArrayTypeRef(TypeRef baseTypeRef) {
        this.baseTypeRef = baseTypeRef;
        this.length = UNDEFINED_LENGTH;
    }

    @Override
    public String toString() {
        return baseTypeRef.toString() + "[" + (length == UNDEFINED_LENGTH ? "" : length) + "]";
    }
}
