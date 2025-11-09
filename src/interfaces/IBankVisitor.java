package interfaces;

import concrete_elements.KaspiBank;
import concrete_elements.HalykBank;
import concrete_elements.FreedomBank;

public interface IBankVisitor {
    void visit(KaspiBank bank);
    void visit(HalykBank bank);
    void visit(FreedomBank bank);
}
