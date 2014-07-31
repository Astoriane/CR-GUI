package net.astoriane.jcr.core.module;

public class LoaderModule implements Module {
	
	private int id;
	private String name;
	
	public LoaderModule(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void load() {
		
		
		
	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

}
