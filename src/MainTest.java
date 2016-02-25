import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Youmin on 2/24/2016.
 */

public class MainTest {
    int a[] = {5,2,1};
    int b[] = {9,6,24};
    int result[] = {-9,-6,-24};

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGcd() throws Exception {
        Main main = new Main();
        for(int i = 0; i < a.length; i++) {
            int c = main.unit(a[i], b[i]);
            assertEquals(c, result[i]);
        }
    }
}


