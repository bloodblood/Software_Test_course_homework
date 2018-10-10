package hotelworld;

import java.util.ArrayList;

/**
 * @author ZyQin
 */
public class HotelWorldSystem {
    private ArrayList<CityClock> cityClocks = new ArrayList<CityClock>();

    public ArrayList<CityClock> getCityClocks() {
        return cityClocks;
    }
    public void attach (CityClock cityClock){

        this.cityClocks.add(cityClock);
    }
}
