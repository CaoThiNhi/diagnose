package net.simplifiedlearning.simplifiedcoding.Webservices;

import net.simplifiedlearning.simplifiedcoding.Models.Image;
import net.simplifiedlearning.simplifiedcoding.Models.Report;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * Created by nhict on 20/03/2018.
 */

public interface ApiInterface {
    @POST("/reports.php")
    Call<ResponseBody> uploadFileMultiPart(@Body RequestBody files);

    @GET("/reports.php")
    Call<List<Report>> getReports(
            @Query("user_id") int user_id
    );

    @POST("/reports.php")
    Call<ResponseBody> updateReport(@Body RequestBody report);

    @POST("/reports.php")
    Call<ResponseBody> deleteReport(@Body RequestBody report);

    @GET("/images.php")
    Call<List<Image>> getImages(
            @Query("report_id") int report_id
    );
}