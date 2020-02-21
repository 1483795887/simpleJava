package com.simplejava.ast.ExprNode;

import com.simplejava.ast.Location;
import com.simplejava.ast.Node;
import com.simplejava.ast.TypeNode;

abstract public class ExprNode extends Node {
    protected TypeNode typeNode;

    public ExprNode(Location location) {
        super(location);
    }

    public TypeNode getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(TypeNode typeNode) {
        this.typeNode = typeNode;
    }
}
