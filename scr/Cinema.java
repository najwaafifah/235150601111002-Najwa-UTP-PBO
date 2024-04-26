public class Cinema extends User {
    private String name;
    private User[] listUsers;
    private Studio[] listStudios;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
        this.listUsers = new User[0];
        this.listStudios = new Studio[studioCapacity];
        init();
    }

    private void init() {
        addStudioWithMovies("Imax", "Inception", 9.5, new String[] {"Action", "Thriller", "Science Fiction"});
        addStudioWithMovies("Imax", "Siksa kuburrr", 9.4, new String[]{"Action", "Horror", "Drama"});
        addStudioWithMovies("Premiere", "Interstellar", 9.8, new String[]{"Sci-Fi", "Adventure", "Drama"});
        addStudioWithMovies("Reguler", "The Shawshank Redemption", 9.3, new String[]{"Drama", "Thriller"});
        addStudioWithMovies("Imax", "Avatar", 9.5, new String[] {"Action", "Adventure", "Science Fiction"});
        addStudioWithMovies("Premiere", "The Godfather", 9.2, new String[] {"Action", "Thriller", "Science Fiction"});
        addStudioWithMovies("Reguler", "The Lord of the Rings : The Fellowship of the Ring", 9.5, new String[] {"Action", "Thriller", "Science Fiction"});
        addStudioWithMovies("Premiere", "The Shawshank Redemption", 8.6, new String[] {"Action", "Thriller", "Science Fiction"});
        addStudioWithMovies("Imax", "Barbie", 9.5, new String[] {"Action", "Thriller", "Science Fiction"});
        addStudioWithMovies("Reguler", "Miracle in 7", 9.5, new String[] {"Action", "Thriller", "Science Fiction"});
        
    }

    public boolean registerUser(User user) {
        System.out.println("Register to our system");
        System.out.println("Full Name : " + getFullName());
        System.out.println("Email : " + getEmail());
        System.out.println("Password : " + getPassword());
        System.out.println("Inicial balance : " + getBalance());
        System.out.println("Succesfully registered User");

    }

    public User authenticateUser(String email, String password) {
    
    }

    public void displayListStudio() {
        
    }

    public void displayStudioDetail(int studioNumber) {
       
    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres) {
    
    }

    public boolean bookTicket(User user, int studioNumber, char row, int col) {
        
    }

    public String getName() {
        return name;
    }
}
