package blservice;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import VO.SystemManagerVO;

public interface UserInfo_blservice {

	public SystemManagerVO getSystemManagerInfo(String SystemManager_name);
	
	public boolean modifySystemManagerInfo(SystemManagerVO systemManager);
	
    public boolean CustomerinfoModify(CustomerVO Customer,CustemorInfoChangeVO VO);
	
	public boolean CustomerinfoShow(CustomerVO Customer);
    //����Mock����Ĳ���
	public void add(SystemManagerVO manager);
	
	public SystemManagerVO  get();
}
