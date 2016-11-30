package presentation.view.hotel_ui;

import other.boolean;
import VO.HotelRoomInfoVO;

public interface HotelRoomManagementControllerService {
	public boolean roomModify(String hotelId, HotelRoomInfoVO currentInfo);

	public HotelRoomInfoVO getHotelRoomInfo(String hotelId);

	public boolean showHotelRoomInfo(HotelRoomInfoVO currentInfo);
}
