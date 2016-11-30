package blservice;

import java.util.ArrayList;

import PO.HotelPO;
import PO.HotelRoomInfoPO;
import PO.Label;
import PO.Rank;

public interface Hotel_blservice {
	public HotelPO getHotelInfo(String hotelId);

	public boolean modifyHotelInfo(HotelPO hotelInfo);

	public String[] getListOfHotelId();

	public String addHotel(HotelPO hotel);

	public String addHotelStaff(String hotelId);

	public boolean addAssessment(String hotelID, String assessment);

	public boolean addLabelAssessment(String hotelID,
			ArrayList<Label> labelList);

	public boolean addRankAssessment(String hotelID, Rank rank);

	public boolean roomModify(String hotelId,HotelRoomInfoPO currentInfo);

	public HotelRoomInfoPO getHotelRoomInfo(String hotelId);

	public ArrayList<PO.Label> getLabelAssessment(String hotelId);

	public boolean deleteLabelAssessment(String hotelId,Label label);

	public String[] getListOfHotelPrefer(String userId);
	

}
