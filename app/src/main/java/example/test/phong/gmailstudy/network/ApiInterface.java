package example.test.phong.gmailstudy.network;

import java.util.List;

import example.test.phong.gmailstudy.model.MessageKl;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 7/29/2017.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<MessageKl>> getInbox();

}
