package io.swagger.client.model;

import io.swagger.client.model.Heartbeat;
import java.util.ArrayList;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Heartbeats extends ArrayList<Heartbeat> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Heartbeats {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
