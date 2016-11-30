package presentation.controller.hotelController;

import java.util.ArrayList;

import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import other.boolean;
import other.SortMethod;
import presentation.view.hotel_ui.HotelViewControllerService;

public class HotelViewController implements HotelViewControllerService{
	Hotel_blservice hotelService;

	public HotelInfoVO getHotelInfo(String hotelId) {
		HotelInfoVO vo = new HotelInfoVO();
		return vo;
	}

	public boolean showHotelInfo(HotelInfoVO HotelInfo) {
		return true;
	}

	public String[] getListOfHotelId() {
		return this.hotelService.getListOfHotelId();

	}

	public ArrayList<HotelInfoVO> getListOfHotel(String[] hotelId) {
//		String[] hotelIdList = this.getListOfHotelId();
		ArrayList<HotelInfoVO> voList = new ArrayList<HotelInfoVO>();
//		voList.add(new HotelInfoVO(this.hotelService
//				.getHotelInfo(hotelIdList[0])));
		return voList;
	}

	public boolean showHotelList(ArrayList<HotelInfoVO> list) {
		return true;

	}

	public ArrayList<HotelInfoVO> HotelListSort(SortMethod method,
			ArrayList<HotelInfoVO> list) {
		return list;

	}

	public String[] getListOfHotelPrefer(String userId) {
		return this.hotelService.getListOfHotelPrefer(userId);
	}

	public boolean bookRoom(String hotelID) {
		
		return true;
	}
}
