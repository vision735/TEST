package thread.communication;

public class ShengChanTrag implements Runnable {
	private Tianmao t;

	public ShengChanTrag(Tianmao t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		while (true) {
			t.shengChan();
		}
	}
}
