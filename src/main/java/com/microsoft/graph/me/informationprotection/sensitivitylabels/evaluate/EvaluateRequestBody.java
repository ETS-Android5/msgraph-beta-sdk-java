package microsoft.graph.me.informationprotection.sensitivitylabels.evaluate;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.CurrentLabel;
import microsoft.graph.models.DiscoveredSensitiveType;
/** Provides operations to call the evaluate method. */
public class EvaluateRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The currentLabel property */
    private CurrentLabel _currentLabel;
    /** The discoveredSensitiveTypes property */
    private java.util.List<DiscoveredSensitiveType> _discoveredSensitiveTypes;
    /**
     * Instantiates a new evaluateRequestBody and sets the default values.
     * @return a void
     */
    public EvaluateRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluateRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateRequestBody();
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
     * Gets the currentLabel property value. The currentLabel property
     * @return a currentLabel
     */
    @javax.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this._currentLabel;
    }
    /**
     * Gets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @return a discoveredSensitiveType
     */
    @javax.annotation.Nullable
    public java.util.List<DiscoveredSensitiveType> getDiscoveredSensitiveTypes() {
        return this._discoveredSensitiveTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("currentLabel", (n) -> { currentObject.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
            this.put("discoveredSensitiveTypes", (n) -> { currentObject.setDiscoveredSensitiveTypes(n.getCollectionOfObjectValues(DiscoveredSensitiveType::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
        writer.writeCollectionOfObjectValues("discoveredSensitiveTypes", this.getDiscoveredSensitiveTypes());
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
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     * @return a void
     */
    public void setCurrentLabel(@javax.annotation.Nullable final CurrentLabel value) {
        this._currentLabel = value;
    }
    /**
     * Sets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @param value Value to set for the discoveredSensitiveTypes property.
     * @return a void
     */
    public void setDiscoveredSensitiveTypes(@javax.annotation.Nullable final java.util.List<DiscoveredSensitiveType> value) {
        this._discoveredSensitiveTypes = value;
    }
}
