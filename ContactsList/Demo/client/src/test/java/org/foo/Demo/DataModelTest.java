package org.foo.Demo;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class DataModelTest {
    
    public DataModelTest() {
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

    @org.junit.Test
    public void testDoubleClick() {
        Data d = new Data();
        d.getWords().add("Jaroslav");
        DataModel.editContact(d, "Jaroslav");
        assertEquals("Jaroslav", d.getContact());
        d.setContact("Yarda");
        DataModel.updateContacts(d);
        assertEquals("Yarda", d.getWords().get(0));
    }
    
    @org.junit.Test
    public void testCorrectAddition() {
        Data d = new Data();
        d.setIndex(-1);
        d.getWords().addAll(Arrays.asList("Tom","Dick","Harry"));
        assertEquals(3, d.getWords().size());
        DataModel.editContact(d, "Dick");
        DataModel.deleteContact(d, "Dick");
        assertEquals(2, d.getWords().size());
        d.setContact("Yarda");
        DataModel.updateContacts(d);
        assertEquals(3, d.getWords().size());
        assertEquals("Yarda", d.getWords().get(2));
    }
    
}
