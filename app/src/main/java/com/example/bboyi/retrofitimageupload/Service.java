package com.example.bboyi.retrofitimageupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by adinugroho
 */

interface Service {
    @Multipart
    @POST("uploadfile")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image, @Part("file") RequestBody name);
}
