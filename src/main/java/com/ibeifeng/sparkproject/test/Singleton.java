package com.ibeifeng.sparkproject.test;

/**
 * 
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance = null;
	private Singleton() {
		
	}
	
	/**
	 * @return
	 */
	public static Singleton getInstance() {

		if(instance == null) {

			synchronized(Singleton.class) {

				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
}
