package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    public void price_per_night_is_correct(){
        Reservation today = new Reservation();
        today.setPricePerNight(10.00);
        assertEquals(today.getPricePerNight(), 10);
    }

}