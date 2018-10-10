package hotelworld;

/**
 * @author ZyQin
 */
public class CityClock {
    private int utcOffset;
    private int change;


    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public int getTime() {
        return (this.utcOffset + this.change + 24) % 24;
    }

    public void setChange(int change) {
        this.change = change;
    }
}
