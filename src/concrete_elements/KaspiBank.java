package concrete_elements;
import interfaces.IBank;
import interfaces.IBankVisitor;

public class KaspiBank implements IBank {
    private final String name;
    public KaspiBank(String name) {
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
