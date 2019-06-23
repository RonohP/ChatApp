package com.example.chatapp.fragments;

import com.example.chatapp.notifications.MyResponse;
import com.example.chatapp.notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIService {
    @Header(
            {
                    "Content-Type: application/json",
                    "Authorization: key = AAAAoVJlz3U:APA91bF3LCjXiCwYl7RB09NmyskPhSgYeyskJptOT-MPtjsWhluU878-_MZlDuqZ6GSF2g0nJKqhHOdeNoLlwzZH8qL_xUe-esTK7FVVCilPjYmsGuTfg7G-wva0YSzvaF7ZFQ7yxC5S"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
