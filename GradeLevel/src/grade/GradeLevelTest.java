package grade;



import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



	@RunWith(Parameterized.class)
	public class GradeLevelTest {

		String expected = "A";
		int input = 98;
		
		public GradeLevelTest(String expected, int input) {
			this.expected = expected;
			this.input =input;
		}
		
		@Parameters
		public static Collection userData(){  
			return Arrays.asList(new Object[][]{  
				{"ERR",101},
				{"A",100},
				{"A",99},
				{"A",91},
				{"A",90},
				{"B",89},
				{"B",80},
				{"B",81},
				{"C",79},
				{"C",61},
				{"C",60},
				{"D",59},
				{"D",0},
				{"D",1},
				{"err",-1}
		        }) ;  
		}
	
	@Test
	public void test() {
		assertEquals(expected, new Gradelevel().studentLevel(input));
	}

}
