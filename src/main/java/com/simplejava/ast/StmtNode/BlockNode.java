package com.simplejava.ast.StmtNode;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Location;

import java.util.List;

public class BlockNode extends StmtNode {
    private List<StmtNode> stmtList;

    public BlockNode(Location location, List<StmtNode> stmtList) {
        super(location);
        this.stmtList = stmtList;
    }

    @Override
    public void _dump(Dumper dumper) {
        dumper.printMember("statements", stmtList);
    }
}
