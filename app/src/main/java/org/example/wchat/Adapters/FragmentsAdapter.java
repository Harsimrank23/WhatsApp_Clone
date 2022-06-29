package org.example.wchat.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.example.wchat.Fragments.CallsFragment;
import org.example.wchat.Fragments.ChatsFragment;
import org.example.wchat.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentStateAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    // implement override methods and super constructor:
//    public FragmentsAdapter(@NonNull FragmentManager fm) {
//        super(fm);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        // return on the basis of selected fragment:
//        switch (position)
//        {
//            case 0:return new ChatsFragment();
//            case 1:return new StatusFragment();
//            case 2:return new CallsFragment();
//            default:return new ChatsFragment();
//        }
//    }
//
//    @Override
//    public int getCount() {
//        return 3;
//    }
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        // set title according to position
//        String title=null;
//        if(position==0) title = "CHATS";
//
//        if(position==1) title = "STATUS";
//
//        if(position==2) title = "CALLS";
//
//        return title;
//    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:return new ChatsFragment();
            case 1:return new StatusFragment();
            case 2:return new CallsFragment();
            default:return new ChatsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }


}
