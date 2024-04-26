public class Ticket extend Studio {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studionumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }
    public String getTicketInfo() {}
    public Movie getMovie() {
        return movie;
    }
    public int getStudioNumber() {
        return studioNumber;
    }
    public void setPrice(double price) {}
    public double getPrice() {
        return price;
    }
    public String getSeat() {
        return seat;
    }
    public static double getTicketPrice(String type) {}
}
