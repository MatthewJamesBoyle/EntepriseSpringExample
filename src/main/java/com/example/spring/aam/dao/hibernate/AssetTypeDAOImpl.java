package com.example.spring.aam.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.example.spring.aam.dao.IAssetTypeDAO;
import com.example.spring.aam.model.IAssetType;


public class AssetTypeDAOImpl implements IAssetTypeDAO {
  /**
   * 
   */
  private SessionFactory sessionFactory;

  /**
   * 
   * @return
   */
  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  /**
   * 
   * @param sessionFatory
   */
  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<IAssetType> getAssetTypes() {
    return
        this
          .getSessionFactory()
          .getCurrentSession()
          .createQuery("from AssetType")
          .list();
  }

  @Override
  public List<IAssetType> getAssetTypesAndAssets() {
    List<IAssetType> assetTypes = this.getAssetTypes();
    /* TODO: initialise the assets
    for (IAssetType assetType : assetTypes) {
      Hibernate.initialize(assetType.getAssets());
    }
    */
    
    return assetTypes;
  }

  @Override
  public IAssetType getAssetType(String assetTypeName) {
    Query query = 
        this
          .getSessionFactory()
          .getCurrentSession()
          .createQuery("from AssetType where assetTypeName = :name");
    query.setParameter("name", assetTypeName);
		return (IAssetType) query.uniqueResult();
  }

  @Override
  public void save(IAssetType assetType) {
    this
      .getSessionFactory()
      .getCurrentSession()
      .save(assetType);
  }

  @Override
  public void delete(IAssetType assetType) {
    this
      .getSessionFactory()
      .getCurrentSession()
      .delete(assetType);
  }
}