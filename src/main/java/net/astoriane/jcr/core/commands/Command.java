package net.astoriane.jcr.core.commands;

public interface Command {

	public void run(String[] data);

	public String getName();

	public int getId();
	
	public boolean returnValue();

}
