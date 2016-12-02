package presentation.controller.adviceFeedBackController;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import blservice.AdviceFeedBack_blservice;
import blservice.impl.AdviceFeedBack_bl;
import presentation.view.adviceFeedBack_ui.AdviceFeedBackControllerService;

public class AdvicefeedbackController implements AdviceFeedBackControllerService{

	private AdviceFeedBack_blservice advicefeedbackblservice;
	public AdvicefeedbackController(){
		advicefeedbackblservice = new AdviceFeedBack_bl();
	}
	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.getAllAdvice(userID);
	}

	public boolean addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.addAdviceFeedBack(advicefeedbackvo);
	}

	public boolean modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.modifyAdviceFeedBack(advicefeedbackvo);
	}
}
