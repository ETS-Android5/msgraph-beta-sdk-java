package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DetectedSensitiveContent extends DetectedSensitiveContentBase implements Parsable {
    /** The classificationAttributes property */
    private java.util.List<ClassificationAttribute> _classificationAttributes;
    /** The classificationMethod property */
    private ClassificationMethod _classificationMethod;
    /** The matches property */
    private java.util.List<SensitiveContentLocation> _matches;
    /** The scope property */
    private SensitiveTypeScope _scope;
    /** The sensitiveTypeSource property */
    private SensitiveTypeSource _sensitiveTypeSource;
    /**
     * Instantiates a new detectedSensitiveContent and sets the default values.
     * @return a void
     */
    public DetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectedSensitiveContent
     */
    @javax.annotation.Nonnull
    public static DetectedSensitiveContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectedSensitiveContent();
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
     * Gets the classificationMethod property value. The classificationMethod property
     * @return a classificationMethod
     */
    @javax.annotation.Nullable
    public ClassificationMethod getClassificationMethod() {
        return this._classificationMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DetectedSensitiveContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classificationAttributes", (n) -> { currentObject.setClassificationAttributes(n.getCollectionOfObjectValues(ClassificationAttribute::createFromDiscriminatorValue)); });
            this.put("classificationMethod", (n) -> { currentObject.setClassificationMethod(n.getEnumValue(ClassificationMethod.class)); });
            this.put("matches", (n) -> { currentObject.setMatches(n.getCollectionOfObjectValues(SensitiveContentLocation::createFromDiscriminatorValue)); });
            this.put("scope", (n) -> { currentObject.setScope(n.getEnumValue(SensitiveTypeScope.class)); });
            this.put("sensitiveTypeSource", (n) -> { currentObject.setSensitiveTypeSource(n.getEnumValue(SensitiveTypeSource.class)); });
        }};
    }
    /**
     * Gets the matches property value. The matches property
     * @return a sensitiveContentLocation
     */
    @javax.annotation.Nullable
    public java.util.List<SensitiveContentLocation> getMatches() {
        return this._matches;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a sensitiveTypeScope
     */
    @javax.annotation.Nullable
    public SensitiveTypeScope getScope() {
        return this._scope;
    }
    /**
     * Gets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @return a sensitiveTypeSource
     */
    @javax.annotation.Nullable
    public SensitiveTypeSource getSensitiveTypeSource() {
        return this._sensitiveTypeSource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("classificationAttributes", this.getClassificationAttributes());
        writer.writeEnumValue("classificationMethod", this.getClassificationMethod());
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeEnumValue("sensitiveTypeSource", this.getSensitiveTypeSource());
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
     * Sets the classificationMethod property value. The classificationMethod property
     * @param value Value to set for the classificationMethod property.
     * @return a void
     */
    public void setClassificationMethod(@javax.annotation.Nullable final ClassificationMethod value) {
        this._classificationMethod = value;
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     * @return a void
     */
    public void setMatches(@javax.annotation.Nullable final java.util.List<SensitiveContentLocation> value) {
        this._matches = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final SensitiveTypeScope value) {
        this._scope = value;
    }
    /**
     * Sets the sensitiveTypeSource property value. The sensitiveTypeSource property
     * @param value Value to set for the sensitiveTypeSource property.
     * @return a void
     */
    public void setSensitiveTypeSource(@javax.annotation.Nullable final SensitiveTypeSource value) {
        this._sensitiveTypeSource = value;
    }
}
