package Popup;
import common.Base;

public class Popup extends Base{

    public void closePopUp() throws InterruptedException {
        sleepFor(5);
        clickByCss(".close");
    }
}