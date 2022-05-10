package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents the filter type and evalaution result of the filter. */
public class AssignmentFilterTypeAndEvaluationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents the filter type. Possible values are: none, include, exclude. */
    private DeviceAndAppManagementAssignmentFilterType _assignmentFilterType;
    /** Represents the evalaution result of the filter. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated. */
    private AssignmentFilterEvaluationResult _evaluationResult;
    /**
     * Instantiates a new assignmentFilterTypeAndEvaluationResult and sets the default values.
     * @return a void
     */
    public AssignmentFilterTypeAndEvaluationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterTypeAndEvaluationResult
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterTypeAndEvaluationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterTypeAndEvaluationResult();
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
     * Gets the assignmentFilterType property value. Represents the filter type. Possible values are: none, include, exclude.
     * @return a deviceAndAppManagementAssignmentFilterType
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getAssignmentFilterType() {
        return this._assignmentFilterType;
    }
    /**
     * Gets the evaluationResult property value. Represents the evalaution result of the filter. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated.
     * @return a assignmentFilterEvaluationResult
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluationResult getEvaluationResult() {
        return this._evaluationResult;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignmentFilterTypeAndEvaluationResult currentObject = this;
        return new HashMap<>(2) {{
            this.put("assignmentFilterType", (n) -> { currentObject.setAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
            this.put("evaluationResult", (n) -> { currentObject.setEvaluationResult(n.getEnumValue(AssignmentFilterEvaluationResult.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentFilterType", this.getAssignmentFilterType());
        writer.writeEnumValue("evaluationResult", this.getEvaluationResult());
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
     * Sets the assignmentFilterType property value. Represents the filter type. Possible values are: none, include, exclude.
     * @param value Value to set for the assignmentFilterType property.
     * @return a void
     */
    public void setAssignmentFilterType(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this._assignmentFilterType = value;
    }
    /**
     * Sets the evaluationResult property value. Represents the evalaution result of the filter. Possible values are: unknown, match, notMatch, inconclusive, failure, notEvaluated.
     * @param value Value to set for the evaluationResult property.
     * @return a void
     */
    public void setEvaluationResult(@javax.annotation.Nullable final AssignmentFilterEvaluationResult value) {
        this._evaluationResult = value;
    }
}
