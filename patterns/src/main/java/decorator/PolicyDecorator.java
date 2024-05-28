package decorator;

public class PolicyDecorator implements Policy {
    private Policy wrappee;
    public PolicyDecorator(Policy source) {
        this.wrappee = source;
    }


    @Override
    public void createTicket() {
        wrappee.createTicket();
    }

    @Override
    public void deleteTicket() {
        wrappee.deleteTicket();
    }

    @Override
    public void updateTicket() {
        wrappee.updateTicket();
    }

    @Override
    public void viewTicket() {
        wrappee.viewTicket();
    }
}
