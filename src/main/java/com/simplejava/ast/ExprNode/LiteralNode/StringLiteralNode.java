package com.simplejava.ast.ExprNode.LiteralNode;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;
import com.simplejava.type.BasicTypeRefs;
import com.simplejava.utils.TextUtils;

public class StringLiteralNode extends LiteralNode {
    private String value;

    public StringLiteralNode(Location location, String value) {
        super(location, BasicTypeRefs.stringRef());
        this.value = TextUtils.getStringReal(value);
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("value", TextUtils.getDumpString(value));
        dumper.printMember("type", typeNode);
    }
}
