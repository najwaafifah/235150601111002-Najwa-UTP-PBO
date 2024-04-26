public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;
    private static int MAX_TICKET;

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }
    public boolean addTicket(Ticket ticket) {

    }
    public void displayAllTickets() {

    }
    public boolean isMatch(String email, String password) {

    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getFullName() {
        return fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {}
}