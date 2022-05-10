package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContinuousAccessEvaluationSessionControl implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies continuous access evaluation settings. The possible values are: strictEnforcement, disabled, unknownFutureValue. */
    private ContinuousAccessEvaluationMode _mode;
    /**
     * Instantiates a new continuousAccessEvaluationSessionControl and sets the default values.
     * @return a void
     */
    public ContinuousAccessEvaluationSessionControl() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a continuousAccessEvaluationSessionControl
     */
    @javax.annotation.Nonnull
    public static ContinuousAccessEvaluationSessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContinuousAccessEvaluationSessionControl();
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
        final ContinuousAccessEvaluationSessionControl currentObject = this;
        return new HashMap<>(1) {{
            this.put("mode", (n) -> { currentObject.setMode(n.getEnumValue(ContinuousAccessEvaluationMode.class)); });
        }};
    }
    /**
     * Gets the mode property value. Specifies continuous access evaluation settings. The possible values are: strictEnforcement, disabled, unknownFutureValue.
     * @return a continuousAccessEvaluationMode
     */
    @javax.annotation.Nullable
    public ContinuousAccessEvaluationMode getMode() {
        return this._mode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("mode", this.getMode());
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
     * Sets the mode property value. Specifies continuous access evaluation settings. The possible values are: strictEnforcement, disabled, unknownFutureValue.
     * @param value Value to set for the mode property.
     * @return a void
     */
    public void setMode(@javax.annotation.Nullable final ContinuousAccessEvaluationMode value) {
        this._mode = value;
    }
}
