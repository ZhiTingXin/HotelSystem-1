package presentation.controller.hotelController;

import java.util.ArrayList;

import PO.Label;
import PO.Rank;
import blservice.Hotel_blservice;
import other.boolean;
import presentation.view.hotel_ui.HotelAssessmentControllerService;

public class HotelAssessmentController implements HotelAssessmentControllerService{
	Hotel_blservice hotelService;

	public boolean addAssessment(String hotelID, String assessment) {
		this.hotelService.addAssessment(hotelID, assessment);
		return true;

	}

	public boolean addRankAssessment(String hotelID, Rank rank) {
		this.hotelService.addRankAssessment(hotelID, rank);
		return true;
	}

	public boolean addLabelAssessment(String hotelID,
			ArrayList<Label> labelList) {
		this.hotelService.addLabelAssessment(hotelID, labelList);
		return true;
	}
	
}
