package presentation.view.hotel_ui;

import java.util.ArrayList;

import other.boolean;
import other.SortMethod;
import VO.HotelInfoVO;

public interface HotelViewControllerService {
	public HotelInfoVO getHotelInfo(String hotelId) ;

	public boolean showHotelInfo(HotelInfoVO HotelInfo) ;
	public String[] getListOfHotelId() ;

	public ArrayList<HotelInfoVO> getListOfHotel(String[] hotelId) ;

	public boolean showHotelList(ArrayList<HotelInfoVO> list) ;

	public ArrayList<HotelInfoVO> HotelListSort(SortMethod method,
			ArrayList<HotelInfoVO> list);

	public String[] getListOfHotelPrefer(String userId) ;

	public boolean bookRoom(String hotelID);
}
