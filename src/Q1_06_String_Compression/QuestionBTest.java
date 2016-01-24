package Q1_06_String_Compression;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class QuestionBTest {
	
	private String str;
	private String expected;
	
	public  QuestionBTest(String str, String expected) {
		this.str = str;
		this.expected = expected;
	}
	
	@Parameters(name = "{index}: compress({0})={1}")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ "aaaaabbbbaaaabbddc", "a5b4a4b2d2c1" },
			{ "aaaaabbbbaaaabbddc", "a5b4a4b2d2c2" }
		});
	}
	@Test
	public void compressTest() {
		//fail("Not yet implemented");
//		String str = "aaaaabbbbaaaabbddc";
//		String expected = "a5b4a4b2d2c1";
//		String actual = QuestionB.compress(str);
//		assertEquals(expected, actual);
		assertEquals(expected, QuestionB.compress(str));
	}

}
