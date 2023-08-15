
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

// El objetivo de los tests es comprobar que el método ConversionARomanos arroja correctamente los valores asignados en los arrays
public class ConversionARomanosTest {
    ConversionARomanos conversionARomanos;
    String numero;

    @Before
    public void init(){
        conversionARomanos = new ConversionARomanos();
        numero = "";
    }

    //Con los 9 primeros test compruebo los elementos del array numerosUnidades
    @Test
    public void testConversion(){
        numero = conversionARomanos.conversionNumero(1);
        Assert.assertEquals("I",numero);
    }

    @Test
    public void testConversion2(){
        numero = conversionARomanos.conversionNumero(2);
        Assert.assertEquals("II", numero);
    }

    @Test
    public void testConversion3(){
        numero = conversionARomanos.conversionNumero(3);
        Assert.assertEquals("III", numero);
    }
    @Test
    public void testConversion4(){
        numero = conversionARomanos.conversionNumero(4);
        Assert.assertEquals("IV", numero);
    }

    @Test
    public void testConversion5(){
        numero = conversionARomanos.conversionNumero(5);
        Assert.assertEquals("V", numero);
    }

    @Test
    public void testConversion6(){
        numero = conversionARomanos.conversionNumero(6);
        Assert.assertEquals("VI", "VI");
    }

    @Test
    public void testConversion7(){
        numero = conversionARomanos.conversionNumero(7);
        Assert.assertEquals("VII",numero);
    }
    @Test
    public void testConversion8(){
        numero = conversionARomanos.conversionNumero(8);
        Assert.assertEquals("VIII", numero);
    }

    @Test
    public void testConversion9(){
        numero = conversionARomanos.conversionNumero(9);
        Assert.assertEquals("IX", numero);
    }
// Desde el test10 al test77 compruebo elementos del array numeroDecenas
    // En tests de otros arrays comprobaré el resto de elementos de este array
    @Test
    public void testConversion10(){
        numero = conversionARomanos.conversionNumero(10);
        Assert.assertEquals("X",numero);
    }

    @Test
    public void testConversion14(){
        numero = conversionARomanos.conversionNumero(14);
        Assert.assertEquals("XIV", numero);
    }

    @Test
    public void testConversion16(){
        numero = conversionARomanos.conversionNumero(16);
        Assert.assertEquals("XVI",numero);
    }

    @Test
    public void testConversion24(){
        numero = conversionARomanos.conversionNumero(24);
        Assert.assertEquals("XXIV", numero);
    }

    @Test
    public void testConversion36(){
        numero = conversionARomanos.conversionNumero(36);
        Assert.assertEquals("XXXVI", numero);
    }

    @Test
    public void testConversion49(){
        numero = conversionARomanos.conversionNumero(49);
        Assert.assertEquals("XLIX", numero);
    }

    @Test
    public void testConversion50(){
        numero = conversionARomanos.conversionNumero(50);
        Assert.assertEquals("L", numero);
    }

    @Test
    public void testConversion77(){
        numero = conversionARomanos.conversionNumero(77);
        Assert.assertEquals("LXXVII", numero);
    }
    //Del test100 al test999 compruebo elementos del array numerosDecenas
    //También compruebo elementos del array numerosCentenas
    @Test
    public void testConversion100(){
        numero = conversionARomanos.conversionNumero(100);
        Assert.assertEquals("C", numero);
    }

    @Test
    public void testConversion101(){
        numero = conversionARomanos.conversionNumero(101);
        Assert.assertEquals("CI", numero);
    }

    @Test
    public void testConversion122(){
        numero = conversionARomanos.conversionNumero(122);
        Assert.assertEquals("CXXII", numero);
    }

    @Test
    public void testConversion158(){
        numero = conversionARomanos.conversionNumero(158);
        Assert.assertEquals("CLVIII", numero);
    }

    @Test
    public void testConversion234(){
        numero = conversionARomanos.conversionNumero(234);
        Assert.assertEquals("CCXXXIV", numero);
    }

    @Test
    public void testConversion372(){
        numero = conversionARomanos.conversionNumero(372);
        Assert.assertEquals("CCCLXXII", numero);
    }

    @Test
    public void testConversion500(){
        numero = conversionARomanos.conversionNumero(500);
        Assert.assertEquals("D", numero);
    }

    @Test
    public void testConversion566(){
        numero = conversionARomanos.conversionNumero(566);
        Assert.assertEquals("DLXVI", numero);
    }

    @Test
    public void testConversion893(){
        numero = conversionARomanos.conversionNumero(893);
        Assert.assertEquals("DCCCXCIII", numero);
    }

    @Test
    public void testConversion999(){
        numero = conversionARomanos.conversionNumero(999);
        Assert.assertEquals("CMXCIX", numero);
    }
    // Del test1000 al test3000 compruebo los elementos que faltaban del array numerosCentenas
    // También compruebo los 3 elementos del array numeroMiles
    @Test
    public void testConversion1000(){
        numero = conversionARomanos.conversionNumero(1000);
        Assert.assertEquals("M", numero);
    }

    @Test
    public void testConversion1400(){
        numero = conversionARomanos.conversionNumero(1400);
        Assert.assertEquals("MCD", numero);
    }

    @Test
    public void testConversion2000(){
        numero = conversionARomanos.conversionNumero(2000);
        Assert.assertEquals("MM", numero);
    }

    @Test
    public void testConversion2600(){
        numero = conversionARomanos.conversionNumero(2600);
        Assert.assertEquals("MMDC", numero);
    }

    @Test
    public void testConversion2700(){
        numero = conversionARomanos.conversionNumero(2700);
        Assert.assertEquals("MMDCC", numero);
        }

        @Test
    public void testConversion3000(){
        numero = conversionARomanos.conversionNumero(3000);
        Assert.assertEquals("MMM", numero);
        }
    }

