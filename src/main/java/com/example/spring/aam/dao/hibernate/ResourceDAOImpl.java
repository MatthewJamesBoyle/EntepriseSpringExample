package com.example.spring.aam.dao.hibernate;

import org.hibernate.SessionFactory;

import com.example.spring.aam.dao.IResourceDAO;
import com.example.spring.aam.model.IResource;


public class ResourceDAOImpl implements IResourceDAO {
  /**
   * 
   */
  private SessionFactory sessionFactory;

  /**
   * 
   * @return
   */
  public SessionFactory getSessionFatory() {
    return sessionFactory;
  }

  /**
   * 
   * @param sessionFatory
   */
  public void setSessionFatory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public void save(IResource resource) {
    this
      .getSessionFatory()
      .getCurrentSession()
      .save(resource);
  }
}
