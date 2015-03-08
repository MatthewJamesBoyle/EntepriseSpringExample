package com.example.spring.aam;

import java.util.List;

import org.hibernate.Hibernate;

import com.example.spring.aam.dao.IAssetDAO;
import com.example.spring.aam.dao.IAssetTypeDAO;
import com.example.spring.aam.model.Asset;
import com.example.spring.aam.model.AssetType;
import com.example.spring.aam.model.IAsset;
import com.example.spring.aam.model.IAssetType;

public class AAMServiceImpl implements AAMService {
	/**
   * 
   */
	private IAssetTypeDAO assetTypeDAO;

	private IAssetDAO assetDAO;

	/**
	 * 
	 * @param assetTypeDAO
	 */
	public AAMServiceImpl(IAssetTypeDAO assetTypeDAO, IAssetDAO assetDAO) {
		this.assetTypeDAO = assetTypeDAO;
		this.assetDAO = assetDAO;
	}

	@Override
	public List<IAssetType> getAssetTypeList() {
		return this.assetTypeDAO.getAssetTypesAndAssets();
	}

	@Override
	public List<IAssetType> getAssetTypeAssetList() {
		return this.assetTypeDAO.getAssetTypesAndAssets();
	}

	@Override
	public IAssetType addAssetType(String assetTypeName) {
		IAssetType assetType = assetTypeDAO.getAssetType(assetTypeName);
		if (assetType == null) {
			assetType = new AssetType();
			assetType.setAssetTypeName(assetTypeName);
			this.assetTypeDAO.save(assetType);
			return assetType;
		}

		return null;
	}

	@Override
	public IAssetType updateAssetType(String assetTypeName,
			String newAssetTypeName) {
		IAssetType assetType = assetTypeDAO.getAssetType(assetTypeName);
		if (assetType != null) {
			assetType.setAssetTypeName(newAssetTypeName);
		}

		return assetType;
	}

	@Override
	public IAssetType deleteAssetType(String assetTypeName) {
		IAssetType assetType = assetTypeDAO.getAssetType(assetTypeName);
		if (assetType != null // && aType.getAssets().isEmpty()
				&& assetType.getResources().isEmpty()) {
			assetTypeDAO.delete(assetType);
		}
		return assetType;
	}

	@Override
	public List<IAsset> ListAssets() {
		// TODO Auto-generated method stub
		return this.assetDAO.getAssetList();
	}

	public IAsset ListAssets(String no) {
		return this.assetDAO.getAssetList(new Integer(no));
	}

	public List<IAsset> ListAssets(String noS, String noE) {
		List<IAsset> toPrint = this.assetDAO.getAssetList(new Integer(noS),
				new Integer(noE));
		for (IAsset i : toPrint) {
			Hibernate.initialize(i.getAssetTypeID().getResources());
		}
		return toPrint;
	}

	public boolean addAsset(String assetNo, String assetName, String type) {
		if (this.assetTypeDAO.getAssetType(type) == null) {
			return false;
		} else if (this.assetDAO.getAssetList(new Integer(assetNo)) != null) {

			return false;
		} else {
			Asset toAdd = new Asset();
			toAdd.setAssetName(assetName);
			toAdd.setAssetNumber(new Integer(assetNo));
			toAdd.setAssetTypeID(this.assetTypeDAO.getAssetType(type));
			assetDAO.addAsset(toAdd);
		}

		return true;

	}

	public boolean updateAsset(String oldAssetNo, String newAssetNo,
			String assetName, String assetType) {
		IAsset assetToUpdate = null;
		if (this.assetDAO.getAssetList(new Integer(oldAssetNo)) == null) {
			return false;
		} else {

			assetToUpdate = this.assetDAO.getAssetList(new Integer(oldAssetNo));
			this.assetDAO.updateAsset(new Integer(oldAssetNo), new Integer(
					newAssetNo));
			return true;
		}

	}

	@Override
	public boolean deleteAsset(String assetNo) {
		IAsset toCheck = this.assetDAO.getAssetList(new Integer(assetNo));
		if (toCheck == null) {
			return false;
		} else {
			if (toCheck.getWorksForAsset().size() > 0) {
				throw new IllegalArgumentException("asset has works");
			} else {
				this.assetDAO.deleteAsset(new Integer(assetNo));
				return true;

			}
		}

	}

	@Override
	public boolean deleteAsset(String startNo, String endNo) {
		List<IAsset> toDelete = this.assetDAO.getAssetList(
				new Integer(startNo), new Integer(endNo));

		if (toDelete.size() <= 0) {
			return false;
		}
		for (IAsset a : toDelete) {
			Hibernate.initialize(a);
			if (a.getWorksForAsset().size() > 0) {
				throw new IllegalArgumentException(
						"one of the assets has a work associated with it, so none were deleted");
			}

		}
		for (IAsset a : toDelete) {
			Hibernate.initialize(a);
			this.assetDAO.deleteAsset(a.getAssetNumber());
		}

		return true;
	}
}