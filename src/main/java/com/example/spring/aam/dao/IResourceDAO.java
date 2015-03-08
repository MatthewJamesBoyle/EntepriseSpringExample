package com.example.spring.aam.dao;

import com.example.spring.aam.model.IResource;


public interface IResourceDAO {
   /**
    * Save a new resource
    * 
    * @param resource 
    */
   void save(IResource resource);
}
