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

/**
 * Information about withheld taxes.
 */
@ApiModel(description = "Information about withheld taxes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-08T10:12:04.923+08:00")
public class TaxCollection {
  /**
   * The tax collection model applied to the item.
   */
  @JsonAdapter(ModelEnum.Adapter.class)
  public enum ModelEnum {
    MARKETPLACEFACILITATOR("MarketplaceFacilitator");

    private String value;

    ModelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelEnum fromValue(String text) {
      for (ModelEnum b : ModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Model")
  private ModelEnum model = null;

  /**
   * The party responsible for withholding the taxes and remitting them to the taxing authority.
   */
  @JsonAdapter(ResponsiblePartyEnum.Adapter.class)
  public enum ResponsiblePartyEnum {
    AMAZON_SERVICES_INC_("Amazon Services, Inc.");

    private String value;

    ResponsiblePartyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponsiblePartyEnum fromValue(String text) {
      for (ResponsiblePartyEnum b : ResponsiblePartyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResponsiblePartyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponsiblePartyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponsiblePartyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResponsiblePartyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ResponsibleParty")
  private ResponsiblePartyEnum responsibleParty = null;

  public TaxCollection model(ModelEnum model) {
    this.model = model;
    return this;
  }

   /**
   * The tax collection model applied to the item.
   * @return model
  **/
  @ApiModelProperty(value = "The tax collection model applied to the item.")
  public ModelEnum getModel() {
    return model;
  }

  public void setModel(ModelEnum model) {
    this.model = model;
  }

  public TaxCollection responsibleParty(ResponsiblePartyEnum responsibleParty) {
    this.responsibleParty = responsibleParty;
    return this;
  }

   /**
   * The party responsible for withholding the taxes and remitting them to the taxing authority.
   * @return responsibleParty
  **/
  @ApiModelProperty(value = "The party responsible for withholding the taxes and remitting them to the taxing authority.")
  public ResponsiblePartyEnum getResponsibleParty() {
    return responsibleParty;
  }

  public void setResponsibleParty(ResponsiblePartyEnum responsibleParty) {
    this.responsibleParty = responsibleParty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxCollection taxCollection = (TaxCollection) o;
    return Objects.equals(this.model, taxCollection.model) &&
        Objects.equals(this.responsibleParty, taxCollection.responsibleParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, responsibleParty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxCollection {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    responsibleParty: ").append(toIndentedString(responsibleParty)).append("\n");
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

