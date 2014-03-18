//========================================================================
//
// File: src/com/mentor/nucleus/bp/core/ui/cells/PropertyParameterCellProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/generate_cell_modifiers.arc
// Version:      $Revision: 1.2 $
//
// Copyright 2005-2014 Mentor Graphics Corporation.  All rights reserved.
//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
//
//  Optional Comments about the generated java file
//

package com.mentor.nucleus.bp.core.ui.cells.providers;

import java.util.Vector;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.Composite;

  import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.inspector.ObjectElement;
import com.mentor.nucleus.bp.core.ui.cells.ICellProvider;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.*;

public class PropertyParameterCellProvider implements ICellProvider {
    private String[] By_Ref_vals = { "By Value",
        "By Reference" };
    
	@Override
	public CellEditor getCellEditor(final NonRootModelElement element,
			Composite parent, ObjectElement data) {
                if(data.getName().equals("Name")) {
	                CellEditor editor = new TextCellEditor(parent);
					editor.setValidator(new ModelElementNameValidator(element));
	                return editor;
	            }
                if(data.getName().equals("Descrip")) {
	                CellEditor editor = new TextCellEditor(parent);
	                return editor;
	            }
                if(data.getName().equals("By_Ref")) {
                	CellEditor editor = new EnumCellEditor(parent, By_Ref_vals);
                	return editor;
                }
			  if(data.getName().equals("Dimensions")) {
			  	CellEditor editor = new TextCellEditor(parent);
			  	editor.setValidator(new DimensionsValidator(element));
			  	return editor;
			  }

		return null;
	}

	@Override
	public boolean supportsEdit(NonRootModelElement element,
			ObjectElement data, Composite parent) {
		CellEditor editor = getCellEditor(element, parent, data);
		if(editor != null) {
			editor.dispose();
			return true;
		}
		return false;
	}
	
	@Override
	public String getValue(NonRootModelElement element, ObjectElement data) {
		if(data.getName().equals("By_Ref")) {
	        Integer By_Ref_value = (Integer) data.getValue();
			if(By_Ref_value >= 0 && By_Ref_value < By_Ref_vals.length) {
				return By_Ref_vals[By_Ref_value];
			}
		}
		return null;
	}
	
	@Override
	public void setValue(NonRootModelElement element, ObjectElement data, Object value) {
        if(data.getName().equals("Name"))
        {
            if ( ! value.toString().equals(((PropertyParameter_c) element).getName()) )
            {
                ((PropertyParameter_c) element).setName(value.toString());
            }
        }
        if(data.getName().equals("Descrip"))
        {
            if ( ! value.toString().equals(((PropertyParameter_c) element).getDescrip()) )
            {
                ((PropertyParameter_c) element).setDescrip(value.toString());
            }
        }
        if(data.getName().equals("By_Ref"))
        {
            int new_val = Integer.parseInt(value.toString());
            if ( new_val != ((PropertyParameter_c) element).getBy_ref() )
            {
                ((PropertyParameter_c) element).setBy_ref(new_val);
            }
        }
        if(data.getName().equals("Dimensions"))
        {
            if ( ! value.toString().equals(((PropertyParameter_c) element).getDimensions()) )
            {
                Vector dims = DimensionsUtil.getDimensionsData(value.toString(),(PropertyParameter_c) element);
                if (dims.size() > 0) {
                    for (int i = 0; i < dims.size(); i++) {
                        int numElements = ((Integer)dims.get(i)).intValue();
                        ((PropertyParameter_c) element).Resizedimensions(i, numElements, dims.size());
                    }
                } else {
                    ((PropertyParameter_c) element).Resizedimensions(0, 0, 0);
                }
                ((PropertyParameter_c) element).setDimensions(value.toString());
            }
        }

	}
	
}