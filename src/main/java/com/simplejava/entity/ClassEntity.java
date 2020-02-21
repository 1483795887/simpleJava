package com.simplejava.entity;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;

public class ClassEntity extends Entity {
    private String name;

    public ClassEntity(Location location, String name) {
        this.location = location;
        this.name = name;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("name", name);
    }
}
