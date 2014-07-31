package net.astoriane.jcr.core.module;

public interface Module {
	
	public void load();
	
	public void loop();

	public void exit();
	
	public void launch();
	
}
