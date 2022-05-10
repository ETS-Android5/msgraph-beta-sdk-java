package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementExchangeOnPremisesPolicy extends Entity implements Parsable {
    /** The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization */
    private java.util.List<DeviceManagementExchangeAccessRule> _accessRules;
    /** The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access */
    private OnPremisesConditionalAccessSettings _conditionalAccessSettings;
    /** Default access state in Exchange. This rule applies globally to the entire Exchange organization. Possible values are: none, allow, block, quarantine. */
    private DeviceManagementExchangeAccessLevel _defaultAccessLevel;
    /** The list of device classes known to Exchange */
    private java.util.List<DeviceManagementExchangeDeviceClass> _knownDeviceClasses;
    /** Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML. */
    private byte[] _notificationContent;
    /**
     * Instantiates a new deviceManagementExchangeOnPremisesPolicy and sets the default values.
     * @return a void
     */
    public DeviceManagementExchangeOnPremisesPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementExchangeOnPremisesPolicy
     */
    @javax.annotation.Nonnull
    public static DeviceManagementExchangeOnPremisesPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeOnPremisesPolicy();
    }
    /**
     * Gets the accessRules property value. The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization
     * @return a deviceManagementExchangeAccessRule
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeAccessRule> getAccessRules() {
        return this._accessRules;
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this._conditionalAccessSettings;
    }
    /**
     * Gets the defaultAccessLevel property value. Default access state in Exchange. This rule applies globally to the entire Exchange organization. Possible values are: none, allow, block, quarantine.
     * @return a deviceManagementExchangeAccessLevel
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessLevel getDefaultAccessLevel() {
        return this._defaultAccessLevel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementExchangeOnPremisesPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessRules", (n) -> { currentObject.setAccessRules(n.getCollectionOfObjectValues(DeviceManagementExchangeAccessRule::createFromDiscriminatorValue)); });
            this.put("conditionalAccessSettings", (n) -> { currentObject.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
            this.put("defaultAccessLevel", (n) -> { currentObject.setDefaultAccessLevel(n.getEnumValue(DeviceManagementExchangeAccessLevel.class)); });
            this.put("knownDeviceClasses", (n) -> { currentObject.setKnownDeviceClasses(n.getCollectionOfObjectValues(DeviceManagementExchangeDeviceClass::createFromDiscriminatorValue)); });
            this.put("notificationContent", (n) -> { currentObject.setNotificationContent(n.getByteArrayValue()); });
        }};
    }
    /**
     * Gets the knownDeviceClasses property value. The list of device classes known to Exchange
     * @return a deviceManagementExchangeDeviceClass
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementExchangeDeviceClass> getKnownDeviceClasses() {
        return this._knownDeviceClasses;
    }
    /**
     * Gets the notificationContent property value. Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getNotificationContent() {
        return this._notificationContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessRules", this.getAccessRules());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeEnumValue("defaultAccessLevel", this.getDefaultAccessLevel());
        writer.writeCollectionOfObjectValues("knownDeviceClasses", this.getKnownDeviceClasses());
        writer.writeByteArrayValue("notificationContent", this.getNotificationContent());
    }
    /**
     * Sets the accessRules property value. The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization
     * @param value Value to set for the accessRules property.
     * @return a void
     */
    public void setAccessRules(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeAccessRule> value) {
        this._accessRules = value;
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     * @return a void
     */
    public void setConditionalAccessSettings(@javax.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this._conditionalAccessSettings = value;
    }
    /**
     * Sets the defaultAccessLevel property value. Default access state in Exchange. This rule applies globally to the entire Exchange organization. Possible values are: none, allow, block, quarantine.
     * @param value Value to set for the defaultAccessLevel property.
     * @return a void
     */
    public void setDefaultAccessLevel(@javax.annotation.Nullable final DeviceManagementExchangeAccessLevel value) {
        this._defaultAccessLevel = value;
    }
    /**
     * Sets the knownDeviceClasses property value. The list of device classes known to Exchange
     * @param value Value to set for the knownDeviceClasses property.
     * @return a void
     */
    public void setKnownDeviceClasses(@javax.annotation.Nullable final java.util.List<DeviceManagementExchangeDeviceClass> value) {
        this._knownDeviceClasses = value;
    }
    /**
     * Sets the notificationContent property value. Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.
     * @param value Value to set for the notificationContent property.
     * @return a void
     */
    public void setNotificationContent(@javax.annotation.Nullable final byte[] value) {
        this._notificationContent = value;
    }
}
