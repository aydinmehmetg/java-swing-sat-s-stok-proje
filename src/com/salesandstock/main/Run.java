package com.salesandstock.main;

import javax.swing.SwingUtilities;

import com.salesandstock.ui.AnaPencereUi;

public class Run {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new AnaPencereUi();
				
			}
		});
		
	}

}
