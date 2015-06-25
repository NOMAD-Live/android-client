package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Heartbeat  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_beat")
  private BigDecimal lastBeat = null;

  
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
   * Last time the broadcaster reported (Date.now()).
   **/
  @ApiModelProperty(value = "Last time the broadcaster reported (Date.now()).")
  public BigDecimal getLastBeat() {
    return lastBeat;
  }
  public void setLastBeat(BigDecimal lastBeat) {
    this.lastBeat = lastBeat;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Heartbeat {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastBeat: ").append(lastBeat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
