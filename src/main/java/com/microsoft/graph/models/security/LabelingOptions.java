package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LabelingOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentMethod property */
    private AssignmentMethod _assignmentMethod;
    /** The downgradeJustification property */
    private DowngradeJustification _downgradeJustification;
    /** The extendedProperties property */
    private java.util.List<KeyValuePair> _extendedProperties;
    /** The labelId property */
    private String _labelId;
    /**
     * Instantiates a new labelingOptions and sets the default values.
     * @return a void
     */
    public LabelingOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a labelingOptions
     */
    @javax.annotation.Nonnull
    public static LabelingOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelingOptions();
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
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a assignmentMethod
     */
    @javax.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this._assignmentMethod;
    }
    /**
     * Gets the downgradeJustification property value. The downgradeJustification property
     * @return a downgradeJustification
     */
    @javax.annotation.Nullable
    public DowngradeJustification getDowngradeJustification() {
        return this._downgradeJustification;
    }
    /**
     * Gets the extendedProperties property value. The extendedProperties property
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExtendedProperties() {
        return this._extendedProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LabelingOptions currentObject = this;
        return new HashMap<>(4) {{
            this.put("assignmentMethod", (n) -> { currentObject.setAssignmentMethod(n.getEnumValue(AssignmentMethod.class)); });
            this.put("downgradeJustification", (n) -> { currentObject.setDowngradeJustification(n.getObjectValue(DowngradeJustification::createFromDiscriminatorValue)); });
            this.put("extendedProperties", (n) -> { currentObject.setExtendedProperties(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("labelId", (n) -> { currentObject.setLabelId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the labelId property value. The labelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabelId() {
        return this._labelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeObjectValue("downgradeJustification", this.getDowngradeJustification());
        writer.writeCollectionOfObjectValues("extendedProperties", this.getExtendedProperties());
        writer.writeStringValue("labelId", this.getLabelId());
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
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    public void setAssignmentMethod(@javax.annotation.Nullable final AssignmentMethod value) {
        this._assignmentMethod = value;
    }
    /**
     * Sets the downgradeJustification property value. The downgradeJustification property
     * @param value Value to set for the downgradeJustification property.
     * @return a void
     */
    public void setDowngradeJustification(@javax.annotation.Nullable final DowngradeJustification value) {
        this._downgradeJustification = value;
    }
    /**
     * Sets the extendedProperties property value. The extendedProperties property
     * @param value Value to set for the extendedProperties property.
     * @return a void
     */
    public void setExtendedProperties(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._extendedProperties = value;
    }
    /**
     * Sets the labelId property value. The labelId property
     * @param value Value to set for the labelId property.
     * @return a void
     */
    public void setLabelId(@javax.annotation.Nullable final String value) {
        this._labelId = value;
    }
}
