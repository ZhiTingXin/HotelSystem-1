package PO;

public class HotelStrategyPO {
	private String id;
	private String hotelStrategyInfo;
	String hotelID;

	/**
	 * 
	 *  hotelStrategyInfo 酒店促销策略的基本内容
	 *  hotelID 酒店的id
	 */
	public HotelStrategyPO(){}
	public HotelStrategyPO(String hotelStrategyInfo,String hotelID) {
		super();
		this.hotelStrategyInfo = hotelStrategyInfo;
		this.hotelID = hotelID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelStrategyInfo() {
		return hotelStrategyInfo;
	}
	public void setHotelStrategyInfo(String hotelStrategyInfo) {
		this.hotelStrategyInfo = hotelStrategyInfo;
	}
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	
}
