package com.internousdev.tabicale.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tabicale.dao.ProductInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductCompleteAction extends ActionSupport implements SessionAware{

	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String price;

	private String imageFilePath;
	private String imageFileName;

	private String releaseDate;
	private String releaseCompany;

	private Map<String,Object>session;

	public String execute(){
		String result = ERROR;
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		int count = productInfoDAO.createProduct(productId,productName,productNameKana,productDescription,categoryId,price,imageFilePath,imageFileName,releaseDate,releaseCompany);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}


	public String getProductId(){
		return productId;
	}
	public void setProductId(String productId){
		this.productId = productId;
	}

	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductNameKana(){
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana){
		this.productNameKana = productNameKana;
	}

	public String getProductDescription(){
		return productDescription;
	}
	public void SetProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price = price;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany(){
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany = releaseCompany;
	}






	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}


}
