package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/ProvidedInterfaceSignalsAdapter.java
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
// class ProvidedSignal_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
import com.mentor.nucleus.bp.core.sorter.PropertyParameter_cSorter;
/**
 * This file adapts the meta-model entity; 'ProvidedSignal_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class ProvidedInterfaceSignalsAdapter implements ITreeContentProvider {
	static ProvidedInterfaceSignalsAdapter providedinterfacesignalsadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static ProvidedInterfaceSignalsAdapter getInstance() {
		if (providedinterfacesignalsadapter == null) {
			providedinterfacesignalsadapter = new ProvidedInterfaceSignalsAdapter();
		}
		return providedinterfacesignalsadapter;
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
		Provision_c result186 = Provision_c
				.getOneC_POnR4501(ProvidedExecutableProperty_c
						.getOneSPR_PEPOnR4503((ProvidedSignal_c) arg));
		if (result186 != null) {
			return result186;
		}
		ImportedProvision_c result187 = ImportedProvision_c
				.getOneCL_IPOnR4703(ImportedReference_c.getOneCL_IIROnR4701(InterfaceReference_c.getOneC_IROnR4009(Provision_c
						.getOneC_POnR4501(ProvidedExecutableProperty_c
								.getOneSPR_PEPOnR4503((ProvidedSignal_c) arg)))));
		if (result187 != null) {
			return result187;
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
		PropertyParameter_c[] parameters_4503_1 = PropertyParameter_c
				.getManyC_PPsOnR4006(ExecutableProperty_c.getManyC_EPsOnR4501(ProvidedExecutableProperty_c
						.getManySPR_PEPsOnR4503((ProvidedSignal_c) arg)));

		resultSize += parameters_4503_1.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		PropertyParameter_cSorter sorterC_PP = new PropertyParameter_cSorter();
		sorterC_PP.sort(parameters_4503_1);
		for (int i = 0; i < parameters_4503_1.length; i++) {
			result[count] = new MultipleOccurrenceElement(parameters_4503_1[i]);
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		PropertyParameter_c[] parameters_4503_1 = PropertyParameter_c
				.getManyC_PPsOnR4006(ExecutableProperty_c.getManyC_EPsOnR4501(ProvidedExecutableProperty_c
						.getManySPR_PEPsOnR4503((ProvidedSignal_c) arg)));

		if (parameters_4503_1.length > 0)
			return true;
		return false;
	}
}