package abstractfactory;


import abstractfactory.delivery.AirDeliveryFactory;
import abstractfactory.delivery.RailroadDeliveryFactory;
import abstractfactory.delivery.SeaDeliveryFactory;

public class Main {

    private static final App airDelivery = new App(new AirDeliveryFactory());
    private static final App seaDelivery = new App(new SeaDeliveryFactory());
    private static final App railroadDelivery = new App(new RailroadDeliveryFactory());

    public static void main(String[] args) {
        //dafsdfsdfsdf
        airDelivery.pack();
        System.out.println("_________________________");
        seaDelivery.pack();
        System.out.println("_________________________");
        railroadDelivery.pack();
    }
}