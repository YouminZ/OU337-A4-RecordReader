import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Youmin on 2/24/2016.
 */

public class MainTest {
    int field1[] = {0,4,5,-3,-5,-19,0,0,0,3,6,3,-1,-1,-1,0,0,0,1,1,1};
    int field2[] = {5,0,9,-4,0,5,-6,0,2,-8,0,9,-1,0,1,-1,0,1,-1,0,1};
    int total[] = {0,0,-9,4,0,-5,0,0,0,8,0,-9,1,0,-1,0,0,0,1,0,-1};

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testUnit() throws Exception {
        Main main = new Main();
        for(int i = 0; i < field1.length; i++) {
            int expected = main.unit(field1[i], field2[i]);
            assertEquals(expected, total[i]);
        }
    }
}


