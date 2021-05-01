package com.example.mathgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1,tv_p2;

    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;

    //array for this image;

    Integer[] cardsarray={101,102,103,104,105,106,201,202,203,204,205,206};

    //actual image;

    int image101,image102,image103,image104,image105,image106,
            image201,image202,image203,image204,image205,image206;
    int firstCard,secondCard;
    int clickedfirst,clickedsecond;
    int cardNumbers=1;
    int turn=1;
    int playerPoints=10,cpupoints=10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1=(TextView)findViewById(R.id.tv_p1);
        tv_p2=(TextView)findViewById(R.id.tv_p2);

        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);

        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);

        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);

        iv_23=(ImageView)findViewById(R.id.iv_23);
        iv_24=(ImageView)findViewById(R.id.iv_24);

        iv_31=(ImageView)findViewById(R.id.iv_31);
        iv_32=(ImageView)findViewById(R.id.iv_32);

        iv_33=(ImageView)findViewById(R.id.iv_33);
        iv_34=(ImageView)findViewById(R.id.iv_34);



        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");


        //load the cards image;

        frontsOfCardsRecourses();

        //shuffle the image

        Collections.shuffle(Arrays.asList(cardsarray));

        //change the second player color when inactive;



        tv_p2.setTextColor(Color.GRAY);


        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());


                dostuf(iv_11,theCard);


            }
        });



        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_12,theCard);

            }
        });



        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_13,theCard);

            }
        });


        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_14,theCard);

            }
        });



        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_21,theCard);

            }
        });



        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_22,theCard);

            }
        });



        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_23,theCard);

            }
        });



        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_24,theCard);



            }
        });



        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_31,theCard);

            }
        });



        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_32,theCard);

            }
        });



        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());

                dostuf(iv_33,theCard);

            }
        });



        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int theCard=Integer.parseInt((String)view.getTag());



                dostuf(iv_34,theCard);

            }
        });


    }

    private void dostuf(ImageView iv,int card){

        if (cardsarray[card]==101){

            iv.setImageResource(image101);
        }
        else if (cardsarray[card]==102){
            iv.setImageResource(image102);
        }

        else if (cardsarray[card]==103){
            iv.setImageResource(image103);
        }

        else if (cardsarray[card]==104){
            iv.setImageResource(image104);
        }

        else if (cardsarray[card]==105){
            iv.setImageResource(image105);
        }

        else if (cardsarray[card]==106){
            iv.setImageResource(image106);
        }

        else if (cardsarray[card]==201){
            iv.setImageResource(image201);
        }

        else if (cardsarray[card]==202){
            iv.setImageResource(image202);
        }

        else if (cardsarray[card]==203){
            iv.setImageResource(image203);
        }

        else if (cardsarray[card]==204){
            iv.setImageResource(image204);
        }

        else if (cardsarray[card]==205){
            iv.setImageResource(image205);
        }

        else if (cardsarray[card]==206){
            iv.setImageResource(image206);



        }


        //check which image is selected and save it to temporayry variable;

        if (cardNumbers==1){

            firstCard=cardsarray[card];
            if (firstCard>200){

                firstCard=firstCard-100;
            }

            cardNumbers=2;
            clickedfirst=card;
            iv.setEnabled(false);


        }else if (cardNumbers==2){
            secondCard=cardsarray[card];
            if (secondCard>200){

                secondCard=secondCard-100;

            }

            cardNumbers=1;
            clickedsecond=card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            android.os.Handler handler=new android.os.Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //calculate if the selected image are selected;

                    calculate();



                }
            },1000);

        }
    }

    private void calculate(){



        //if image are equal than remove them and coin add.

        if (firstCard==secondCard){
            if (clickedfirst==0){
                iv_11.setVisibility(View.INVISIBLE);



            }

            else if (clickedfirst==1){
                iv_12.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==2){
                iv_13.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if (clickedfirst==4){
                iv_21.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==5){
                iv_22.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==6){
                iv_23.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==7){
                iv_24.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==8){
                iv_31.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==9){
                iv_32.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==10){
                iv_33.setVisibility(View.INVISIBLE);
            }

            else if (clickedfirst==11){
                iv_34.setVisibility(View.INVISIBLE);
            }




            if (clickedsecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if (clickedsecond==4){
                iv_21.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==5){
                iv_22.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==6){
                iv_23.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==7){
                iv_24.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==8){
                iv_31.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==9){
                iv_32.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==10){
                iv_33.setVisibility(View.INVISIBLE);
            }

            else if (clickedsecond==11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            //add points to the correct players.

            if (turn == 1){

                playerPoints=playerPoints+0;
                tv_p1.setText("p1:"+playerPoints);

            }else  if (turn == 2){
                cpupoints=cpupoints+0;
                tv_p2.setText("p2:"+cpupoints);
            }





        }else {

            iv_11.setImageResource(R.drawable.back_image);
            iv_12.setImageResource(R.drawable.back_image);
            iv_13.setImageResource(R.drawable.back_image);
            iv_14.setImageResource(R.drawable.back_image);
            iv_21.setImageResource(R.drawable.back_image);
            iv_22.setImageResource(R.drawable.back_image);
            iv_23.setImageResource(R.drawable.back_image);
            iv_24.setImageResource(R.drawable.back_image);
            iv_31.setImageResource(R.drawable.back_image);
            iv_32.setImageResource(R.drawable.back_image);
            iv_33.setImageResource(R.drawable.back_image);
            iv_34.setImageResource(R.drawable.back_image);



            //change the player turn.

            if (turn==1){
                turn=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else   if (turn==2){
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);


        //check ind if the game is over.

        checkend();
    }

    private void checkend(){



        if (iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE &&
                iv_13.getVisibility()==View.INVISIBLE &&
                iv_14.getVisibility()==View.INVISIBLE &&
                iv_21.getVisibility()==View.INVISIBLE &&
                iv_22.getVisibility()==View.INVISIBLE &&
                iv_23.getVisibility()==View.INVISIBLE &&
                iv_24.getVisibility()==View.INVISIBLE &&
                iv_31.getVisibility()==View.INVISIBLE &&
                iv_32.getVisibility()==View.INVISIBLE &&
                iv_33.getVisibility()==View.INVISIBLE &&
                iv_34.getVisibility()==View.INVISIBLE


        ){

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);



            builder.setTitle("Game Score:");
            builder.setMessage("Game Over\nP1: "+playerPoints+"\nP2:"+cpupoints);
            builder.setCancelable(false);

            builder.setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {




                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();



                }
            });

            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {



                    finish();



                }
            });

            AlertDialog alertDialog=builder.create();

            alertDialog.show();




        }

    }


    private void frontsOfCardsRecourses(){


        image101=R.drawable.a101;
        image102=R.drawable.b102;
        image103=R.drawable.c103;
        image104=R.drawable.d104;
        image105=R.drawable.e105;
        image106=R.drawable.f106;
        image201=R.drawable.a201;
        image202=R.drawable.b202;
        image203=R.drawable.c203;
        image204=R.drawable.d204;
        image205=R.drawable.e205;
        image206=R.drawable.f206;


    }




}