package Data;

import org.junit.Test;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class DataSearchTest {
    @Test
    public void TestSearchFlowerByVariety() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllFlowers1().get(0), DataSearch.searchFlowByVariety("Rose"));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchFlowerByVarietyNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByVariety("Lily"));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchFlowerByVarietyWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByVariety("Rose"));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchFlowerByLength() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllFlowers1().get(0), DataSearch.searchFlowByLength(20,1));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchFlowerByLengthNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByLength(40,2));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchFlowerByLengthWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByLength(20,1));
        } finally {
            System.setIn( old );
        }

    }


    @Test
    public void TestSearchFlowerByPrice() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllFlowers1().get(0), DataSearch.searchFlowByPrice(25,1));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchFlowerByPriceNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByPrice(70,2));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchFlowerByPriceWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByPrice(20,1));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchFlowerByFreshness() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllFlowers1().get(0), DataSearch.searchFlowByFreshness(1));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchFlowerByFreshnessNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByFreshness(4));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchFlowerByFreshnessWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchFlowByFreshness(1));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchAccessoryByVariety() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllAccessories1().get(0), DataSearch.searchAccByVariety("Balloons"));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchAccessoryByVarietyNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchAccByVariety("Rose"));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchAccessoryByVarietyWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchAccByVariety("Balloons"));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchAccessoryByPrice() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(ItemsInfo.getAllAccessories1().get(0), DataSearch.searchAccByPrice(100,1));
        } finally {
            System.setIn( old );
        }

    }

    @Test
    public void TestSearchAccessoryByPriceNotFoundError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchAccByPrice(1000,2));
        } finally {
            System.setIn( old );
        }

    }
    @Test
    public void TestSearchAccessoryByPriceWrongChoiceError() throws IOException, MessagingException {
        new ItemsInfo();
        String input = "-1";
        InputStream testInput = new ByteArrayInputStream( input.getBytes("UTF-8") );
        InputStream old = System.in;
        try {
            System.setIn( testInput );
            assertEquals(null, DataSearch.searchAccByPrice(100,1));
        } finally {
            System.setIn( old );
        }

    }
}