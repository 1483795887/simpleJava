package com.simplejava.type;

public class BasicTypeRefs extends NamedTypeRef {
    public BasicTypeRefs(String name) {
        super(name);
    }

    public static NamedTypeRef charRef() {
        return new BasicTypeRefs("C");
    }

    public static NamedTypeRef shortRef() {
        return new BasicTypeRefs("S");
    }

    public static NamedTypeRef intRef() {
        return new BasicTypeRefs("I");
    }

    public static NamedTypeRef longRef() {
        return new BasicTypeRefs("J");
    }

    public static NamedTypeRef voidRef() {
        return new BasicTypeRefs("V");
    }

    public static NamedTypeRef stringRef() {
        return new ClassTypeRef("java.lang.String");
    }
}
