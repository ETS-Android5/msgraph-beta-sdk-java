package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MembershipRuleProcessingStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Detailed error message if dynamic group processing ran into an error.  Optional. Read-only. */
    private String _errorMessage;
    /** Most recent date and time when membership of a dynamic group was updated.  Optional. Read-only. */
    private OffsetDateTime _lastMembershipUpdated;
    /** Current status of a dynamic group processing. Possible values are: NotStarted, Running, Succeeded, Failed, and UnknownFutureValue.  Required. Read-only. */
    private MembershipRuleProcessingStatusDetails _status;
    /**
     * Instantiates a new membershipRuleProcessingStatus and sets the default values.
     * @return a void
     */
    public MembershipRuleProcessingStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a membershipRuleProcessingStatus
     */
    @javax.annotation.Nonnull
    public static MembershipRuleProcessingStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembershipRuleProcessingStatus();
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
     * Gets the errorMessage property value. Detailed error message if dynamic group processing ran into an error.  Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this._errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MembershipRuleProcessingStatus currentObject = this;
        return new HashMap<>(3) {{
            this.put("errorMessage", (n) -> { currentObject.setErrorMessage(n.getStringValue()); });
            this.put("lastMembershipUpdated", (n) -> { currentObject.setLastMembershipUpdated(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(MembershipRuleProcessingStatusDetails.class)); });
        }};
    }
    /**
     * Gets the lastMembershipUpdated property value. Most recent date and time when membership of a dynamic group was updated.  Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastMembershipUpdated() {
        return this._lastMembershipUpdated;
    }
    /**
     * Gets the status property value. Current status of a dynamic group processing. Possible values are: NotStarted, Running, Succeeded, Failed, and UnknownFutureValue.  Required. Read-only.
     * @return a MembershipRuleProcessingStatusDetails
     */
    @javax.annotation.Nullable
    public MembershipRuleProcessingStatusDetails getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeOffsetDateTimeValue("lastMembershipUpdated", this.getLastMembershipUpdated());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the errorMessage property value. Detailed error message if dynamic group processing ran into an error.  Optional. Read-only.
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this._errorMessage = value;
    }
    /**
     * Sets the lastMembershipUpdated property value. Most recent date and time when membership of a dynamic group was updated.  Optional. Read-only.
     * @param value Value to set for the lastMembershipUpdated property.
     * @return a void
     */
    public void setLastMembershipUpdated(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastMembershipUpdated = value;
    }
    /**
     * Sets the status property value. Current status of a dynamic group processing. Possible values are: NotStarted, Running, Succeeded, Failed, and UnknownFutureValue.  Required. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final MembershipRuleProcessingStatusDetails value) {
        this._status = value;
    }
}
