package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/ExternalEntitiesAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class ExternalEntity_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'ExternalEntity_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class ExternalEntitiesAdapter implements ITreeContentProvider {
	static ExternalEntitiesAdapter externalentitiesadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static ExternalEntitiesAdapter getInstance() {
		if (externalentitiesadapter == null) {
			externalentitiesadapter = new ExternalEntitiesAdapter();
		}
		return externalentitiesadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		ExternalEntityPackage_c result37 = ExternalEntityPackage_c
				.getOneS_EEPKOnR33((ExternalEntity_c) arg);
		if (result37 != null) {
			return result37;
		}
		Package_c result38 = Package_c.getOneEP_PKGOnR8000(PackageableElement_c
				.getOnePE_PEOnR8001((ExternalEntity_c) arg));
		if (result38 != null) {
			return result38;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;
		Bridge_c[] bridgeoperations_19_1 = Bridge_c
				.getManyS_BRGsOnR19((ExternalEntity_c) arg);

		ModelContentProvider.sort(bridgeoperations_19_1);
		resultSize += bridgeoperations_19_1.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		for (int i = 0; i < bridgeoperations_19_1.length; i++) {
			result[count] = bridgeoperations_19_1[i];
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		Bridge_c[] bridgeoperations_19_1 = Bridge_c
				.getManyS_BRGsOnR19((ExternalEntity_c) arg);

		if (bridgeoperations_19_1.length > 0)
			return true;
		return false;
	}
}