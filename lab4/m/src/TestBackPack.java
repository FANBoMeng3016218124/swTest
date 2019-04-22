import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBackPack {
    @Test
    public void testBack(){
        int[] w = {3,4,5};
        int[] p = {4,5,6};
    	assertEquals(BackPack.BackPack_Solution(10, 3, w, p)[3][10], 11);
    }
}