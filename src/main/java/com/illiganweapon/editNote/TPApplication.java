package com.illiganweapon.editNote;

public class TPApplication {
	private static TPApplication instance;
	
    public TPApplication() {
    }

    static TPApplication getInstance() {
    	if (instance == null) {
    		instance = new TPApplication();
		}
		return instance;
	}
}