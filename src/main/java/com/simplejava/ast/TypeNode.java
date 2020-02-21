package com.simplejava.ast;

import com.simplejava.type.Type;
import com.simplejava.type.TypeRef;

public class TypeNode extends Node {
    private Type type;
    private TypeRef typeRef;

    public TypeNode(Location location, TypeRef typeRef) {
        super(location);
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

    @Override
    public void _dump(Dumper dumper) {

    }
}
