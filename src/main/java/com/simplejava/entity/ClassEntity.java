package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;

public class ClassEntity extends Entity {
    private String name;
    private AccessSpecifier accessSpecifier;

    public ClassEntity(Location location, AccessSpecifier accessSpecifier, String name) {
        this.location = location;
        this.accessSpecifier = accessSpecifier;
        this.name = name;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("specifier", accessSpecifier.toString());
        dumper.printMember("name", name);
    }
}
