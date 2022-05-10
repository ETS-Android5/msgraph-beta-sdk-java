package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReferencedObject implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the referenced object. Must match one of the objects in the directory definition. */
    private String _referencedObjectName;
    /** Currently not supported. Name of the property in the referenced object, the value for which is used as the reference. */
    private String _referencedProperty;
    /**
     * Instantiates a new referencedObject and sets the default values.
     * @return a void
     */
    public ReferencedObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a referencedObject
     */
    @javax.annotation.Nonnull
    public static ReferencedObject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReferencedObject();
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
        final ReferencedObject currentObject = this;
        return new HashMap<>(2) {{
            this.put("referencedObjectName", (n) -> { currentObject.setReferencedObjectName(n.getStringValue()); });
            this.put("referencedProperty", (n) -> { currentObject.setReferencedProperty(n.getStringValue()); });
        }};
    }
    /**
     * Gets the referencedObjectName property value. Name of the referenced object. Must match one of the objects in the directory definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferencedObjectName() {
        return this._referencedObjectName;
    }
    /**
     * Gets the referencedProperty property value. Currently not supported. Name of the property in the referenced object, the value for which is used as the reference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferencedProperty() {
        return this._referencedProperty;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("referencedObjectName", this.getReferencedObjectName());
        writer.writeStringValue("referencedProperty", this.getReferencedProperty());
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
     * Sets the referencedObjectName property value. Name of the referenced object. Must match one of the objects in the directory definition.
     * @param value Value to set for the referencedObjectName property.
     * @return a void
     */
    public void setReferencedObjectName(@javax.annotation.Nullable final String value) {
        this._referencedObjectName = value;
    }
    /**
     * Sets the referencedProperty property value. Currently not supported. Name of the property in the referenced object, the value for which is used as the reference.
     * @param value Value to set for the referencedProperty property.
     * @return a void
     */
    public void setReferencedProperty(@javax.annotation.Nullable final String value) {
        this._referencedProperty = value;
    }
}
