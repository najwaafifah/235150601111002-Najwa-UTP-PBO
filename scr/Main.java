import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema("UTP A Cinema", 3); 
        User currentUser = null; 

        while (true) {
            System.out.println("------------------");
            System.out.println("UTP A Cinema");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Pick your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (currentUser != null) {
                        System.out.println("You are already logged in!");
                    } else {
                        System.out.println("Login to our system");
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Password: ");
                        String password = scanner.nextLine();

                        
                        currentUser = cinema.authenticateUser(email, password);
                        if (currentUser != null) {
                            System.out.println("Login successfully");
                            System.out.println("Welcome " + currentUser.getFullName() + " to " + cinema.getName() + "!");
                        } else {
                            System.out.println("Login failed. Invalid email or password.");
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Register to our system");
                    System.out.print("Fullname: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Password: ");
                    String regPassword = scanner.nextLine();
                    System.out.print("Initial balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); 

                    
                    User newUser = new User(email, regPassword, fullName, balance);
                    boolean registered = cinema.registerUser(newUser);
                    if (registered) {
                        System.out.println("Successfully registered user!");
                    } else {
                        System.out.println("Registration failed. Please try again later.");
                    }
            }
                    
            
            
            while (currentUser != null) {
                System.out.println("--------------------");
                System.out.println("1. Pesan ticket");
                System.out.println("2. Tampilkan tiket milik saya");
                System.out.println("3. Lihat studio yang ada");
                System.out.println("4. Lihat detail studio");
                System.out.println("5. Top up saldo");
                System.out.println("6. Exit program");
                System.out.print("Pick your choice: ");
                int userChoice = scanner.nextInt();
                scanner.nextLine(); 
            }
        }
    }
}
