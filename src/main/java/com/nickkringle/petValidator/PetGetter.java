package com.nickkringle.petValidator;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.*;

public class PetGetter {
    String catApiKey = "";

    public String getPetURL() throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.get("https://api.thecatapi.com/v1/images/search")
                .header("Content-Type", "application/json")
                .header("x-api-key", catApiKey)
                .asJson();

        JSONObject object = request.getBody().getArray().getJSONObject(0);

        return object.getString("url");
    }

    public File copyToFile(InputStream inputStream, String filePath) throws IOException {
        File file = new File(filePath);
        try(OutputStream outputStream = new FileOutputStream(file)) {
            IOUtils.copy(inputStream, outputStream);
        }
        return file;
    }

    public InputStream getPetImage(String url) throws UnirestException {
        HttpResponse<java.io.InputStream> response = Unirest.get(url)
                .header("x-api-key", catApiKey)
                .asBinary();

        return response.getBody();
    }

    public String analyzeImageURL(File file) throws UnirestException {
        String recognitionKey = "";
        String imageAPI = "https://api.cloudmersive.com";

        HttpResponse<JsonNode> response = Unirest.post(imageAPI + "/image/recognize/describe")
                .header("Apikey", recognitionKey)
                .field("imageFile", file).asJson();

        JsonNode jsonNode = response.getBody();

        JSONObject bestOutcome = jsonNode.getObject().getJSONObject("BestOutcome");
        String desc = bestOutcome.getString("Description");
        return desc;
    }


    public String getRandomString() throws UnirestException, IOException {
        String kitty = getPetURL();
        InputStream pic = getPetImage(kitty);
        File file = copyToFile(pic, "./tempFile.jpg");
        return analyzeImageURL(file);
    }
}
