package com.simplejava.type;

public class BasicTypeRefs {
    public static NamedTypeRef charRef() {
        return new ClassTypeRef("java.lang.Character");
    }

    public static NamedTypeRef shortRef() {
        return new ClassTypeRef("java.lang.Short");
    }

    public static NamedTypeRef intRef() {
        return new ClassTypeRef("java.lang.Integer");
    }

    public static NamedTypeRef longRef() {
        return new ClassTypeRef("java.lang.Long");
    }

    public static NamedTypeRef stringRef() {
        return new ClassTypeRef("java.lang.String");
    }
}
