package com.example.spring.aam.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class AssetType implements Serializable, IAssetType {
	/**
   * 
   */
	private Integer id;

	@Override
	public String toString() {
		return "AssetType [id=" + id + ", version=" + version
				+ ", assetTypeName=" + assetTypeName + ", resources="
				+ resources.toString() + "]";
	}

	/**
   * 
   */
	private Integer version;

	/**
   * 
   */
	private String assetTypeName;

	/**
   * 
   */
	private Set<IResource> resources = new HashSet<IResource>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#getVersion()
	 */
	@Override
	public Integer getVersion() {
		return this.version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.IAssetType#setVersion(java.lang.Integer)
	 */
	@Override
	public void setVersion(Integer version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#getAssetTypeName()
	 */
	@Override
	public String getAssetTypeName() {
		return assetTypeName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.model.IAssetType#setAssetTypeName(java.lang.String
	 * )
	 */
	@Override
	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#getResources()
	 */
	@Override
	public Set<IResource> getResources() {
		return resources;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.model.IAssetType#setResources(java.util.Set)
	 */
	@Override
	public void setResources(Set<IResource> resources) {
		this.resources = resources;
	}
}
