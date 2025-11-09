package concrete_visitors;

import interfaces.IBankVisitor;
import concrete_elements.FreedomBank;
import concrete_elements.HalykBank;
import concrete_elements.KaspiBank;

public class ConversionVisitor implements IBankVisitor {
    @Override
    public void visit(KaspiBank kbank){
        System.out.println(kbank.getName() + ": The exchange rate for converting KZT to US dollars is 528 KZT per 1 USD.");
    }
    @Override
    public void visit(HalykBank hbank){
        System.out.println(hbank.getName() +": The exchange rate for converting KZT to US dollars is 527 KZT per 1 USD.");
    }
    @Override
    public void visit(FreedomBank fbank){
        System.out.println(fbank.getName() +": The exchange rate for converting KZT to US dollars is 528 KZT per 1 USD.");
    }
}
