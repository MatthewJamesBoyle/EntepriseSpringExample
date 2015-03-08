package com.example.spring.aam.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.example.spring.aam.model.Asset;
import com.example.spring.aam.model.IAsset;

public interface IAssetDAO {

	public SessionFactory getSessionFactory();

	public void setSessionFactory(SessionFactory sessionFactory);

	public List<IAsset> getAssetList();

	public IAsset getAssetList(int assetNo);

	public List<IAsset> getAssetList(Integer integer, Integer integer2);

	public void addAsset(Asset asset);

	public void updateAsset(int assetToUpdate, int newAssetNo);

	public void deleteAsset(int startNo);

	public void deleteAsset(int startNo, int endNo);

}