package microsoft.graph.devicemanagement.evaluateassignmentfilter;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AssignmentFilterEvaluateRequest;
/** Provides operations to call the evaluateAssignmentFilter method. */
public class EvaluateAssignmentFilterRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The data property */
    private AssignmentFilterEvaluateRequest _data;
    /**
     * Instantiates a new evaluateAssignmentFilterRequestBody and sets the default values.
     * @return a void
     */
    public EvaluateAssignmentFilterRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateAssignmentFilterRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluateAssignmentFilterRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateAssignmentFilterRequestBody();
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
     * Gets the data property value. The data property
     * @return a assignmentFilterEvaluateRequest
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluateRequest getData() {
        return this._data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateAssignmentFilterRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("data", (n) -> { currentObject.setData(n.getObjectValue(AssignmentFilterEvaluateRequest::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("data", this.getData());
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
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     * @return a void
     */
    public void setData(@javax.annotation.Nullable final AssignmentFilterEvaluateRequest value) {
        this._data = value;
    }
}
