import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import io.appium.java_client.AppiumDriver;


public class Activity8 {
	
	private final static PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	
	public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
		
		Sequence swipe = new Sequence(finger, 1)
				.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), start.getX(), start.getY()))
				.addAction(finger.createPointerDown(LEFT.asArg()))
				.addAction(finger.createPointerMove(ofMillis(duration),PointerInput.Origin.viewport(), end.getX(), end.getY()))
				.addAction(finger.createPointerUp(LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
		
		
	}

}
