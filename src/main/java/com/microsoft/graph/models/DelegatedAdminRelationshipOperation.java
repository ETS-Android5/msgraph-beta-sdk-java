package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminRelationshipOperation extends Entity implements Parsable {
    /** The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The data (payload) for the operation. Read-only. */
    private String _data;
    /** The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The type of long-running operation. The possible values are: delegatedAdminAccessAssignmentUpdate, unknownFutureValue. Read-only. */
    private DelegatedAdminRelationshipOperationType _operationType;
    /** The status of the operation. Read-only. The possible values are: notStarted, running, complete, failed, unknownFutureValue. Read-only. Supports $orderBy. */
    private DelegatedAdminRelationshipOperationStatus _status;
    /**
     * Instantiates a new delegatedAdminRelationshipOperation and sets the default values.
     * @return a void
     */
    public DelegatedAdminRelationshipOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminRelationshipOperation
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminRelationshipOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminRelationshipOperation();
    }
    /**
     * Gets the createdDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the data property value. The data (payload) for the operation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getData() {
        return this._data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DelegatedAdminRelationshipOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("data", (n) -> { currentObject.setData(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(DelegatedAdminRelationshipOperationType.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DelegatedAdminRelationshipOperationStatus.class)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the operationType property value. The type of long-running operation. The possible values are: delegatedAdminAccessAssignmentUpdate, unknownFutureValue. Read-only.
     * @return a delegatedAdminRelationshipOperationType
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipOperationType getOperationType() {
        return this._operationType;
    }
    /**
     * Gets the status property value. The status of the operation. Read-only. The possible values are: notStarted, running, complete, failed, unknownFutureValue. Read-only. Supports $orderBy.
     * @return a delegatedAdminRelationshipOperationStatus
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipOperationStatus getStatus() {
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("data", this.getData());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the data property value. The data (payload) for the operation. Read-only.
     * @param value Value to set for the data property.
     * @return a void
     */
    public void setData(@javax.annotation.Nullable final String value) {
        this._data = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the operationType property value. The type of long-running operation. The possible values are: delegatedAdminAccessAssignmentUpdate, unknownFutureValue. Read-only.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    public void setOperationType(@javax.annotation.Nullable final DelegatedAdminRelationshipOperationType value) {
        this._operationType = value;
    }
    /**
     * Sets the status property value. The status of the operation. Read-only. The possible values are: notStarted, running, complete, failed, unknownFutureValue. Read-only. Supports $orderBy.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DelegatedAdminRelationshipOperationStatus value) {
        this._status = value;
    }
}
