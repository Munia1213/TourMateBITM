package com.example.shakil.tourmateproject.Common;

import com.example.shakil.tourmateproject.Model.Results;
import com.example.shakil.tourmateproject.Remote.IGoogleAPIService;
import com.example.shakil.tourmateproject.Remote.RetrofitClient;

/**
 * Created by Shakil on 2/10/2018.
 */

public class Common {

    public static Results currentResult;

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";
    public static IGoogleAPIService getGoogleAPIService(){
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
