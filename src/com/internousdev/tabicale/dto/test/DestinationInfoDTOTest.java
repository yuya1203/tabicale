package com.internousdev.tabicale.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tabicale.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {

	// get Id test

	@Test
	public void testGetId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try {
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//set Id test

	@Test
	public void testSetId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");

			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testGetUserId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}




	//set UserId test
	@Test
	public void testSetUserId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abcあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	//get FamilyName test
	@Test
	public void testGetFamilyName1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abd123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName9() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
	}

	@Test
	public void testGetFamilyName() {

	}

	@Test
	public void testGetFamilyName() {

	}

	@Test
	public void testGetFamilyName() {

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
