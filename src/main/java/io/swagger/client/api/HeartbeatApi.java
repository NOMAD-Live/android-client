package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Heartbeat;
import io.swagger.client.model.APIError;
import io.swagger.client.model.Heartbeats;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class HeartbeatApi {
  String basePath = "http://api.nomadlive.tv/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Heartbeat a Stream
   * Gives a signal to the server to prevent the stream from deletion.\n
   * @param streamId ID of the stream you want to signal.
   * @param p Password protecting the stream.
   * @param password Password protecting the stream.
   * @return Heartbeat
   */
  public Heartbeat  streamStreamIdPost (String streamId, String p, String password) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'streamId' is set
    if (streamId == null) {
       throw new ApiException(400, "Missing the required parameter 'streamId' when calling streamStreamIdPost");
    }
    

    // create path and map variables
    String path = "/stream/{stream_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "stream_id" + "\\}", apiInvoker.escapeString(streamId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    if (p != null)
      queryParams.put("p", ApiInvoker.parameterToString(p));
    if (password != null)
      queryParams.put("password", ApiInvoker.parameterToString(password));
    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Heartbeat) ApiInvoker.deserialize(response, "", Heartbeat.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Clean Streams
   * Destroys all the Streams that did not report in the last 15 seconds.\n
   * @return Heartbeats
   */
  public Heartbeats  streamsCleanGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/streams/clean".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Heartbeats) ApiInvoker.deserialize(response, "", Heartbeats.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
