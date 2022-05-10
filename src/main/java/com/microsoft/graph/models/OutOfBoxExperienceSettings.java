package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Out of box experience setting */
public class OutOfBoxExperienceSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** AAD join authentication type. Possible values are: singleUser, shared. */
    private WindowsDeviceUsageType _deviceUsageType;
    /** If set to true, then the user can't start over with different account, on company sign-in */
    private Boolean _hideEscapeLink;
    /** Show or hide EULA to user */
    private Boolean _hideEULA;
    /** Show or hide privacy settings to user */
    private Boolean _hidePrivacySettings;
    /** If set, then skip the keyboard selection page if Language and Region are set */
    private Boolean _skipKeyboardSelectionPage;
    /** Type of user. Possible values are: administrator, standard. */
    private WindowsUserType _userType;
    /**
     * Instantiates a new outOfBoxExperienceSettings and sets the default values.
     * @return a void
     */
    public OutOfBoxExperienceSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outOfBoxExperienceSettings
     */
    @javax.annotation.Nonnull
    public static OutOfBoxExperienceSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutOfBoxExperienceSettings();
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
     * Gets the deviceUsageType property value. AAD join authentication type. Possible values are: singleUser, shared.
     * @return a windowsDeviceUsageType
     */
    @javax.annotation.Nullable
    public WindowsDeviceUsageType getDeviceUsageType() {
        return this._deviceUsageType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutOfBoxExperienceSettings currentObject = this;
        return new HashMap<>(6) {{
            this.put("deviceUsageType", (n) -> { currentObject.setDeviceUsageType(n.getEnumValue(WindowsDeviceUsageType.class)); });
            this.put("hideEscapeLink", (n) -> { currentObject.setHideEscapeLink(n.getBooleanValue()); });
            this.put("hideEULA", (n) -> { currentObject.setHideEULA(n.getBooleanValue()); });
            this.put("hidePrivacySettings", (n) -> { currentObject.setHidePrivacySettings(n.getBooleanValue()); });
            this.put("skipKeyboardSelectionPage", (n) -> { currentObject.setSkipKeyboardSelectionPage(n.getBooleanValue()); });
            this.put("userType", (n) -> { currentObject.setUserType(n.getEnumValue(WindowsUserType.class)); });
        }};
    }
    /**
     * Gets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideEscapeLink() {
        return this._hideEscapeLink;
    }
    /**
     * Gets the hideEULA property value. Show or hide EULA to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideEULA() {
        return this._hideEULA;
    }
    /**
     * Gets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidePrivacySettings() {
        return this._hidePrivacySettings;
    }
    /**
     * Gets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipKeyboardSelectionPage() {
        return this._skipKeyboardSelectionPage;
    }
    /**
     * Gets the userType property value. Type of user. Possible values are: administrator, standard.
     * @return a windowsUserType
     */
    @javax.annotation.Nullable
    public WindowsUserType getUserType() {
        return this._userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceUsageType", this.getDeviceUsageType());
        writer.writeBooleanValue("hideEscapeLink", this.getHideEscapeLink());
        writer.writeBooleanValue("hideEULA", this.getHideEULA());
        writer.writeBooleanValue("hidePrivacySettings", this.getHidePrivacySettings());
        writer.writeBooleanValue("skipKeyboardSelectionPage", this.getSkipKeyboardSelectionPage());
        writer.writeEnumValue("userType", this.getUserType());
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
     * Sets the deviceUsageType property value. AAD join authentication type. Possible values are: singleUser, shared.
     * @param value Value to set for the deviceUsageType property.
     * @return a void
     */
    public void setDeviceUsageType(@javax.annotation.Nullable final WindowsDeviceUsageType value) {
        this._deviceUsageType = value;
    }
    /**
     * Sets the hideEscapeLink property value. If set to true, then the user can't start over with different account, on company sign-in
     * @param value Value to set for the hideEscapeLink property.
     * @return a void
     */
    public void setHideEscapeLink(@javax.annotation.Nullable final Boolean value) {
        this._hideEscapeLink = value;
    }
    /**
     * Sets the hideEULA property value. Show or hide EULA to user
     * @param value Value to set for the hideEULA property.
     * @return a void
     */
    public void setHideEULA(@javax.annotation.Nullable final Boolean value) {
        this._hideEULA = value;
    }
    /**
     * Sets the hidePrivacySettings property value. Show or hide privacy settings to user
     * @param value Value to set for the hidePrivacySettings property.
     * @return a void
     */
    public void setHidePrivacySettings(@javax.annotation.Nullable final Boolean value) {
        this._hidePrivacySettings = value;
    }
    /**
     * Sets the skipKeyboardSelectionPage property value. If set, then skip the keyboard selection page if Language and Region are set
     * @param value Value to set for the skipKeyboardSelectionPage property.
     * @return a void
     */
    public void setSkipKeyboardSelectionPage(@javax.annotation.Nullable final Boolean value) {
        this._skipKeyboardSelectionPage = value;
    }
    /**
     * Sets the userType property value. Type of user. Possible values are: administrator, standard.
     * @param value Value to set for the userType property.
     * @return a void
     */
    public void setUserType(@javax.annotation.Nullable final WindowsUserType value) {
        this._userType = value;
    }
}
