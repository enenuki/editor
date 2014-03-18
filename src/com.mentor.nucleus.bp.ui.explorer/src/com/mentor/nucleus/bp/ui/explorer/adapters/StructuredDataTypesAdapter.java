package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/StructuredDataTypesAdapter.java
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
// class StructuredDataType_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
import com.mentor.nucleus.bp.core.sorter.StructureMember_cSorter;
/**
 * This file adapts the meta-model entity; 'StructuredDataType_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class StructuredDataTypesAdapter implements ITreeContentProvider {
	static StructuredDataTypesAdapter structureddatatypesadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static StructuredDataTypesAdapter getInstance() {
		if (structureddatatypesadapter == null) {
			structureddatatypesadapter = new StructuredDataTypesAdapter();
		}
		return structureddatatypesadapter;
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
		DataTypePackage_c result193 = DataTypePackage_c
				.getOneS_DPKOnR39(DataType_c
						.getOneS_DTOnR17((StructuredDataType_c) arg));
		if (result193 != null) {
			return result193;
		}
		Package_c result194 = Package_c
				.getOneEP_PKGOnR8000(PackageableElement_c
						.getOnePE_PEOnR8001(DataType_c
								.getOneS_DTOnR17((StructuredDataType_c) arg)));
		if (result194 != null) {
			return result194;
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
		StructureMember_c[] members_44_1 = StructureMember_c
				.getManyS_MBRsOnR44((StructuredDataType_c) arg);

		resultSize += members_44_1.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		StructureMember_cSorter sorterS_MBR = new StructureMember_cSorter();
		sorterS_MBR.sort(members_44_1);
		for (int i = 0; i < members_44_1.length; i++) {
			result[count] = members_44_1[i];
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		StructureMember_c[] members_44_1 = StructureMember_c
				.getManyS_MBRsOnR44((StructuredDataType_c) arg);

		if (members_44_1.length > 0)
			return true;
		return false;
	}
}