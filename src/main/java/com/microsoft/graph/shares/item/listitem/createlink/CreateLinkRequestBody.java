package microsoft.graph.shares.item.listitem.createlink;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DriveRecipient;
/** Provides operations to call the createLink method. */
public class CreateLinkRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expirationDateTime property */
    private OffsetDateTime _expirationDateTime;
    /** The password property */
    private String _password;
    /** The recipients property */
    private java.util.List<DriveRecipient> _recipients;
    /** The retainInheritedPermissions property */
    private Boolean _retainInheritedPermissions;
    /** The scope property */
    private String _scope;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new createLinkRequestBody and sets the default values.
     * @return a void
     */
    public CreateLinkRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createLinkRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateLinkRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateLinkRequestBody();
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
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateLinkRequestBody currentObject = this;
        return new HashMap<>(6) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
            this.put("retainInheritedPermissions", (n) -> { currentObject.setRetainInheritedPermissions(n.getBooleanValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the password property value. The password property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a driveRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this._recipients;
    }
    /**
     * Gets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRetainInheritedPermissions() {
        return this._retainInheritedPermissions;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("password", this.getPassword());
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeBooleanValue("retainInheritedPermissions", this.getRetainInheritedPermissions());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("type", this.getType());
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
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this._recipients = value;
    }
    /**
     * Sets the retainInheritedPermissions property value. The retainInheritedPermissions property
     * @param value Value to set for the retainInheritedPermissions property.
     * @return a void
     */
    public void setRetainInheritedPermissions(@javax.annotation.Nullable final Boolean value) {
        this._retainInheritedPermissions = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
