package com.internousdev.tabicale.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductAction extends ActionSupport implements SessionAware{
private int productId;
//List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductionInfoDTO>();
private Map<String, Object> session;


/*public String execute(){
	String result = ERROR;
	ProductionInfoDAO dao = new ProductionInfoDAO();
	int count = dao.delete(productId);
	if(count > 0){
		productionInfoDtoList = dao.getProductionInfoList();
		session.put("productInfoDtoList", productionInfoDtoList);
		result SUCCESS;
	}
	return result;
}*/

public int getProductId(){
	return productId;
}

public void setProductId(int productId){
	this.productId = productId;
}

public Map<String, Object> getSession(){
	return session;
}

public void setSession(Map<String, Object> session){
	this.session = session;
}
}
