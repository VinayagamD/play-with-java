package com.vinaylogics.playwithjava.designpatterns.creational.factory;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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
    @ParameterizedTest(name = "{index} => type=''{0}''")
    @EnumSource(value = Vehicle.VehicleType.class, names = {"TWO_WHEELER", "THREE_WHEELER", "FOUR_WHEELER"})
    public void testCreate(Vehicle.VehicleType type){
        Vehicle actual = null;
        switch (type){
            case TWO_WHEELER:
                actual = new TwoWheeler();
                break;
            case THREE_WHEELER:
                actual = new ThreeWheeler();
                break;
            case FOUR_WHEELER:
                actual = new FourWheeler();
                break;
            default:
                fail("Invalid type passed");
        }
        Vehicle expected = factory.create(type);
        assertNotNull(expected);
        assertEquals(actual.getVehicle(),expected.getVehicle());
    }

}