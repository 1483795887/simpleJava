package com.simplejava.ast;

import com.simplejava.entity.ClassEntity;

import java.util.ArrayList;
import java.util.List;

public class Declarations {
    private List<ClassEntity> classEntityList;

    public Declarations() {
        classEntityList = new ArrayList<>();
    }

    public void addClass(ClassEntity entity) {
        classEntityList.add(entity);
    }

    public List<ClassEntity> getClassEntityList() {
        return classEntityList;
    }
}
