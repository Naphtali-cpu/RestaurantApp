//package io.github.vinge1718.restaurant;
//
//import static org.junit.Assert.*;
//
//import android.widget.TextView;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.Robolectric;
//import org.robolectric.RobolectricTestRunner;
//
//@RunWith(RobolectricTestRunner.class)
//public class MainActivityTest {
//    private MainActivity activity;
//    @Before
//    public void setUp() throws Exception {
//        activity = Robolectric.buildActivity(MainActivity.class)
//                .create()
//                .resume()
//                .get();
//    }
//
//    @Test
//    public void validateTextViewContent(){
//        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
//        assertTrue("MyRestaurants".equals(appNameTextView.getText().toString()));
//    }
//}
