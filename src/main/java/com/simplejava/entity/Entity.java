package com.simplejava.entity;

import com.simplejava.ast.Dumpable;
import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;

abstract public class Entity implements Dumpable {
    Location location;

    @Override
    public void dump(Dumper dumper) {
        dumper.printClass(this, location);
        _dump(dumper);
    }

    abstract public void _dump(Dumper dumper);
}
