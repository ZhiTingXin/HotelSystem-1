package presentation.controller.hotelController;

import java.util.ArrayList;

import PO.Label;
import blservice.Hotel_blservice;
import other.boolean;
import presentation.view.hotel_ui.AssessmentManagementControllerService;

public class AssessmentManagementController implements AssessmentManagementControllerService{
	Hotel_blservice hotelService;

	public ArrayList<Label> getLabelAssessment(String hotelId) {
		return this.hotelService.getLabelAssessment(hotelId);
		
	}

	public boolean showLabelAssessment(ArrayList<Label> labelList) {
		return true;
	}

	public boolean deleteLabelAssessment(String hotelID,Label label) {
		this.hotelService.deleteLabelAssessment(hotelID, label);
		return true;
	}

}
