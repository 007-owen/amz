/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package models.ordersV0;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import models.ordersV0.OpenTimeInterval;

/**
 * The time interval for which the business is open.
 */
@ApiModel(description = "The time interval for which the business is open.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:12:04.923+08:00")
public class OpenInterval {
  @SerializedName("StartTime")
  private OpenTimeInterval startTime = null;

  @SerializedName("EndTime")
  private OpenTimeInterval endTime = null;

  public OpenInterval startTime(OpenTimeInterval startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The time when the business opens.
   * @return startTime
  **/
  @ApiModelProperty(value = "The time when the business opens.")
  public OpenTimeInterval getStartTime() {
    return startTime;
  }

  public void setStartTime(OpenTimeInterval startTime) {
    this.startTime = startTime;
  }

  public OpenInterval endTime(OpenTimeInterval endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The time when the business closes.
   * @return endTime
  **/
  @ApiModelProperty(value = "The time when the business closes.")
  public OpenTimeInterval getEndTime() {
    return endTime;
  }

  public void setEndTime(OpenTimeInterval endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInterval openInterval = (OpenInterval) o;
    return Objects.equals(this.startTime, openInterval.startTime) &&
        Objects.equals(this.endTime, openInterval.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInterval {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

