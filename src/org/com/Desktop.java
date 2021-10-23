package org.com;

public class Desktop extends Computer {
private void desktopSize() {
	System.out.println("DesktopSize is 15.67cm");

}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopSize();
	d.computerModel();
}
}
