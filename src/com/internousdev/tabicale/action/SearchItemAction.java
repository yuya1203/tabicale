package com.internousdev.tabicale.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private String keywords;
	private String pageNo;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<String> keywordsErrorMessageList = new ArrayList<String>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;
		
		InputChecker inputChecker = new Input Checker();
		if(keywords==null){
			keywords="";
		}
		keywordsErrorMessageList = inputchecker.doCheck("検索ワード", keywords, 0 ,16, true, true, true, true, false, true, true);
		
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		switch(categoryId){
			case "1":
				productInfoDtoList = productInfoDAO.getProductInfoListAll(keywords.replaceAll("　", " "))
		}
	}
}
