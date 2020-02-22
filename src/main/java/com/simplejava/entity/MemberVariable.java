package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.ExprNode.ExprNode;
import com.simplejava.ast.Location;
import com.simplejava.ast.TypeNode;

public class MemberVariable extends Variable {
    private AccessSpecifier accessSpecifier;


    public MemberVariable(Location location, TypeNode typeNode, String name, ExprNode init) {
        super(location, typeNode, name, init);
        accessSpecifier = AccessSpecifier.PRIVATE;
    }

    public MemberVariable(Location location, AccessSpecifier accessSpecifier, TypeNode typeNode, String name, ExprNode init) {
        super(location, typeNode, name, init);
        this.accessSpecifier = accessSpecifier;
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
