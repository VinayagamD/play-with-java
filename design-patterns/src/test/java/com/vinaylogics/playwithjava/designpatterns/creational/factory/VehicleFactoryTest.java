package com.vinaylogics.playwithjava.designpatterns.creational.factory;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit testing for Vehicle Factory Test")
class VehicleFactoryTest {
    VehicleFactory factory;

    @BeforeEach
    public void setUp(){
        factory = VehicleFactory.INSTANCE;
        assertNotNull(factory);
    }

    @DisplayName("Test case for null types")
    @Test
    public void testCreate_NullType(){
        try {
            factory.create(null);
            fail("Expected factory exception");
        } catch (FactoryExceptions e) {
            assertNotNull(e);
            assertEquals(e.getMessage(),"Type Cannot be null" );
        }
    }

    @DisplayName("Test Case for Two wheeler creation")
    @Test
    public void testCreate_TwoWheeler(){
        Vehicle actual = new TwoWheeler();
        Vehicle expected = factory.create(Vehicle.VehicleType.TWO_WHEELER);
        assertNotNull(expected);
        assertEquals(actual.getVehicle(),expected.getVehicle());
    }

    @DisplayName("Test Case for Three wheeler creation")
    @Test
    public void testCreate_ThreeWheeler(){
        Vehicle actual = new ThreeWheeler();
        Vehicle expected = factory.create(Vehicle.VehicleType.THREE_WHEELER);
        assertNotNull(expected);
        assertEquals(actual.getVehicle(),expected.getVehicle());
    }

    @DisplayName("Test Case for Four wheeler creation")
    @Test
    public void testCreate_FourWheeler(){
        Vehicle actual = new FourWheeler();
        Vehicle expected = factory.create(Vehicle.VehicleType.FOUR_WHEELER);
        assertNotNull(expected);
        assertEquals(actual.getVehicle(),expected.getVehicle());
    }

}