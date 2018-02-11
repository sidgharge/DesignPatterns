package com.sid;

public class App {
	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactoryImpl();
		
		Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
		
		Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
		
		Shape square = shapeFactory.createShape(ShapeType.SQUARE);
		
		Shape noShape = shapeFactory.createShape(null);
		
		circle.draw();
		rectangle.draw();
		square.draw();
		System.out.println(noShape);
	}
}
