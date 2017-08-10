
import java.util.ArrayList;

public class Point {

    private ArrayList<Point> neighbors;
    private int currentState;
    private int nextState;
    private int numStates = 2;

    public Point() {
        currentState = 0;
        nextState = 0;
        neighbors = new ArrayList<Point>();
    }

    public void clicked() {
        currentState = (++currentState) % numStates;
    }

    public int getState() {
        return currentState;
    }

    public void setState(int s) {
        currentState = s;
    }

    public void calculateNewState() {
     int kolega= getActiveNeighbors();

     if(currentState==0){ 
        if(kolega==0) 
            nextState=0;       
        if(kolega==1) 
            nextState=0; 
        if(kolega==2) 
            nextState=0; 
        if(kolega==3) 
            nextState=1; 
        if(kolega==4) 
            nextState=0; 
        if(kolega==5) 
            nextState=0; 
        if(kolega==6) 
            nextState=1; 
        if(kolega==7) 
            nextState=1; 
        if(kolega==8) 
            nextState=1; 
        } 
        
     if(currentState==1){            
        if(kolega==0) 
            nextState=0; 
        if(kolega==1) 
            nextState=0; 
        if(kolega==2) 
            nextState=1; 
        if(kolega==3) 
            nextState=1; 
        if(kolega==4) 
            nextState=0; 
        if(kolega==5) 
            nextState=1; 
        if(kolega==6) 
            nextState=1; 
        if(kolega==7) 
            nextState=1; 
        if(kolega==8) 
            nextState=1; 
        }
    }

    public void changeState() {
        currentState = nextState;
    }

    public void addNeighbor(Point nei) {
        neighbors.add(nei);
    }

    public int getActiveNeighbors() {

        int count = 0;
        for (Point p : neighbors) {

            if (p.getState() == 1) {
                count++;
            }
        }
        return count;
    }
}
