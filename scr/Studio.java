public class Studio extends Cinema{
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        setSeats();
    }

    public String getStudioInfo() {
        return Studio;
    }

    public int isBooked(char row, int col) {
        
    }

    public boolean reserve(char row, int col) {
        
    }

    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
    
    }

    public void setSeats() {
    
    }
}
