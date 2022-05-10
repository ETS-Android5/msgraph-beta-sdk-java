package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAutopilotDeploymentProfile extends Entity implements Parsable {
    /** The list of assigned devices for the profile. */
    private java.util.List<WindowsAutopilotDeviceIdentity> _assignedDevices;
    /** The list of group assignments for the profile. */
    private java.util.List<WindowsAutopilotDeploymentProfileAssignment> _assignments;
    /** Profile creation time */
    private OffsetDateTime _createdDateTime;
    /** Description of the profile */
    private String _description;
    /** The template used to name the AutoPilot Device. This can be a custom text and can also contain either the serial number of the device, or a randomly generated number. The total length of the text generated by the template can be no more than 15 characters. */
    private String _deviceNameTemplate;
    /** The AutoPilot device type that this profile is applicable to. Possible values are: windowsPc, surfaceHub2. */
    private WindowsAutopilotDeviceType _deviceType;
    /** Name of the profile */
    private String _displayName;
    /** Enable Autopilot White Glove for the profile. */
    private Boolean _enableWhiteGlove;
    /** Enrollment status screen setting */
    private WindowsEnrollmentStatusScreenSettings _enrollmentStatusScreenSettings;
    /** HardwareHash Extraction for the profile */
    private Boolean _extractHardwareHash;
    /** Language configured on the device */
    private String _language;
    /** Profile last modified time */
    private OffsetDateTime _lastModifiedDateTime;
    /** AzureAD management app ID used during client device-based enrollment discovery */
    private String _managementServiceAppId;
    /** Out of box experience setting */
    private OutOfBoxExperienceSettings _outOfBoxExperienceSettings;
    /** Scope tags for the profile. */
    private java.util.List<String> _roleScopeTagIds;
    /**
     * Instantiates a new windowsAutopilotDeploymentProfile and sets the default values.
     * @return a void
     */
    public WindowsAutopilotDeploymentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotDeploymentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotDeploymentProfile();
    }
    /**
     * Gets the assignedDevices property value. The list of assigned devices for the profile.
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getAssignedDevices() {
        return this._assignedDevices;
    }
    /**
     * Gets the assignments property value. The list of group assignments for the profile.
     * @return a windowsAutopilotDeploymentProfileAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsAutopilotDeploymentProfileAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. Profile creation time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceNameTemplate property value. The template used to name the AutoPilot Device. This can be a custom text and can also contain either the serial number of the device, or a randomly generated number. The total length of the text generated by the template can be no more than 15 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceNameTemplate() {
        return this._deviceNameTemplate;
    }
    /**
     * Gets the deviceType property value. The AutoPilot device type that this profile is applicable to. Possible values are: windowsPc, surfaceHub2.
     * @return a windowsAutopilotDeviceType
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeviceType getDeviceType() {
        return this._deviceType;
    }
    /**
     * Gets the displayName property value. Name of the profile
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enableWhiteGlove property value. Enable Autopilot White Glove for the profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableWhiteGlove() {
        return this._enableWhiteGlove;
    }
    /**
     * Gets the enrollmentStatusScreenSettings property value. Enrollment status screen setting
     * @return a windowsEnrollmentStatusScreenSettings
     */
    @javax.annotation.Nullable
    public WindowsEnrollmentStatusScreenSettings getEnrollmentStatusScreenSettings() {
        return this._enrollmentStatusScreenSettings;
    }
    /**
     * Gets the extractHardwareHash property value. HardwareHash Extraction for the profile
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExtractHardwareHash() {
        return this._extractHardwareHash;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsAutopilotDeploymentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignedDevices", (n) -> { currentObject.setAssignedDevices(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(WindowsAutopilotDeploymentProfileAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceNameTemplate", (n) -> { currentObject.setDeviceNameTemplate(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(WindowsAutopilotDeviceType.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enableWhiteGlove", (n) -> { currentObject.setEnableWhiteGlove(n.getBooleanValue()); });
            this.put("enrollmentStatusScreenSettings", (n) -> { currentObject.setEnrollmentStatusScreenSettings(n.getObjectValue(WindowsEnrollmentStatusScreenSettings::createFromDiscriminatorValue)); });
            this.put("extractHardwareHash", (n) -> { currentObject.setExtractHardwareHash(n.getBooleanValue()); });
            this.put("language", (n) -> { currentObject.setLanguage(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managementServiceAppId", (n) -> { currentObject.setManagementServiceAppId(n.getStringValue()); });
            this.put("outOfBoxExperienceSettings", (n) -> { currentObject.setOutOfBoxExperienceSettings(n.getObjectValue(OutOfBoxExperienceSettings::createFromDiscriminatorValue)); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the language property value. Language configured on the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this._language;
    }
    /**
     * Gets the lastModifiedDateTime property value. Profile last modified time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the managementServiceAppId property value. AzureAD management app ID used during client device-based enrollment discovery
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementServiceAppId() {
        return this._managementServiceAppId;
    }
    /**
     * Gets the outOfBoxExperienceSettings property value. Out of box experience setting
     * @return a outOfBoxExperienceSettings
     */
    @javax.annotation.Nullable
    public OutOfBoxExperienceSettings getOutOfBoxExperienceSettings() {
        return this._outOfBoxExperienceSettings;
    }
    /**
     * Gets the roleScopeTagIds property value. Scope tags for the profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedDevices", this.getAssignedDevices());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceNameTemplate", this.getDeviceNameTemplate());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enableWhiteGlove", this.getEnableWhiteGlove());
        writer.writeObjectValue("enrollmentStatusScreenSettings", this.getEnrollmentStatusScreenSettings());
        writer.writeBooleanValue("extractHardwareHash", this.getExtractHardwareHash());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("managementServiceAppId", this.getManagementServiceAppId());
        writer.writeObjectValue("outOfBoxExperienceSettings", this.getOutOfBoxExperienceSettings());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the assignedDevices property value. The list of assigned devices for the profile.
     * @param value Value to set for the assignedDevices property.
     * @return a void
     */
    public void setAssignedDevices(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this._assignedDevices = value;
    }
    /**
     * Sets the assignments property value. The list of group assignments for the profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<WindowsAutopilotDeploymentProfileAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Profile creation time
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the profile
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceNameTemplate property value. The template used to name the AutoPilot Device. This can be a custom text and can also contain either the serial number of the device, or a randomly generated number. The total length of the text generated by the template can be no more than 15 characters.
     * @param value Value to set for the deviceNameTemplate property.
     * @return a void
     */
    public void setDeviceNameTemplate(@javax.annotation.Nullable final String value) {
        this._deviceNameTemplate = value;
    }
    /**
     * Sets the deviceType property value. The AutoPilot device type that this profile is applicable to. Possible values are: windowsPc, surfaceHub2.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    public void setDeviceType(@javax.annotation.Nullable final WindowsAutopilotDeviceType value) {
        this._deviceType = value;
    }
    /**
     * Sets the displayName property value. Name of the profile
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enableWhiteGlove property value. Enable Autopilot White Glove for the profile.
     * @param value Value to set for the enableWhiteGlove property.
     * @return a void
     */
    public void setEnableWhiteGlove(@javax.annotation.Nullable final Boolean value) {
        this._enableWhiteGlove = value;
    }
    /**
     * Sets the enrollmentStatusScreenSettings property value. Enrollment status screen setting
     * @param value Value to set for the enrollmentStatusScreenSettings property.
     * @return a void
     */
    public void setEnrollmentStatusScreenSettings(@javax.annotation.Nullable final WindowsEnrollmentStatusScreenSettings value) {
        this._enrollmentStatusScreenSettings = value;
    }
    /**
     * Sets the extractHardwareHash property value. HardwareHash Extraction for the profile
     * @param value Value to set for the extractHardwareHash property.
     * @return a void
     */
    public void setExtractHardwareHash(@javax.annotation.Nullable final Boolean value) {
        this._extractHardwareHash = value;
    }
    /**
     * Sets the language property value. Language configured on the device
     * @param value Value to set for the language property.
     * @return a void
     */
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this._language = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Profile last modified time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the managementServiceAppId property value. AzureAD management app ID used during client device-based enrollment discovery
     * @param value Value to set for the managementServiceAppId property.
     * @return a void
     */
    public void setManagementServiceAppId(@javax.annotation.Nullable final String value) {
        this._managementServiceAppId = value;
    }
    /**
     * Sets the outOfBoxExperienceSettings property value. Out of box experience setting
     * @param value Value to set for the outOfBoxExperienceSettings property.
     * @return a void
     */
    public void setOutOfBoxExperienceSettings(@javax.annotation.Nullable final OutOfBoxExperienceSettings value) {
        this._outOfBoxExperienceSettings = value;
    }
    /**
     * Sets the roleScopeTagIds property value. Scope tags for the profile.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
}
