package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DefaultUserRolePermissions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the default user role can create applications. */
    private Boolean _allowedToCreateApps;
    /** Indicates whether the default user role can create security groups. */
    private Boolean _allowedToCreateSecurityGroups;
    /** Indicates whether the default user role can read other users. */
    private Boolean _allowedToReadOtherUsers;
    /**
     * Instantiates a new defaultUserRolePermissions and sets the default values.
     * @return a void
     */
    public DefaultUserRolePermissions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a defaultUserRolePermissions
     */
    @javax.annotation.Nonnull
    public static DefaultUserRolePermissions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultUserRolePermissions();
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
     * Gets the allowedToCreateApps property value. Indicates whether the default user role can create applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToCreateApps() {
        return this._allowedToCreateApps;
    }
    /**
     * Gets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToCreateSecurityGroups() {
        return this._allowedToCreateSecurityGroups;
    }
    /**
     * Gets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToReadOtherUsers() {
        return this._allowedToReadOtherUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DefaultUserRolePermissions currentObject = this;
        return new HashMap<>(3) {{
            this.put("allowedToCreateApps", (n) -> { currentObject.setAllowedToCreateApps(n.getBooleanValue()); });
            this.put("allowedToCreateSecurityGroups", (n) -> { currentObject.setAllowedToCreateSecurityGroups(n.getBooleanValue()); });
            this.put("allowedToReadOtherUsers", (n) -> { currentObject.setAllowedToReadOtherUsers(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowedToCreateApps", this.getAllowedToCreateApps());
        writer.writeBooleanValue("allowedToCreateSecurityGroups", this.getAllowedToCreateSecurityGroups());
        writer.writeBooleanValue("allowedToReadOtherUsers", this.getAllowedToReadOtherUsers());
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
     * Sets the allowedToCreateApps property value. Indicates whether the default user role can create applications.
     * @param value Value to set for the allowedToCreateApps property.
     * @return a void
     */
    public void setAllowedToCreateApps(@javax.annotation.Nullable final Boolean value) {
        this._allowedToCreateApps = value;
    }
    /**
     * Sets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups.
     * @param value Value to set for the allowedToCreateSecurityGroups property.
     * @return a void
     */
    public void setAllowedToCreateSecurityGroups(@javax.annotation.Nullable final Boolean value) {
        this._allowedToCreateSecurityGroups = value;
    }
    /**
     * Sets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users.
     * @param value Value to set for the allowedToReadOtherUsers property.
     * @return a void
     */
    public void setAllowedToReadOtherUsers(@javax.annotation.Nullable final Boolean value) {
        this._allowedToReadOtherUsers = value;
    }
}
