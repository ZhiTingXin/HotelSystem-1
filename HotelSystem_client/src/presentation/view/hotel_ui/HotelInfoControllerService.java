package presentation.view.hotel_ui;

import other.boolean;
import VO.HotelInfoVO;

public interface HotelInfoControllerService {
	public boolean modifyHotelInfo(HotelInfoVO hotelInfo);

	public HotelInfoVO getHotelInfo(String hotelId);

	public boolean showHotelInfo(HotelInfoVO hotelInfo);
}
