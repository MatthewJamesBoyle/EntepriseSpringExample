package com.example.spring.aam.model;

public interface IResource {
  /**
   * Get the value of resourceID
   *
   * @return the value of resourceID
   */
  public Integer getResourceId();

  /**
   * Set the value of resourceID
   *
   * @param resourceID new value of resourceID
   */
  public void setResourceId(Integer resourceId);

  /**
   * @return the version
   */
  public int getVersion();

  /**
   * @param version the version to set
   */
  public void setVersion(Integer version);

  /**
   * Get the value of assetType
   *
   * @return the value of assetType
   */
  public IAssetType getAssetType();

  /**
   * Set the value of assetType
   *
   * @param assetType new value of assetType
   */
  public void setAssetType(IAssetType assetType);

  /**
   * 
   * @return
   */
  public String getResourceFirstName();

  /**
   * 
   * @param resourceFirstName
   */
  public void setResourceFirstName(String resourceFirstName);

  /**
   * Get the value of resourceLastName
   *
   * @return the value of resourceLastName
   */
  public String getResourceLastName();

  /**
   * Set the value of resourceLastName
   *
   * @param resourceLastName new value of resourceLastName
   */
  public void setResourceLastName(String resourceLastName);

  /**
   * Get the value of resourceAddress
   *
   * @return the value of resourceAddress
   */
  public String getResourceAddress();

  /**
   * Set the value of resourceAddress
   *
   * @param resourceAddress new value of resourceAddress
   */
  public void setResourceAddress(String resourceAddress);

  /**
   * Get the value of resourceEmail
   *
   * @return the value of resourceEmail
   */
  public String getResourceEmail();

  /**
   * Set the value of resourceEmail
   *
   * @param resourceEmail new value of resourceEmail
   */
  public void setResourceEmail(String resourceEmail);
}