package com.internousdev.tabicale.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tabicale.util.CommonUtility;
import com.internousdev.tabicale.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class AddProductConfirmAction extends ActionSupport implements SessionAware{

	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String price;

	private String releaseDate;
	private String releaseCompany;


	private String imageFilePath;
	private String imageFileName;

	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	private String fileExtension;

	private Map<String,Object>session;

	private String imageFilePathError;

	private List<String> productIdErrorMessageList = new ArrayList<String>();
	private List<String> productNameErrorMessageList = new ArrayList<String>();
	private List<String> productNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> productDescriptionErrorMessageList = new ArrayList<String>();
	private List<String> categoryIdErrorMessageList = new ArrayList<String>();
	private List<String> priceErrorMessageList = new ArrayList<String>();

	private List<String> releaseDateErrorMessageList = new ArrayList<String>();
	private List<String> releaseCompanyErrorMessageList = new ArrayList<String>();

	private List<String> userImageErrorMessageList = new ArrayList<String>();

	public String execute(){
		String result = ERROR;
		InputChecker inputChecker = new InputChecker();


		//画像ファイルが選択されているか確認する
		if(userImage != null){
			imageFilePathError = null;
		}else{
			imageFilePathError = "画像ファイルを選んでください";
		}

		//特定の拡張子以外の画像ファイルを選択できないようにする
		//最後の.の位置を取得します
		if(userImageFileName != null){
			int point = userImageFileName.lastIndexOf(".");
			System.out.println(point);
		//.が存在する場合.以降の文字を返します
			if(point != -1){
				fileExtension = userImageFileName.substring(point + 1);
			}

			//jpegかjpgでないときエラー文を挿入
			if(!fileExtension.equals("jpeg")&& !fileExtension.equals("jpg")){
				imageFilePathError = "使用できるファイルは'.jpeg.jpg'です";
			}
		}

		if(categoryId != null) {
			if(!(categoryId.equals("2") || categoryId.equals("3") || categoryId.equals("4"))) {
				return ERROR;
			}
			}else {
				return ERROR;
			}

		//入力された値を保存する
		session.put("productId", productId);
		session.put("productName", productName);
		session.put("productNameKana", productNameKana);
		session.put("productDescription", productDescription);
		session.put("categoryId", categoryId);
		session.put("price", price);

		session.put("releaseDate", releaseDate);
		session.put("releaseCompany", releaseCompany);


		//選択した画像ファイル名をコンソールに表示する
		System.out.println(userImageFileName);

		//選択した画像ファイルをサーバーに保存する
		String  filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images/");

		System.out.println("imageLocation" + filePath);

		CommonUtility commonUtility = new CommonUtility();
		userImageFileName = commonUtility.getRamdomValue() + userImageFileName;

		//サーバー上に保存した画像をimageファルダにコピーする
		File fileToCreate = new File(filePath,userImageFileName);
		try{
			FileUtils.copyFile(userImage, fileToCreate);
			session.put("imageFileName", userImageFileName);
			session.put("imageFilePath", "./images/"+userImageFileName);
			session.put("image_flg", userImageFileName);
			}catch(IOException e){
				e.printStackTrace();
			}


		productIdErrorMessageList = inputChecker.doCheck("商品ID", productId, 1, 16, false, false, false, true, false, false, false);
		productNameErrorMessageList = inputChecker.doCheck("商品名", productName,1, 100, true, true, true, true, true, true, false);
		productNameKanaErrorMessageList = inputChecker.doCheck("商品名カナ", productNameKana, 1, 100, true, false, false, true, true, true, false);
		productDescriptionErrorMessageList = inputChecker.doCheck("商品詳細",productDescription, 1, 255, true, true, true, true, true, true, false);
		categoryIdErrorMessageList = inputChecker.doCheck("カテゴリID", categoryId, 1, 8, false, false, false, true, false, false, false);
		priceErrorMessageList = inputChecker.doCheck("価格", price, 1, 16, false, false, false, true, false, false, false);

		releaseDateErrorMessageList = inputChecker.doCheck("発売年月", releaseDate, 1, 16, false, true, true, true, false, false, false);
		releaseCompanyErrorMessageList = inputChecker.doCheck("発売会社",releaseCompany, 1, 50, true, true, true, true, true, true, false);

		userImageErrorMessageList = inputChecker.doCheck("画像", userImage, 1, 255, true, true, true, true, true, true, false);



		if(productIdErrorMessageList.size()==0
				&& productNameErrorMessageList.size()==0
				&& productNameKanaErrorMessageList.size()==0
				&& productDescriptionErrorMessageList.size()==0
				&& categoryIdErrorMessageList.size()==0
				&& priceErrorMessageList.size()==0
				&& releaseDateErrorMessageList.size()==0
				&& releaseCompanyErrorMessageList.size()==0
				&& userImageErrorMessageList.size()==0 ) {
					result = SUCCESS;
				}else {
					session.put("productIdErrorMessageList", productIdErrorMessageList);
					session.put("productNameErrorMessageList", productNameErrorMessageList);
					session.put("productNameKanaErrorMessageList", productNameKanaErrorMessageList);
					session.put("productDescriptionErrorMessageList", productDescriptionErrorMessageList);
					session.put("categoryIdErrorMessageList", categoryIdErrorMessageList);
					session.put("priceErrormessageList", priceErrorMessageList);
					session.put("releaseDateErrorMessageList", releaseDateErrorMessageList);
					session.put("releaseCompanyErrorMessageList", releaseCompanyErrorMessageList);
					session.put("userImageErrorMesssageList", userImageErrorMessageList);
					result = ERROR;
				}

		session.put("checked", 1);
		result = SUCCESS;
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


	//画像ファイルに関するGetter/Setter
	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public File getUserImage(){
		return userImage;
	}
	public void setUserImage(File userImage){
		this.userImage = userImage;
	}

	public String getUserImageContentType(){
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType){
		this.userImageContentType = userImageContentType;
	}

	public String getUserImageFileName(){
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName){
		this.userImageFileName = userImageFileName;
	}

	public String getImageFilePathError(){
		return imageFilePathError;
	}
	public void setImageFilePathError(String imageFilePathError){
		this.imageFilePathError = imageFilePathError;
	}



	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

}

