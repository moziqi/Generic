package org.moziqi.generic.company.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.moziqi.generic.R;
import org.moziqi.generic.common.fragment.GenericFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends GenericFragment {

    private static final String ARG_SECTION_TITLE = "section_title";

    /**
     * 返回根据title参数创建的fragment
     */
    public static SearchFragment newInstance(String title) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }


}
