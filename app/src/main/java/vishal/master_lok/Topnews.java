package vishal.master_lok;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment that demonstrates how to use CardView.
 */
public class Topnews extends android.support.v4.app.Fragment {

 private static final String TAG = Topnews.class.getSimpleName();

 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
 }

 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container,
                          Bundle savedInstanceState) {
  // Inflate the layout for this fragment
  return inflater.inflate(R.layout.topnews, container, false);
 }
}