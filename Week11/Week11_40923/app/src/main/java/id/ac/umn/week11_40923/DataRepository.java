package id.ac.umn.week11_40923;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class DataRepository {
    static String placeholderUrl = "https://jsonplaceholder.typicode.com";

    public interface PostServices {
        @GET("posts")
        Call<List<PostModel>> getPosts();
    }

    static final PostServices create() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(placeholderUrl)
                .build();

        return retrofit.create(PostServices.class);
    }
}
