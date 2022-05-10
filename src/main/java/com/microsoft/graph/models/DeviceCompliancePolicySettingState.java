package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Compilance Policy Setting State for a given device. */
public class DeviceCompliancePolicySettingState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Current value of setting on device */
    private String _currentValue;
    /** Error code for the setting */
    private Long _errorCode;
    /** Error description */
    private String _errorDescription;
    /** Name of setting instance that is being reported. */
    private String _instanceDisplayName;
    /** The setting that is being reported */
    private String _setting;
    /** SettingInstanceId */
    private String _settingInstanceId;
    /** Localized/user friendly setting name that is being reported */
    private String _settingName;
    /** Contributing policies */
    private java.util.List<SettingSource> _sources;
    /** The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned. */
    private ComplianceStatus _state;
    /** UserEmail */
    private String _userEmail;
    /** UserId */
    private String _userId;
    /** UserName */
    private String _userName;
    /** UserPrincipalName. */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceCompliancePolicySettingState and sets the default values.
     * @return a void
     */
    public DeviceCompliancePolicySettingState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceCompliancePolicySettingState
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicySettingState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicySettingState();
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
     * Gets the currentValue property value. Current value of setting on device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentValue() {
        return this._currentValue;
    }
    /**
     * Gets the errorCode property value. Error code for the setting
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getErrorCode() {
        return this._errorCode;
    }
    /**
     * Gets the errorDescription property value. Error description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this._errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceCompliancePolicySettingState currentObject = this;
        return new HashMap<>(13) {{
            this.put("currentValue", (n) -> { currentObject.setCurrentValue(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getLongValue()); });
            this.put("errorDescription", (n) -> { currentObject.setErrorDescription(n.getStringValue()); });
            this.put("instanceDisplayName", (n) -> { currentObject.setInstanceDisplayName(n.getStringValue()); });
            this.put("setting", (n) -> { currentObject.setSetting(n.getStringValue()); });
            this.put("settingInstanceId", (n) -> { currentObject.setSettingInstanceId(n.getStringValue()); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
            this.put("sources", (n) -> { currentObject.setSources(n.getCollectionOfObjectValues(SettingSource::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ComplianceStatus.class)); });
            this.put("userEmail", (n) -> { currentObject.setUserEmail(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the instanceDisplayName property value. Name of setting instance that is being reported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstanceDisplayName() {
        return this._instanceDisplayName;
    }
    /**
     * Gets the setting property value. The setting that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetting() {
        return this._setting;
    }
    /**
     * Gets the settingInstanceId property value. SettingInstanceId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingInstanceId() {
        return this._settingInstanceId;
    }
    /**
     * Gets the settingName property value. Localized/user friendly setting name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Gets the sources property value. Contributing policies
     * @return a settingSource
     */
    @javax.annotation.Nullable
    public java.util.List<SettingSource> getSources() {
        return this._sources;
    }
    /**
     * Gets the state property value. The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this._state;
    }
    /**
     * Gets the userEmail property value. UserEmail
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this._userEmail;
    }
    /**
     * Gets the userId property value. UserId
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userName property value. UserName
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currentValue", this.getCurrentValue());
        writer.writeLongValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorDescription", this.getErrorDescription());
        writer.writeStringValue("instanceDisplayName", this.getInstanceDisplayName());
        writer.writeStringValue("setting", this.getSetting());
        writer.writeStringValue("settingInstanceId", this.getSettingInstanceId());
        writer.writeStringValue("settingName", this.getSettingName());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
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
     * Sets the currentValue property value. Current value of setting on device
     * @param value Value to set for the currentValue property.
     * @return a void
     */
    public void setCurrentValue(@javax.annotation.Nullable final String value) {
        this._currentValue = value;
    }
    /**
     * Sets the errorCode property value. Error code for the setting
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Long value) {
        this._errorCode = value;
    }
    /**
     * Sets the errorDescription property value. Error description
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this._errorDescription = value;
    }
    /**
     * Sets the instanceDisplayName property value. Name of setting instance that is being reported.
     * @param value Value to set for the instanceDisplayName property.
     * @return a void
     */
    public void setInstanceDisplayName(@javax.annotation.Nullable final String value) {
        this._instanceDisplayName = value;
    }
    /**
     * Sets the setting property value. The setting that is being reported
     * @param value Value to set for the setting property.
     * @return a void
     */
    public void setSetting(@javax.annotation.Nullable final String value) {
        this._setting = value;
    }
    /**
     * Sets the settingInstanceId property value. SettingInstanceId
     * @param value Value to set for the settingInstanceId property.
     * @return a void
     */
    public void setSettingInstanceId(@javax.annotation.Nullable final String value) {
        this._settingInstanceId = value;
    }
    /**
     * Sets the settingName property value. Localized/user friendly setting name that is being reported
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
    /**
     * Sets the sources property value. Contributing policies
     * @param value Value to set for the sources property.
     * @return a void
     */
    public void setSources(@javax.annotation.Nullable final java.util.List<SettingSource> value) {
        this._sources = value;
    }
    /**
     * Sets the state property value. The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._state = value;
    }
    /**
     * Sets the userEmail property value. UserEmail
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this._userEmail = value;
    }
    /**
     * Sets the userId property value. UserId
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userName property value. UserName
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
