package com.example.bottomnavigation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by niccapdevila on 3/26/16.
 */
public class FavoritesFragment extends BaseFragment {

    public static FavoritesFragment  newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt(ARGS_INSTANCE, instance);
        FavoritesFragment fragment = new FavoritesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mFragmentNavigation != null) {
                        mFragmentNavigation.pushFragment(FriendsFragment.newInstance(mInt+1));
                    }
                }
            });
            btn.setText(getClass().getSimpleName() + " " + mInt);
        }
    }
}
