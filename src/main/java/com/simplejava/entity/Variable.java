package com.simplejava.entity;

import com.simplejava.ast.ExprNode.ExprNode;
import com.simplejava.ast.Location;
import com.simplejava.ast.TypeNode;

abstract public class Variable extends Entity {
    protected TypeNode typeNode;
    protected String name;
    protected ExprNode init;

    public Variable(Location location, TypeNode typeNode, String name, ExprNode init) {
        this.location = location;
        this.typeNode = typeNode;
        this.name = name;
        this.init = init;
    }

    public boolean hasInitialize() {
        return init != null;
    }
}
