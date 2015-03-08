package com.example.spring.aam.dao;

import java.util.List;

import com.example.spring.aam.model.IAssetType;


public interface IAssetTypeDAO {
   /**
    * Retrieve a list of asset types
    * <b>Note:</b> This will not retrieve associated assets if lazy load is true
    * 
    * @return a list of all the asset types
    */
   public List<IAssetType> getAssetTypes();

   /**
    * Retrieves a list of asset types and associated assets regardless of
    * the setting for lazy load.
    * 
    * @return a list of all the asset types and their associated assets
    */
   public List<IAssetType> getAssetTypesAndAssets();

   /**
    * Get an asset type by name
    * 
    * @param aName - the asset type name
    * @return the retrieved asset type or null if asset type not found
    */
   public IAssetType getAssetType(String aName);
   
   /**
    *  Save a new asset type
    * 
    * @param assetType is the asset type object to be saved
    */
   void save(IAssetType assetType);

   /**
    * Delete the asset type
    * 
    * @param assetType to be deleted
    */
   void delete(IAssetType assetType);
}