
package CS_348_SP_2019.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CIExercise.EndsWith2;

public class EndsWith2Test {

	@Test
	public void testToString() {
		EndsWith2 two = new EndsWith2();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith2 [names=Karl Wurst\nYesenia Mercedes-Nunez\n]", two.toString());
	}

}
