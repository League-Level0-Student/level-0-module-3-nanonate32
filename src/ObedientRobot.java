import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Nathaniel;
	public static void main(String[] args) {

		 Nathaniel = new Robot();
		Nathaniel.penDown();
		DrawSquare();
		DrawTriangle();
		DrawCircle();

		
	}
	public static void DrawSquare() {Nathaniel.move(100);
	Nathaniel.turn(90);
	Nathaniel.move(100);
	Nathaniel.turn(90);
	Nathaniel.move(100);
	Nathaniel.turn(90);
	Nathaniel.move(100);
		
	}
	public static void DrawTriangle() {Nathaniel.turn(60);
	Nathaniel.move(100);
	Nathaniel.turn(120);
	Nathaniel.move(100);
	Nathaniel.turn(120);
	Nathaniel.move(100);
	}
	public static void DrawCircle() {
		for (int i = 0; i < 360; i++) {
	    Nathaniel.turn(1);
		Nathaniel.move(1);
		}
		
	}
	}
