package com.internousdev.tabicale.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.tabicale.dto.CartInfoDTO;

public class CartInfoDTOTest {

	@Test
	public void testGetId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"2147483648\"");
		}
	}

	@Test
	public void testGetId5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//setId

	@Test
	public void testSetId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual= dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual= dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual= dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId4() {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

	//getUserId

	@Test
	public void testGetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals (expected, actual);
	}

	@Test
	public void testGetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//setUserId

	@Test
	public void testSetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		CartInfoDTO dto =new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//getTempUserId

	@Test
	public void testGetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "  ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//setTempUserID

	@Test
	public void testSetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//getProductId test

	@Test
	public void testGetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//setProductId test

	@Test
	public void testSetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//getProdutCount test

	@Test
	public void testGetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483648");

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetProductCount test

	@Test
	public void testSetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMin = Integer.parseInt("-2147483648");

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//get Price test

	@Test
	public void testGetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = 10000000;
			dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = -10000000;
			dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	//set Price test

	@Test
	public void testSetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -9999999;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = 10000000;
			dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int postalMax = -10000000;
			dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	//get registDate test

	@Test
	public void testGetRegistDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRegistDate2() throws ParseException {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//set registDate Test

	@Test
	public void testSetRegistDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetRegistDate2() throws ParseException {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	//get UpdateDate test

	@Test
	public void testGetUpdateDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUpdateDate2() throws ParseException {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date expected = sdf.parse("2018/04/20 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	//set UpdateDate test

	@Test
	public void testSetUpdate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUpdateDate2() throws ParseException {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date expected = sdf.parse("2018/04/20 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	//get ProductName test

	@Test
	public void testGetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//set ProductName test

	@Test
	public void testSetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//get ProductNameKana

	@Test
	public void testGetProductNameKana1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//set ProductNameKana

	@Test
	public void testSetProductNameKana1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
}

















































