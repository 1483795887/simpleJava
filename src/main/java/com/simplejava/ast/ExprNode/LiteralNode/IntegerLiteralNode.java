package com.simplejava.ast.ExprNode.LiteralNode;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;
import com.simplejava.type.IntegerTypeRef;
import com.simplejava.type.TypeRef;

public class IntegerLiteralNode extends LiteralNode {
    private long value;

    private IntegerLiteralNode(Location location, TypeRef typeRef, long value) {
        super(location, typeRef);
        this.value = value;
    }

    public static IntegerLiteralNode intLiteralNode(Location location, String value) {
        long v;
        value = value.toLowerCase();
        boolean minus = false;
        if (value.charAt(0) == '-')
            minus = true;
        value = value.replaceFirst("-", "");
        if (value.startsWith("0x")) {
            value = value.substring(2);
            v = Long.parseLong(value, 16);
        } else if (value.startsWith("0")) {
            if (value.length() == 1)
                v = 0;
            else {
                value = value.substring(1);
                v = Long.parseLong(value, 8);
            }
        } else
            v = Long.parseLong(value, 10);
        if (minus)
            v = -v;
        return new IntegerLiteralNode(location, IntegerTypeRef.longRef(), v);
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("value", value);
        dumper.printMember("type", typeNode);
    }
}
