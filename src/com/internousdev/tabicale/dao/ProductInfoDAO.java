package com.internousdev.tabicale.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.tabicare.dto.ProductInfoDTO;

public class ProductInfoDAO {

	private String keyword;

	public List<ProductInfoDAO> getProductInfoList(){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnector();
		List<ProductInfoDTO> productInfoDtoList=new ArrayList<ProductInfoDTO>();
		String sql="select * from product_info";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				ProductInfoDTO productInfoDto=new ProductInfoDTO();
				productInfoDto.setId(resultSet.getInt("id"));
				productInfoDto.setProductId(resultSet.getInt("product_id"));
				productInfoDto.setProductName(resultSet.getString("product_name"));
				productInfoDto.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDto.setProductDescription(resultSet.getString("product_description"));
				productInfoDto.setCategoryId(resultSet.getInt("category_id"));
				productInfoDto.setPrice(resultSet.getInt("price"));
				productInfoDto.setImageFilePath(resultSet.getString("image_file_path"));
				productInfoDto.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDto.setReleaseDate(resultSet.getDate("release_date"));
				productInfoDto.setReleaseCompany(resultSet.getString("release_company"));
				productInfoDto.setStatus(resultSet.getInt("status"));
				productInfoDto.setUpdateDate(resultSet.getDate("regist_date"));
				productInfoDto.setUpdateDate(resultSet.getDate("update_date"));
				productInfoDtoList.add(productInfoDto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDtoList;
	}
	public ProductInfoDTO getProductInfo(int productId){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		ProductInfoDTO productInfoDTO=new ProductInfoDTO();
		String sql="select * from product_info where product_id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			PreparedStatement.setInt(1,product);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				productInfoDTO.setId(resultSet.getInt("id"));
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFilePath(resultSet.getString("image_file_path"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDTO.setRegistDate(resultSet.getDate("release_date"));
				productInfoDTO.setReleaseCompany(resultSet.getString("release_company"));
				productInfoDTO.setStatus(resultSet.getInt("status"));
				productInfoDTO.setUpdateDate(resultSet.getDate("regist_date"));
				productInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDTO;
	}
	public List<ProductInfoDTO> getProductInfoListByCategoryId(int categoryId,int productId,int limitOffset,int limitRowCount){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		List<com.internousdev.tabicale.dto.ProductInfoDTO> productInfoDtoList=new ArrayList<ProductInfoDTO>();
		String sql="select * from product_info where category_id=? and product_id not in(?) order by rand() limit ?,?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, categoryId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, limitOffset);
			preparedStatement.setInt(4, limitRowCount);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				com.internousdev.tabicale.dto.ProductInfoDTO productInfoDTO=new ProductInfoDTO();
				productInfoDTO.setId(resultSet.getInt("id"));
				productInfoDTO.setProductId(resultSet.getInt("product_id"));
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFilePath(resultSet.getString("image_file_name"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDTO.setReleaseDate(resultSet.getDate("release_date"));
				productInfoDTO.setReleaseCompany(resultSet.getString("release_company"));
				productInfoDTO.setStatus(resultSet.getInt("status"));
				productInfoDTO.setUpdateDate(resultSet.getDate("regist_date"));
				productInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
				productInfoDtoList.add(productInfoDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDtoList;
	}

	public List<ProductInfoDTO> getProductInfoListAll(String[] keywordsList){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		List<ProductInfoDTO> productInfoDtoList=new ArrayList<ProductInfoDTO>();
		String sql="select * from product_info where";
		boolean initializeFlag=true;
		for(String keyword: keywordsList){
			sql +="(product_name like '%" + keyword + "%' or pruduct_name_kana like '%" + keyword + "%')";
			initializeFlag=false;
		}else{
			sql += " and (product_name like'%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
		}
	}
	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			com.internousdev.tabicale.dto.ProductInfoDTO productInfoDTO=new ProductInfoDTO();
			productInfoDTO.setId(resultSet.getInt("id"));
			productInfoDTO.setProductId(resultSet.getInt("product_Id"));
			productInfoDTO.setProductName(resultSet.getString("product_name"));
			productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
			productInfoDTO.setProductDescription(resultSet.getString("product_description"));

		}
	}

}