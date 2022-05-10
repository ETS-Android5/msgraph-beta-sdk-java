package microsoft.graph.users.item.joinedgroups.item.drives.item.items.item.permissions.item.revokegrants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DriveRecipient;
/** Provides operations to call the revokeGrants method. */
public class RevokeGrantsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The grantees property */
    private java.util.List<DriveRecipient> _grantees;
    /**
     * Instantiates a new revokeGrantsRequestBody and sets the default values.
     * @return a void
     */
    public RevokeGrantsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a revokeGrantsRequestBody
     */
    @javax.annotation.Nonnull
    public static RevokeGrantsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RevokeGrantsRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RevokeGrantsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("grantees", (n) -> { currentObject.setGrantees(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the grantees property value. The grantees property
     * @return a driveRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<DriveRecipient> getGrantees() {
        return this._grantees;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("grantees", this.getGrantees());
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
     * Sets the grantees property value. The grantees property
     * @param value Value to set for the grantees property.
     * @return a void
     */
    public void setGrantees(@javax.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this._grantees = value;
    }
}
