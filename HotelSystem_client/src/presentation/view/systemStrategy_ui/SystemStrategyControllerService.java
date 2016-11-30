package presentation.view.systemStrategy_ui;

import java.util.ArrayList;

import VO.SystemStrategy1VO;
import VO.SystemStrategyVO;
import other.boolean;

public interface SystemStrategyControllerService {
    
	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID);
	
	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name);
	
	public boolean modifySystemStrategy(SystemStrategyVO systemStrategy);
	
	public boolean deleteSystemStrategy(String systemStrategy_Name);
	
	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemStrategy);
	
	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy);
	
	public boolean modifySystemStrategy1(SystemStrategy1VO systemstrategy);
	
}
