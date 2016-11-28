package VO;

import java.util.Date;

import PO.SystemStaffPO;
import PO.SystemStrategyPO;

/**��վӪ�����Ե�����
 * ��վӪ�����Ե�����
 * �ƶ���վӪ�����Ե���վӪ����Ա��id
 * ��վӪ�����ԵĿ�ʼʱ��
 * ��վӪ�����ԵĽ���ʱ��
 * @author zhiting Xin
 *
 */
public class SystemStrategyVO {
	
     private String systemStrategy_name;
     private double discount;
     private Date begin_date;
     private Date end_date;
     private String systemStaffID;
     
     public SystemStrategyVO(){
    	 super();
     }
     
     public SystemStrategyVO(SystemStrategyPO systemstrategypo,SystemStaffPO systemstaffpo){
    	 super();
    	 this.systemStrategy_name = systemstrategypo.getSystemStrategy_name();
    	 this.discount = systemstrategypo.getDiscount();
    	 this.begin_date = systemstrategypo.getBegin_date();
    	 this.end_date = systemstrategypo.getEnd_date();
    	 this.systemStaffID = systemstaffpo.getId();
     }
     
     public String getStrategy_name(){
    	 return this.systemStrategy_name;
     }
     
     public double getDiscount(){
    	 return this.discount;
     }
     
     public Date getBegin_Date(){
    	 return this.begin_date;
     }
     
     public String getSystemStaffID() {
 		return this.systemStaffID;
 	}
     
     public Date getEnd_date() {
 		return end_date;
 	}
    
}
