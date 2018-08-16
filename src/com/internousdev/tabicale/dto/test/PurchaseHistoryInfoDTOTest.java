package com.internousdev.tabicale.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tabicale.dto.PurchaseHistoryInfoDTO;

public class PurchaseHistoryInfoDTOTest {
	int max =2147483647;
	int min =-2147483648;
	String exmax = "2147483648";
	String exmin = "-2147483649";

	//id gettetr/setter
	@Test
	public void testGetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	//userId getter/setter
	@Test
	public void testGetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

/*UserId8？ もしくは UserId9？
	@Test
	public void testGetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
*/
	@Test
	public void testGetUserId9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//productId getter/setter
	@Test
	public void testGetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//productCount getter/sertter
	@Test
	public void testGetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetDestinationId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetDestinationId() {
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

	@Test
	public void testGetProductName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductDescription() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductDescription() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetCategoryId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetCategoryId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFileName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImageFileName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFamilyNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetFirstNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetFirstNameKana() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetEmail() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTelNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUserAddress() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUserAddress() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetSubtotal() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetSubtotal() {
		fail("まだ実装されていません");
	}

}
