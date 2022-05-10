package microsoft.graph.deviceappmanagement.mobileapps.item.updaterelationships;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.MobileAppRelationship;
/** Provides operations to call the updateRelationships method. */
public class UpdateRelationshipsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The relationships property */
    private java.util.List<MobileAppRelationship> _relationships;
    /**
     * Instantiates a new updateRelationshipsRequestBody and sets the default values.
     * @return a void
     */
    public UpdateRelationshipsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRelationshipsRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateRelationshipsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRelationshipsRequestBody();
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
        final UpdateRelationshipsRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("relationships", (n) -> { currentObject.setRelationships(n.getCollectionOfObjectValues(MobileAppRelationship::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the relationships property value. The relationships property
     * @return a mobileAppRelationship
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppRelationship> getRelationships() {
        return this._relationships;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("relationships", this.getRelationships());
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
     * Sets the relationships property value. The relationships property
     * @param value Value to set for the relationships property.
     * @return a void
     */
    public void setRelationships(@javax.annotation.Nullable final java.util.List<MobileAppRelationship> value) {
        this._relationships = value;
    }
}
