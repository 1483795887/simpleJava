package com.simplejava.type;

public class TypeNode {
    private Type type;
    private TypeRef typeRef;

    public TypeNode(TypeRef typeRef) {
        this.typeRef = typeRef;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TypeRef getTypeRef() {
        return typeRef;
    }

    public void setTypeRef(TypeRef typeRef) {
        this.typeRef = typeRef;
    }
}
