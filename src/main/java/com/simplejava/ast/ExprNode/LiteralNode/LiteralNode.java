package com.simplejava.ast.ExprNode.LiteralNode;

import com.simplejava.ast.ExprNode.ExprNode;
import com.simplejava.ast.Location;
import com.simplejava.ast.TypeNode;
import com.simplejava.type.TypeRef;

abstract public class LiteralNode extends ExprNode {
    public LiteralNode(Location location, TypeRef typeRef) {
        super(location);
        this.typeNode = new TypeNode(location, typeRef);
    }
}
