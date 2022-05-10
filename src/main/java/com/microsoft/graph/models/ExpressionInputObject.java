package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExpressionInputObject implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Definition of the test object. */
    private ObjectDefinition _definition;
    /** Property values of the test object. */
    private java.util.List<StringKeyObjectValuePair> _properties;
    /**
     * Instantiates a new expressionInputObject and sets the default values.
     * @return a void
     */
    public ExpressionInputObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a expressionInputObject
     */
    @javax.annotation.Nonnull
    public static ExpressionInputObject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpressionInputObject();
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
     * Gets the definition property value. Definition of the test object.
     * @return a objectDefinition
     */
    @javax.annotation.Nullable
    public ObjectDefinition getDefinition() {
        return this._definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExpressionInputObject currentObject = this;
        return new HashMap<>(2) {{
            this.put("definition", (n) -> { currentObject.setDefinition(n.getObjectValue(ObjectDefinition::createFromDiscriminatorValue)); });
            this.put("properties", (n) -> { currentObject.setProperties(n.getCollectionOfObjectValues(StringKeyObjectValuePair::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the properties property value. Property values of the test object.
     * @return a stringKeyObjectValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyObjectValuePair> getProperties() {
        return this._properties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
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
     * Sets the definition property value. Definition of the test object.
     * @param value Value to set for the definition property.
     * @return a void
     */
    public void setDefinition(@javax.annotation.Nullable final ObjectDefinition value) {
        this._definition = value;
    }
    /**
     * Sets the properties property value. Property values of the test object.
     * @param value Value to set for the properties property.
     * @return a void
     */
    public void setProperties(@javax.annotation.Nullable final java.util.List<StringKeyObjectValuePair> value) {
        this._properties = value;
    }
}
