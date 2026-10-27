import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

/* Draws a space scene with planets that are squares or circles, with stars and aliens in the background.
* The planets are in different positions, colors, and sizes.
* The stars and aliens are randomly drawn in the background.
*
* @param painter The PainterAPI object used to draw on the canvas.
* @param color The color of the shape.
* @param x The x-coordinate of the shape's position.
* @param y The y-coordinate of the shape's position.
* @param radius The radius of the circle shape.
* @param size The size of the square shape.
* 
*/

public class Space {
    // draws a circle with the specified color.
    public static void drawCircle(PainterAPI painter, Color color, int radius) {
        painter.startFill(color);
        painter.circle(radius);
        painter.finishFill();
        painter.liftPen();
    }

    // draws a square with the specified color.
    public static void drawSquare(PainterAPI painter, Color color) {
        painter.startFill(color);
        for (int i = 0; i < 4; i++) {
            painter.forward(100);
            painter.turnRight(90);
        }
        painter.finishFill();
        painter.liftPen();
    }

    // calls drawCircle with the specified radius and position.
    public static void circlePlanet(PainterAPI painter, int x, int y) {
        drawCircle(painter, Color.BLUE, 50);
        painter.moveTo(x, y);
    }

    // calls drawSquare with the specified size and position.
    public static void squarePlanet(PainterAPI painter, int x, int y, int size) {
        drawSquare(painter, Color.BLUE);
        painter.moveTo(x, y);
        painter.forward(size);
        painter.liftPen();
    }

    // calls drawCircle or drawSquare to draw stars and aliens in the background.
    // two for loops to draw the specified number of stars and aliens in random
    // positions and colors.
    public static void drawDecor(PainterAPI painter, int numStars, int numAliens) {

    }

    // calls drawDecor to draw stars and aliens in the background.
    // calls circlePlanet and squarePlanet to draw planets in different positions,
    // colors, and sizes.
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
        PainterAPI painter = canvas.getPainter();

        circlePlanet(painter, 200, 300);
        squarePlanet(painter, 400, 300, 50);
    }
}