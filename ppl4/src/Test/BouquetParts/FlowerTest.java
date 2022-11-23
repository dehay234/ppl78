package BouquetParts;

import MainBouquet.Bouquet;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class FlowerTest {
        @Test
        public void testChangeVariety() throws UnsupportedEncodingException {
            Flower f = new Flower("Rose",1,1,1);
            String input = "Lily";
            InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
            InputStream old = System.in;
            try {
                System.setIn(testInput);
                f.changeProperties(1);
                assertEquals(f.getVariety(),input);
            } finally {
                 System.setIn(old);
            }
        }
    @Test
    public void testChangeLength() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "14";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.changeProperties(2);
            assertEquals(f.getLength(),14);
        } finally {
            System.setIn(old);
        }
    }
    @Test
    public void testChangeLengthError() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "-10";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);

            assertEquals("Wrong length",f.changeProperties(2));
        } finally {
            System.setIn(old);
        }
    }
    @Test
    public void testChangeFreshness() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.changeProperties(3);
            assertEquals(f.getFreshness(),1);
        } finally {
            System.setIn(old);
        }
    }
    @Test
    public void testChangeFreshnessError() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "-10";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);

            assertEquals("Wrong freshness",f.changeProperties(3));
        } finally {
            System.setIn(old);
        }
    }
    @Test
    public void testChangePrice() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "1";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            f.changeProperties(4);
            assertEquals(f.getPrice(),1);
        } finally {
            System.setIn(old);
        }
    }
    @Test
    public void testChangePriceError() throws UnsupportedEncodingException {
        Flower f = new Flower("Rose",1,1,1);
        String input = "-10";
        InputStream testInput = new ByteArrayInputStream(input.getBytes("UTF-8"));
        InputStream old = System.in;
        try {
            System.setIn(testInput);
            assertEquals("Wrong price",f.changeProperties(4));
        } finally {
            System.setIn(old);
        }
    }
}