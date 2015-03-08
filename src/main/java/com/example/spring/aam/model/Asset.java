package com.example.spring.aam.model;

import java.util.Set;

public class Asset implements IAsset {

	private int id;
	private IAssetType assetTypeID;
	private int assetNumber;
	private String assetName;
	private Set<Works> worksForAsset;

	public Set<Works> getWorksForAsset() {
		return worksForAsset;
	}

	public void setWorksForAsset(Set<Works> worksForAsset) {
		this.worksForAsset = worksForAsset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#getAssetTypeID()
	 */
	@Override
	public IAssetType getAssetTypeID() {
		return assetTypeID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.IAsset2#setAssetTypeID(com.example.spring
	 * .aam.model.IAssetType)
	 */
	@Override
	public void setAssetTypeID(IAssetType assetTypeID) {
		this.assetTypeID = assetTypeID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#getAssetNumber()
	 */
	@Override
	public int getAssetNumber() {
		return assetNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#setAssetNumber(int)
	 */
	@Override
	public void setAssetNumber(int assetNumber) {
		this.assetNumber = assetNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#getAssetName()
	 */
	@Override
	public String getAssetName() {
		return assetName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAsset2#setAssetName(java.lang.String)
	 */
	@Override
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", assetTypeID=" + assetTypeID
				+ ", assetNumber=" + assetNumber + ", assetName=" + assetName
				+ "]";
	}

}
