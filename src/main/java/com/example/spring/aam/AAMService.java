package com.example.spring.aam;

import java.util.List;

import com.example.spring.aam.model.IAsset;
import com.example.spring.aam.model.IAssetType;

public interface AAMService {
	/**
	 * Produces a list of the Asset Type names without the list of associated
	 * Assets unless lazy is set to false in the Hibernate mapping file.
	 * 
	 * @return list of Asset Types
	 */
	List<IAssetType> getAssetTypeList();

	/**
	 * Produces a list of the Asset Type names and their associated Assets This
	 * will work if lazy="true" in mapping file
	 * 
	 * @return list of Asset Types and Associated Assets
	 */
	List<IAssetType> getAssetTypeAssetList();

	/**
	 * Add an Asset Type
	 * 
	 * @param aName
	 * @return
	 */
	IAssetType addAssetType(String assetTypeName);

	/**
	 * Update the name of an Asset Type.
	 * 
	 * @param oldAssetTypeName
	 *            - The asset type name currently on the database
	 * @param newAssetTypeName
	 *            - The asset type name to be changed
	 * @return
	 */
	public IAssetType updateAssetType(String oldAssetTypeName,
			String newAssetTypeName);

	/**
	 * Delete asset type from the database
	 * 
	 * @param string
	 * @return
	 */
	public IAssetType deleteAssetType(String assetTypeName);

	public List<IAsset> ListAssets();

	public IAsset ListAssets(String no);

	public List<IAsset> ListAssets(String noS, String noE);

	public boolean addAsset(String assetNo, String assetName, String type);

	public boolean updateAsset(String oldAssetNo, String newAssetNo,
			String assetName, String assetType);

	public boolean deleteAsset(String assetNo);

	public boolean deleteAsset(String startNo, String endNo);
	
	
}
