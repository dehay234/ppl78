package Data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsInfoTest {
    @Test
    public void testShowFlowers(){
        assertEquals(true,ItemsInfo.showFlowers());
    }
    @Test
    public void testShowAccessories(){
        assertEquals(true,ItemsInfo.showAccessories());
    }

}