import concrete_elements.FreedomBank;
import concrete_elements.HalykBank;
import concrete_elements.KaspiBank;
import concrete_visitors.AdvertisementVisitor;
import concrete_visitors.ConversionVisitor;
import interfaces.IBank;
import interfaces.IBankVisitor;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<IBank> banks = new ArrayList<>();
        banks.add(new KaspiBank("Kaspi Bank"));
        banks.add(new HalykBank("Halyk Bank"));
        banks.add(new FreedomBank("Freedom Bank"));

        IBankVisitor visitor1 = new AdvertisementVisitor();
        IBankVisitor visitor2 = new ConversionVisitor();

        System.out.println("Advertisement:");
        for (IBank b : banks) {
            b.accept(visitor1);
        }
        System.out.println();
        System.out.println("Conversion:");
        for (IBank b : banks) {
            b.accept(visitor2);
        }
    }
}
