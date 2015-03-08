package com.example.spring.aam.dao.hibernate;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;

import com.example.spring.aam.dao.IAssetDAO;
import com.example.spring.aam.model.Asset;
import com.example.spring.aam.model.IAsset;

public class AssetDAOImpl implements IAssetDAO {

	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.dao.hibernate.AssetDAO#getSessionFactory()
	 */
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.spring.aam.dao.hibernate.AssetDAO#setSessionFactory(org.hibernate
	 * .SessionFactory)
	 */
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.dao.hibernate.AssetDAO#getAssetList()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<IAsset> getAssetList() {
		List<IAsset> toReturn = this.getSessionFactory().getCurrentSession()
				.createQuery("from Asset").list();
		for (IAsset i : toReturn) {

			Hibernate.initialize(i.getAssetTypeID().getResources());

		}
		return toReturn;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.dao.hibernate.AssetDAO#getAssetList(int)
	 */
	@Override
	public IAsset getAssetList(int assetNo) {
		IAsset toIns = (IAsset) this.getSessionFactory().getCurrentSession()
				.createQuery("From Asset where assetNumber = :no")
				.setInteger("no", assetNo).uniqueResult();
		if (toIns != null) {
			Hibernate.initialize(toIns.getAssetTypeID().getResources());
		}
		return toIns;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.spring.aam.dao.hibernate.AssetDAO#getAssetList(int, int)
	 */
	@Override
	public List<IAsset> getAssetList(Integer assetNoStart, Integer assetNoEnd) {
		return this
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"From Asset where assetNumber BETWEEN :start AND :end")
				.setInteger("start", assetNoStart)
				.setInteger("end", assetNoEnd).list();

	}

	@Override
	public void addAsset(Asset toSave) {
		this.getSessionFactory().getCurrentSession().save(toSave);

	}

	@Override
	public void updateAsset(int oldAssetNo, int newAssetNo) {
		IAsset toSave = this.getAssetList(oldAssetNo);
		toSave.setAssetNumber(newAssetNo);
		this.getSessionFactory().getCurrentSession().save(toSave);

	}

	@Override
	public void deleteAsset(int startNo) {
		this.getSessionFactory().getCurrentSession()
				.delete(this.getAssetList(startNo));

	}

	@Override
	public void deleteAsset(int startNo, int endNo) {
		// TODO Auto-generated method stub

	}
}
