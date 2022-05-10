package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the browser information of the used for signing-in. */
    private String _browser;
    /** The browserId property */
    private String _browserId;
    /** Refers to the UniqueID of the device used for signing-in. */
    private String _deviceId;
    /** Refers to the name of the device used for signing-in. */
    private String _displayName;
    /** Indicates whether the device is compliant or not. */
    private Boolean _isCompliant;
    /** Indicates if the device is managed or not. */
    private Boolean _isManaged;
    /** Indicates the OS name and version used for signing-in. */
    private String _operatingSystem;
    /** Indicates information on whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined. */
    private String _trustType;
    /**
     * Instantiates a new deviceDetail and sets the default values.
     * @return a void
     */
    public DeviceDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceDetail
     */
    @javax.annotation.Nonnull
    public static DeviceDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceDetail();
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
     * Gets the browser property value. Indicates the browser information of the used for signing-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowser() {
        return this._browser;
    }
    /**
     * Gets the browserId property value. The browserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowserId() {
        return this._browserId;
    }
    /**
     * Gets the deviceId property value. Refers to the UniqueID of the device used for signing-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the displayName property value. Refers to the name of the device used for signing-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceDetail currentObject = this;
        return new HashMap<>(8) {{
            this.put("browser", (n) -> { currentObject.setBrowser(n.getStringValue()); });
            this.put("browserId", (n) -> { currentObject.setBrowserId(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isCompliant", (n) -> { currentObject.setIsCompliant(n.getBooleanValue()); });
            this.put("isManaged", (n) -> { currentObject.setIsManaged(n.getBooleanValue()); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("trustType", (n) -> { currentObject.setTrustType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isCompliant property value. Indicates whether the device is compliant or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliant() {
        return this._isCompliant;
    }
    /**
     * Gets the isManaged property value. Indicates if the device is managed or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManaged() {
        return this._isManaged;
    }
    /**
     * Gets the operatingSystem property value. Indicates the OS name and version used for signing-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the trustType property value. Indicates information on whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrustType() {
        return this._trustType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("browserId", this.getBrowserId());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("trustType", this.getTrustType());
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
     * Sets the browser property value. Indicates the browser information of the used for signing-in.
     * @param value Value to set for the browser property.
     * @return a void
     */
    public void setBrowser(@javax.annotation.Nullable final String value) {
        this._browser = value;
    }
    /**
     * Sets the browserId property value. The browserId property
     * @param value Value to set for the browserId property.
     * @return a void
     */
    public void setBrowserId(@javax.annotation.Nullable final String value) {
        this._browserId = value;
    }
    /**
     * Sets the deviceId property value. Refers to the UniqueID of the device used for signing-in.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the displayName property value. Refers to the name of the device used for signing-in.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isCompliant property value. Indicates whether the device is compliant or not.
     * @param value Value to set for the isCompliant property.
     * @return a void
     */
    public void setIsCompliant(@javax.annotation.Nullable final Boolean value) {
        this._isCompliant = value;
    }
    /**
     * Sets the isManaged property value. Indicates if the device is managed or not.
     * @param value Value to set for the isManaged property.
     * @return a void
     */
    public void setIsManaged(@javax.annotation.Nullable final Boolean value) {
        this._isManaged = value;
    }
    /**
     * Sets the operatingSystem property value. Indicates the OS name and version used for signing-in.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the trustType property value. Indicates information on whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @param value Value to set for the trustType property.
     * @return a void
     */
    public void setTrustType(@javax.annotation.Nullable final String value) {
        this._trustType = value;
    }
}
