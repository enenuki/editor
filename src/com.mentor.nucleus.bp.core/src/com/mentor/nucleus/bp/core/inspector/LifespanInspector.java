package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/LifespanInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class Lifespan_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'Lifespan_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class LifespanInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public LifespanInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    ClassInstanceParticipant_c result1 = ClassInstanceParticipant_c.getOneSQ_CIPOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result1 != null) {
        return result1;
    }               
    ExternalEntityParticipant_c result2 = ExternalEntityParticipant_c.getOneSQ_EEPOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result2 != null) {
        return result2;
    }               
    FunctionPackageParticipant_c result3 = FunctionPackageParticipant_c.getOneSQ_FPPOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result3 != null) {
        return result3;
    }               
    ClassParticipant_c result4 = ClassParticipant_c.getOneSQ_CPOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result4 != null) {
        return result4;
    }               
    ComponentParticipant_c result5 = ComponentParticipant_c.getOneSQ_COPOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result5 != null) {
        return result5;
    }               
    ActorParticipant_c result6 = ActorParticipant_c.getOneSQ_APOnR930(InteractionParticipant_c.getOneSQ_POnR940((Lifespan_c)arg));
     if (result6 != null) {
        return result6;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    TimingMark_c [] v_timingmarks = 
TimingMark_c.getManySQ_TMsOnR931(
(Lifespan_c)arg)
;



    sort(v_timingmarks);
    SynchronousMessage_c [] v_synchronousmessages = 
SynchronousMessage_c.getManyMSG_SMsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    sort(v_synchronousmessages);
    AsynchronousMessage_c [] v_asynchronousmessages = 
AsynchronousMessage_c.getManyMSG_AMsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    sort(v_asynchronousmessages);
    ReturnMessage_c [] v_returnmessages = 
ReturnMessage_c.getManyMSG_RsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    sort(v_returnmessages);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_timingmarks.length ; i++) {   
        result.add(new ObjectElement("v_timingmarks", ObjectElement.RELATION_ROLE_ELEMENT, v_timingmarks[i], arg, false));
    }
    for (int i = 0 ; i < v_synchronousmessages.length ; i++) {   
        result.add(new ObjectElement("v_synchronousmessages", ObjectElement.RELATION_ROLE_ELEMENT, v_synchronousmessages[i], arg, false));
    }
    for (int i = 0 ; i < v_asynchronousmessages.length ; i++) {   
        result.add(new ObjectElement("v_asynchronousmessages", ObjectElement.RELATION_ROLE_ELEMENT, v_asynchronousmessages[i], arg, false));
    }
    for (int i = 0 ; i < v_returnmessages.length ; i++) {   
        result.add(new ObjectElement("v_returnmessages", ObjectElement.RELATION_ROLE_ELEMENT, v_returnmessages[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    TimingMark_c [] v_timingmarks = 
TimingMark_c.getManySQ_TMsOnR931(
(Lifespan_c)arg)
;



    if (v_timingmarks.length > 0) return true;
    SynchronousMessage_c [] v_synchronousmessages = 
SynchronousMessage_c.getManyMSG_SMsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    if (v_synchronousmessages.length > 0) return true;
    AsynchronousMessage_c [] v_asynchronousmessages = 
AsynchronousMessage_c.getManyMSG_AMsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    if (v_asynchronousmessages.length > 0) return true;
    ReturnMessage_c [] v_returnmessages = 
ReturnMessage_c.getManyMSG_RsOnR1018(
Message_c.getManyMSG_MsOnR1007(
InteractionParticipant_c.getManySQ_PsOnR930(
(Lifespan_c)arg)
)
)
;



    if (v_returnmessages.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	return details;
  }
  
  /**
  * @seee IModelClassInspector#getReferentials(Object)
  * Returns the an array of Role Objects specifying the referenctial attibutes of
  * this model element
  * Role Name: <T_TPS.NameOnly>
  * Role Value: <Chain_result>
  * Role Type: "Referential"
  */
  public ObjectElement[] getReferentials(Object arg) {
     List<ObjectElement> referentials = new ArrayList<ObjectElement>();
    return referentials.toArray(new ObjectElement [referentials.size()]);        
  }

  /**
  * @seee IModelClassInspector#getAttributes(Object)
  * Returns the an array of Role objects that give the attibutes of the model 
  * element it self e.g.
  * Role Name: "Name"
  * Role Value: metaModelElement.getName()
  * Role Type: "Primitive"
  */
  public ObjectElement[] getAttributes(Object arg) {
    ObjectElement attrSet[] = new ObjectElement[4];
      attrSet[0] = new ObjectElement("Descrip", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDescrip"), arg, "getDescrip", true);
      attrSet[1] = new ObjectElement("Destroyed", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDestroyed"), arg, "getDestroyed", true);
    ObjectElement compAttrSet[] = new ObjectElement[2];    
    for (int i = 0; i < 2 ; i++) {
        compAttrSet[i] = attrSet[i];
    }
    return compAttrSet;
  }

    /**
     * Return configured image if none exists for the element type
     */
    public Image getImage(Object element) {
		Image image = CorePlugin.getImageFor(element, false);
		if(image != null) {
			return image;
		}
		return CorePlugin.getImageFor("Lifespan.gif");
	}
    }       

