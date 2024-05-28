package abstractfactory.packages.bigbox;

public class BigBoxForRailroad implements IBigBox{
    @Override
    public void pack() {
        System.out.println("pack big box which will be delivered by Railroad");
    }
}
