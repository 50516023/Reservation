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

            //�ꌅ�̏ꍇ,�O��0��t����

            if ( h.length()==1){

                h = "0" + h;

            }


            add(h);

            // start��1���₷

            start++;

        }

    }


    // �Ō�ɐݒ肳��Ă��鎞����Ԃ�

    public String getLast(){

        return getItem( getItemCount()-1 );

    }



}




