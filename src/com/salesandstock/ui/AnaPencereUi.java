package com.salesandstock.ui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.salesandstock.interfaces.FeInterfaces;

public class AnaPencereUi extends JFrame implements FeInterfaces{

	@Override
	public void initPencere() {
		initPencere();
		
	}

	@Override
	public JPanel initPanel() {
		JTabbedPane tabs= initTabs();
		JMenuBar bar = initBar();
		
		//add(tabs);
		//setJMenuBar(bar);
		setTitle("Satýþ ve Stok Programý");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		return null;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
