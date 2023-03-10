package moore_stateMachine.sandbox;

/*Generated by MPS */


public class LighSwitch {


  private final int LIGHTOFF = 0;
  private final int LIGHTONDIM = 1;
  private final int LIGHTONMEDIUM = 2;
  private final int LIGHTONBRIGHT = 3;
  private final int ONPRESSED = 0;
  private final int OFFPRESSED = 1;
  private final int BRIGHTNESSOFF = 0;
  private final int BRIGHTNESSDIM = 1;
  private final int BRIGHTNESSMEDIUM = 2;
  private final int BRIGHTNESSHIGH = 3;


  private int currentState = LIGHTOFF;

  public LighSwitch() {
  }

  public void displayState() {
    String stateName = "";
    switch (currentState) {
      case LIGHTOFF:
        System.out.println("Current State: " + "lightOFF");
        break;
      case LIGHTONDIM:
        System.out.println("Current State: " + "lightONdim");
        break;
      case LIGHTONMEDIUM:
        System.out.println("Current State: " + "lightONmedium");
        break;
      case LIGHTONBRIGHT:
        System.out.println("Current State: " + "lightONbright");
        break;
    }
  }

  public void onEvent(int event) {
    switch (currentState) {
      case LIGHTOFF:
        switch (event) {
          case ONPRESSED:
            System.out.println("  On Event: " + "onPressed" + " moved to State: " + "lightONdim");
            this.currentState = LIGHTONDIM;
            break;
        }
        System.out.println("Set action to: " + "brightnessOFF");
        break;
      case LIGHTONDIM:
        switch (event) {
          case ONPRESSED:
            System.out.println("  On Event: " + "onPressed" + " moved to State: " + "lightONmedium");
            this.currentState = LIGHTONMEDIUM;
            break;
          case OFFPRESSED:
            System.out.println("  On Event: " + "offPressed" + " moved to State: " + "lightOFF");
            this.currentState = LIGHTOFF;
            break;
        }
        System.out.println("Set action to: " + "brightnessDim");
        break;
      case LIGHTONMEDIUM:
        switch (event) {
          case ONPRESSED:
            System.out.println("  On Event: " + "onPressed" + " moved to State: " + "lightONbright");
            this.currentState = LIGHTONBRIGHT;
            break;
          case OFFPRESSED:
            System.out.println("  On Event: " + "offPressed" + " moved to State: " + "lightOFF");
            this.currentState = LIGHTOFF;
            break;
        }
        System.out.println("Set action to: " + "brightnessMedium");
        break;
      case LIGHTONBRIGHT:
        switch (event) {
          case ONPRESSED:
            System.out.println("  On Event: " + "onPressed" + " moved to State: " + "lightONdim");
            this.currentState = LIGHTONDIM;
            break;
          case OFFPRESSED:
            System.out.println("  On Event: " + "offPressed" + " moved to State: " + "lightOFF");
            this.currentState = LIGHTOFF;
            break;
        }
        System.out.println("Set action to: " + "brightnessHigh");
        break;
    }
  }

}
