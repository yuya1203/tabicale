package com.internousdev.tabicale.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.tabicale.dto.ProductInfoDTO;

public class ProductInfoDTOTest {
	int max = 2147483647;
	int min = -2147483648;
	String exmax = "2147483647";
	String exmin = "-2147483648";

	//id getter
	@Test
	public void testGetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setId(expected);
//			int actual = dto.getId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483647\"");
		}
	}

	@Test
	public void testGetId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setId(expected);
//			int actual = dto.getId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	//id setter
	@Test
	public void testSetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);
//			int actual = dto.getId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483647\"");
		}
	}

	@Test
	public void testSetId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);
//			int actual = dto.getId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}


	//productId getter
	@Test
	public void testGetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setProductId(expected);
//			int actual = dto.getProductId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483647\"");
		}
	}

	@Test
	public void testGetProductId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setProductId(expected);
//			int actual = dto.getProductId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	//productId setter
	@Test
	public void testSetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setProductId(expected);
//			int actual = dto.getProductId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductId5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setProductId(expected);
//			int actual = dto.getProductId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	//productName getter
	@Test
	public void testGetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//productName setter
	@Test
	public void testSetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual= dto.getProductName();
		assertEquals(expected, actual);
	}

	//productNameKana getter
	@Test
	public void testGetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//productNameKana setter
	@Test
	public void testSetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual= dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//productDescription getter
	@Test
	public void testGetProductDescription1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	//productDescription setter
	@Test
	public void testSetProductDescription1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual= dto.getProductDescription();
		assertEquals(expected, actual);
	}

	//categoryId getter
	@Test
	public void testGetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setCategoryId(expected);
//			int actual = dto.getCategoryId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}

	@Test
	public void testGetCategoryId5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setCategoryId(expected);
//			int actual = dto.getCategoryId();
//			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}


	//CategoryId setter
	@Test
	public void testSetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId4() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}

	@Test
	public void testSetCategoryId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//price getter
	@Test
	public void testGetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For inpu strin:\"2147483647\"");
		}
	}

	@Test
	public void testGetPrice5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For inpu strin:\"-2147483648\"");
		}
	}

	//price setter
	@Test
	public void testSetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = max;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = min;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}

	@Test
	public void testSetPrice5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected, actual);
		} catch (RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//imageFilePath getter
	@Test
	public void testGetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//imageFilePath setter
	@Test
	public void testSetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual= dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	//imageFileName getter
	@Test
	public void testGetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//ImageFileName setter
	@Test
	public void testSetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual= dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//releaseDate getter
	@Test
	public void testGetReleaseDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDate2() throws ParseException{
		ProductInfoDTO dto = new ProductInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");

		dto.setReleaseDate(expected);
		assertEquals(expected,dto.getReleaseDate());
	}

	//releaseDate setter
	@Test
	public void testSetReleaseDate1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate2() throws ParseException{
		ProductInfoDTO dto = new ProductInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("2018042012:00:002");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	//releaseCompany getter
	@Test
	public void testGetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//releaseCompany setter
	@Test
	public void testSetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmax;

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = exmin;

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany11() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany12() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual= dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//status getter
	@Test
	public void testGetStatus() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setStatus(expected)
	}

	@Test
	public void testSetStatus() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUpdateDate() {
		fail("まだ実装されていません");
	}

}
