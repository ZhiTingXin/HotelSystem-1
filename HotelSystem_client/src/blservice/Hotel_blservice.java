package blservice;

import java.util.ArrayList;

import PO.HotelPO;
import PO.HotelRoomInfoPO;
import PO.Label;
import PO.Rank;
import other.ResultMessage;

public interface Hotel_blservice {
	public HotelPO getHotelInfo(String hotelId);

	public ResultMessage modifyHotelInfo(HotelPO hotelInfo);

	public String[] getListOfHotelId();

	public String addHotel(HotelPO hotel);

	public String addHotelStaff(String hotelId);

	public ResultMessage addAssessment(String hotelID, String assessment);

	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList);

	public ResultMessage addRankAssessment(String hotelID, Rank rank);

	public ResultMessage roomModify(String hotelId,HotelRoomInfoPO currentInfo);

	public HotelRoomInfoPO getHotelRoomInfo(String hotelId);

	public ArrayList<PO.Label> getLabelAssessment(String hotelId);

	public ResultMessage deleteLabelAssessment(String hotelId,Label label);

	public String[] getListOfHotelPrefer(String userId);
	

}
