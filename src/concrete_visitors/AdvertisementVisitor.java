package concrete_visitors;

import concrete_elements.FreedomBank;
import concrete_elements.HalykBank;
import concrete_elements.KaspiBank;
import interfaces.IBankVisitor;

public class AdvertisementVisitor implements IBankVisitor {
    @Override
    public void visit(KaspiBank kbank){
        System.out.println(kbank.getName() + ":We create innovative services that make the lives of Kazakhstanis better!");
    }
    @Override
    public void visit(HalykBank hbank){
        System.out.println(hbank.getName() +":Our task is to make great things out of beautiful things!");
    }
    @Override
    public void visit(FreedomBank fbank){
        System.out.println("The " + fbank.getName() +"'s goal is to become a leader in its segment, specifically in providing financial services to the general public.");
    }
}
