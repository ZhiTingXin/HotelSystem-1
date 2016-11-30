package blservice.impl;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import VO.SystemManagerVO;
import blservice.UserInfo_blservice;

public class UserInfo_bl implements UserInfo_blservice{

	SystemManagerVO mana;
	public SystemManagerVO getSystemManagerInfo(String SystemManager_name) {
		
		return null;
	}

	public boolean modifySystemManagerInfo(SystemManagerVO systemManager) {
		
		return null;
	}

	public boolean CustomerinfoModify(CustomerVO Customer, CustemorInfoChangeVO VO) {
		return false;
	}

	public boolean CustomerinfoShow(CustomerVO Customer) {
		return false;
	}
//≤‚ ‘Mock ¥˙¬Î
	public void add(SystemManagerVO manager) {
		// TODO Auto-generated method stub
		this.mana = manager;
		return;
	}
	public SystemManagerVO  get(){
		return mana;
	}
}
