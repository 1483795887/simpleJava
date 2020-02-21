package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.ExprNode.ExprNode;
import com.simplejava.ast.Location;
import com.simplejava.ast.TypeNode;

public class Variable extends Member {
    private AccessSpecifier accessSpecifier;
    private TypeNode typeNode;
    private String name;
    private ExprNode init;

    public Variable(Location location, TypeNode typeNode, String name, ExprNode init) {
        this.location = location;
        this.name = name;
        this.init = init;
        this.typeNode = typeNode;
        accessSpecifier = AccessSpecifier.PRIVATE;
    }

    public Variable(Location location, AccessSpecifier accessSpecifier, TypeNode typeNode, String name, ExprNode init) {
        this.location = location;
        this.name = name;
        this.init = init;
        this.typeNode = typeNode;
        this.accessSpecifier = accessSpecifier;
    }

    public boolean hasInitialize() {
        return init != null;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("specifier", accessSpecifier.toString());
        dumper.printMember("type", typeNode);
        dumper.printMember("name", name);
        if (hasInitialize())
            dumper.printMember("init", init);
    }
}
