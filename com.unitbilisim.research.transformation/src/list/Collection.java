/**
 */
package list;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link list.Collection#getOwnedLists <em>Owned Lists</em>}</li>
 *   <li>{@link list.Collection#getOwnedFeatures <em>Owned Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see list.ListPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Lists</b></em>' containment reference list.
	 * The list contents are of type {@link list.List}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Lists</em>' containment reference list.
	 * @see list.ListPackage#getCollection_OwnedLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<List> getOwnedLists();

	/**
	 * Returns the value of the '<em><b>Owned Features</b></em>' containment reference list.
	 * The list contents are of type {@link list.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Features</em>' containment reference list.
	 * @see list.ListPackage#getCollection_OwnedFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getOwnedFeatures();

} // Collection
