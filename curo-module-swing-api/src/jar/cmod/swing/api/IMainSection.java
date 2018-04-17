package jar.cmod.swing.api;

import java.awt.Container;

import javax.swing.ImageIcon;

/**
 * this interface is passed to the swing module
 * no part of DlS!
 * 
 * @author Hendrik Heinle
 *
 */
public interface IMainSection {
	
	public String getName();
	public ImageIcon getIcon();
	public char getShortcut();
	public Container getContentPane();
	
}
