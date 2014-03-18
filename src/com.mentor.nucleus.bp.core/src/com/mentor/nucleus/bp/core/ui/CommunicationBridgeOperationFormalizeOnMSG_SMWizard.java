package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    CommunicationBridgeOperationFormalizeOnMSG_SMWizard.java
//
// WARNING: Do not edit this generated file
// Generated by arc/wizard.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.wizard.*;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.TransactionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * CommunicationBridgeOperationFormalizeOnMSG_SMWizard class
 */
public class CommunicationBridgeOperationFormalizeOnMSG_SMWizard extends Wizard {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	// workbench selection when the wizard was started
	protected IStructuredSelection m_selection;

	// the workbench instance
	protected IWorkbench m_workbench;

	// the viewer the wizard was started from. This must be replaced with a listener system
	protected Viewer m_viewer;

	// Pages stack
	protected Stack m_pagesStack = new Stack();

	// wizard pages
	CommunicationBridgeOperationFormalizeOnMSG_SMWizardPage4 MSG_SM_CommunicationBridgeOperationFormalizePage4;

	// wizard state
	// constants
	protected static final int INITIAL_WIZARD_STATE = -1;
	protected static final int MSG_SM_COMMUNICATIONBRIDGEOPERATIONFORMALIZE0_WIZARD_STATE = 0;
	// member
	protected int m_state = INITIAL_WIZARD_STATE;
	// end wizard state

	// cache for contextual selections (public for use by unit tests)
	public SynchronousMessage_c v_syncMessage = null;
	public ExternalEntityParticipant_c v_eep = null;

	// cache for the users selections (public for use by unit tests)
	public Bridge_c v_Message = null;

	/**
	 * Constructor for CommunicationBridgeOperationFormalizeOnMSG_SMWizard.
	 */
	public CommunicationBridgeOperationFormalizeOnMSG_SMWizard() {
		super();
	}

	/**
	 * See field.
	 */
	public IStructuredSelection getSelection() {
		return m_selection;
	}

	public void addPages() {
		MSG_SM_CommunicationBridgeOperationFormalizePage4 = new CommunicationBridgeOperationFormalizeOnMSG_SMWizardPage4(
				"CommunicationBridgeOperationFormalizeOnMSG_SMWizardPage4");
		addPage(MSG_SM_CommunicationBridgeOperationFormalizePage4);
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection,
			Viewer viewer) {
		this.m_workbench = workbench;
		this.m_selection = selection;
		this.m_viewer = viewer;
		for (Iterator iterator = selection.iterator(); iterator.hasNext();) {
			Object context = iterator.next();
			if (context instanceof SynchronousMessage_c) {
				v_syncMessage = (SynchronousMessage_c) context;
			}
			if (context instanceof ExternalEntityParticipant_c) {
				v_eep = (ExternalEntityParticipant_c) context;
			}
		}
	}

	public boolean canFinish() {
		boolean pagesComplete = true;
		pagesComplete = pagesComplete
				&& MSG_SM_CommunicationBridgeOperationFormalizePage4
						.isPageComplete();
		return pagesComplete;
	}

	public IWizardPage getNextPage(IWizardPage page) {
		List pages = new ArrayList(getPages().length);
		for (int i = 0; i < getPages().length; i++) {
			pages.add(getPages()[i]);
		}
		switch (pages.indexOf(page)) {
			case MSG_SM_COMMUNICATIONBRIDGEOPERATIONFORMALIZE0_WIZARD_STATE :
				return null;
		}
		return null;
	}

	public IWizardPage getPreviousPage(IWizardPage page) {
		if (m_pagesStack.empty()) {
			return null;
		} else {
			List pages = new ArrayList(getPages().length);
			for (int i = 0; i < getPages().length; i++) {
				pages.add(getPages()[i]);
			}
			m_state = pages.indexOf((IWizardPage) m_pagesStack.peek());
			((PtWizardPage) m_pagesStack.peek()).onPageEntry();
			return (IWizardPage) m_pagesStack.pop();
		}
	}

	public boolean performFinish() {
		TransactionUtil.TransactionGroup transactionGroup = null;
		ModelRoot modelRoot = v_eep.getModelRoot();
		try {
			transactionGroup = TransactionUtil
					.startTransactionsOnSelectedModelRoots("Communication Bridge Operation Formalize"); //$NON-NLS-1$
			if (((v_syncMessage != null))) {

				if (((v_eep != null))) {

					Bridge_c v_bridgeOp = Bridge_c
							.getOneS_BRGOnR1012(BridgeMessage_c
									.getOneMSG_BOnR1020(v_syncMessage));

					java.util.UUID v_existingId = Gd_c.Null_unique_id();

					if (((v_bridgeOp != null))) {

						v_existingId = v_bridgeOp.getBrg_id();

					}

					Message_c v_message = Message_c
							.getOneMSG_MOnR1018(v_syncMessage);

					InteractionParticipant_c v_participant = InteractionParticipant_c
							.getOneSQ_POnR930(v_eep);

					if (v_message != null) {
						v_message.relateAcrossR1007To(v_participant);
					} else {
						Throwable t = new Throwable();
						t.fillInStackTrace();
						CorePlugin.logError(
								"Relate attempted on null left hand instance.",
								t);
					}

					ExternalEntity_c v_ee = ExternalEntity_c
							.getOneS_EEOnR933(v_eep);

					if (((v_ee != null))) {

						if (v_syncMessage != null) {
							v_syncMessage
									.Formalizewithbridgeoperation(v_Message
											.getBrg_id());
						} else {
							Throwable t = new Throwable();
							t.fillInStackTrace();
							CorePlugin
									.logError(
											"Attempted to call an operation on a null instance.",
											t);
						}

						Sel_c.Clearselection();

					}

				}

			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			if (transactionGroup != null)
				TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin
					.logError(
							"Transaction: Communication Bridge Operation Formalize failed", e);//$NON-NLS-1$
			// return true so that the wizard will
			// close
			return true;
		}
		if (transactionGroup != null)
			TransactionUtil.endTransactions(transactionGroup);
		if (m_viewer != null) {
			if (m_viewer instanceof StructuredViewer) {
				((StructuredViewer) m_viewer).refresh(v_eep);
			} else {
				m_viewer.refresh();
			}
		}
		return true;
	}
}