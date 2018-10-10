package hotelworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelWorldSystemTest {

    private HotelWorldSystem hotel;
    private PhoneClock phoneClock;

    @Before
    public void setUp() throws Exception {
        this.hotel = new HotelWorldSystem();
        this.phoneClock = new PhoneClock(8);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void the_time_of_clock_Beijing_should_be_0_after_the_the_phone_clock_is_set_to_0_Beijing_time(){
        CityClock beijingClock = new CityClock(8);
        hotel.attach(beijingClock);

        phoneClock.setHotelWorldSystem(hotel);
        phoneClock.setTime(0);

        assertEquals(beijingClock.getTime(), 0);
    }

    @Test
    public void the_time_of_phoneclock_should_be_the_same_as_what_itself_is_set_after_it_is_set_to_1_Beijing_time(){
        phoneClock.setTime(1);
        assertEquals(phoneClock.getTime(), 1);
    }
    @Test
    public void the_time_of_clock_London_and_the_time_of_clock_Moscow_should_be_2_and_6_after_the_the_phone_clock_is_set_to_10_Beijing_time(){
        CityClock londonClock = new CityClock(0);
        CityClock moscowClock = new CityClock(4);
        hotel.attach(londonClock);
        hotel.attach(moscowClock);

        phoneClock.setHotelWorldSystem(hotel);
        phoneClock.setTime(10);
        assertEquals(2, londonClock.getTime());
        assertEquals(6, moscowClock.getTime());

    }



}