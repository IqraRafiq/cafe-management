import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class timeEstimateTest {

	@Test
	public void test() {
		int timeGap = 45;
		food food1 = new food();
		GregorianCalendar date = new GregorianCalendar();
		int second = date.get(Calendar.SECOND);
		int minute = date.get(Calendar.MINUTE);
		int hour = date.get(Calendar.HOUR);
		assertEquals(food1.timeEstimate(timeGap),hour + " : " + (minute+timeGap) + " : " + second);
	}

}
