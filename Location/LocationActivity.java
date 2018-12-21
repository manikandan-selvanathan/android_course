package com.facebook.www.Location;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.facebook.www.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getLocation();
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 32);
        } else {
            GetCurrentLocation();
            Log.d("Changes", "getLocation: permissions granted");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

       if(requestCode==32)
       {
           if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
           {
               GetCurrentLocation();
           }
       }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void GetCurrentLocation() {
        try {
            final LocationManager mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            if (mLocationManager == null)
                return;
            final Criteria locationCriteria = new Criteria();
            locationCriteria.setAccuracy(Criteria.ACCURACY_COARSE);
            locationCriteria.setPowerRequirement(Criteria.POWER_MEDIUM);
            runOnUiThread(new Runnable() {
                @SuppressLint("MissingPermission")
                @Override
                public void run() {
                    try {
                        Log.i("GetCurrentLocation", "Location permission has already been granted.");
                        String locationProvider = mLocationManager.getBestProvider(locationCriteria, true);
                        if (locationProvider != null) {
                            mLocationManager.requestLocationUpdates(locationProvider, 1000, 1, new LocationListener() {
                                boolean isLocationChangedCalled;

                                @Override
                                public void onLocationChanged(Location location) {
                                    isLocationChangedCalled = true;
                                    if (isLocationChangedCalled) {
                                        isLocationChangedCalled = false;
                                    }
                                    getAddress(location);
                                }

                                @Override
                                public void onStatusChanged(String provider, int status, Bundle extras) {
                                }

                                @Override
                                public void onProviderEnabled(String provider) {
                                }

                                @Override
                                public void onProviderDisabled(String provider) {
                                }

                            });
                        } else {

                        }
                    } catch (Exception e) {

                    }
                }
            });
        } catch (Exception e) {
            Log.e("GetCurrentLocation", e.getMessage());
        }
    }


    void getAddress(Location locationd)
    {
        try{
            Geocoder geocoder = new Geocoder(this,Locale.getDefault());
            Location location = locationd;
            List<Address> addresses = null;
            String resultMessage = "";

            try {
                addresses = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
                if (addresses == null || addresses.size() == 0) {
                }else
                {
                    Address address = addresses.get(0);
                    ArrayList<String> addressParts = new ArrayList<>();

                    // Fetch the address lines using getAddressLine,
                    // join them, and send them to the thread
                    for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                        addressParts.add(address.getAddressLine(i));
                    }

                    resultMessage = TextUtils.join("\n", addressParts);
                }
            }
            catch (Exception ioException) {
                Log.e("Error", resultMessage, ioException);
            }
        }
        catch (Exception e)
        {

        }
    }

}
