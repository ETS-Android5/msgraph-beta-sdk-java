package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminAccessAssignment extends Entity implements Parsable {
    /** The accessContainer property */
    private DelegatedAdminAccessContainer _accessContainer;
    /** The accessDetails property */
    private DelegatedAdminAccessDetails _accessDetails;
    /** The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue. */
    private DelegatedAdminAccessAssignmentStatus _status;
    /**
     * Instantiates a new delegatedAdminAccessAssignment and sets the default values.
     * @return a void
     */
    public DelegatedAdminAccessAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminAccessAssignment
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminAccessAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminAccessAssignment();
    }
    /**
     * Gets the accessContainer property value. The accessContainer property
     * @return a delegatedAdminAccessContainer
     */
    @javax.annotation.Nullable
    public DelegatedAdminAccessContainer getAccessContainer() {
        return this._accessContainer;
    }
    /**
     * Gets the accessDetails property value. The accessDetails property
     * @return a delegatedAdminAccessDetails
     */
    @javax.annotation.Nullable
    public DelegatedAdminAccessDetails getAccessDetails() {
        return this._accessDetails;
    }
    /**
     * Gets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DelegatedAdminAccessAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessContainer", (n) -> { currentObject.setAccessContainer(n.getObjectValue(DelegatedAdminAccessContainer::createFromDiscriminatorValue)); });
            this.put("accessDetails", (n) -> { currentObject.setAccessDetails(n.getObjectValue(DelegatedAdminAccessDetails::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DelegatedAdminAccessAssignmentStatus.class)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @return a delegatedAdminAccessAssignmentStatus
     */
    @javax.annotation.Nullable
    public DelegatedAdminAccessAssignmentStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessContainer", this.getAccessContainer());
        writer.writeObjectValue("accessDetails", this.getAccessDetails());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the accessContainer property value. The accessContainer property
     * @param value Value to set for the accessContainer property.
     * @return a void
     */
    public void setAccessContainer(@javax.annotation.Nullable final DelegatedAdminAccessContainer value) {
        this._accessContainer = value;
    }
    /**
     * Sets the accessDetails property value. The accessDetails property
     * @param value Value to set for the accessDetails property.
     * @return a void
     */
    public void setAccessDetails(@javax.annotation.Nullable final DelegatedAdminAccessDetails value) {
        this._accessDetails = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DelegatedAdminAccessAssignmentStatus value) {
        this._status = value;
    }
}
