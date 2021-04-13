package Test;

import org.testng.annotations.Test;

import Generics.CreateLeaveType;
import Generics.CreateLeaveType1;
import Generics.CreateLeaveType2;
import Generics.LoginPOM;

public class TestLeaveType extends BaseTest
{
 @Test
 
	public void createLeave ()
	{
	  CreateLeaveType set=new CreateLeaveType(driver);
		
		set.settingsclick();
		
		set.typeofleave();
		
		CreateLeaveType1 LeaveTy=new CreateLeaveType1(driver);
		
		LeaveTy.CreateLeaveTy();
		
		
		CreateLeaveType2 NewLeave=new CreateLeaveType2(driver);
		
		NewLeave.enterleave();
		
		NewLeave.Leavesub();
		
		NewLeave.logout();
		

	}

}
