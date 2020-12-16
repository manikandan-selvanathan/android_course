package com.saimobileapps.learning;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static android.content.Context.LOCATION_SERVICE;

public class Helper {

    static Helper helper;
    public static Helper Instance()
    {
        if(helper!=null)
        {
            return helper;
        }
        else
        {
            return new Helper();
        }

    }

    public void GetCurrentLocation(final Context activity) {
        try {
            final LocationManager mLocationManager = (LocationManager) activity.getSystemService(LOCATION_SERVICE);
            if (mLocationManager == null) {
                //Enable the location popup
                return;
            }
            final Criteria locationCriteria = new Criteria();
            locationCriteria.setAccuracy(Criteria.ACCURACY_COARSE);
            locationCriteria.setPowerRequirement(Criteria.POWER_MEDIUM);
            try {
                Log.i("LocationSample", "Location permission has already been granted.");
                final String locationProvider = mLocationManager.getBestProvider(locationCriteria, true);
                if (locationProvider != null) {
                    if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    mLocationManager.requestLocationUpdates(locationProvider, 1000, 1, new LocationListener() {
                        boolean isLocationChangedCalled;

                        @Override
                        public void onLocationChanged(Location location) {
                            isLocationChangedCalled = true;
                            if (isLocationChangedCalled) {
                                isLocationChangedCalled = false;
                            }
                            Log.d("LocationSample", "Lattitude: " + location.getLatitude() + "Longitude: " + location.getLongitude());
                            getAddress(activity,location);
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
        } catch (Exception e) {
            Log.e("GetCurrentLocation", e.getMessage());
        }
    }

    void getAddress(Context activity, Location locationd) {
        try {
            Geocoder geocoder = new Geocoder(activity, Locale.getDefault());
            Location location = locationd;
            List<Address> addresses = null;
            String resultMessage = "";

            try {
                addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                if (addresses == null || addresses.size() == 0) {
                } else {
                    Address address = addresses.get(0);
                    ArrayList<String> addressParts = new ArrayList<>();
                    for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                        addressParts.add(address.getAddressLine(i));
                    }
                    resultMessage = TextUtils.join("\n", addressParts);
                    Log.d("LocationSample", resultMessage);
                }
            } catch (Exception ioException) {
                Log.e("LocationSample", resultMessage, ioException);
            }
        } catch (Exception e) {

        }
    }



}
