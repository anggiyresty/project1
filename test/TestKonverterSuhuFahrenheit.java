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
public class TestKonverterSuhuFahrenheit {
    
    private double input, expectedCelcius, expectedFahrenheit, expectedReamur, expectedKelvin;
    
    public TestKonverterSuhuFahrenheit(double input, double expectedCelcius, double expectedFahrenheit, double expectedReamur, double expectedKelvin) {
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

    @Parameterized.Parameters
    public static Collection<Double[]> parameterNumber() {
        return Arrays.asList(new Double[][]{{89.6, 31.999999999999996, 89.6, 25.599999999999998, 305.15}});
    }

    @Test
    public  void testFahrenheit(){
        KonverterSuhu ks = new KonverterSuhu();
        double[] result = ks.fahrenheit(input);

        assertEquals(expectedCelcius, result[0], 0.0);
        assertEquals(expectedFahrenheit, result[1], 0.0);
        assertEquals(expectedReamur, result[2], 0.0);
        assertEquals(expectedKelvin, result[3], 0.0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
