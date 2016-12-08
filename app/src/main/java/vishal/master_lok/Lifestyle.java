package vishal.master_lok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Lifestyle extends Fragment {

        private static final String TAG = Lifestyle.class.getSimpleName();

        /** The CardView widget. */
        //@VisibleForTesting
        CardView mCardView;

    public Lifestyle() {

    }
        public static Lifestyle newInstance() {
            Lifestyle fragment = new Lifestyle();
            fragment.setRetainInstance(true);
            return fragment;
        }



    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.cards_layout, container, false);
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            mCardView = (CardView) view.findViewById(R.id.cardview);
     /*       mRadiusSeekBar = (SeekBar) view.findViewById(R.id.cardview_radius_seekbar);
            mRadiusSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    Log.d(TAG, String.format("SeekBar Radius progress : %d", progress));
                    mCardView.setRadius(progress);
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    //Do nothing
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    //Do nothing
                }
            });

            mElevationSeekBar = (SeekBar) view.findViewById(R.id.cardview_elevation_seekbar);
            mElevationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    Log.d(TAG, String.format("SeekBar Elevation progress : %d", progress));
                   // mCardView.setElevation(progress);
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    //Do nothing
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    //Do nothing
                }
            });*/
        }




    }
