package net.astoriane.jcr.lib;

public enum State {

	STARTUP(0), IDLE(1), WORKING(2), DONE(3), EXIT(4);

	private int id;

	State(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
