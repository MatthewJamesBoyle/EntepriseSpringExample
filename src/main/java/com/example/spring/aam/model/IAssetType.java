package com.example.spring.aam.model;

import java.util.Set;

public interface IAssetType {
  /**
   * @return the id
   */
  public Integer getId();

  /**
   * @param id the id to set
   */
  public void setId(Integer id);

  /**
   * @return the version
   */
  public Integer getVersion();

  /**
   * @param version the version to set
   */
  public void setVersion(Integer version);

  /**
   * @return the assetTypeName
   */
  public String getAssetTypeName();

  /**
   * @param assetTypeName the assetTypeName to set
   */
  public void setAssetTypeName(String assetTypeName);

  /**
   * 
   * @return the resources
   */
  public Set<IResource> getResources();

  /**
   * Set the resources
   * 
   * @param resources 
   */
  public void setResources(Set<IResource> resources);
}