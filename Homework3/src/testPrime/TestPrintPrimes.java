package testPrime;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;
import prime.PrintPrimes;

public class TestPrintPrimes {

	 PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
	 ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流

	  @Before
	  public void setUp() throws Exception {
	        
	    bytes = new ByteArrayOutputStream();    // 分配空间
	    console = System.out;                   // 获取System.out 输出流的句柄

	    System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes


	    }

	    @After
	    public void tearDown() throws Exception {
	        
	        System.setOut(console);
	    }

	    @Test
	    public void testResult() throws Exception {
	        PrintPrimes.printPrimes(3);

	        String s = new String("Prime: 2\nPrime: 3\nPrime: 5\n");    // 注意：控制台的换行，这里用 '\n' 表示
	        assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流 
	    }

}

