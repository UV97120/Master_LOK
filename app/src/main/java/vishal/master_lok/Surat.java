package vishal.master_lok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Surat extends Fragment {


    public Surat() {
        // Required empty public constructor
    }
  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
   //     View view = inflater.inflate(R.layout.frag_two,container,false);
      return inflater.inflate(R.layout.frag_two, container, false);
        //   return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*-------------------------Initialization------------------------------*/
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPageAndroid);
  //      ListView listView = (ListView)view.findViewById(R.id.listview_fragment);


        /*--------------------------Adapter Or Context Are Adding-------------------------------*/
        CustomPagerAdapter adapterView = new CustomPagerAdapter(getContext());
        mViewPager.setAdapter(adapterView);
    }
}
