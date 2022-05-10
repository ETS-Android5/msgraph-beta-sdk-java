package microsoft.graph.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.updatedeviceproperties;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateDeviceProperties method. */
public class UpdateDevicePropertiesRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The addressableUserName property */
    private String _addressableUserName;
    /** The deviceAccountPassword property */
    private String _deviceAccountPassword;
    /** The deviceAccountUpn property */
    private String _deviceAccountUpn;
    /** The deviceFriendlyName property */
    private String _deviceFriendlyName;
    /** The displayName property */
    private String _displayName;
    /** The groupTag property */
    private String _groupTag;
    /** The userPrincipalName property */
    private String _userPrincipalName;
    /**
     * Instantiates a new updateDevicePropertiesRequestBody and sets the default values.
     * @return a void
     */
    public UpdateDevicePropertiesRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateDevicePropertiesRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateDevicePropertiesRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDevicePropertiesRequestBody();
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
     * Gets the addressableUserName property value. The addressableUserName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddressableUserName() {
        return this._addressableUserName;
    }
    /**
     * Gets the deviceAccountPassword property value. The deviceAccountPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountPassword() {
        return this._deviceAccountPassword;
    }
    /**
     * Gets the deviceAccountUpn property value. The deviceAccountUpn property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountUpn() {
        return this._deviceAccountUpn;
    }
    /**
     * Gets the deviceFriendlyName property value. The deviceFriendlyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceFriendlyName() {
        return this._deviceFriendlyName;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final UpdateDevicePropertiesRequestBody currentObject = this;
        return new HashMap<>(7) {{
            this.put("addressableUserName", (n) -> { currentObject.setAddressableUserName(n.getStringValue()); });
            this.put("deviceAccountPassword", (n) -> { currentObject.setDeviceAccountPassword(n.getStringValue()); });
            this.put("deviceAccountUpn", (n) -> { currentObject.setDeviceAccountUpn(n.getStringValue()); });
            this.put("deviceFriendlyName", (n) -> { currentObject.setDeviceFriendlyName(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("groupTag", (n) -> { currentObject.setGroupTag(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupTag property value. The groupTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupTag() {
        return this._groupTag;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
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
        writer.writeStringValue("addressableUserName", this.getAddressableUserName());
        writer.writeStringValue("deviceAccountPassword", this.getDeviceAccountPassword());
        writer.writeStringValue("deviceAccountUpn", this.getDeviceAccountUpn());
        writer.writeStringValue("deviceFriendlyName", this.getDeviceFriendlyName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("groupTag", this.getGroupTag());
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
     * Sets the addressableUserName property value. The addressableUserName property
     * @param value Value to set for the addressableUserName property.
     * @return a void
     */
    public void setAddressableUserName(@javax.annotation.Nullable final String value) {
        this._addressableUserName = value;
    }
    /**
     * Sets the deviceAccountPassword property value. The deviceAccountPassword property
     * @param value Value to set for the deviceAccountPassword property.
     * @return a void
     */
    public void setDeviceAccountPassword(@javax.annotation.Nullable final String value) {
        this._deviceAccountPassword = value;
    }
    /**
     * Sets the deviceAccountUpn property value. The deviceAccountUpn property
     * @param value Value to set for the deviceAccountUpn property.
     * @return a void
     */
    public void setDeviceAccountUpn(@javax.annotation.Nullable final String value) {
        this._deviceAccountUpn = value;
    }
    /**
     * Sets the deviceFriendlyName property value. The deviceFriendlyName property
     * @param value Value to set for the deviceFriendlyName property.
     * @return a void
     */
    public void setDeviceFriendlyName(@javax.annotation.Nullable final String value) {
        this._deviceFriendlyName = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the groupTag property value. The groupTag property
     * @param value Value to set for the groupTag property.
     * @return a void
     */
    public void setGroupTag(@javax.annotation.Nullable final String value) {
        this._groupTag = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
