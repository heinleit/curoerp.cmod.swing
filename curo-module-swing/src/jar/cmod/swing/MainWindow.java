package jar.cmod.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import jar.cmod.swing.api.IMainSection;
import jar.cmod.swing.api.IMainWindow;
import jar.cmod.swing.api.MainWindowSettings;
import jar.cmod.swing.api.exception.MainFrameIndexAlreadyOccupiedException;

public class MainWindow extends JFrame implements IMainWindow {
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		System.out.println("Main Window Lüppt!");
}

	@Override
	public void addMainSection(int arg0, IMainSection arg1) throws MainFrameIndexAlreadyOccupiedException {
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(arg1.getContentPane(), BorderLayout.CENTER);
	}

	@Override
	public void setFullscreen(boolean arg0) {
		//TODO implementation
	}

	@Override
	public void setIcon(ImageIcon image) {
		super.setIconImage(image.getImage());
	}

	@Override
	public void setSettings(MainWindowSettings arg0) {
		
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	@Override
	public void open() {
		super.setMinimumSize(new Dimension(1280, 600));
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.setVisible(true);
	}
		
}
