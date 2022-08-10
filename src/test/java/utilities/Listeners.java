package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;

public class Listeners extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			ScreenShot.capturescreen(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
