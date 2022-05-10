package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassificationJobResponse extends JobResponseBase implements Parsable {
    /** The result property */
    private DetectedSensitiveContentWrapper _result;
    /**
     * Instantiates a new classificationJobResponse and sets the default values.
     * @return a void
     */
    public ClassificationJobResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classificationJobResponse
     */
    @javax.annotation.Nonnull
    public static ClassificationJobResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationJobResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassificationJobResponse currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("result", (n) -> { currentObject.setResult(n.getObjectValue(DetectedSensitiveContentWrapper::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the result property value. The result property
     * @return a detectedSensitiveContentWrapper
     */
    @javax.annotation.Nullable
    public DetectedSensitiveContentWrapper getResult() {
        return this._result;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("result", this.getResult());
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     * @return a void
     */
    public void setResult(@javax.annotation.Nullable final DetectedSensitiveContentWrapper value) {
        this._result = value;
    }
}
