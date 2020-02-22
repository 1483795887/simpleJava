package com.simplejava.type;

public class FunctionTypeRef extends TypeRef {
    private TypeRef retType;
    private ParamTypeRef params;

    public FunctionTypeRef(TypeRef retType, ParamTypeRef params) {
        this.retType = retType;
        this.params = params;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("(");
        for (TypeRef typeRef : params.getParams()) {
            value.append(typeRef.toString());
        }
        value.append(")").append(retType.toString());
        return value.toString();
    }
}
