package MainBouquet;

import BouquetParts.Accessory;
import BouquetParts.Flower;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class BouquetTest {

    @Test
    public void testAddingIntoEmptyBouquet(){
        Flower f = new Flower("Rose",1,20,30);
        new Bouquet(1);
        Bouquet.addFlower(f);
        assertEquals(f,Bouquet.getFlowers().get(0));

    }
    @Test
    public void testAddingIntoFullBouquet(){
        Flower f = new Flower("Rose",1,20,30);
        new  Bouquet(1);
        new Bouquet();
        Bouquet.addFlower(new Flower("Lotus",2,12,40));
        Bouquet.addFlower(new Flower("Anemonia",3,16,42));
        Bouquet.addFlower(f);
        assertEquals(f,Bouquet.getFlowers().get(Bouquet.getFlowers().size()-1));
    }
    @Test
    public void testShowingBouquet(){
        new  Bouquet(1);
        assertTrue(Bouquet.showBouquet());
    }
    @Test
    public void showNotEmptyBouquet(){
        new  Bouquet(1);
        Bouquet.addFlower(new Flower("Lotus",2,12,40));
        Bouquet.addAccessory(new Accessory("Chocholate",200));
        assertTrue(Bouquet.showBouquet());
    }

    @Test
    public void testAddingAccessory(){
        Accessory acc = new Accessory("Balloon",100);
        new  Bouquet(1);
        Bouquet.addAccessory(new Accessory("Chocholate",200));
        Bouquet.addAccessory(new Accessory("Chocholate",150));
        Bouquet.addAccessory(acc);
        assertEquals(acc,Bouquet.getAccessories().get(Bouquet.getAccessories().size()-1));
    }

    @Test
    public void testSorting(){
        new  Bouquet(1);
        Bouquet.addFlower(new Flower("Lotus",2,12,40));
        Bouquet.addFlower(new Flower("Anemonia",3,16,42));
        Bouquet.addFlower(new Flower("Rose",1,20,30));
        new Bouquet().sort();
    }

    @Test
    public void testDeletingAccessory() throws UnsupportedEncodingException {
        new Bouquet(1);
        Accessory acc = new Accessory("Balloon",150);
        Bouquet.addAccessory(acc);
        Bouquet.addAccessory(acc);

        int countBefore=0,countAfter=0;
        for(Accessory a:Bouquet.getAccessories()){
            if(a.equals(acc))
                countBefore++;
        }

        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            Bouquet.deleteAccessory();
        } finally {
            System.setIn( old );
        }

        for(Accessory a:Bouquet.getAccessories()){
            if(a.equals(acc))
                countAfter++;
        }
        assertEquals(countBefore-1,countAfter);
    }

    @Test
    public void testDeletingFlowerFromEmptyBouquet() throws UnsupportedEncodingException {
        new Bouquet(1);
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals("Bouquet is empty",Bouquet.deleteFlower());
        } finally {
            System.setIn( old );
        }
    }
    @Test
    public void testDeletingAccessoryFromEmptyBouquet() throws UnsupportedEncodingException {
        new Bouquet(1);
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals("There is no accessories",Bouquet.deleteAccessory());
        } finally {
            System.setIn( old );
        }
    }

    @Test
    public void testTryingGettingOutOfArrayBordersWhileDeletingFlower() throws UnsupportedEncodingException {
        new Bouquet(1);
        Bouquet.addFlower(new Flower("Rose",1,15,30));
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals("Wrong choice!",Bouquet.deleteFlower());
        } finally {
            System.setIn( old );
        }
    }

    @Test
    public void testTryingGettingOutOfArrayBordersWhileDeletingAccessory() throws UnsupportedEncodingException {
        new Bouquet(1);
        Bouquet.addAccessory(new Accessory("Balloon",150));
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals("Wrong choice!",Bouquet.deleteAccessory());
        } finally {
            System.setIn( old );
        }
    }

    @Test
    public void testDeletingFlower() throws UnsupportedEncodingException {
        new Bouquet(1);
        Flower flow = new Flower("Lotus",1,16,240);
        Bouquet.addFlower(flow);
        Bouquet.addFlower(new Flower("Rose",1,15,30));
        Bouquet.addFlower(flow);

        int countBefore=0,countAfter=0;
        for(Flower flower:Bouquet.getFlowers()){
            if(flow.equals(flower))
                countBefore++;
        }

        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            Bouquet.deleteFlower();
        } finally {
            System.setIn( old );
        }

        for(Flower flower:Bouquet.getFlowers()){
            if(flow.equals(flower))
                countAfter++;
        }
        assertEquals(countBefore-1,countAfter);

    }

}