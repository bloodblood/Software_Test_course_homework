package hotelworld;

/**
 * @author ZyQin
 */
public class PhoneClock {
    private int time;
    private int utcOffset;
    private HotelWorldSystem hotelWorldSystem = new HotelWorldSystem();
    public void setTime(int time){
        this.time = time;
        if (hotelWorldSystem == null) {return;}
        for(CityClock cityClock : this.hotelWorldSystem.getCityClocks()){
            cityClock.setChange(time - this.utcOffset);
        }
    }

    public void setHotelWorldSystem(HotelWorldSystem hotelWorldSystem) {
        this.hotelWorldSystem = hotelWorldSystem;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public int getTime() {
        return this.time;
    }
    public PhoneClock (int utcOffset){
        this.utcOffset = utcOffset;
    }
}
