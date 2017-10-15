package com.oreilly;

import com.google.gson.Gson;
import com.oreilly.json.Result;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BoxscoreRetriever implements Function<List<String>, List<Result>> {
    private static final String BASE = "http://gd2.mlb.com/components/game/mlb/";

    private OkHttpClient client = new OkHttpClient();
    private Gson gson = new Gson();

    @SuppressWarnings("ConstantConditions")
    public Optional<Result> gamePattern2Result(String pattern) {
        String[] parts = pattern.split("_");
        String dateUrl = String.format("year_%s/month_%s/day_%s/",
                parts[1], parts[2], parts[3]);
        String boxscoreUrl = BASE + dateUrl + pattern + "boxscore.json";

        Request request = new Request.Builder()
                .url(boxscoreUrl)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                System.out.println("Boxscore not found for " + boxscoreUrl);
                return Optional.empty();
            }

            return Optional.ofNullable(
                    gson.fromJson(response.body().charStream(), Result.class));
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Result> apply(List<String> strings) {
        return strings.parallelStream()
                .map(this::gamePattern2Result)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
