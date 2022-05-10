package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkloadStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The display name for the workload. Required. Read-only. */
    private String _displayName;
    /** The date and time the workload was offboarded. Optional. Read-only. */
    private OffsetDateTime _offboardedDateTime;
    /** The date and time the workload was onboarded. Optional. Read-only. */
    private OffsetDateTime _onboardedDateTime;
    /** The onboarding status for the workload. Possible values are: notOnboarded, onboarded, unknownFutureValue. Optional. Read-only. */
    private WorkloadOnboardingStatus _onboardingStatus;
    /**
     * Instantiates a new workloadStatus and sets the default values.
     * @return a void
     */
    public WorkloadStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadStatus
     */
    @javax.annotation.Nonnull
    public static WorkloadStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadStatus();
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
     * Gets the displayName property value. The display name for the workload. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkloadStatus currentObject = this;
        return new HashMap<>(4) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("offboardedDateTime", (n) -> { currentObject.setOffboardedDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardedDateTime", (n) -> { currentObject.setOnboardedDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardingStatus", (n) -> { currentObject.setOnboardingStatus(n.getEnumValue(WorkloadOnboardingStatus.class)); });
        }};
    }
    /**
     * Gets the offboardedDateTime property value. The date and time the workload was offboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOffboardedDateTime() {
        return this._offboardedDateTime;
    }
    /**
     * Gets the onboardedDateTime property value. The date and time the workload was onboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnboardedDateTime() {
        return this._onboardedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status for the workload. Possible values are: notOnboarded, onboarded, unknownFutureValue. Optional. Read-only.
     * @return a workloadOnboardingStatus
     */
    @javax.annotation.Nullable
    public WorkloadOnboardingStatus getOnboardingStatus() {
        return this._onboardingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("offboardedDateTime", this.getOffboardedDateTime());
        writer.writeOffsetDateTimeValue("onboardedDateTime", this.getOnboardedDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
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
     * Sets the displayName property value. The display name for the workload. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the offboardedDateTime property value. The date and time the workload was offboarded. Optional. Read-only.
     * @param value Value to set for the offboardedDateTime property.
     * @return a void
     */
    public void setOffboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._offboardedDateTime = value;
    }
    /**
     * Sets the onboardedDateTime property value. The date and time the workload was onboarded. Optional. Read-only.
     * @param value Value to set for the onboardedDateTime property.
     * @return a void
     */
    public void setOnboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onboardedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status for the workload. Possible values are: notOnboarded, onboarded, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    public void setOnboardingStatus(@javax.annotation.Nullable final WorkloadOnboardingStatus value) {
        this._onboardingStatus = value;
    }
}
