package PO;

import java.util.Date;

import VO.OrderVO;
import other.OrderState;

public class OrderPO {

	private String id;
	private String hotelId;
	private String userId;
	private OrderState status;
	private Date entryTime;
	private Date lastTime;
	private String orderInfo;
	private double price;
	
	//���췽��
	public OrderPO(){}
	public OrderPO(String Id,String htId,String userId,OrderState st,Date entry,Date last,String info,int pr){
		super();
		this.id = Id;
		this.hotelId =htId;
		this.userId = userId;
		this.entryTime = entry;
		this.status = st;
		this.price = pr;
		this.orderInfo = info;
		this.lastTime =last;
	}
	
	
	//structer vo >po
	public OrderPO(OrderVO orderVO){
		id = orderVO.getOrderID();
		hotelId = orderVO.getHotelID();
		userId = orderVO.getUserID();
		entryTime = orderVO.getEntryTime();
		status = orderVO.getOrderState();
		price = orderVO.getPrice();
		lastTime = orderVO.getLastime();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public OrderState getStatus() {
		return status;
	}
	public void setStatus(OrderState status) {
		this.status = status;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
