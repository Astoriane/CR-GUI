package net.astoriane.jcr.core.module;

public interface Module {

	public void load();

	public void loop();

	public void exit();

	public void launch();

	public int getId();

	public String getUnlocalizedName();

	public String getName();

}
