package de.tu_bs.cs.isf.e4cf.text_editor.extensions;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.e4cf.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.e4cf.text_editor.stringtable.EditorST;

public class XMLFileExtension extends TextEditorProjectExplorerFileExtension {
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(EditorST.BUNDLE_NAME, "icons/xml-icon.png");
	}

}