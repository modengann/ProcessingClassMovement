import processing.core.*;
public class App extends PApplet{
    Circle circle;
    public static void main(String[] args){
        PApplet.main("App");
    }

    public void settings() {
        size(1920 , 1080);

    }

    public void setup(){
        circle = new Circle(this);
    }

    public void draw(){
        background(100);
        circle.display();
    }

    public void keyPressed(){
        if(keyCode == LEFT){
            circle.moveLeft();
        }
        else if(keyCode == RIGHT){
            circle.moveRight();
        }
        else if(keyCode == UP){
            circle.moveUp();
        }
        else if(keyCode == DOWN){
            circle.moveDown();
        }
    }
}
