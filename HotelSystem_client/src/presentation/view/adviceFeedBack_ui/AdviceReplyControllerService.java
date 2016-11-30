package presentation.view.adviceFeedBack_ui;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import other.boolean;


public interface AdviceReplyControllerService {

	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId);
	
	public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId);
	
	public boolean update(AdviceFeedBackVO advice);
}
