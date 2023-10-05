/**
 * 
 */
package CS361HW1;

/**
 * @author cscharff
 *
 */



abstract class GraphicObject {

	private int pixelX, pixelY;

	abstract void moveTo(int newX, int newY);

	abstract void draw();

}