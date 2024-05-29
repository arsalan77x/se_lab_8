package main.java.scanner;

import scanner.token.Token;
import scanner.type.Type;

public class ScannerFactory {
    public Type getType(String s) {
        return Token.getTyepFormString(s);
    }
}



