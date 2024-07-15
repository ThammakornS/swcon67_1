public class Theater {
    private String movie;
    private Seat seat;
    private String announcement;

    public Theater(String movie, Seat seat) {
        this.movie = movie;
        this.seat = seat;
    }

    public void makeAnnouncement(String announcement){
        announcement = this.announcement;
        System.out.println(announcement);
    }

    public void setAnnouncement(String announcement){
        this.announcement = announcement;
    }
}