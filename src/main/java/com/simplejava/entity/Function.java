package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;
import com.simplejava.ast.StmtNode.BlockNode;
import com.simplejava.ast.TypeNode;
import com.simplejava.type.TypeRef;

public class Function extends Entity {
    private String name;
    private TypeNode typeNode;
    private BlockNode body;
    private AccessSpecifier accessSpecifier;

    public Function(Location location, AccessSpecifier accessSpecifier, TypeRef typeRef, String name, BlockNode body) {
        this.location = location;
        this.name = name;
        this.typeNode = new TypeNode(location, typeRef);
        this.body = body;
        this.accessSpecifier = accessSpecifier;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("specifier", accessSpecifier.toString());
        dumper.printMember("name", name);
        dumper.printMember("type", typeNode);
        dumper.printMember("body", body);
    }
}
