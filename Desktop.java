package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size is: 24 inches");
		
	}
	
	
	public void proccessor() {
		System.out.println("proccessor is : Intel(R) Core(TM) i5-2520M CPU @ 2.50GHz   2.50 GHz");
		
	}
	public void installedRAM() {
		System.out.println("Installed RAM is: 8.00 GB (7.88 GB usable)");	
	}
	
	public static void main(String[] args) {
		
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
		desk.proccessor();
		desk.installedRAM();
	}


}
