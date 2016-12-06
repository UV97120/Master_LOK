package vishal.master_lok;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Gujarat extends ListFragment {

    public Gujarat() {
        // Required empty public constructor
    }

      int [] prgmImages={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.a,R.drawable.b,R.drawable.c};
     String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_three,container,false);

        //Create Adapter and set to
        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, prgmNameList );
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
/*        Intent intent = new Intent(v.getContext(), BlankFragment.class);
        v.getContext().startActivity(intent);*/
//         Intent intent = new Intent(v.getContext(),NewShow.class);
//                    v.getContext().startActivity(intent);
//                    getActivity().finish();
        getActivity().finish();
//    Toast.makeText(getActivity(),getListView().getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
    }

}
