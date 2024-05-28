package decorator;

public class UserPolicy extends PolicyDecorator{
    public UserPolicy(Policy source) {
        super(source);
    }

    @Override
    public void createTicket() {
        System.out.println("You can not create a ticket");
    }

    @Override
    public void deleteTicket() {
        System.out.println("You can not delete a ticket");
    }

    @Override
    public void updateTicket() {
        System.out.println("You can not update a ticket");
    }

}
