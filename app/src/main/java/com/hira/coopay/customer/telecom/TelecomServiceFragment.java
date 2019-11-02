package com.hira.coopay.customer.telecom;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hira.coopay.customer.R;


public class TelecomServiceFragment extends Fragment {
    View view;
//    Button mbalance, callaCeenter;


    public TelecomServiceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_telecom_service,container,false);

//        mbalance=view.findViewById(R.id.mbalance);
//        callaCeenter=view.findViewById(R.id.call_center_button);
//
//
//
//
//        mbalance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new TelecomServiceEvent(view, TelecomServiceFragment.this).mBalanceRequest();
//
//            }
//        });
//        callaCeenter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new TelecomServiceEvent(view, TelecomServiceFragment.this).callCenter();
//
//            }
//        });
        return view;
    }

//    public void callCenter(String ussd){
//        Intent callintent=new Intent(Intent.ACTION_CALL);
//        callintent.setData(Uri.parse("tel:" + ussd));
//        if(ActivityCompat.checkSelfPermission(view.getContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
//            return;
//        }
//        startActivity(callintent);
//
//    }


}
