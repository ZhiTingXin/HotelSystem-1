package presentation.view.adviceFeedBack_ui;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import other.boolean;

public interface AdviceFeedBackControllerService {
    
	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID);
	
	public boolean addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);
	
	public boolean modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);
	
}
