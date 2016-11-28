package TestRMI;

import RMI.RemoteHelper;

public class testLogin {
   public static void ad(){
	   try{
		  boolean a = RemoteHelper.getInstance().getLoginDataService().confirm("151250170", "xzt970828");
		  System.out.println(a);
	   }catch(Exception e){
		   e.printStackTrace();
	   }
   }
}
