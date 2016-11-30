package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.boolean;
import PO.Label;

public interface AssessmentManagementControllerService {

	public ArrayList<Label> getLabelAssessment(String hotelId);

	public boolean showLabelAssessment(ArrayList<Label> labelList);

	public boolean deleteLabelAssessment(String hotelID, Label label);
}
