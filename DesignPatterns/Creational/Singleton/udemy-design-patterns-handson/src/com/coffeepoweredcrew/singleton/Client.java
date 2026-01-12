package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
        EagerRegistry registry =  EagerRegistry.getInstance();
        EagerRegistry registry2 =  EagerRegistry.getInstance();
        //System.out.println(registry == registry2);

        LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL2 = LazyRegistryWithDCL.getInstance();
        //System.out.println(lazyRegistryWithDCL1 == lazyRegistryWithDCL2);


        LazyRegistryIODH singleton;
        System.out.println("check1")
        singleton =  LazyRegistryIODH.getInstance();
        System.out.println("check2")
	}

}
