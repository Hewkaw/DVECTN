package com.example.user.dvectn.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.Spinner;

import com.example.user.dvectn.R;

/**
 * Created by User on 21/2/2561.
 */

public class Fragment_bt_pj_2 extends Fragment implements View.OnClickListener {
    Bundle bn;
    String frg,f1;
    String nameList[] = {"-","0","1","2","3","4","5"};
    Spinner spn1, spn2 , spn3 , spn4 , spn5 , spn6 , spn7 , spn8 ;
    public  static  final String TAG_KONAMIJUNG = "KOKOJUNG";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.av_bt_pj_2,container, false);
        bn = getArguments();

        spn1 = view.findViewById(R.id.spinner21);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn1.setAdapter(adapter);

        spn2 = view.findViewById(R.id.spinner22);
        ArrayAdapter adapter1 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn2.setAdapter(adapter1);

        spn3 = view.findViewById(R.id.spinner23);
        ArrayAdapter adapter2 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn3.setAdapter(adapter2);

        spn4 = view.findViewById(R.id.spinner24);
        ArrayAdapter adapter3 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn4.setAdapter(adapter3);

        spn5 = view.findViewById(R.id.spinner25);
        ArrayAdapter adapter4 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn5.setAdapter(adapter4);

        spn6 = view.findViewById(R.id.spinner26);
        ArrayAdapter adapter5 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn6.setAdapter(adapter5);

        spn7 = view.findViewById(R.id.spinner27);
        ArrayAdapter adapter6 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn7.setAdapter(adapter6);

        spn8 = view.findViewById(R.id.spinner28);
        ArrayAdapter adapter7 = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,nameList);
        spn8.setAdapter(adapter7);





        if(bn != null);
        {
            frg = bn.getString(Fragment_bt_pj.TAG_KAW3);
        }
        view.findViewById(R.id.btn11).setOnClickListener(this);
        view.findViewById(R.id.bbbtn3).setOnClickListener(this);
        return view;
    }

    public void replaceFragment(Fragment fragment, Bundle bundle) {

        if (bundle != null)
            fragment.setArguments(bundle);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment oldFragment = fragmentManager.findFragmentByTag(fragment.getClass().getName());

        //if oldFragment already exits in fragmentManager use it
        if (oldFragment != null) {
            fragment = oldFragment;
        }

        fragmentTransaction.replace(R.id.content, fragment, fragment.getClass().getName());

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);


        fragmentTransaction.commit();
    }

    private void senddata (){
        String[] tmpSpn = {spn1.getSelectedItem().toString(),spn2.getSelectedItem().toString(),spn3.getSelectedItem().toString(),
                spn4.getSelectedItem().toString(),spn5.getSelectedItem().toString(),spn6.getSelectedItem().toString(),
                spn7.getSelectedItem().toString(),spn8.getSelectedItem().toString()};


        if(tmpSpn != null){
            if (!tmpSpn[0].equals("-") && !tmpSpn[1].equals("-") && !tmpSpn[2].equals("-") && !tmpSpn[3].equals("-") && !tmpSpn[4].equals("-")
                    && !tmpSpn[5].equals("-") && !tmpSpn[6].equals("-") && !tmpSpn[7].equals("-") ){
                Toast.makeText(getContext(), ""+tmpSpn[0]
                        +" , "+tmpSpn[1]+" , "+tmpSpn[2]+" , "+tmpSpn[3]+" , "+tmpSpn[4]+" , "+tmpSpn[5]
                        +" , "+tmpSpn[6]+" , "+tmpSpn[7], Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getContext(),"กรุณากรอกให้ครบ",Toast.LENGTH_SHORT).show();
            }


        }else {
            Toast.makeText(getContext(), "wrong", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn11:
                Bundle bn = new Bundle();
                bn.putString(TAG_KONAMIJUNG,"963");

                Fragment_bt_pj av_bt_pj = new Fragment_bt_pj();
                av_bt_pj.setArguments(bn);
                replaceFragment(av_bt_pj,bn);

                break;
            case  R.id.bbbtn3:

                senddata();
                break;
        }

    }
}

