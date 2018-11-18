package com.example.m1k3y.projecti.utils;

import android.net.Uri;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    public static final int DISPLAY_TIME = 0;
    public static final int KEY_TIME = 1;
    public static final String ALARM_TIME = "12:11";

    private static String avatarUrl = "https://scontent-hkg3-2.xx.fbcdn.net/v/t1.0-9/46482027_376680916405661_7612030827156733952_n.jpg?_nc_cat=102&_nc_eui2=AeEVKfU0YZi_f8lYMbnC59Dlke5gvdZRX51ufmBY4hjpH3mIY_rCSh7H1lwi8ZXmP9f4jsnbCAw7Pe6MgeCBYpNLnxVoypMDKes5zmb_dGL2GA&_nc_ht=scontent-hkg3-2.xx&oh=305c1fca5c078a1b465624366a60fae1&oe=5C83E190";
    private static String hustUrl = "https://scontent-hkg3-2.xx.fbcdn.net/v/t1.0-9/46456350_377311423009277_4323971648236552192_n.jpg?_nc_cat=111&_nc_eui2=AeHeUW8WvDNGz0OEhsm7OqKuWX8-_BMfqdVR8Y8Rj1tq-CR6Mmh7JJm3mVt4H_3w7zo8Hl8AcTlAOA8Tt3I-ungVVYeT41RtFcptz8SiNcijiw&_nc_ht=scontent-hkg3-2.xx&oh=0860a6a4675a155f36e6154ae4c76e3a&oe=5C832E9C";

    public static String getProfilePhotoUrl(Uri uri){
        return uri == null ? hustUrl : uri.toString();
    }

    public static String getTime(){

        return (new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z"))
                .format(Calendar.getInstance().getTime())
                .toUpperCase();


    }


}
