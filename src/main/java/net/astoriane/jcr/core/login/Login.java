package net.astoriane.jcr.core.login;

import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.lib.Reference;
import net.astoriane.jcr.lib.State;
import net.astoriane.jcr.util.PythonLauncher;

public class Login {
	
	public static void login(String username, String pass) {
		PythonLauncher.launchPythonScript(Reference.PYTHON_LOGIN, username + " " + pass);
	}

}
