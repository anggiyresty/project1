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

@RunWith(Parameterized.class)
public class TestKonverterSuhuKelvin {
    
    private double input, expectedCelcius, expectedFahrenheit, expectedReamur, expectedKelvin;
    
    public TestKonverterSuhuKelvin(double input, double expectedCelcius, double expectedFahrenheit, double expectedReamur, double expectedKelvin) {
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
        return Arrays.asList(new Double[][]{{305.15, 32.0, 89.59999999999997, 25.6, 305.15}});
    }

    @Test
    public  void testKelvin(){
        KonverterSuhu ks = new KonverterSuhu();
        double[] result = ks.kelvin(input);

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
