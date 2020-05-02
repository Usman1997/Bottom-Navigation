package com.example.bottomnavigation;

import android.os.Bundle;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by niccapdevila on 3/26/16.
 */
public class RecentsFragment extends BaseFragment {

    public static RecentsFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt(ARGS_INSTANCE, instance);
        RecentsFragment fragment = new RecentsFragment();
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
                    mFragmentNavigation.pushFragment(RecentsFragment.newInstance(mInt + 1));
                }
            }
        });
        btn.setText(getClass().getSimpleName() + " " + mInt);
    }
}
