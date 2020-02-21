package com.simplejava.compiler;

import com.simplejava.ast.Dumper;
import com.simplejava.ast.Node;
import com.simplejava.exception.CompileException;
import com.simplejava.exception.SyntaxException;
import com.simplejava.parser.ParseException;
import com.simplejava.parser.Parser;
import com.simplejava.parser.TokenMgrError;
import com.simplejava.utils.ErrorHandler;

import java.io.*;

public class Compiler {
    private static final String SOURCE_ENCODED = "utf-8";

    private ErrorHandler errorHandler;
    private Dumper dumper;

    private Compiler() {
        dumper = new Dumper(System.out);
        errorHandler = new ErrorHandler(System.err);
    }

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        CompileOption option = new CompileOption(args);
        for (String filePath : option.getCompileFiles()) {
            try {
                compiler.compile(filePath);
            } catch (CompileException e) {
                compiler.errorHandler.error(e.getMessage());
            }
        }
    }

    private Parser getParser(File file) throws SyntaxException {
        try {
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file),
                            SOURCE_ENCODED));
            return new Parser(r, file.getPath());
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new SyntaxException(e.getMessage());
        }
    }

    private Node parseFile(String path) throws SyntaxException {
        File file = new File(path);
        Parser parser = getParser(file);
        try {
            return parser.primary();
        } catch (ParseException | TokenMgrError e) {
            throw new SyntaxException(e.getMessage());
        }
    }

    private void compile(String path) throws CompileException {
        Node node = parseFile(path);
        node.dump(dumper);
    }
}
