package abstractfactory.packages.box;

public class BoxForRailroad implements IBox{
    @Override
    public void pack() {
        System.out.println("pack box which will be delivered by Railroad");
    }
}
