package com.xworkz.chaining2;

public class Camera {
	

		private String color;
		private double cost;
		private double weight;

		public Camera(String color, double cost) {
			super();
			this.color = color;
			this.cost = cost;
		}

		public Camera(String color, double cost, double weight) {
			this(color, cost);
			this.weight = weight;
		}

		public void capture() {
			System.out.println("running capture in camera");
		}

		public void display() {

			System.out.println("color : " + color);
			System.out.println("cost : " + cost);
			System.out.println("weight : " + weight);
		}


	public static void main(String[] args) {

		Camera sonyCamera = new Camera("green", 650.5, 2.00);
		sonyCamera.capture();
		sonyCamera.display();

		System.out.println("******************************************");
		Camera sonyCamera1 = new Camera("gray", 50000.00, 1.00);
		sonyCamera1.capture();
		sonyCamera1.display();
	}

}
