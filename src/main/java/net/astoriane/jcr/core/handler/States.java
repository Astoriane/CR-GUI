package net.astoriane.jcr.core.handler;

public enum States {

	STARTUP(0), IDLE(1), WORKING(2), DONE(3), EXIT(4);

	private int id;

	States(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
