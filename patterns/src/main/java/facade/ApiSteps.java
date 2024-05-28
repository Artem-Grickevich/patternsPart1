package facade;

public class ApiSteps {
    //facade
    public Item getItem(String nameEndpoint, String priceEndpoint, String idEndpoint) {
        return new Item(ApiRequests.getName(nameEndpoint), ApiRequests.getPrice(priceEndpoint), ApiRequests.getId(idEndpoint));
    }
}
