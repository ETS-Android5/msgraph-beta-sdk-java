package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Access Rules in Exchange. */
public class DeviceManagementExchangeAccessRule implements AdditionalDataHolder, Parsable {
    /** Access Level for Exchange granted by this rule. Possible values are: none, allow, block, quarantine. */
    private DeviceManagementExchangeAccessLevel _accessLevel;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device Class which will be impacted by this rule. */
    private DeviceManagementExchangeDeviceClass _deviceClass;
    /**
     * Instantiates a new deviceManagementExchangeAccessRule and sets the default values.
     * @return a void
     */
    public DeviceManagementExchangeAccessRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementExchangeAccessRule
     */
    @javax.annotation.Nonnull
    public static DeviceManagementExchangeAccessRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeAccessRule();
    }
    /**
     * Gets the accessLevel property value. Access Level for Exchange granted by this rule. Possible values are: none, allow, block, quarantine.
     * @return a deviceManagementExchangeAccessLevel
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessLevel getAccessLevel() {
        return this._accessLevel;
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
     * Gets the deviceClass property value. Device Class which will be impacted by this rule.
     * @return a deviceManagementExchangeDeviceClass
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeDeviceClass getDeviceClass() {
        return this._deviceClass;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementExchangeAccessRule currentObject = this;
        return new HashMap<>(2) {{
            this.put("accessLevel", (n) -> { currentObject.setAccessLevel(n.getEnumValue(DeviceManagementExchangeAccessLevel.class)); });
            this.put("deviceClass", (n) -> { currentObject.setDeviceClass(n.getObjectValue(DeviceManagementExchangeDeviceClass::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
        writer.writeObjectValue("deviceClass", this.getDeviceClass());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessLevel property value. Access Level for Exchange granted by this rule. Possible values are: none, allow, block, quarantine.
     * @param value Value to set for the accessLevel property.
     * @return a void
     */
    public void setAccessLevel(@javax.annotation.Nullable final DeviceManagementExchangeAccessLevel value) {
        this._accessLevel = value;
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
     * Sets the deviceClass property value. Device Class which will be impacted by this rule.
     * @param value Value to set for the deviceClass property.
     * @return a void
     */
    public void setDeviceClass(@javax.annotation.Nullable final DeviceManagementExchangeDeviceClass value) {
        this._deviceClass = value;
    }
}
