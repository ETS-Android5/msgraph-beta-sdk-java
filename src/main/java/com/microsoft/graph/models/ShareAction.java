package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ShareAction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The identities the item was shared with in this action. */
    private java.util.List<IdentitySet> _recipients;
    /**
     * Instantiates a new shareAction and sets the default values.
     * @return a void
     */
    public ShareAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shareAction
     */
    @javax.annotation.Nonnull
    public static ShareAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShareAction();
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
        final ShareAction currentObject = this;
        return new HashMap<>(1) {{
            this.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the recipients property value. The identities the item was shared with in this action.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public java.util.List<IdentitySet> getRecipients() {
        return this._recipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
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
     * Sets the recipients property value. The identities the item was shared with in this action.
     * @param value Value to set for the recipients property.
     * @return a void
     */
    public void setRecipients(@javax.annotation.Nullable final java.util.List<IdentitySet> value) {
        this._recipients = value;
    }
}
