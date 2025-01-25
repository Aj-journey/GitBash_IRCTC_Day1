package UtiityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DropDownHelper {
	public static void dropdownHandle(List<WebElement> allList, String Value) {
		for (WebElement aa : allList) {
			String dropvalue = aa.getText();

			if (dropvalue.contains(Value)) {

				WebElementHelper.click(aa);
				break;
			}

		}
	}
}
