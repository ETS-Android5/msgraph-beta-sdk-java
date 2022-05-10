package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DiscoveredSensitiveType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The classificationAttributes property */
    private java.util.List<ClassificationAttribute> _classificationAttributes;
    /** The confidence property */
    private Integer _confidence;
    /** The count property */
    private Integer _count;
    /** The id property */
    private String _id;
    /**
     * Instantiates a new discoveredSensitiveType and sets the default values.
     * @return a void
     */
    public DiscoveredSensitiveType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a discoveredSensitiveType
     */
    @javax.annotation.Nonnull
    public static DiscoveredSensitiveType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscoveredSensitiveType();
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
     * Gets the classificationAttributes property value. The classificationAttributes property
     * @return a classificationAttribute
     */
    @javax.annotation.Nullable
    public java.util.List<ClassificationAttribute> getClassificationAttributes() {
        return this._classificationAttributes;
    }
    /**
     * Gets the confidence property value. The confidence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidence() {
        return this._confidence;
    }
    /**
     * Gets the count property value. The count property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this._count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DiscoveredSensitiveType currentObject = this;
        return new HashMap<>(4) {{
            this.put("classificationAttributes", (n) -> { currentObject.setClassificationAttributes(n.getCollectionOfObjectValues(ClassificationAttribute::createFromDiscriminatorValue)); });
            this.put("confidence", (n) -> { currentObject.setConfidence(n.getIntegerValue()); });
            this.put("count", (n) -> { currentObject.setCount(n.getIntegerValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classificationAttributes", this.getClassificationAttributes());
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("id", this.getId());
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
     * Sets the classificationAttributes property value. The classificationAttributes property
     * @param value Value to set for the classificationAttributes property.
     * @return a void
     */
    public void setClassificationAttributes(@javax.annotation.Nullable final java.util.List<ClassificationAttribute> value) {
        this._classificationAttributes = value;
    }
    /**
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     * @return a void
     */
    public void setConfidence(@javax.annotation.Nullable final Integer value) {
        this._confidence = value;
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     * @return a void
     */
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this._count = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
}
