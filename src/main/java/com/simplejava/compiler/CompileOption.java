package com.simplejava.compiler;

import java.util.ArrayList;
import java.util.List;

public class CompileOption {
    private String[] args;
    private List<String> compileFiles;

    public CompileOption(String[] args) {
        this.args = args;
        compileFiles = new ArrayList<>();
        boolean parsedFiles = false;
        for (String arg : args) {
            if (!parsedFiles && arg.charAt(0) != '-') {
                compileFiles.add(arg);
            }
        }
    }

    public List<String> getCompileFiles() {
        return compileFiles;
    }
}
