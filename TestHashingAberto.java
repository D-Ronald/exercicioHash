import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import hash.EstruturaHashTable;

public class TestHashingAberto {
    
    private EstruturaHashTable ha;

    @Before
    public void configurar(){
        ha = new EstruturaHashTable();
    }

    @Test
    public void testaInsertSearch(){
        assertFalse(ha.search(10));
        assertFalse(ha.search(11));
        assertTrue(ha.insert(10));
        assertTrue(ha.search(10));
        assertFalse(ha.search(11));
    }

    @Test
    public void testaColisa(){
        assertFalse(ha.search(10));
        assertTrue(ha.insert(10));
        assertFalse(ha.insert(1010));
        assertTrue(ha.search(10));
        assertFalse(ha.search(1010));
    }

    @Test
    public void testaDeleteSearch(){
        assertTrue(ha.insert(10));
        assertTrue(ha.search(10));
        assertTrue(ha.delete(10));
        assertFalse(ha.delete(11));
        assertFalse(ha.search(10));
        
    }

}
