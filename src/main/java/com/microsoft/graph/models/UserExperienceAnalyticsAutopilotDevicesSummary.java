package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics summary of Devices not windows autopilot ready. */
public class UserExperienceAnalyticsAutopilotDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The count of intune devices that are not autopilot registerd. */
    private Integer _devicesNotAutopilotRegistered;
    /** The count of intune devices not autopilot profile assigned. */
    private Integer _devicesWithoutAutopilotProfileAssigned;
    /** The count of windows 10 devices that are Intune and Comanaged. */
    private Integer _totalWindows10DevicesWithoutTenantAttached;
    /**
     * Instantiates a new userExperienceAnalyticsAutopilotDevicesSummary and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAutopilotDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAutopilotDevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAutopilotDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAutopilotDevicesSummary();
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
     * Gets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesNotAutopilotRegistered() {
        return this._devicesNotAutopilotRegistered;
    }
    /**
     * Gets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesWithoutAutopilotProfileAssigned() {
        return this._devicesWithoutAutopilotProfileAssigned;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAutopilotDevicesSummary currentObject = this;
        return new HashMap<>(3) {{
            this.put("devicesNotAutopilotRegistered", (n) -> { currentObject.setDevicesNotAutopilotRegistered(n.getIntegerValue()); });
            this.put("devicesWithoutAutopilotProfileAssigned", (n) -> { currentObject.setDevicesWithoutAutopilotProfileAssigned(n.getIntegerValue()); });
            this.put("totalWindows10DevicesWithoutTenantAttached", (n) -> { currentObject.setTotalWindows10DevicesWithoutTenantAttached(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the totalWindows10DevicesWithoutTenantAttached property value. The count of windows 10 devices that are Intune and Comanaged.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalWindows10DevicesWithoutTenantAttached() {
        return this._totalWindows10DevicesWithoutTenantAttached;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("devicesNotAutopilotRegistered", this.getDevicesNotAutopilotRegistered());
        writer.writeIntegerValue("devicesWithoutAutopilotProfileAssigned", this.getDevicesWithoutAutopilotProfileAssigned());
        writer.writeIntegerValue("totalWindows10DevicesWithoutTenantAttached", this.getTotalWindows10DevicesWithoutTenantAttached());
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
     * Sets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd.
     * @param value Value to set for the devicesNotAutopilotRegistered property.
     * @return a void
     */
    public void setDevicesNotAutopilotRegistered(@javax.annotation.Nullable final Integer value) {
        this._devicesNotAutopilotRegistered = value;
    }
    /**
     * Sets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned.
     * @param value Value to set for the devicesWithoutAutopilotProfileAssigned property.
     * @return a void
     */
    public void setDevicesWithoutAutopilotProfileAssigned(@javax.annotation.Nullable final Integer value) {
        this._devicesWithoutAutopilotProfileAssigned = value;
    }
    /**
     * Sets the totalWindows10DevicesWithoutTenantAttached property value. The count of windows 10 devices that are Intune and Comanaged.
     * @param value Value to set for the totalWindows10DevicesWithoutTenantAttached property.
     * @return a void
     */
    public void setTotalWindows10DevicesWithoutTenantAttached(@javax.annotation.Nullable final Integer value) {
        this._totalWindows10DevicesWithoutTenantAttached = value;
    }
}
