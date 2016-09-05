package firsttest;

import java.io.IOException;

import android.os.Bundle;
import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public  class ChuangyeRegsiter extends UiAutomatorTestCase {
	String phone="13422222259";
	public void testRegsiter() throws UiObjectNotFoundException, RemoteException, IOException{
		
//		if(!UiDevice.getInstance().isScreenOn()){
//			UiDevice.getInstance().wakeUp();
//		}
		Bundle bundle =getParams();
		phone=bundle.getString("bundle");
		String command = " am start -n com.easyrongchuangye/.activities.EasyrongChuangyeActivity";
//		Exc.execCommand(command);
		Runtime.getRuntime().exec(command);
        step();
		
		UiObject Zhanghu=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/mine_user_name"));
		if(!Zhanghu.exists()){
			System.out.println("注册失败");
			}
		else{
			String actual = Zhanghu.getText();
			String phonenum="F"+phone;
			System.out.println("注册成功"+phonenum.equals(actual));		
//			assertEqual(,phonenum, actual);
			}
	}

	
	public void step() throws UiObjectNotFoundException{
		
		UiObject my=new UiObject(new UiSelector().text("我的"));
		my.clickAndWaitForNewWindow();
		UiObject setting=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/mine_setting_img"));
		setting.clickAndWaitForNewWindow();
		UiObject exit=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/exit_login_view"));
		exit.clickAndWaitForNewWindow();
		UiObject comfrim=new UiObject(new UiSelector().resourceId("android:id/button1"));
		comfrim.clickAndWaitForNewWindow();
		UiObject regsiter=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/mine_user_name"));
		regsiter.clickAndWaitForNewWindow();
		UiObject regsiternow=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_tv"));
		regsiternow.clickAndWaitForNewWindow();
		UiObject teleNo=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_mobile_edit_tv"));
		teleNo.setText(phone);
		UiObject getmsm=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_pin_btn"));
		getmsm.click();
		sleep(2000);
		UiObject yanzhengma=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_pin_edit_tv"));
		yanzhengma.setText("000000");
		UiObject MiMa=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_pwd_edit_tv"));
		MiMa.setText("a123456");
		UiObject DiQu=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_area_text"));
		DiQu.clickAndWaitForNewWindow();
		
		UiScrollable first =new UiScrollable(new UiSelector().resourceId("com.easyrongchuangye:id/first"));
		first.flingForward();
		UiScrollable Mid =new UiScrollable(new UiSelector().resourceId("com.easyrongchuangye:id/middle"));
		Mid.flingForward();
		UiScrollable End =new UiScrollable(new UiSelector().resourceId("com.easyrongchuangye:id/end"));
		End.flingForward();
		UiScrollable QueDing =new UiScrollable(new UiSelector().resourceId("com.easyrongchuangye:id/confirm_action"));
		QueDing.clickAndWaitForNewWindow();
		UiScrollable Option=new UiScrollable(new UiSelector().resourceId("com.easyrongchuangye:id/is_agreed"));
		Option.click();
		UiObject ZhuCe=new UiObject(new UiSelector().resourceId("com.easyrongchuangye:id/register_register_btn"));
		ZhuCe.clickAndWaitForNewWindow();	
	}
	
//
//	public void setup() throws Exception{
//		super.setUp();
//	};
//		public void testpress() {
//		UiDevice.getInstance().pressMenu();
//		UiDevice.getInstance().pressHome();
//		UiDevice.getInstance().pressMenu();
//		UiDevice.getInstance().pressBack();
//		UiDevice.getInstance().pressBack();
//		UiDevice.getInstance().pressBack();
	//}
//	public void testapp() {

//		UiDevice.getInstance().pressBack();
//		UiDevice.getInstance().pressBack();
//		UiDevice.getInstance().click(303, 592);
//		try {
//			UiObject ent = new UiObject(new UiSelector().text("助理"));
//			ent.clickAndWaitForNewWindow();
//		} catch (Exception e) {
//		
//			System.out.println("fail");
//			// TODO: handle exception
//		}
// System.out.println("*****************fa");
//		System.out.println("**********************"+ent.getText());
	
//		sleep(3000);
//		UiDevice.getInstance().pressBack();
//		UiDevice.getInstance().pressBack();
}