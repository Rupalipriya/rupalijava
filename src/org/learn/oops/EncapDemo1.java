package org.learn.oops;

public class EncapDemo1 {
	void mk() {
		EncapsultaionDemo encapsultaionDemo=new EncapsultaionDemo();
		//encapsultaionDemo.a();
		encapsultaionDemo.setA(45);
		encapsultaionDemo.setF(43.5f);
		encapsultaionDemo.setS("Ram");
		
		System.out.println(encapsultaionDemo.getA());
		int num=encapsultaionDemo.getA();
		encapsultaionDemo.getF();
		encapsultaionDemo.getS();
	}

}
