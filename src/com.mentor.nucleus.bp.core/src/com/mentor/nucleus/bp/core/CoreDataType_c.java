package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.CoreDataType_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_CORE_DATA_TYPE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class CoreDataType_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public CoreDataType_c(ModelRoot modelRoot, java.util.UUID p_m_dt_id,
			int p_m_core_typ) {
		super(modelRoot);
		m_core_typ = p_m_core_typ;
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

		Object[] key = {m_dt_id};
		addInstanceToMap(key);
	}
	static public CoreDataType_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_dt_id, int p_m_core_typ, String p_contentPath,
			IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);
		CoreDataType_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_dt_id};
			new_inst = (CoreDataType_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				new_inst.m_core_typ = p_m_core_typ;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new CoreDataType_c(modelRoot, p_m_dt_id, p_m_core_typ);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public CoreDataType_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_dt_id, int p_m_core_typ) {
		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);
		CoreDataType_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_dt_id};
			source = (CoreDataType_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				source.m_core_typ = p_m_core_typ;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

				return source;
			}
		}
		// there is no instance matching the id
		CoreDataType_c new_inst = new CoreDataType_c(modelRoot, p_m_dt_id,
				p_m_core_typ);
		return new_inst;
	}
	public CoreDataType_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_dt_id = IdAssigner.NULL_UUID;
		Object[] key = {m_dt_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_dt_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_dt_id != p_newKey) {

			m_dt_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof CoreDataType_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof CoreDataType_c)) {
			return false;
		}

		CoreDataType_c me = (CoreDataType_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getDt_id()) || IdAssigner.NULL_UUID
				.equals(((CoreDataType_c) elem).getDt_id())) && this != elem) {
			return false;
		}
		if (!getDt_id().equals(((CoreDataType_c) elem).getDt_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof CoreDataType_c)) {
			return false;
		}

		CoreDataType_c me = (CoreDataType_c) elem;
		if (!getDt_idCachedValue().equals(
				((CoreDataType_c) elem).getDt_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private int m_core_typ;
	private java.util.UUID m_dt_id;

	// declare association references from this class

	// referring navigation

	DataType_c IsSupertypeDataType;
	public void relateAcrossR17To(DataType_c target) {
		relateAcrossR17To(target, true);
	}
	public void relateAcrossR17To(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeDataType)
			return; // already related

		if (IsSupertypeDataType != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeDataType != null) {

				IsSupertypeDataType.clearBackPointerR17To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"CoreDataType_c.relateAcrossR17To(DataType_c target)",
									"Relate performed across R17 from Core Data Type to Data Type without unrelate of prior instance.");
				}
			}

			IsSupertypeDataType = target;
			if (IdAssigner.NULL_UUID.equals(target.getDt_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_dt_id = target.getDt_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR17To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "17", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR17From(DataType_c target) {
		unrelateAcrossR17From(target, true);
	}
	public void unrelateAcrossR17From(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeDataType == null)
			return; // already unrelated

		if (target != IsSupertypeDataType) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin
					.logError(
							"Tried to unrelate from non-related instance across R17",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR17To(this);
		}

		if (IsSupertypeDataType != null) {

			m_dt_id = IsSupertypeDataType.getDt_id();
			if (IdAssigner.NULL_UUID.equals(m_dt_id)) {
				m_dt_id = IsSupertypeDataType.getDt_idCachedValue();
			}
			IsSupertypeDataType = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "17", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static CoreDataType_c getOneS_CDTOnR17(DataType_c[] targets) {
		return getOneS_CDTOnR17(targets, null);
	}

	public static CoreDataType_c getOneS_CDTOnR17(DataType_c[] targets,
			ClassQueryInterface_c test) {
		CoreDataType_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneS_CDTOnR17(targets[i], test);
			}
		}

		return ret_val;
	}

	public static CoreDataType_c getOneS_CDTOnR17(DataType_c target) {
		return getOneS_CDTOnR17(target, null);
	}

	public static CoreDataType_c getOneS_CDTOnR17(DataType_c target,
			boolean loadComponent) {
		return getOneS_CDTOnR17(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static CoreDataType_c getOneS_CDTOnR17(DataType_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneS_CDTOnR17(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static CoreDataType_c getOneS_CDTOnR17(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test) {
		return getOneS_CDTOnR17(modelRoot, target, test, true);
	}

	public static CoreDataType_c getOneS_CDTOnR17(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneS_CDTOnR17(modelRoot, target, test);
	}
	private static CoreDataType_c find_getOneS_CDTOnR17(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test) {
		if (target != null) {
			CoreDataType_c source = (CoreDataType_c) target.backPointer_IsSubtypeCoreDataTypeIsSubtype_R17;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c[] targets) {
		return getManyS_CDTsOnR17(targets, null);
	}
	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c[] targets,
			boolean loadComponent) {
		return getManyS_CDTsOnR17(targets, null, loadComponent);
	}
	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c[] targets,
			ClassQueryInterface_c test) {
		return getManyS_CDTsOnR17(targets, test, true);
	}

	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new CoreDataType_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			CoreDataType_c source = (CoreDataType_c) targets[i].backPointer_IsSubtypeCoreDataTypeIsSubtype_R17;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			CoreDataType_c[] ret_set = new CoreDataType_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new CoreDataType_c[0];
		}
	}

	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c target) {
		if (target != null) {
			DataType_c[] targetArray = new DataType_c[1];
			targetArray[0] = target;
			return getManyS_CDTsOnR17(targetArray);
		} else {
			CoreDataType_c[] result = new CoreDataType_c[0];
			return result;
		}
	}

	public static CoreDataType_c[] getManyS_CDTsOnR17(DataType_c target,
			boolean loadComponent) {
		if (target != null) {
			DataType_c[] targetArray = new DataType_c[1];
			targetArray[0] = target;
			return getManyS_CDTsOnR17(targetArray, loadComponent);
		} else {
			CoreDataType_c[] result = new CoreDataType_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R17
		DataType_c relInst55199 = (DataType_c) baseRoot.getInstanceList(
				DataType_c.class).get(new Object[]{m_dt_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst55199 == null) {
			relInst55199 = (DataType_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(DataType_c.class)
					.get(new Object[]{m_dt_id});
		}
		if (relInst55199 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst55199 = (DataType_c) roots[i].getInstanceList(
						DataType_c.class).get(new Object[]{m_dt_id});
				if (relInst55199 != null)
					break;
			}
		}
		//synchronized
		if (relInst55199 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst55199) && !isProxy())) {
				relInst55199.relateAcrossR17To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R17
		// S_DT
		inst = IsSupertypeDataType;
		unrelateAcrossR17From(IsSupertypeDataType, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(CoreDataType_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final CoreDataType_c inst = (CoreDataType_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static CoreDataType_c CoreDataTypeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		CoreDataType_c result = findCoreDataTypeInstance(modelRoot, test,
				loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					CoreDataType_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findCoreDataTypeInstance(modelRoot, test,
								loadComponent);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}
		if (result != null && loadComponent) {
			result.loadProxy();
		}
		return result;
	}
	private static CoreDataType_c findCoreDataTypeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				CoreDataType_c x = (CoreDataType_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static CoreDataType_c CoreDataTypeInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return CoreDataTypeInstance(modelRoot, test, true);
	}

	public static CoreDataType_c CoreDataTypeInstance(ModelRoot modelRoot) {
		return CoreDataTypeInstance(modelRoot, null, true);
	}

	public static CoreDataType_c[] CoreDataTypeInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					CoreDataType_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(CoreDataType_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				CoreDataType_c x = (CoreDataType_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				CoreDataType_c[] ret_set = new CoreDataType_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new CoreDataType_c[0];
			}
		}
	}
	public static CoreDataType_c[] CoreDataTypeInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return CoreDataTypeInstances(modelRoot, test, true);
	}
	public static CoreDataType_c[] CoreDataTypeInstances(ModelRoot modelRoot) {
		return CoreDataTypeInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Core Data Type.dispose call: ";
		DataType_c testR17Inst2 = DataType_c.getOneS_DTOnR17(this, false);

		if (testR17Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "17 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.DELETE, "Core Data Type", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("dt_id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getDt_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getDt_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public int getCore_typ() {
		return m_core_typ;
	}

	public void setCore_typ(int newValue) {
		if (m_core_typ == newValue) {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Core_typ", new Integer(m_core_typ), new Integer(newValue),
				true);

		m_core_typ = newValue;
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getDt_idLongBased() {
		if (IsSupertypeDataType != null) {
			return IsSupertypeDataType.getDt_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getDt_id() {
		if (IsSupertypeDataType != null) {
			return IsSupertypeDataType.getDt_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeDataType != null);

	}

	public java.util.UUID getDt_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_dt_id))
			return m_dt_id;
		else
			return getDt_id();
	}

	public void setDt_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_dt_id)) {
				return;
			}
		} else if (m_dt_id != null) {
			if (m_dt_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Dt_id",
				m_dt_id, newValue, true);
		m_dt_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type", //$NON-NLS-1$
				" Operation entered: Core Data Type::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		CoreDataType_c[] objs = CoreDataType_c.CoreDataTypeInstances(modelRoot,
				null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type", //$NON-NLS-1$
				" Operation entered: Core Data Type::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class CoreDataType_c_test55201_c implements ClassQueryInterface_c {
			CoreDataType_c_test55201_c(java.util.UUID p55202) {
				m_p55202 = p55202;
			}
			private java.util.UUID m_p55202;
			public boolean evaluate(Object candidate) {
				CoreDataType_c selected = (CoreDataType_c) candidate;
				boolean retval = false;
				retval = (selected.getDt_id().equals(m_p55202));
				return retval;
			}
		}

		CoreDataType_c[] objs55200 = CoreDataType_c.CoreDataTypeInstances(
				modelRoot, new CoreDataType_c_test55201_c(getDt_id()));

		if (((objs55200.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Core Data Type", //$NON-NLS-1$
								"Consistency: Object: Core Data Type: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs55200.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Core Data Type: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs55200.length), e);
			}
			retval = false;

		}

		if (((objs55200.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Core Data Type", //$NON-NLS-1$
								"Consistency: Object: Core Data Type: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs55200.length)
										+ " DT_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Core Data Type: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55200.length)
										+ " DT_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Core Data Type is a subtype in association: rel.Numb = 17
		// The supertype class is: Data Type
		class DataType_c_test55206_c implements ClassQueryInterface_c {
			DataType_c_test55206_c(java.util.UUID p55207) {
				m_p55207 = p55207;
			}
			private java.util.UUID m_p55207;
			public boolean evaluate(Object candidate) {
				DataType_c selected = (DataType_c) candidate;
				boolean retval = false;
				retval = (selected.getDt_id().equals(m_p55207));
				return retval;
			}
		}

		DataType_c[] objs55205 = DataType_c.DataTypeInstances(modelRoot,
				new DataType_c_test55206_c(getDt_id()));

		if (((objs55205.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Core Data Type", //$NON-NLS-1$
								"Consistency: Object: Core Data Type: Association: 17: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs55205.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Core Data Type: Association: 17: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55205.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public java.util.UUID Get_ooa_id() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_ooa_id");
		final ModelRoot modelRoot = getModelRoot();
		return getDt_id();

	} // End get_ooa_id
	public String Get_compartment_text(final int p_At, final int p_Comp_num,
			final int p_Ent_num) {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_compartment_text");
		final ModelRoot modelRoot = getModelRoot();
		String v_result = "";

		if ((p_At == Justification_c.Center_in_X)) {

			v_result = "«primitive»";

		}

		else if ((p_At == Justification_c.Center)) {

			DataType_c v_selfDt = DataType_c.getOneS_DTOnR17(this);

			if (((v_selfDt != null))) {

				v_result = v_selfDt.getName();

				PackageableElement_c v_pe = PackageableElement_c
						.getOnePE_PEOnR8001(v_selfDt);

				if ((v_pe != null)) {

					v_result = v_pe.Getvisibilityadornment() + v_result;

				}

			}

			else {

				v_result = Ooaofooa.Getorphanedelementname(modelRoot);

			}

		}

		return v_result;

	} // End get_compartment_text
	public int Get_compartments() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_compartments");
		final ModelRoot modelRoot = getModelRoot();
		return 1;

	} // End get_compartments
	public int Get_entries(final int p_Comp_num) {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_entries");
		final ModelRoot modelRoot = getModelRoot();
		return 1;

	} // End get_entries
	public int Get_text_style(final int p_At, final int p_Comp_num,
			final int p_Ent_num) {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_text_style");
		final ModelRoot modelRoot = getModelRoot();
		return Style_c.None;

	} // End get_text_style
	public int Get_style() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_style");
		final ModelRoot modelRoot = getModelRoot();
		return Style_c.Box;

	} // End get_style
	public String Get_name() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Get_name");
		final ModelRoot modelRoot = getModelRoot();
		DataType_c v_dt = DataType_c.getOneS_DTOnR17(this);

		if (((v_dt == null))) {

			return "";

		}

		else {

			return v_dt.getName();

		}

	} // End get_name
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		DataType_c v_dt = DataType_c.getOneS_DTOnR17(this);

		this.unrelateAcrossR17From(v_dt);

		if (delete()) {
			Ooaofooa.getDefaultInstance().fireModelElementDeleted(
					new BaseModelDelta(Modeleventnotification_c.DELTA_DELETE,
							this));
		}

	} // End dispose
	public Object Converttoinstance() {
		Ooaofooa.log.println(ILogger.OPERATION, "Core Data Type",
				" Operation entered: CoreDataType::Converttoinstance");
		return this;
	} // End convertToInstance

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Core Data Type