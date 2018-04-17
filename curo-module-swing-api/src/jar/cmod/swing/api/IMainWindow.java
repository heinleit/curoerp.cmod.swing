package jar.cmod.swing.api;

import javax.swing.ImageIcon;

import jar.cmod.swing.api.exception.MainFrameIndexAlreadyOccupiedException;

public interface IMainWindow {
	
	public void open();
	
	//Settings (size, position etc.) => saved
	public void setSettings(MainWindowSettings settings);
	
	public void setTitle(String title);
	
	public void setIcon(ImageIcon icon);
	
	public void setFullscreen(boolean fullscreen);
	
	public void addMainSection(int index, IMainSection section) throws MainFrameIndexAlreadyOccupiedException;
	
}
