package com;  
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;  
import com.android.uiautomator.core.UiObjectNotFoundException;  
import com.android.uiautomator.core.UiScrollable;  
import com.android.uiautomator.core.UiSelector;  
import com.android.uiautomator.testrunner.UiAutomatorTestCase;  
  
public class Runner extends UiAutomatorTestCase {  
  
	private final static int SleepTime = 200;
    public void testDemo() throws UiObjectNotFoundException {  
        UiDevice device = getUiDevice();
        device.pressHome();
        
        //UiObject wx = new UiObject(new UiSelector().packageName("com.tencent.mm"));
        //wx.click();
        
        try {  
            Thread.sleep(SleepTime);  
        } catch (InterruptedException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
    
        UiObject settingApp = new UiObject(new UiSelector().text("微信"));  
        settingApp.click();  
        //休眠3秒  
        try {  
            Thread.sleep(SleepTime);  
        } catch (InterruptedException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        
        // click "+" image view
        device.click(552, 98);
        try {  
            Thread.sleep(SleepTime);  
        } catch (InterruptedException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        
        // click "add friends"
        device.click(512, 289);
        try {  
            Thread.sleep(SleepTime);  
        } catch (InterruptedException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        
        //input phonenumber now
        UiObject phone = new UiObject(new UiSelector().className("android.widget.EditText"));
        phone.setText("13681902026");
        device.pressEnter();
        
        //click search button
        UiObject confirm = new UiObject(new UiSelector().className("android.widget.Button"));
        confirm.clickAndWaitForNewWindow();
        
        //click "add to contact"
        UiObject add = new UiObject(new UiSelector().className("android.widget.Button"));
        add.clickAndWaitForNewWindow();
        
        UiObject send = new UiObject(new UiSelector().text("发送"));
        send.clickAndWaitForNewWindow();
        
        //now back

        device.pressBack();
        
        device.pressBack();
        
        device.pressBack();
        /*
        UiObject pswd = new UiObject(new UiSelector().className("android.widget.EditText"));
        pswd.setText("2411domy");
        getUiDevice().pressEnter();
        try {  
            Thread.sleep(2000);  
        } catch (InterruptedException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        
        //UiObject login = new UiObject(new UiSelector().text("登陆"));

        //login.click();
        getUiDevice().click(40, 760);
        /*
        // 进入语言和输入法设置  
        UiScrollable settingItems = new UiScrollable( new UiSelector().scrollable(true));  
  
        UiObject languageAndInputItem = settingItems.getChildByText(  
                new UiSelector().text("Language & input"), "Language & input", true);  
        languageAndInputItem.clickAndWaitForNewWindow();  
        */
          
    }  
}  