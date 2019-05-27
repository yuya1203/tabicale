
package com.internousdev.tabicale.util;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils
;

import com.internousdev.tabicale.dto.ProductInfoDTO;
public class InputChecker {



	/**
	 * このプログラムは渡された値を正規表現か検証するものです。
	 * 使い方はdoCheckに9つの引数を渡します。後半部分には当てはまる形式にtrueを入れます。
	 * emailを判別したいのであれば英字、数字、記号を含むため下記のようになります。
	 * 例(質問の内容,値,最小文字数,最大文字数,true,false,false,true,true)となります。
	 * 結果はList形式で渡されることに気を付けてください。
	 *
	 */
	public List<String> doCheck(String propertyName,String value,int minLength,int maxLength,boolean availableAlphabeticCharacters,boolean availableKanji,boolean availableHiragana,boolean availableHalfWidthDigit,boolean availableHalfWidthSymbols,boolean availableKatakana,boolean availableFullWidthSymbols,boolean stretchedBar){

		//検証した結果を入れるList
				List<String> stringList = new ArrayList<String>();
				List<String> characterTypeList = new ArrayList<String>();

				//入力欄が空かどうかを検証します
				if(StringUtils.isEmpty(value)){
					stringList.add(propertyName + "を入力してください。");
				}

				//入力欄が最小文字数以上、最大文字数以下かどうかを検証します
				if(value.length() < minLength || value.length() > maxLength){
					stringList.add(propertyName + "は" + minLength + "文字以上" + maxLength + "文字以下で入力してください。");
				}


				///////////入力された文字のタイプから何を判別するか決めます//////////
				String regularExpression = "";
				String errorExpression = "";


				if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit || availableHalfWidthSymbols||availableKatakana||availableFullWidthSymbols||stretchedBar){
					regularExpression = "[^";
				}
				if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) || !(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)|| !(stretchedBar)){
					errorExpression = "[^";
				}

				if(availableAlphabeticCharacters){
					regularExpression +="a-zA-Z";
						characterTypeList.add("半角英字");
				}else{
					errorExpression += "a-zA-Z";
				}

				if(availableKanji){
					regularExpression +="一-龯";
					characterTypeList.add("漢字");
				}else{
					errorExpression +="一-龯";
				}

				if(availableHiragana){
					regularExpression +="ぁ-ん";
					characterTypeList.add("ひらがな");
				}else{
					errorExpression +="ぁ-ん";
				}

				if(availableHalfWidthDigit){
					regularExpression +="0-9";
					characterTypeList.add("半角数字");
				}else{
					errorExpression+="0-9";
				}

				if(availableHalfWidthSymbols){
					regularExpression +="@.,;:!#$%&'*+-/=?^_`{|}~\\s";
					characterTypeList.add("半角記号");
				}else{
					errorExpression +="@.,;:!#$%&'*+-/=?^_`{|}~\\s";
				}

				if(availableKatakana){
					regularExpression +="ァ-ヺ";
					characterTypeList.add("カタカナ");
				}else{
					errorExpression +="ァ-ヺ";
				}

				if(availableFullWidthSymbols){
					regularExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～、。　";
					characterTypeList.add("全角記号");
				}else{
					errorExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～、。　";
				}

				if(stretchedBar){
					regularExpression +="ー";
					characterTypeList.add("");
				}else{
					errorExpression +="ー";
				}
				if(!StringUtils.isEmpty(regularExpression)){
					regularExpression +="]+";
				}
				if(!StringUtils.isEmpty(errorExpression)){
					errorExpression +="]+";
				}
				////////////////////////////ここまで///////////////////////////


				//判別した項目に応じてエラーメッセージを返します
				String characterType = "";
				for(int i = 0;i < characterTypeList.size();i++){
					if(i == 0){
						characterType += characterTypeList.get(i).toString();
					}else{
						characterType += "、" + characterTypeList.get(i).toString();
					}
				}
				if(errorExpression.equals("")){
					if(value.matches(regularExpression)){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}else{
					if(value.matches(regularExpression)||(!value.matches(errorExpression)&&!value.equals(""))){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}

				return stringList;
			}

	public List<String> doPriceCheck(String propertyName,String value,int minLength,int maxLength,boolean availableAlphabeticCharacters,boolean availableKanji,boolean availableHiragana,boolean availableHalfWidthDigit,boolean availableHalfWidthSymbols,boolean availableKatakana,boolean availableFullWidthSymbols){

		//検証した結果を入れるList
				List<String> stringList = new ArrayList<String>();
				List<String> characterTypeList = new ArrayList<String>();

				//入力欄が空かどうかを検証します
				if(StringUtils.isEmpty(value)){
					stringList.add(propertyName + "を入力してください。");
				}

				//入力欄が最小文字数以上、最大文字数以下かどうかを検証します
				if(value.length() < minLength || value.length() > maxLength){
					stringList.add("価格は1桁から8桁以内でお願いします");
				}


				///////////入力された文字のタイプから何を判別するか決めます//////////
				String regularExpression = "";
				String errorExpression = "";


				if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit || availableHalfWidthSymbols||availableKatakana||availableFullWidthSymbols){
					regularExpression = "[^";
				}
				if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) || !(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)){
					errorExpression = "[^";
				}

				if(availableAlphabeticCharacters){
					regularExpression +="a-zA-Z";
						characterTypeList.add("半角英字");
				}else{
					errorExpression += "a-zA-Z";
				}

				if(availableKanji){
					regularExpression +="一-龯";
					characterTypeList.add("漢字");
				}else{
					errorExpression +="一-龯";
				}

				if(availableHiragana){
					regularExpression +="ぁ-ん";
					characterTypeList.add("ひらがな");
				}else{
					errorExpression +="ぁ-ん";
				}

				if(availableHalfWidthDigit){
					regularExpression +="0-9";
					characterTypeList.add("半角数字");
				}else{
					errorExpression+="0-9";
				}

				if(availableHalfWidthSymbols){
					regularExpression +="@.,;:!#$%&'*+-/=?^_`{|}~\\s";
					characterTypeList.add("半角記号");
				}else{
					errorExpression +="@.,;:!#$%&'*+-/=?^_`{|}~\\s";
				}

				if(availableKatakana){
					regularExpression +="ァ-ヺ";
					characterTypeList.add("カタカナ");
				}else{
					errorExpression +="ァ-ヺ";
				}

				if(availableFullWidthSymbols){
					regularExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～ー、。　";
					characterTypeList.add("全角記号");
				}else{
					errorExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～ー、。　";
				}

				if(!StringUtils.isEmpty(regularExpression)){
					regularExpression +="]+";
				}
				if(!StringUtils.isEmpty(errorExpression)){
					errorExpression +="]+";
				}
				////////////////////////////ここまで///////////////////////////


				//判別した項目に応じてエラーメッセージを返します
				String characterType = "";
				for(int i = 0;i < characterTypeList.size();i++){
					if(i == 0){
						characterType += characterTypeList.get(i).toString();
					}else{
						characterType += "、" + characterTypeList.get(i).toString();
					}
				}
				if(errorExpression.equals("")){
					if(value.matches(regularExpression)){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}else{
					if(value.matches(regularExpression)||(!value.matches(errorExpression)&&!value.equals(""))){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}

				return stringList;
			}


	//一度目のパスワードと二度目のパスワードが同じかを検証します。
	public List<String> doPasswordCheck(String password,String reConfirmationPassword){
		List<String> stringList = new ArrayList<String>();
		if(!(password.equals(reConfirmationPassword))){
			stringList.add("入力されたパスワードが異なります。");
		}
		return stringList;
	}

	//商品名とが同一なものがないか判断します
	public List<String> doIdentical_productNameCheck(List<ProductInfoDTO> productInfoDtoList,String productName){
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<productInfoDtoList.size();i++){
			if(productInfoDtoList.get(i).getProductName().equals(productName)){
				stringList.add("同一の商品名が存在してます。");
			}
			System.out.println("i"+i);
		}
		return stringList;
	}

	//商品名カナが同一なものがないか判断します
	public List<String> doIdentical_productNameKanaCheck(List<ProductInfoDTO> productInfoDtoList,String productNameKana){
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<productInfoDtoList.size();i++){
			if(productInfoDtoList.get(i).getProductNameKana().equals(productNameKana)){
				stringList.add("同一の商品名かなが存在してます。");
			}
			System.out.println("i"+i);
		}
		return stringList;
	}

}
