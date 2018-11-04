/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.  Only one \&quot;target\&quot; type should be set.
 */
@ApiModel(description = "ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.  Only one \"target\" type should be set.")

public class V2beta1ResourceMetricSource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("targetAverageUtilization")
  private Integer targetAverageUtilization = null;

  @SerializedName("targetAverageValue")
  private Quantity targetAverageValue = null;

  public V2beta1ResourceMetricSource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is the name of the resource in question.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V2beta1ResourceMetricSource targetAverageUtilization(Integer targetAverageUtilization) {
    this.targetAverageUtilization = targetAverageUtilization;
    return this;
  }

   /**
   * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
   * @return targetAverageUtilization
  **/
  @ApiModelProperty(value = "targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.")
  public Integer getTargetAverageUtilization() {
    return targetAverageUtilization;
  }

  public void setTargetAverageUtilization(Integer targetAverageUtilization) {
    this.targetAverageUtilization = targetAverageUtilization;
  }

  public V2beta1ResourceMetricSource targetAverageValue(Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }

   /**
   * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \&quot;pods\&quot; metric source type.
   * @return targetAverageValue
  **/
  @ApiModelProperty(value = "targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type.")
  public Quantity getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ResourceMetricSource v2beta1ResourceMetricSource = (V2beta1ResourceMetricSource) o;
    return Objects.equals(this.name, v2beta1ResourceMetricSource.name) &&
        Objects.equals(this.targetAverageUtilization, v2beta1ResourceMetricSource.targetAverageUtilization) &&
        Objects.equals(this.targetAverageValue, v2beta1ResourceMetricSource.targetAverageValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetAverageUtilization, targetAverageValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ResourceMetricSource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetAverageUtilization: ").append(toIndentedString(targetAverageUtilization)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
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

