package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    // Constructor
    public Gate (){
      mSwing = CLOSED;
    }

    // Set Swing
    public boolean setSwing(int direction){
      mSwing = direction;
      if(direction == IN || direction == OUT || direction == CLOSED) {
        return true;
      }
      else {
        return false;
      }
    }

    // Open Gate
    public boolean open(int direction){
      if(direction == IN || direction == OUT){
        setSwing(direction);
        return true;
      }
      else return false;
    }

    // Close Gate
    public void close(){
      mSwing = CLOSED;
    }

    // Set Swing Direction
    public int getSwingDirection(){
      return mSwing;
    }

    // Number of Snails gone in or out
    public int thru(int count){
      if(mSwing == IN) return count;
      else if(mSwing == OUT) return count*(-1);
      else return 0;
    }

    // ToString Method Overriden
    public String toString(){
       if(mSwing == CLOSED) return "This gate is closed";
       else if(mSwing == IN) return "This gate is open and swings to enter the pen only";
       else if(mSwing == OUT) return "This gate is open and swings to exit the pen only";
       else return "This gate has an invalid swing direction";
    }

}
