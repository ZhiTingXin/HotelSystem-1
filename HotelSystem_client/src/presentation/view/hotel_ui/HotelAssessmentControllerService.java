package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.boolean;
import PO.Label;
import PO.Rank;

public interface HotelAssessmentControllerService {
	public boolean addAssessment(String hotelID, String assessment);

	public boolean addRankAssessment(String hotelID, Rank rank);

	public boolean addLabelAssessment(String hotelID,
			ArrayList<Label> labelList);
}
