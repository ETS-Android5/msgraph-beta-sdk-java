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
public class SynchronizationQuarantine implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _currentBegan;
    /** Describes the error(s) that occurred when putting the synchronization job into quarantine. */
    private SynchronizationError _error;
    /** Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _nextAttempt;
    /** A code that signifies why the quarantine was imposed. Possible values are: EncounteredBaseEscrowThreshold, EncounteredTotalEscrowThreshold, EncounteredEscrowProportionThreshold, EncounteredQuarantineException, QuarantinedOnDemand, TooManyDeletes, Unknown. */
    private QuarantineReason _reason;
    /** Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _seriesBegan;
    /** Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted). */
    private Long _seriesCount;
    /**
     * Instantiates a new synchronizationQuarantine and sets the default values.
     * @return a void
     */
    public SynchronizationQuarantine() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationQuarantine
     */
    @javax.annotation.Nonnull
    public static SynchronizationQuarantine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationQuarantine();
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
     * Gets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCurrentBegan() {
        return this._currentBegan;
    }
    /**
     * Gets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
     * @return a synchronizationError
     */
    @javax.annotation.Nullable
    public SynchronizationError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SynchronizationQuarantine currentObject = this;
        return new HashMap<>(6) {{
            this.put("currentBegan", (n) -> { currentObject.setCurrentBegan(n.getOffsetDateTimeValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(SynchronizationError::createFromDiscriminatorValue)); });
            this.put("nextAttempt", (n) -> { currentObject.setNextAttempt(n.getOffsetDateTimeValue()); });
            this.put("reason", (n) -> { currentObject.setReason(n.getEnumValue(QuarantineReason.class)); });
            this.put("seriesBegan", (n) -> { currentObject.setSeriesBegan(n.getOffsetDateTimeValue()); });
            this.put("seriesCount", (n) -> { currentObject.setSeriesCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the nextAttempt property value. Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextAttempt() {
        return this._nextAttempt;
    }
    /**
     * Gets the reason property value. A code that signifies why the quarantine was imposed. Possible values are: EncounteredBaseEscrowThreshold, EncounteredTotalEscrowThreshold, EncounteredEscrowProportionThreshold, EncounteredQuarantineException, QuarantinedOnDemand, TooManyDeletes, Unknown.
     * @return a quarantineReason
     */
    @javax.annotation.Nullable
    public QuarantineReason getReason() {
        return this._reason;
    }
    /**
     * Gets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSeriesBegan() {
        return this._seriesBegan;
    }
    /**
     * Gets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSeriesCount() {
        return this._seriesCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("currentBegan", this.getCurrentBegan());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("nextAttempt", this.getNextAttempt());
        writer.writeEnumValue("reason", this.getReason());
        writer.writeOffsetDateTimeValue("seriesBegan", this.getSeriesBegan());
        writer.writeLongValue("seriesCount", this.getSeriesCount());
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
     * Sets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the currentBegan property.
     * @return a void
     */
    public void setCurrentBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this._currentBegan = value;
    }
    /**
     * Sets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final SynchronizationError value) {
        this._error = value;
    }
    /**
     * Sets the nextAttempt property value. Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the nextAttempt property.
     * @return a void
     */
    public void setNextAttempt(@javax.annotation.Nullable final OffsetDateTime value) {
        this._nextAttempt = value;
    }
    /**
     * Sets the reason property value. A code that signifies why the quarantine was imposed. Possible values are: EncounteredBaseEscrowThreshold, EncounteredTotalEscrowThreshold, EncounteredEscrowProportionThreshold, EncounteredQuarantineException, QuarantinedOnDemand, TooManyDeletes, Unknown.
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final QuarantineReason value) {
        this._reason = value;
    }
    /**
     * Sets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the seriesBegan property.
     * @return a void
     */
    public void setSeriesBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this._seriesBegan = value;
    }
    /**
     * Sets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @param value Value to set for the seriesCount property.
     * @return a void
     */
    public void setSeriesCount(@javax.annotation.Nullable final Long value) {
        this._seriesCount = value;
    }
}
