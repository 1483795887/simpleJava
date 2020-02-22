package com.simplejava.ast.StmtNode;

import com.simplejava.ast.Location;
import com.simplejava.ast.Node;

abstract public class StmtNode extends Node {
    public StmtNode(Location location) {
        super(location);
    }
}
