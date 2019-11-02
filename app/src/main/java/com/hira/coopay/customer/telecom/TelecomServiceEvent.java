package com.hira.coopay.customer.telecom;


import android.app.Dialog;

import android.net.Uri;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.hira.coopay.customer.MainActivity;
import com.hira.coopay.customer.R;


public class TelecomServiceEvent {
    MainActivity act;
    View view;
    int defaultlanguge=1;
    TelecomServiceFragment telecomeService;

    public TelecomServiceEvent(View view, TelecomServiceFragment telecomeService) {
        this.view = view;
        this.telecomeService=telecomeService;
    }
    //=====================================Mobile Balance request==============================//
    public void mBalanceRequest(){
        String ussd =String.format("*%s%s",804,Uri.encode("#"));
       // telecomeService.callCenter(ussd);
    }
    //=====================================Send Mobile money==============================//


    public void callCenter(){



       final Dialog callSupport=new Dialog(this.telecomeService.view.getContext());
        callSupport.setContentView(R.layout.call_ceneter_layout);



        RadioButton amharicLang=callSupport.findViewById(R.id.amlang);
        RadioButton orolang=callSupport.findViewById(R.id.orolang);


        Button sysSupport=callSupport.findViewById(R.id.system_support);
        Button networkSupport=callSupport.findViewById(R.id.netwoking);
        Button hawalaSupport=callSupport.findViewById(R.id.hawala);
        Button eBankingSupport=callSupport.findViewById(R.id.e_banking);
        amharicLang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                defaultlanguge=1;
            }


        });
        orolang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                defaultlanguge=2;

            }
        });

        sysSupport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ussd =String.format("%s,%s,%s",8518,defaultlanguge,1);
              //  telecomeService.callCenter(ussd);

            }

        });
        networkSupport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ussd =String.format("%s,%s,%s",8518,defaultlanguge,2);
              //  telecomeService.callCenter(ussd);

            }


        });
        hawalaSupport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ussd =String.format("%s,%s,%s",8518,defaultlanguge,3);
               // telecomeService.callCenter(ussd);

            }

        });
        eBankingSupport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ussd =String.format("%s,%s,%s",8518,defaultlanguge,4);
              //  telecomeService.callCenter(ussd);

            }


        });
        callSupport.show();

    }
}
