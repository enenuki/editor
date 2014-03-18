package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ParticipantInUseCase_c.java
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
abstract class EV_PARTICIPANT_IN_USE_CASE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class ParticipantInUseCase_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public ParticipantInUseCase_c(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_part_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_part_id = IdAssigner.preprocessUUID(p_m_part_id);

		Object[] key = {m_package_id, m_part_id};
		addInstanceToMap(key);
	}
	static public ParticipantInUseCase_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_part_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);
		ParticipantInUseCase_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_package_id, p_m_part_id};
			new_inst = (ParticipantInUseCase_c) instances.get(key);
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
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_package_id = IdAssigner
						.preprocessUUID(p_m_package_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_part_id = IdAssigner.preprocessUUID(p_m_part_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new ParticipantInUseCase_c(modelRoot, p_m_package_id,
					p_m_part_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public ParticipantInUseCase_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_part_id) {
		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);
		ParticipantInUseCase_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_package_id, p_m_part_id};
			source = (ParticipantInUseCase_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_part_id = IdAssigner.preprocessUUID(p_m_part_id);

				return source;
			}
		}
		// there is no instance matching the id
		ParticipantInUseCase_c new_inst = new ParticipantInUseCase_c(modelRoot,
				p_m_package_id, p_m_part_id);
		return new_inst;
	}
	public ParticipantInUseCase_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_package_id = IdAssigner.NULL_UUID;
		m_part_id = IdAssigner.NULL_UUID;
		Object[] key = {m_package_id, m_part_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_package_id, m_part_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_package_id != p_newKey) {

			m_package_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof ParticipantInUseCase_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof ParticipantInUseCase_c)) {
			return false;
		}

		ParticipantInUseCase_c me = (ParticipantInUseCase_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getPackage_id()) || IdAssigner.NULL_UUID
				.equals(((ParticipantInUseCase_c) elem).getPackage_id()))
				&& this != elem) {
			return false;
		}
		if (!getPackage_id().equals(
				((ParticipantInUseCase_c) elem).getPackage_id()))
			return false;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getPart_id()) || IdAssigner.NULL_UUID
				.equals(((ParticipantInUseCase_c) elem).getPart_id()))
				&& this != elem) {
			return false;
		}
		if (!getPart_id().equals(((ParticipantInUseCase_c) elem).getPart_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof ParticipantInUseCase_c)) {
			return false;
		}

		ParticipantInUseCase_c me = (ParticipantInUseCase_c) elem;
		if (!getPackage_idCachedValue().equals(
				((ParticipantInUseCase_c) elem).getPackage_idCachedValue()))
			return false;
		if (!getPart_idCachedValue().equals(
				((ParticipantInUseCase_c) elem).getPart_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_package_id;
	private java.util.UUID m_part_id;

	// declare association references from this class

	// referring navigation

	InteractionParticipant_c CanDisplayInteractionParticipant;
	public void relateAcrossR1203To(InteractionParticipant_c target) {
		relateAcrossR1203To(target, true);
	}
	public void relateAcrossR1203To(InteractionParticipant_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == CanDisplayInteractionParticipant)
			return; // already related

		if (CanDisplayInteractionParticipant != target) {

			Object oldKey = getInstanceKey();

			if (CanDisplayInteractionParticipant != null) {

				CanDisplayInteractionParticipant.clearBackPointerR1203To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"ParticipantInUseCase_c.relateAcrossR1203To(InteractionParticipant_c target)",
									"Relate performed across R1203 from Participant in Use Case to Interaction Participant without unrelate of prior instance.");
				}
			}

			CanDisplayInteractionParticipant = target;
			if (IdAssigner.NULL_UUID.equals(target.getPart_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_part_id = target.getPart_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR1203To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "1203", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR1203From(InteractionParticipant_c target) {
		unrelateAcrossR1203From(target, true);
	}
	public void unrelateAcrossR1203From(InteractionParticipant_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (CanDisplayInteractionParticipant == null)
			return; // already unrelated

		if (target != CanDisplayInteractionParticipant) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R1203",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR1203To(this);
		}

		if (CanDisplayInteractionParticipant != null) {

			m_part_id = CanDisplayInteractionParticipant.getPart_id();
			if (IdAssigner.NULL_UUID.equals(m_part_id)) {
				m_part_id = CanDisplayInteractionParticipant
						.getPart_idCachedValue();
			}
			CanDisplayInteractionParticipant = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "1203", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	// referring navigation

	UseCaseDiagram_c IsDisplayedInUseCaseDiagram;
	public void relateAcrossR1203To(UseCaseDiagram_c target) {
		relateAcrossR1203To(target, true);
	}
	public void relateAcrossR1203To(UseCaseDiagram_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsDisplayedInUseCaseDiagram)
			return; // already related

		if (IsDisplayedInUseCaseDiagram != target) {

			Object oldKey = getInstanceKey();

			if (IsDisplayedInUseCaseDiagram != null) {

				IsDisplayedInUseCaseDiagram.clearBackPointerR1203To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"ParticipantInUseCase_c.relateAcrossR1203To(UseCaseDiagram_c target)",
									"Relate performed across R1203 from Participant in Use Case to Use Case Diagram without unrelate of prior instance.");
				}
			}

			IsDisplayedInUseCaseDiagram = target;
			if (IdAssigner.NULL_UUID.equals(target.getPackage_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_package_id = target.getPackage_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR1203To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "1203", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR1203From(UseCaseDiagram_c target) {
		unrelateAcrossR1203From(target, true);
	}
	public void unrelateAcrossR1203From(UseCaseDiagram_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsDisplayedInUseCaseDiagram == null)
			return; // already unrelated

		if (target != IsDisplayedInUseCaseDiagram) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R1203",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR1203To(this);
		}

		if (IsDisplayedInUseCaseDiagram != null) {

			m_package_id = IsDisplayedInUseCaseDiagram.getPackage_id();
			if (IdAssigner.NULL_UUID.equals(m_package_id)) {
				m_package_id = IsDisplayedInUseCaseDiagram
						.getPackage_idCachedValue();
			}
			IsDisplayedInUseCaseDiagram = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "1203", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			InteractionParticipant_c[] targets) {
		return getOneUC_PIUCOnR1203(targets, null);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			InteractionParticipant_c[] targets, ClassQueryInterface_c test) {
		ParticipantInUseCase_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneUC_PIUCOnR1203(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			InteractionParticipant_c target) {
		return getOneUC_PIUCOnR1203(target, null);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			InteractionParticipant_c target, boolean loadComponent) {
		return getOneUC_PIUCOnR1203(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			InteractionParticipant_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneUC_PIUCOnR1203(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, InteractionParticipant_c target,
			ClassQueryInterface_c test) {
		return getOneUC_PIUCOnR1203(modelRoot, target, test, true);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, InteractionParticipant_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneUC_PIUCOnR1203(modelRoot, target, test);
	}
	private static ParticipantInUseCase_c find_getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, InteractionParticipant_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203) {
				for (int i = 0; i < target.backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203
						.size(); ++i) {
					ParticipantInUseCase_c source = (ParticipantInUseCase_c) target.backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c[] targets) {
		return getManyUC_PIUCsOnR1203(targets, null);
	}
	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c[] targets, boolean loadComponent) {
		return getManyUC_PIUCsOnR1203(targets, null, loadComponent);
	}
	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c[] targets, ClassQueryInterface_c test) {
		return getManyUC_PIUCsOnR1203(targets, test, true);
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ParticipantInUseCase_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203) {
				for (int j = 0; j < targets[i].backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203
						.size(); ++j) {
					ParticipantInUseCase_c source = (ParticipantInUseCase_c) targets[i].backPointer_IsDisplayedInParticipantInUseCaseIsDisplayedIn_R1203
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			ParticipantInUseCase_c[] ret_set = new ParticipantInUseCase_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ParticipantInUseCase_c[0];
		}
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c target) {
		if (target != null) {
			InteractionParticipant_c[] targetArray = new InteractionParticipant_c[1];
			targetArray[0] = target;
			return getManyUC_PIUCsOnR1203(targetArray);
		} else {
			ParticipantInUseCase_c[] result = new ParticipantInUseCase_c[0];
			return result;
		}
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			InteractionParticipant_c target, boolean loadComponent) {
		if (target != null) {
			InteractionParticipant_c[] targetArray = new InteractionParticipant_c[1];
			targetArray[0] = target;
			return getManyUC_PIUCsOnR1203(targetArray, loadComponent);
		} else {
			ParticipantInUseCase_c[] result = new ParticipantInUseCase_c[0];
			return result;
		}
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			UseCaseDiagram_c[] targets) {
		return getOneUC_PIUCOnR1203(targets, null);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			UseCaseDiagram_c[] targets, ClassQueryInterface_c test) {
		ParticipantInUseCase_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneUC_PIUCOnR1203(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			UseCaseDiagram_c target) {
		return getOneUC_PIUCOnR1203(target, null);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			UseCaseDiagram_c target, boolean loadComponent) {
		return getOneUC_PIUCOnR1203(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			UseCaseDiagram_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneUC_PIUCOnR1203(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, UseCaseDiagram_c target,
			ClassQueryInterface_c test) {
		return getOneUC_PIUCOnR1203(modelRoot, target, test, true);
	}

	public static ParticipantInUseCase_c getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, UseCaseDiagram_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneUC_PIUCOnR1203(modelRoot, target, test);
	}
	private static ParticipantInUseCase_c find_getOneUC_PIUCOnR1203(
			ModelRoot modelRoot, UseCaseDiagram_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203) {
				for (int i = 0; i < target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
						.size(); ++i) {
					ParticipantInUseCase_c source = (ParticipantInUseCase_c) target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c[] targets) {
		return getManyUC_PIUCsOnR1203(targets, null);
	}
	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c[] targets, boolean loadComponent) {
		return getManyUC_PIUCsOnR1203(targets, null, loadComponent);
	}
	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c[] targets, ClassQueryInterface_c test) {
		return getManyUC_PIUCsOnR1203(targets, test, true);
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ParticipantInUseCase_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203) {
				for (int j = 0; j < targets[i].backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
						.size(); ++j) {
					ParticipantInUseCase_c source = (ParticipantInUseCase_c) targets[i].backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			ParticipantInUseCase_c[] ret_set = new ParticipantInUseCase_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ParticipantInUseCase_c[0];
		}
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c target) {
		return getManyUC_PIUCsOnR1203(target, null);
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c target, boolean loadComponent) {
		return getManyUC_PIUCsOnR1203(target, null, loadComponent);
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c target, ClassQueryInterface_c test) {
		return getManyUC_PIUCsOnR1203(target, test, true);
	}

	public static ParticipantInUseCase_c[] getManyUC_PIUCsOnR1203(
			UseCaseDiagram_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new ParticipantInUseCase_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203) {
			for (int i = 0; i < target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
					.size(); ++i) {
				ParticipantInUseCase_c source = (ParticipantInUseCase_c) target.backPointer_CanDisplayParticipantInUseCaseCanDisplay_R1203
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			ParticipantInUseCase_c[] ret_set = new ParticipantInUseCase_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ParticipantInUseCase_c[0];
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

		// R1203
		UseCaseDiagram_c relInst37901 = (UseCaseDiagram_c) baseRoot
				.getInstanceList(UseCaseDiagram_c.class).get(
						new Object[]{m_package_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37901 == null) {
			relInst37901 = (UseCaseDiagram_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(UseCaseDiagram_c.class)
					.get(new Object[]{m_package_id});
		}
		if (relInst37901 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37901 = (UseCaseDiagram_c) roots[i].getInstanceList(
						UseCaseDiagram_c.class).get(new Object[]{m_package_id});
				if (relInst37901 != null)
					break;
			}
		}
		//synchronized
		if (relInst37901 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37901) && !isProxy())) {
				relInst37901.relateAcrossR1203To(this, notifyChanges);
			}
		}

		InteractionParticipant_c relInst37902 = (InteractionParticipant_c) baseRoot
				.getInstanceList(InteractionParticipant_c.class).get(
						new Object[]{m_part_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37902 == null) {
			relInst37902 = (InteractionParticipant_c) Ooaofooa
					.getDefaultInstance()
					.getInstanceList(InteractionParticipant_c.class)
					.get(new Object[]{m_part_id});
		}
		if (relInst37902 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37902 = (InteractionParticipant_c) roots[i]
						.getInstanceList(InteractionParticipant_c.class).get(
								new Object[]{m_part_id});
				if (relInst37902 != null)
					break;
			}
		}
		//synchronized
		if (relInst37902 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37902) && !isProxy())) {
				relInst37902.relateAcrossR1203To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R1203
		// UC_UCC
		inst = IsDisplayedInUseCaseDiagram;
		unrelateAcrossR1203From(IsDisplayedInUseCaseDiagram, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// SQ_P
		inst = CanDisplayInteractionParticipant;
		unrelateAcrossR1203From(CanDisplayInteractionParticipant, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(ParticipantInUseCase_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final ParticipantInUseCase_c inst = (ParticipantInUseCase_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static ParticipantInUseCase_c ParticipantInUseCaseInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		ParticipantInUseCase_c result = findParticipantInUseCaseInstance(
				modelRoot, test, loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					ParticipantInUseCase_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findParticipantInUseCaseInstance(modelRoot,
								test, loadComponent);
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
	private static ParticipantInUseCase_c findParticipantInUseCaseInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ParticipantInUseCase_c x = (ParticipantInUseCase_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static ParticipantInUseCase_c ParticipantInUseCaseInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ParticipantInUseCaseInstance(modelRoot, test, true);
	}

	public static ParticipantInUseCase_c ParticipantInUseCaseInstance(
			ModelRoot modelRoot) {
		return ParticipantInUseCaseInstance(modelRoot, null, true);
	}

	public static ParticipantInUseCase_c[] ParticipantInUseCaseInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					ParticipantInUseCase_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(ParticipantInUseCase_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ParticipantInUseCase_c x = (ParticipantInUseCase_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				ParticipantInUseCase_c[] ret_set = new ParticipantInUseCase_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ParticipantInUseCase_c[0];
			}
		}
	}
	public static ParticipantInUseCase_c[] ParticipantInUseCaseInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ParticipantInUseCaseInstances(modelRoot, test, true);
	}
	public static ParticipantInUseCase_c[] ParticipantInUseCaseInstances(
			ModelRoot modelRoot) {
		return ParticipantInUseCaseInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Participant in Use Case.dispose call: ";
		UseCaseDiagram_c testR1203Inst = UseCaseDiagram_c.getOneUC_UCCOnR1203(
				this, false);

		if (testR1203Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "1203 ";
		}

		InteractionParticipant_c testR1203InstOth = InteractionParticipant_c
				.getOneSQ_POnR1203(this, false);

		if (testR1203InstOth != null) {
			delete_error = true;
			errorMsg = errorMsg + "1203 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Participant in Use Case",
						errorMsg);
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
		if (attributeName.equals("package_id")) {
			return true;
		}
		if (attributeName.equals("part_id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getPackage_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getPackage_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		tempID = getPart_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getPart_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public long getPackage_idLongBased() {
		if (IsDisplayedInUseCaseDiagram != null) {
			return IsDisplayedInUseCaseDiagram.getPackage_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getPackage_id() {
		if (IsDisplayedInUseCaseDiagram != null) {
			return IsDisplayedInUseCaseDiagram.getPackage_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getPackage_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_package_id))
			return m_package_id;
		else
			return getPackage_id();
	}

	public void setPackage_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_package_id)) {
				return;
			}
		} else if (m_package_id != null) {
			if (m_package_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Package_id", m_package_id, newValue, true);
		m_package_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getPart_idLongBased() {
		if (CanDisplayInteractionParticipant != null) {
			return CanDisplayInteractionParticipant.getPart_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getPart_id() {
		if (CanDisplayInteractionParticipant != null) {
			return CanDisplayInteractionParticipant.getPart_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getPart_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_part_id))
			return m_part_id;
		else
			return getPart_id();
	}

	public void setPart_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_part_id)) {
				return;
			}
		} else if (m_part_id != null) {
			if (m_part_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Part_id", m_part_id, newValue, true);
		m_part_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Participant in Use Case", //$NON-NLS-1$
						" Operation entered: Participant in Use Case::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		ParticipantInUseCase_c[] objs = ParticipantInUseCase_c
				.ParticipantInUseCaseInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Participant in Use Case", //$NON-NLS-1$
						" Operation entered: Participant in Use Case::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class ParticipantInUseCase_c_test37904_c
				implements
					ClassQueryInterface_c {
			ParticipantInUseCase_c_test37904_c(java.util.UUID p37905,
					java.util.UUID p37906) {
				m_p37905 = p37905;
				m_p37906 = p37906;
			}
			private java.util.UUID m_p37905;
			private java.util.UUID m_p37906;
			public boolean evaluate(Object candidate) {
				ParticipantInUseCase_c selected = (ParticipantInUseCase_c) candidate;
				boolean retval = false;
				retval = (selected.getPackage_id().equals(m_p37905))
						& (selected.getPart_id().equals(m_p37906));
				return retval;
			}
		}

		ParticipantInUseCase_c[] objs37903 = ParticipantInUseCase_c
				.ParticipantInUseCaseInstances(modelRoot,
						new ParticipantInUseCase_c_test37904_c(getPackage_id(),
								getPart_id()));

		if (((objs37903.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Participant in Use Case", //$NON-NLS-1$
								"Consistency: Object: Participant in Use Case: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37903.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Participant in Use Case: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37903.length), e);
			}
			retval = false;

		}

		if (((objs37903.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Participant in Use Case", //$NON-NLS-1$
								"Consistency: Object: Participant in Use Case: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37903.length)
										+ " Package_ID: " + "Not Printable" + " Part_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Participant in Use Case: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37903.length)
										+ " Package_ID: " + "Not Printable" + " Part_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Participant in Use Case is a link class in association: rel.Numb = 1203
		// The one side class in the association is: Use Case Diagram
		class UseCaseDiagram_c_test37910_c implements ClassQueryInterface_c {
			UseCaseDiagram_c_test37910_c(java.util.UUID p37911) {
				m_p37911 = p37911;
			}
			private java.util.UUID m_p37911;
			public boolean evaluate(Object candidate) {
				UseCaseDiagram_c selected = (UseCaseDiagram_c) candidate;
				boolean retval = false;
				retval = (selected.getPackage_id().equals(m_p37911));
				return retval;
			}
		}

		UseCaseDiagram_c[] objs37909 = UseCaseDiagram_c
				.UseCaseDiagramInstances(modelRoot,
						new UseCaseDiagram_c_test37910_c(getPackage_id()));

		if (((objs37909.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Participant in Use Case", //$NON-NLS-1$
								"Consistency: Object: Participant in Use Case: Association: 1203: Cardinality of one side of link is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37909.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Participant in Use Case: Association: 1203: Cardinality of one side of link is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37909.length), e);
			}
			retval = false;

		}

		// Other side
		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Participant in Use Case