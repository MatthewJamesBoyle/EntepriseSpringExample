package com.example.spring.aam.model;

import java.util.Set;

public interface IAsset {
	public int getId();

	public void setId(int id);

	public IAssetType getAssetTypeID();

	public void setAssetTypeID(IAssetType assetTypeID);

	public int getAssetNumber();

	public void setAssetNumber(int assetNumber);

	public String getAssetName();

	public void setAssetName(String assetName);

	public Set<Works> getWorksForAsset();

	public void setWorksForAsset(Set<Works> worksForAsset);

}