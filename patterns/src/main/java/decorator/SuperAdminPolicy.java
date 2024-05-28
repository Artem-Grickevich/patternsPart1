package decorator;

public class SuperAdminPolicy implements Policy {

    @Override
    public void createTicket() {
        System.out.println("You can create tickets");
    }

    @Override
    public void deleteTicket() {
        System.out.println("You can delete tickets");
    }

    @Override
    public void updateTicket() {
        System.out.println("You can update tickets");
    }

    @Override
    public void viewTicket() {
        System.out.println("You can view tickets");
    }
}
