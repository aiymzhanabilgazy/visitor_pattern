package concrete_elements;

import interfaces.IBank;
import interfaces.IBankVisitor;

public class FreedomBank implements IBank {
    private final String name;

    public FreedomBank(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void accept(IBankVisitor visitor) {
        visitor.visit(this);
    }
}
