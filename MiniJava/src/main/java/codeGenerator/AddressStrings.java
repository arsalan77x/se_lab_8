package main.java.codeGenerator;

public class AddressStrings {
    private int num;
    private String varType;
    private String Type;

    public AddressStrings(int num, String varType, String type) {
        this.num = num;
        this.varType = varType;
        Type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}