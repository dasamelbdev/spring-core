package com.dasun.spring_practice.manuala_dependency_injection_demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	OrangeJuice orangeJuice = new OrangeJuice();
    	AppleJuice appleJuice = new AppleJuice();
    	//manually injecting the dependency.
        JuiceMakerService juiceMakerService = new JuiceMakerService(appleJuice);
        juiceMakerService.makeJuice();
    }
}
