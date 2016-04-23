package comp640.computerbuilder.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

import comp640.computerbuilder.R;

/**
 * Created by deandubois on 4/17/16.
 */
public class CartFragment extends Fragment {

    Button checkOut;
=======
public class CartFragment extends CBFragment {
>>>>>>> anturner130/master
=======
public class CartFragment extends CBFragment {
>>>>>>> anturner130/master

    public CartFragment(){
        _title = "My Cart";
        _index = 3;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cart, container, false);
        checkOut = (Button) rootView.findViewById(R.id.check_out_button);
        checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return rootView;
    }
}

