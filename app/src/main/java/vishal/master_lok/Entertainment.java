package vishal.master_lok;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Entertainment extends ListFragment {

    public Entertainment() {
        // Required empty public constructor
    }
    ImageView takePicture;
    // Array of strings storing headline names
    String[] headline = new String[]{
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] img = new int[]{
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d
    };

    // Array of strings to store description
    String[] description = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"
    };

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        // String item = (String) listView.getItemAtPosition(position);

        // Show a toast if the user clicks on an item
        Toast.makeText(getActivity(), "Item Clicked: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_list_view, container, false);
        //get the button view
        takePicture = (ImageView) view.findViewById(R.id.tripledot);
        //set a onclick listener for when the button gets clicked
        takePicture.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Item 11Clicked: ", Toast.LENGTH_SHORT).show();
            }
        });
        final PopupMenu popupMenu = new PopupMenu(getContext(), takePicture);
        // popupMenu.inflate(R.menu.listmenu);
        // Each row in the list stores country name, currency and flag

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 10; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt", "HeadLine : " + headline[i]);
            hm.put("cur", "Description : " + description[i]);
            hm.put("flag", Integer.toString(img[i]));
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"flag", "txt", "cur"};

        // Ids of views in listview_layout
        int[] to = {R.id.news_img, R.id.txt, R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.news_list_view, from, to);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
