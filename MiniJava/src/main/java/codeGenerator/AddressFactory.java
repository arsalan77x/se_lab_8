
package main.java.codeGenerator;

import AddressStrings;
import codeGenerator.Address;

public class AddressFactory {
    public Address createAddress(AddressStrings strings) {
        return Address.createAddress(strings.getNum(), strings.getVarType(), strings.getType());
    }
}


