package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents a property of the ChromeOS device. */
public class ChromeOSDeviceProperty implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the property */
    private String _name;
    /** Whether this property is updatable */
    private Boolean _updatable;
    /** Value of the property */
    private String _value;
    /** Type of the value */
    private String _valueType;
    /**
     * Instantiates a new chromeOSDeviceProperty and sets the default values.
     * @return a void
     */
    public ChromeOSDeviceProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chromeOSDeviceProperty
     */
    @javax.annotation.Nonnull
    public static ChromeOSDeviceProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChromeOSDeviceProperty();
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
        final ChromeOSDeviceProperty currentObject = this;
        return new HashMap<>(4) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("updatable", (n) -> { currentObject.setUpdatable(n.getBooleanValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. Name of the property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the updatable property value. Whether this property is updatable
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpdatable() {
        return this._updatable;
    }
    /**
     * Gets the value property value. Value of the property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Gets the valueType property value. Type of the value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueType() {
        return this._valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("updatable", this.getUpdatable());
        writer.writeStringValue("value", this.getValue());
        writer.writeStringValue("valueType", this.getValueType());
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
     * Sets the name property value. Name of the property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the updatable property value. Whether this property is updatable
     * @param value Value to set for the updatable property.
     * @return a void
     */
    public void setUpdatable(@javax.annotation.Nullable final Boolean value) {
        this._updatable = value;
    }
    /**
     * Sets the value property value. Value of the property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
    /**
     * Sets the valueType property value. Type of the value
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final String value) {
        this._valueType = value;
    }
}
