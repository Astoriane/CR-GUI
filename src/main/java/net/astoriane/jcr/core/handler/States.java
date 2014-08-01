package net.astoriane.jcr.core.handler;

public enum States {

	STARTUP(0), PLACEBO(1), IDLE(2), WORKING(3), EXIT(4);

	private int id;

	States(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
