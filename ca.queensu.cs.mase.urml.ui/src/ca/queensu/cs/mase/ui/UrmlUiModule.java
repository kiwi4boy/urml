/*
 * generated by Xtext
 */
package ca.queensu.cs.mase.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;

/**
 * Use this class to register components to be used within the IDE.
 */
public class UrmlUiModule extends ca.queensu.cs.mase.ui.AbstractUrmlUiModule {
	public UrmlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return UrmlNatureAddingEditorCallback.class;
	}
}
