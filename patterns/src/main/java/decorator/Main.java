package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("user Policy");
        PolicyDecorator userPolicy = new UserPolicy(new SuperAdminPolicy());
        userPolicy.createTicket();
        userPolicy.deleteTicket();
        userPolicy.updateTicket();
        userPolicy.viewTicket();

        System.out.println("manager Policy");
        PolicyDecorator managerPolicy = new ManagerPolicy(new SuperAdminPolicy());
        managerPolicy.createTicket();
        managerPolicy.deleteTicket();
        managerPolicy.updateTicket();
        managerPolicy.viewTicket();

    }
}