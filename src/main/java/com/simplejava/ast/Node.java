package com.simplejava.ast;

abstract public class Node implements Dumpable {
    private Location location;

    public Node(Location location) {
        this.location = location;
    }


    public Location getLocation() {
        return location;
    }

    @Override
    public void dump(Dumper dumper) {
        dumper.printClass(this, location);
        _dump(dumper);
    }

    abstract public void _dump(Dumper dumper);
}
