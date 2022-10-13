public class LayoutFacade {

	private WindowsPC windowsPC = new WindowsPC();

	private MacOS macOS = new MacOS();

	private Tablet tablet = new Tablet();

	public void layoutForApp(int x, int y) {

		int xcord = x, ycord=y;

		windowsPC.setLayout(xcord,ycord);
		macOS.setLayout(xcord,ycord);
		tablet.setLayout(xcord,ycord);

	}

}
