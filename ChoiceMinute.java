package reservation;


import java.awt.Choice;


public class ChoiceMinute extends Choice{
    public ChoiceMinute(){

        // 00分と30分のみを登録

        add("00");

        add("30");

    }

    public int getMinute(int index){
        if ( index==0){
            return 0;
        } else {
            return 30;
        }
    }

}


