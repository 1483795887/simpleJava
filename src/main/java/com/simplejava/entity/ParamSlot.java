package com.simplejava.entity;

import java.util.List;

abstract public class ParamSlot<T> {
    protected List<T> params;

    public ParamSlot(List<T> params) {
        this.params = params;
    }

    public List<T> getParams() {
        return params;
    }
}
