package com.sid;

public class ShapeFactoryImpl implements ShapeFactory {

	@Override
	public Shape createShape(ShapeType shapeType) {

		if (shapeType == null) {
			return null;
		}

		switch (shapeType) {
		case CIRCLE:
			return new Circle();

		case RECTANGLE:
			return new Rectangle();

		case SQUARE:
			return new Square();

		default:
			return null;
		}

	}

}
