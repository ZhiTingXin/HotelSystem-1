package presentation.view.userInfo_ui;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import other.boolean;

public interface CustomerInfo {
	public boolean CustomerinfoModify(CustomerVO Customer,CustemorInfoChangeVO VO);
	
	public boolean CustomerinfoShow(CustomerVO Customer);

}
