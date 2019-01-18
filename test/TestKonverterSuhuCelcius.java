/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import konvertersuhu.KonverterSuhu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ASatya
 */
@RunWith(Parameterized.class)
public class TestKonverterSuhuCelcius {
    
    private double input, expectedCelcius, expectedFahrenheit, expectedReamur, expectedKelvin;
    
    public TestKonverterSuhuCelcius(double input, double expectedCelcius, double expectedFahrenheit, double expectedReamur, double expectedKelvin) {
        this.input = input;
        this.expectedCelcius = expectedCelcius;
        this.expectedFahrenheit = expectedFahrenheit;
        this.expectedReamur = expectedReamur;
        this.expectedKelvin = expectedKelvin;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //buat parameter untuk input, expectedCelcius, expectedFahrenheit, expectedReamur, expectedKelvin
    
    @Parameterized.Parameters
    public static Collection<Double[]> parameterNumber() {
        return Arrays.asList(new Double[][]{{32.0, 32.0, 89.6, 25.6, 305.15}});
    }
    
    @Test
    public  void testCelcius(){
        KonverterSuhu ks = new KonverterSuhu();
        double[] result = ks.celcius(input);

        assertEquals(expectedCelcius, result[0], 0.0);
        assertEquals(expectedFahrenheit, result[1], 0.0);
        assertEquals(expectedReamur, result[2], 0.0);
        assertEquals(expectedKelvin, result[3], 0.0);
    }
    
    
}
