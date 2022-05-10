package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainRegistrant implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The countryOrRegionCode property */
    private String _countryOrRegionCode;
    /** The organization property */
    private String _organization;
    /** The url property */
    private String _url;
    /** The vendor property */
    private String _vendor;
    /**
     * Instantiates a new domainRegistrant and sets the default values.
     * @return a void
     */
    public DomainRegistrant() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainRegistrant
     */
    @javax.annotation.Nonnull
    public static DomainRegistrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainRegistrant();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the countryOrRegionCode property value. The countryOrRegionCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegionCode() {
        return this._countryOrRegionCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DomainRegistrant currentObject = this;
        return new HashMap<>(4) {{
            this.put("countryOrRegionCode", (n) -> { currentObject.setCountryOrRegionCode(n.getStringValue()); });
            this.put("organization", (n) -> { currentObject.setOrganization(n.getStringValue()); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
            this.put("vendor", (n) -> { currentObject.setVendor(n.getStringValue()); });
        }};
    }
    /**
     * Gets the organization property value. The organization property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganization() {
        return this._organization;
    }
    /**
     * Gets the url property value. The url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Gets the vendor property value. The vendor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendor() {
        return this._vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("countryOrRegionCode", this.getCountryOrRegionCode());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("vendor", this.getVendor());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the countryOrRegionCode property value. The countryOrRegionCode property
     * @param value Value to set for the countryOrRegionCode property.
     * @return a void
     */
    public void setCountryOrRegionCode(@javax.annotation.Nullable final String value) {
        this._countryOrRegionCode = value;
    }
    /**
     * Sets the organization property value. The organization property
     * @param value Value to set for the organization property.
     * @return a void
     */
    public void setOrganization(@javax.annotation.Nullable final String value) {
        this._organization = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     * @return a void
     */
    public void setVendor(@javax.annotation.Nullable final String value) {
        this._vendor = value;
    }
}
