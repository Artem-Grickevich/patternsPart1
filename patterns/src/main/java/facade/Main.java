package facade;

public class Main {
    public static void main(String[] args) {
        ApiSteps apiSteps = new ApiSteps();
        Item item = apiSteps.getItem("name", "price", "id");
        System.out.println(item);
    }
}