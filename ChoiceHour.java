package reservation;

import java.awt.Choice;


public class ChoiceHour extends Choice{

    

    ChoiceHour(){

        resetRange(9,21);

    }


    public void resetRange( int start, int end){



        int number = end - start +1;

        removeAll();


        while (start<=end){

            String h = String.valueOf(start);

            //一桁の場合,前に0を付ける

            if ( h.length()==1){

                h = "0" + h;

            }


            add(h);

            // startを1増やす

            start++;

        }

    }


    // 最後に設定されている時刻を返す

    public String getLast(){

        return getItem( getItemCount()-1 );

    }



}




