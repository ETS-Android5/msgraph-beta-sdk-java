package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMappingSource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expression property */
    private String _expression;
    /** The name property */
    private String _name;
    /** The parameters property */
    private java.util.List<StringKeyAttributeMappingSourceValuePair> _parameters;
    /** The type property */
    private AttributeMappingSourceType _type;
    /**
     * Instantiates a new attributeMappingSource and sets the default values.
     * @return a void
     */
    public AttributeMappingSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMappingSource
     */
    @javax.annotation.Nonnull
    public static AttributeMappingSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingSource();
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
     * Gets the expression property value. The expression property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExpression() {
        return this._expression;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttributeMappingSource currentObject = this;
        return new HashMap<>(4) {{
            this.put("expression", (n) -> { currentObject.setExpression(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(StringKeyAttributeMappingSourceValuePair::createFromDiscriminatorValue)); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(AttributeMappingSourceType.class)); });
        }};
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parameters property value. The parameters property
     * @return a stringKeyAttributeMappingSourceValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyAttributeMappingSourceValuePair> getParameters() {
        return this._parameters;
    }
    /**
     * Gets the type property value. The type property
     * @return a attributeMappingSourceType
     */
    @javax.annotation.Nullable
    public AttributeMappingSourceType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the expression property value. The expression property
     * @param value Value to set for the expression property.
     * @return a void
     */
    public void setExpression(@javax.annotation.Nullable final String value) {
        this._expression = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parameters property value. The parameters property
     * @param value Value to set for the parameters property.
     * @return a void
     */
    public void setParameters(@javax.annotation.Nullable final java.util.List<StringKeyAttributeMappingSourceValuePair> value) {
        this._parameters = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final AttributeMappingSourceType value) {
        this._type = value;
    }
}
