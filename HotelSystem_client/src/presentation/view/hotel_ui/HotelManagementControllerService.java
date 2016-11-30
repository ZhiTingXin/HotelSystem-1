package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.boolean;
import VO.HotelInfoVO;

public interface HotelManagementControllerService {
	public String addHotel(HotelInfoVO hotel);

	public String addHotelStaff(String hotelId);

	public boolean showAvailableHotelList(
			ArrayList<HotelInfoVO> availableHotelList);

	public ArrayList<HotelInfoVO> getAvailableHotelList();

	public String getID();
}
