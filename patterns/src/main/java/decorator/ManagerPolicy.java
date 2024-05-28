package decorator;

public class ManagerPolicy extends PolicyDecorator {
    public ManagerPolicy(Policy source) {
        super(source);
    }

    @Override
    public void deleteTicket() {
        System.out.println("You can not delete tickets");
    }
}
