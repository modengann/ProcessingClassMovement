import processing.core.PApplet;

public class Circle {
    PApplet canvas;
    float x;
    float y;
    float size;
    float speed;

    public Circle(PApplet c){
        x = 400;
        y = 300;
        canvas = c;
        size = 80;
        speed = 5;
    }

    public void display(){
        canvas.circle(x, y, size);
    }

    public void moveLeft(){
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }


}
