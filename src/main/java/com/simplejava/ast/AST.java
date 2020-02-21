package com.simplejava.ast;

import com.simplejava.entity.ClassEntity;

import java.util.List;

public class AST extends Node {

    private Declarations declarations;

    public AST(Location location, Declarations declarations) {
        super(location);
        this.declarations = declarations;
    }

    public List<ClassEntity> getClassEntities() {
        return declarations.getClassEntityList();
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("class", getClassEntities());
    }
}
