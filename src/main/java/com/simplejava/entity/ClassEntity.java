package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;

import java.util.List;

public class ClassEntity extends Entity {
    private String name;
    private AccessSpecifier accessSpecifier;
    private List<Entity> members;

    public ClassEntity(Location location, AccessSpecifier accessSpecifier, String name, List<Entity> members) {
        this.location = location;
        this.accessSpecifier = accessSpecifier;
        this.name = name;
        this.members = members;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("specifier", accessSpecifier.toString());
        dumper.printMember("name", name);
        dumper.printMember("members", members);
    }
}
