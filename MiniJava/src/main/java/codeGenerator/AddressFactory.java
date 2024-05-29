
package main.java.codeGenerator;

import AddressStrings;
import codeGenerator.Address;

public class AddressFactory {
    public Address createAddress(AddressStrings contract) {
        return Address.createAddress(contract.getNum(), contract.getVarType(), contract.getType());
    }
}


