package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Neil on 2/20/2017.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12() ;
        BigDecimal cToFResult = service.celsiusToFahrenheit( BigDecimal.valueOf(0.0) ) ;
        assertEquals( "The Celcius to Fahrenheit failed", BigDecimal.valueOf(32), cToFResult ) ;
    }
}