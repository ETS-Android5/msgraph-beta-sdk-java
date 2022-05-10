package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrainingEventsContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of assigned trainings and their information in an attack simulation and training campaign. */
    private java.util.List<AssignedTrainingInfo> _assignedTrainingsInfos;
    /** Number of users who were assigned trainings in an attack simulation and training campaign. */
    private Integer _trainingsAssignedUserCount;
    /**
     * Instantiates a new trainingEventsContent and sets the default values.
     * @return a void
     */
    public TrainingEventsContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trainingEventsContent
     */
    @javax.annotation.Nonnull
    public static TrainingEventsContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingEventsContent();
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
     * Gets the assignedTrainingsInfos property value. List of assigned trainings and their information in an attack simulation and training campaign.
     * @return a assignedTrainingInfo
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedTrainingInfo> getAssignedTrainingsInfos() {
        return this._assignedTrainingsInfos;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TrainingEventsContent currentObject = this;
        return new HashMap<>(2) {{
            this.put("assignedTrainingsInfos", (n) -> { currentObject.setAssignedTrainingsInfos(n.getCollectionOfObjectValues(AssignedTrainingInfo::createFromDiscriminatorValue)); });
            this.put("trainingsAssignedUserCount", (n) -> { currentObject.setTrainingsAssignedUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the trainingsAssignedUserCount property value. Number of users who were assigned trainings in an attack simulation and training campaign.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTrainingsAssignedUserCount() {
        return this._trainingsAssignedUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignedTrainingsInfos", this.getAssignedTrainingsInfos());
        writer.writeIntegerValue("trainingsAssignedUserCount", this.getTrainingsAssignedUserCount());
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
     * Sets the assignedTrainingsInfos property value. List of assigned trainings and their information in an attack simulation and training campaign.
     * @param value Value to set for the assignedTrainingsInfos property.
     * @return a void
     */
    public void setAssignedTrainingsInfos(@javax.annotation.Nullable final java.util.List<AssignedTrainingInfo> value) {
        this._assignedTrainingsInfos = value;
    }
    /**
     * Sets the trainingsAssignedUserCount property value. Number of users who were assigned trainings in an attack simulation and training campaign.
     * @param value Value to set for the trainingsAssignedUserCount property.
     * @return a void
     */
    public void setTrainingsAssignedUserCount(@javax.annotation.Nullable final Integer value) {
        this._trainingsAssignedUserCount = value;
    }
}
