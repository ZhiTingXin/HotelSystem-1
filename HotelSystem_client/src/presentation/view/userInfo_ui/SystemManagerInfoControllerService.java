package presentation.view.userInfo_ui;

import VO.SystemManagerVO;
import other.ResultMessage;

public interface SystemManagerInfoControllerService {

	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager);
	
	public SystemManagerVO getSystemManagerInfo(String systemManager_Name);
	//����Mock����
	public void add(SystemManagerVO manager);
	
	public SystemManagerVO  get();
	
}
