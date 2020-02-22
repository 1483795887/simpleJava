package com.simplejava.entity;

import com.simplejava.ast.Dumpable;
import com.simplejava.ast.Dumper;
import com.simplejava.type.ParamTypeRef;
import com.simplejava.type.TypeRef;

import java.util.ArrayList;
import java.util.List;

public class Params extends ParamSlot<Parameter> implements Dumpable {
    public Params(List<Parameter> params) {
        super(params);

    }

    public ParamTypeRef getTypeRef() {
        List<TypeRef> typeRefs = new ArrayList<>();
        for (Parameter parameter : params) {
            typeRefs.add(parameter.typeNode.getTypeRef());
        }
        return new ParamTypeRef(typeRefs);
    }

    @Override
    public void dump(Dumper dumper) {
        dumper.printMember("params", params);
    }
}
