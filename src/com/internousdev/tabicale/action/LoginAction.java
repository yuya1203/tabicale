package com.internousdev.tabicale.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tabicale.dao.DestinationInfoDAO;
import com.internousdev.tabicale.dto.DestinationInfoDTO;
import com.internousdev.tabicale.dto.MCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String categoryId;
	private String loginId;
	private String password;
	private boolean savedLoginId;

	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();

	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;

		if(savedLoginId==true) {
			session.put("savedLoginId", true);
			session.put("loginId", loginId);
		}else{
			session.put("savedLoginId", false);
			session.remove("loginId", loginId);
		}

		InputChecker inputChecker = new InputChecker();
		loginIdErrorMessageList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false, false, false);
		passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false);

		if(loginIdErrorMessageList.size()!=0
		&& passwordErrorMessageList.size()!=0){
			session.put("loginIdErrorMessageList", loginIdErrorMessageList);
			session.put("passwordErrorMessageList", passwordErrorMessageList);
			session.put("logined", 0);
		}

		if(!session.containsKey("mCategoryList")){
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		UserInfoDAO userInfoDao = new UserInfoDAO();
		if(userInfoDao.isExistsUserInfo(loginId, password)) {
			if(userInfoDao.login(loginId, password) > 0) {
				UserInfoDTO userInfoDTO = userInfoDao.getUserInfo(loginId, password);
				session.put("loginId", userInfoDTO.getUserId());
				int count = 0;
				CartInfoDAO cartInfoDao = new CartInfoDAO();

				count = cartInfoDao.linkToLoginId(String.valueOf(session.get("tempUserId")), loginId);
				if(count > 0){
					DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();
					try{
						List<DestinationInfoDTO> destinationInfoDtoList =new ArrayList<DestinationInfoDTO>();
						destinationInfoDtoList = destinationInfoDao.getDestinationInfo(loginId);
						Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
						if(!(iterator.hasNext())){
							destinationInfoDtoList = null;
						}
						session.put("destinationInfoDtoList", destinationInfoDtoList);
					} catch(SQLException e){
						e.printStackTrace();
					}
					result = "settlement";
				}else if((loginId.equals("admin") && password.equals("admin"))
						 || (loginId.equals("admin2") && password.equals("admin2"))
						 || (loginId.equals("admin3") && password.equals("admin3"))
						 || (loginId.equals("admin4") && password.equals("admin4"))
						 || (loginId.equals("admin5") && password.equals("admin5"))
						 || (loginId.equals("admin6") && password.equals("admin6"))
						 || (loginId.equals("admin7") && password.equals("admin7"))
						 || (loginId.equals("admin8") && password.equals("admin8"))
						 || (loginId.equals("admin9") && password.equals("admin9"))
						 || (loginId.equals("admin10") && password.equals("admin10"))
						 || (loginId.equals("admin11") && password.equals("admin11"))
						 || (loginId.equals("admin12") && password.equals("admin12"))){

					ProductInfoDAO productInfoDao = new ProductInfoDAO();
					productInfoDtoList = productInfoDao.getProductInfoList();
					session.put("productInfoDtoList", productInfoDtoList);
					result = "admin";

				}else{
					result = SUCCESS;
				}
			}
				session.put("logined", 1);
		}
		return result;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public boolean getSavedLoginId(){
		return savedLoginId;
	}

	public void setSavedLoginId(boolean savedLoginId){
		this.savedLoginId = savedLoginId;
	}

	public List<String> getLoginIdErrorMessageList(){
		return loginIdErrorMessageList;
	}

	public void setLoginIdErrorMessageList(List<String> loginIdErrorMessageList){
		this.loginIdErrorMessageList = loginIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList(){
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList){
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public List<ProductInfoDTO> getProductInfoDtoList(){
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList){
		this.productInfoDtoList = productInfoDtoList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
