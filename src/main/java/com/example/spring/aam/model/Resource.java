package com.example.spring.aam.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Resource implements Serializable, IResource {
  /**
   * 
   */
  private Integer resourceId;

  /**
   * 
   */
  private Integer version;
  
  /**
   * 
   */
  private IAssetType assetType;
  
  /**
   * 
   */
  private String resourceFirstName;

  /**
   * 
   */
  private String resourceLastName;

  /**
   * 
   */
  protected String resourceAddress;

  /**
   * 
   */
  protected String resourceEmail;

  @Override
  public Integer getResourceId() {
    return this.resourceId;
  }

  @Override
  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  @Override
  public int getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public IAssetType getAssetType() {
    return assetType;
  }

  @Override
  public void setAssetType(IAssetType assetType) {
    this.assetType = assetType;
  }

  @Override
  public String getResourceFirstName() {
    return resourceFirstName;
  }

  @Override
  public void setResourceFirstName(String resourceFirstName) {
    this.resourceFirstName = resourceFirstName;
  }

  @Override
  public String getResourceLastName() {
    return resourceLastName;
  }

  @Override
  public void setResourceLastName(String resourceLastName) {
    this.resourceLastName = resourceLastName;
  }

  @Override
  public String getResourceAddress() {
    return resourceAddress;
  }

  @Override
  public void setResourceAddress(String resourceAddress) {
    this.resourceAddress = resourceAddress;
  }

  @Override
  public String getResourceEmail() {
    return resourceEmail;
  }

  @Override
  public void setResourceEmail(String resourceEmail) {
    this.resourceEmail = resourceEmail;
  }
}