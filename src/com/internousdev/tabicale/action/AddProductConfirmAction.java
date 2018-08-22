package com.internousdev.tabicale.action;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tabicale.dao.ProductInfoDAO;
import com.internousdev.tabicale.dto.ProductInfoDTO;
import com.internousdev.tabicale.util.CommonUtility;
import com.internousdev.tabicale.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class AddProductConfirmAction extends ActionSupport implements SessionAware{

	private String productId;
	private int maxIdPlusOne;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String price;

	private String releaseDate;
	private String releaseCompany;


	private String imageFilePath;
	private String imageFileName;
	private String imageFileName2;


	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	private String fileExtension;

	private File userImage2;
	private String userImageContentType2;
	private String userImage2FileName;
	private String fileExtension2;

	private Map<String,Object>session;

	private String imageFilePathError;

	private List<String> productNameErrorMessageList = new ArrayList<String>();
	private List<String> productNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> productDescriptionErrorMessageList = new ArrayList<String>();
	private List<String> categoryIdErrorMessageList = new ArrayList<String>();
	private List<String> priceErrorMessageList = new ArrayList<String>();

	private List<String> releaseDateErrorMessageList = new ArrayList<String>();
	private List<String> releaseCompanyErrorMessageList = new ArrayList<String>();

	private List<String> imageFilePathErrorMessageList = new ArrayList<String>();
	private List<String> identical_productNameErrorMessageList = new ArrayList<String>();
	private List<String> identical_productNameKanaErrorMessageList = new ArrayList<String>();



	@SuppressWarnings("unchecked")
	public String execute(){
		String result = ERROR;
		InputChecker inputChecker = new InputChecker();


		productNameErrorMessageList = inputChecker.doCheck("商品名", productName,1, 100, true, true, true, true, true, true, false);
		productNameKanaErrorMessageList = inputChecker.doCheck("商品名かな", productNameKana, 1, 100, false, false, true, false, false, false, false);
		productDescriptionErrorMessageList = inputChecker.doCheck("商品詳細",productDescription, 1, 100, true, true, true, true, true, true, false);
		categoryIdErrorMessageList = inputChecker.doCheck("カテゴリID", categoryId, 1, 8, false, false, false, true, false, false, false);
		priceErrorMessageList = inputChecker.doCheck("価格", price, 1, 16, false, false, false, true, false, false, false);

		releaseDateErrorMessageList = checkDate("発売年月", releaseDate);
		releaseCompanyErrorMessageList = inputChecker.doCheck("発売会社",releaseCompany, 1, 50, true, true, true, true, true, true, false);
		identical_productNameErrorMessageList = inputChecker.doIdentical_productNameCheck((List<ProductInfoDTO>) session.get("productInfoDtoList"), productName);
		identical_productNameKanaErrorMessageList = inputChecker.doIdentical_productNameKanaCheck((List<ProductInfoDTO>) session.get("productInfoDtoList"), productNameKana);


		//画像ファイルが選択されているか確認する
		if(userImage != null){
			imageFilePathError = null;
		}else{
			imageFilePathErrorMessageList.add("画像ファイルを選んでください");
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
				imageFilePathErrorMessageList.add("使用できるファイルは'.jpeg.jpg'です");
			}
		}

		if(userImage2 !=null){
			imageFilePathError = null;
		}else{
			imageFilePathErrorMessageList.add("画像ファイル2を選んでください");
		}
		//特定の拡張子以外の画像ファイルを選択できないようにする
		//最後の.の位置を取得します
		if(userImage2FileName != null){
			int point2 = userImage2FileName.lastIndexOf(".");
			System.out.println(point2);

		//.が存在する場合.以降の文字を返します
			if(point2 != -1){
				fileExtension2 = userImage2FileName.substring(point2 + 1);
			}
			//jpegかjpgでないときエラー文を挿入
			if(!fileExtension2.equals("jpeg")&& !fileExtension2.equals("jpg")){
				imageFilePathErrorMessageList.add("使用できるファイルは'.jpeg.jpg'です");
			}
		}


		//maxIdPlusOne
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		maxIdPlusOne = productInfoDAO.maxIdPlusOne();
		System.out.println(maxIdPlusOne);

		//入力された値を保存する
		session.put("productId", maxIdPlusOne);
		session.put("productName", productName);
		session.put("productNameKana", productNameKana);
		session.put("productDescription", productDescription);
		session.put("categoryId", categoryId);
		session.put("price", price);

		session.put("releaseDate", releaseDate);
		session.put("releaseCompany", releaseCompany);


		if(productNameErrorMessageList.size()==0
				&& productNameKanaErrorMessageList.size()==0
				&& productDescriptionErrorMessageList.size()==0
				&& categoryIdErrorMessageList.size()==0
				&& priceErrorMessageList.size()==0
				&& releaseDateErrorMessageList.size()==0
				&& releaseCompanyErrorMessageList.size()==0
				&& imageFilePathErrorMessageList.size()==0
				&& identical_productNameErrorMessageList.size()==0
				&& identical_productNameKanaErrorMessageList.size()==0) {

					//選択した画像ファイル名をコンソールに表示する
					System.out.println(userImageFileName);

					//選択した画像ファイルをサーバーに保存する
					String  filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images/");

					System.out.println("imageLocation" + filePath);

					CommonUtility commonUtility = new CommonUtility();
					userImageFileName = commonUtility.getRandomValue() + userImageFileName;

					//サーバー上に保存した画像をimageファルダにコピーする
					File fileToCreate = new File(filePath,userImageFileName);

					try{
						FileUtils.copyFile(userImage, fileToCreate);
						session.put("imageFileName", userImageFileName);
						session.put("imageFilePath","./images");
						session.put("image_flg", userImageFileName);
						}catch(IOException e){
							e.printStackTrace();
				}

					//選択した画像ファイル名をコンソールに表示する
					System.out.println(userImage2FileName);

					//選択した画像ファイルをサーバーに保存する
					String  filePath2 = ServletActionContext.getServletContext().getRealPath("/").concat("images/");

					System.out.println("imageLocation" + filePath2);

					CommonUtility commonUtility2 = new CommonUtility();
					userImage2FileName = commonUtility2.getRandomValue() + userImage2FileName;

					//サーバー上に保存した画像をimageファルダにコピーする
					File fileToCreate2 = new File(filePath2, userImage2FileName);

					try{
						FileUtils.copyFile(userImage2, fileToCreate2);
						session.put("imageFileName2", userImage2FileName);
						session.put("imageFilePath2","./images");
						session.put("image_flg2", userImage2FileName);
						}catch(IOException e){
							e.printStackTrace();
				}
					result = SUCCESS;
				}else {
					session.put("productNameErrorMessageList", productNameErrorMessageList);
					session.put("productNameKanaErrorMessageList", productNameKanaErrorMessageList);
					session.put("productDescriptionErrorMessageList", productDescriptionErrorMessageList);
					session.put("categoryIdErrorMessageList", categoryIdErrorMessageList);
					session.put("priceErrormessageList", priceErrorMessageList);
					session.put("releaseDateErrorMessageList", releaseDateErrorMessageList);
					session.put("releaseCompanyErrorMessageList", releaseCompanyErrorMessageList);
					session.put("imageFilePathErrorMessageList", imageFilePathErrorMessageList);
					session.put("identical_productNameErrorMessageList",identical_productNameErrorMessageList);
					session.put("identical_productNameKanaErrorMessageList",identical_productNameKanaErrorMessageList);
					result = ERROR;
				}

		return result;
	}

	private List<String> checkDate(String propertyName, String value){
		List<String> errorList = new ArrayList<String>();

		if(StringUtils.isEmpty(value)){
			errorList.add(propertyName + "を入力してください。");
		}else{
			try{
				DateUtils.parseDateStrictly(value, new String[] { "yyyy-MM-dd","yyyy年MM月dd日"});
			}catch(ParseException e){
				e.printStackTrace();
				errorList.add("yyyy-MM-dd または yyyy年MM月dd日 で入力してください");
			}
		}
		return errorList;
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
	public void setProductDescription(String productDescription){
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

	public String getImageFileName2(){
		return imageFileName2;
	}
	public void setImageFileName2(String imageFileName2){
		this.imageFileName2 = imageFileName2;
	}

	//userImage
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

	//userImage2
	public File getUserImage2(){
		return userImage2;
	}
	public void setUserImage2(File userImage2){
		this.userImage2 = userImage2;
	}

	public String getUserImageContentType2(){
		return userImageContentType2;
	}
	public void setUserImageContentType2(String userImageContentType2){
		this.userImageContentType2 = userImageContentType2;
	}

	public String getUserImage2FileName(){
		return userImage2FileName;
	}
	public void setUserImage2FileName(String userImage2FileName){
		this.userImage2FileName = userImage2FileName;
	}





	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

}

