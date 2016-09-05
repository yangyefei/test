package firsttest;

import java.io.IOException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;




public class test extends UiAutomatorTestCase {


	public static void main(String[] args) throws IOException  {
//		ExecCommand Exc = new ExecCommand();
//		String command = "adb shell am start -n com.easyrongchuangye/.activities.EasyrongChuangyeActivity";
////		Exc.execCommand(command);
//		Runtime.getRuntime().exec(command);
		String jarName="demo0822";
		String testClass="firsttest.ChuangyeRegsiter";
		String testName="";
		String androidId="1";
		new UiAutomatorHelper(jarName,testClass,testName,androidId);
       
	}


}
