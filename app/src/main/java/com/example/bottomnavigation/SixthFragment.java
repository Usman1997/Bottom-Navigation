package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by niccapdevila on 3/26/16.
 */
public class SixthFragment extends BaseFragment {

    public static SixthFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt(ARGS_INSTANCE, instance);
        SixthFragment fragment = new SixthFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFragmentNavigation != null) {
                    mFragmentNavigation.pushFragment(SeventhFragment.newInstance(mInt+1));
                }
            }
        });
        btn.setText(getClass().getSimpleName() + " " + mInt);
    }

}
