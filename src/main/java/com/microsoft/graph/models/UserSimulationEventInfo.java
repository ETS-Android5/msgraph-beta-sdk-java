package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSimulationEventInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign. */
    private String _browser;
    /** Date and time of the simulation event by a user in an attack simulation and training campaign. */
    private OffsetDateTime _eventDateTime;
    /** Name of the simulation event by a user in an attack simulation and training campaign. */
    private String _eventName;
    /** IP address from where the simulation event was initiated by a user in an attack simulation and training campaign. */
    private String _ipAddress;
    /** The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign. */
    private String _osPlatformDeviceDetails;
    /**
     * Instantiates a new userSimulationEventInfo and sets the default values.
     * @return a void
     */
    public UserSimulationEventInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSimulationEventInfo
     */
    @javax.annotation.Nonnull
    public static UserSimulationEventInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSimulationEventInfo();
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
     * Gets the browser property value. Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowser() {
        return this._browser;
    }
    /**
     * Gets the eventDateTime property value. Date and time of the simulation event by a user in an attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * Gets the eventName property value. Name of the simulation event by a user in an attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this._eventName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSimulationEventInfo currentObject = this;
        return new HashMap<>(5) {{
            this.put("browser", (n) -> { currentObject.setBrowser(n.getStringValue()); });
            this.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("eventName", (n) -> { currentObject.setEventName(n.getStringValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("osPlatformDeviceDetails", (n) -> { currentObject.setOsPlatformDeviceDetails(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ipAddress property value. IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the osPlatformDeviceDetails property value. The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsPlatformDeviceDetails() {
        return this._osPlatformDeviceDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("osPlatformDeviceDetails", this.getOsPlatformDeviceDetails());
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
     * Sets the browser property value. Browser information from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the browser property.
     * @return a void
     */
    public void setBrowser(@javax.annotation.Nullable final String value) {
        this._browser = value;
    }
    /**
     * Sets the eventDateTime property value. Date and time of the simulation event by a user in an attack simulation and training campaign.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the eventName property value. Name of the simulation event by a user in an attack simulation and training campaign.
     * @param value Value to set for the eventName property.
     * @return a void
     */
    public void setEventName(@javax.annotation.Nullable final String value) {
        this._eventName = value;
    }
    /**
     * Sets the ipAddress property value. IP address from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the osPlatformDeviceDetails property value. The operating system, platform, and device details from where the simulation event was initiated by a user in an attack simulation and training campaign.
     * @param value Value to set for the osPlatformDeviceDetails property.
     * @return a void
     */
    public void setOsPlatformDeviceDetails(@javax.annotation.Nullable final String value) {
        this._osPlatformDeviceDetails = value;
    }
}
