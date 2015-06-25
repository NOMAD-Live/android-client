package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Stream  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("streamName")
  private String streamName = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("expiration")
  private String expiration = null;
  @SerializedName("record")
  private Boolean record = null;
  @SerializedName("assignedAt")
  private String assignedAt = null;

  
  /**
   * Unique identifier representing a specific stream.
   **/
  @ApiModelProperty(value = "Unique identifier representing a specific stream.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Friendly display name of stream.
   **/
  @ApiModelProperty(value = "Friendly display name of stream.")
  public String getStreamName() {
    return streamName;
  }
  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  
  /**
   * the password preventing anyone to broadcast.
   **/
  @ApiModelProperty(value = "the password preventing anyone to broadcast.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * A date with the following format : 2035-06-21T00:00:00.000Z
   **/
  @ApiModelProperty(value = "A date with the following format : 2035-06-21T00:00:00.000Z")
  public String getExpiration() {
    return expiration;
  }
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  
  /**
   * Wether or not to record the stream.
   **/
  @ApiModelProperty(value = "Wether or not to record the stream.")
  public Boolean getRecord() {
    return record;
  }
  public void setRecord(Boolean record) {
    this.record = record;
  }

  
  /**
   * A date with the following format : 2015-06-21T22:09:35.920Z
   **/
  @ApiModelProperty(value = "A date with the following format : 2015-06-21T22:09:35.920Z")
  public String getAssignedAt() {
    return assignedAt;
  }
  public void setAssignedAt(String assignedAt) {
    this.assignedAt = assignedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  streamName: ").append(streamName).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  expiration: ").append(expiration).append("\n");
    sb.append("  record: ").append(record).append("\n");
    sb.append("  assignedAt: ").append(assignedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
