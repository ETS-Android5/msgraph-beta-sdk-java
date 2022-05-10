package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EvaluateLabelJobResultGroup implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The automatic property */
    private EvaluateLabelJobResult _automatic;
    /** The recommended property */
    private EvaluateLabelJobResult _recommended;
    /**
     * Instantiates a new evaluateLabelJobResultGroup and sets the default values.
     * @return a void
     */
    public EvaluateLabelJobResultGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateLabelJobResultGroup
     */
    @javax.annotation.Nonnull
    public static EvaluateLabelJobResultGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateLabelJobResultGroup();
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
     * Gets the automatic property value. The automatic property
     * @return a evaluateLabelJobResult
     */
    @javax.annotation.Nullable
    public EvaluateLabelJobResult getAutomatic() {
        return this._automatic;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateLabelJobResultGroup currentObject = this;
        return new HashMap<>(2) {{
            this.put("automatic", (n) -> { currentObject.setAutomatic(n.getObjectValue(EvaluateLabelJobResult::createFromDiscriminatorValue)); });
            this.put("recommended", (n) -> { currentObject.setRecommended(n.getObjectValue(EvaluateLabelJobResult::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the recommended property value. The recommended property
     * @return a evaluateLabelJobResult
     */
    @javax.annotation.Nullable
    public EvaluateLabelJobResult getRecommended() {
        return this._recommended;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("automatic", this.getAutomatic());
        writer.writeObjectValue("recommended", this.getRecommended());
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
     * Sets the automatic property value. The automatic property
     * @param value Value to set for the automatic property.
     * @return a void
     */
    public void setAutomatic(@javax.annotation.Nullable final EvaluateLabelJobResult value) {
        this._automatic = value;
    }
    /**
     * Sets the recommended property value. The recommended property
     * @param value Value to set for the recommended property.
     * @return a void
     */
    public void setRecommended(@javax.annotation.Nullable final EvaluateLabelJobResult value) {
        this._recommended = value;
    }
}
