package presentation.controller.hotelController;

import PO.HotelRoomInfoPO;
import VO.HotelRoomInfoVO;
import blservice.Hotel_blservice;
import other.boolean;
import presentation.view.hotel_ui.HotelRoomManagementControllerService;

public class HotelRoomManagementController implements HotelRoomManagementControllerService{
	Hotel_blservice hotelService;

	public boolean roomModify(String hotelId, HotelRoomInfoVO currentInfo) {
		this.hotelService.roomModify(hotelId, new HotelRoomInfoPO(currentInfo));
		return true;
	}

	public HotelRoomInfoVO getHotelRoomInfo(String hotelId) {
		return new HotelRoomInfoVO(this.hotelService.getHotelRoomInfo(hotelId));
	}

	public boolean showHotelRoomInfo(HotelRoomInfoVO currentInfo) {
		return true;
	}

}
