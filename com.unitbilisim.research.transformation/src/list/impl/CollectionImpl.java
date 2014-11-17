/**
 */
package list.impl;

import list.Collection;
import list.Feature;
import list.List;
import list.ListPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link list.impl.CollectionImpl#getOwnedLists <em>Owned Lists</em>}</li>
 *   <li>{@link list.impl.CollectionImpl#getOwnedFeatures <em>Owned Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection {
	/**
	 * The cached value of the '{@link #getOwnedLists() <em>Owned Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLists()
	 * @generated
	 * @ordered
	 */
	protected EList<List> ownedLists;

	/**
	 * The cached value of the '{@link #getOwnedFeatures() <em>Owned Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ListPackage.Literals.COLLECTÝON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getOwnedLists() {
		if (ownedLists == null) {
			ownedLists = new EObjectContainmentEList<List>(List.class, this, ListPackage.COLLECTÝON__OWNED_LÝSTS);
		}
		return ownedLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOwnedFeatures() {
		if (ownedFeatures == null) {
			ownedFeatures = new EObjectContainmentEList<Feature>(Feature.class, this, ListPackage.COLLECTÝON__OWNED_FEATURES);
		}
		return ownedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ListPackage.COLLECTÝON__OWNED_LÝSTS:
				return ((InternalEList<?>)getOwnedLists()).basicRemove(otherEnd, msgs);
			case ListPackage.COLLECTÝON__OWNED_FEATURES:
				return ((InternalEList<?>)getOwnedFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ListPackage.COLLECTÝON__OWNED_LÝSTS:
				return getOwnedLists();
			case ListPackage.COLLECTÝON__OWNED_FEATURES:
				return getOwnedFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ListPackage.COLLECTÝON__OWNED_LÝSTS:
				getOwnedLists().clear();
				getOwnedLists().addAll((java.util.Collection<? extends List>)newValue);
				return;
			case ListPackage.COLLECTÝON__OWNED_FEATURES:
				getOwnedFeatures().clear();
				getOwnedFeatures().addAll((java.util.Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ListPackage.COLLECTÝON__OWNED_LÝSTS:
				getOwnedLists().clear();
				return;
			case ListPackage.COLLECTÝON__OWNED_FEATURES:
				getOwnedFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ListPackage.COLLECTÝON__OWNED_LÝSTS:
				return ownedLists != null && !ownedLists.isEmpty();
			case ListPackage.COLLECTÝON__OWNED_FEATURES:
				return ownedFeatures != null && !ownedFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionImpl
