package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.ExprNode.ExprNode;
import com.simplejava.ast.Location;
import com.simplejava.ast.TypeNode;

public class Parameter extends Variable {
    public Parameter(Location location, TypeNode typeNode, String name, ExprNode init) {
        super(location, typeNode, name, init);
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("type", typeNode);
        dumper.printMember("name", name);
        if (hasInitialize())
            dumper.printMember("init", init);
    }
}
