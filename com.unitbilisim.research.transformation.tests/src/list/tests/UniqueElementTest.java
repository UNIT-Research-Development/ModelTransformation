/**
 */
package list.tests;

import junit.textui.TestRunner;

import list.ListFactory;
import list.UniqueElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unique Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniqueElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniqueElementTest.class);
	}

	/**
	 * Constructs a new Unique Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unique Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniqueElement getFixture() {
		return (UniqueElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ListFactory.eINSTANCE.createUniqueElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UniqueElementTest
