package codeGenerator;

import java.util.ArrayList;

/**
 * Created by mohammad hosein on 6/27/2015.
 */
public class Memory {
    private ArrayList<_3AddressCode> codeBlock;
    private int lastTempIndex;
    private int lastDataAddress;
    private final int startTempMemoryAddress = 500;
    private final int startDataMemoryAddress = 200;
    private final int dataSize = 4;
    private final int tempSize = 4;

    public Memory() {
        codeBlock = new ArrayList<_3AddressCode>();
        lastTempIndex = startTempMemoryAddress;
        lastDataAddress = startDataMemoryAddress;
    }

    // Modifier methods
    public void incrementTemp() {
        lastTempIndex += tempSize;
    }

    public void incrementDataAddress() {
        lastDataAddress += dataSize;
    }

    // Query methods
    public int getCurrentTemp() {
        return lastTempIndex;
    }

    public int getCurrentDataAddress() {
        return lastDataAddress;
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.add(new _3AddressCode(op, opr1, opr2, opr3));
    }

    public int saveMemory() {
        _3AddressCode newCode = new _3AddressCode();
        codeBlock.add(newCode);
        return codeBlock.indexOf(newCode);
    }
}

class _3AddressCode {
    private Operation operation;
    private Address Operand1;
    private Address Operand2;
    private Address Operand3;

    public _3AddressCode() {
    }

    public _3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        this.operation = op;
        this.Operand1 = opr1;
        this.Operand2 = opr2;
        this.Operand3 = opr3;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Address getOperand1() {
        return Operand1;
    }

    public void setOperand1(Address Operand1) {
        this.Operand1 = Operand1;
    }

    public Address getOperand2() {
        return Operand2;
    }

    public void setOperand2(Address Operand2) {
        this.Operand2 = Operand2;
    }

    public Address getOperand3() {
        return Operand3;
    }

    public void setOperand3(Address Operand3) {
        this.Operand3 = Operand3;
    }

    public String toString() {
        if (operation == null) return "";
        StringBuffer res = new StringBuffer("(");
        res.append(operation.toString()).append(",");
        if (Operand1 != null) res.append(Operand1.toString());
        res.append(",");
        if (Operand2 != null) res.append(Operand2.toString());
        res.append(",");
        if (Operand3 != null) res.append(Operand3.toString());
        res.append(")");

        return res.toString();
    }
}
