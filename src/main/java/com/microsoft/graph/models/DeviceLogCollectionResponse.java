package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceLogCollectionResponse extends Entity implements Parsable {
    /** The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18 */
    private Long _errorCode;
    /** The DateTime of the expiration of the logs */
    private OffsetDateTime _expirationDateTimeUTC;
    /** The UPN for who initiated the request */
    private String _initiatedByUserPrincipalName;
    /** The device Id */
    private String _managedDeviceId;
    /** The DateTime the request was received */
    private OffsetDateTime _receivedDateTimeUTC;
    /** The DateTime of the request */
    private OffsetDateTime _requestedDateTimeUTC;
    /** The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _size;
    /** The status of the log collection request */
    private String _status;
    /**
     * Instantiates a new deviceLogCollectionResponse and sets the default values.
     * @return a void
     */
    public DeviceLogCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceLogCollectionResponse
     */
    @javax.annotation.Nonnull
    public static DeviceLogCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLogCollectionResponse();
    }
    /**
     * Gets the errorCode property value. The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getErrorCode() {
        return this._errorCode;
    }
    /**
     * Gets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTimeUTC() {
        return this._expirationDateTimeUTC;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceLogCollectionResponse currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getLongValue()); });
            this.put("expirationDateTimeUTC", (n) -> { currentObject.setExpirationDateTimeUTC(n.getOffsetDateTimeValue()); });
            this.put("initiatedByUserPrincipalName", (n) -> { currentObject.setInitiatedByUserPrincipalName(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("receivedDateTimeUTC", (n) -> { currentObject.setReceivedDateTimeUTC(n.getOffsetDateTimeValue()); });
            this.put("requestedDateTimeUTC", (n) -> { currentObject.setRequestedDateTimeUTC(n.getOffsetDateTimeValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getDoubleValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. The UPN for who initiated the request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this._initiatedByUserPrincipalName;
    }
    /**
     * Gets the managedDeviceId property value. The device Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the receivedDateTimeUTC property value. The DateTime the request was received
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTimeUTC() {
        return this._receivedDateTimeUTC;
    }
    /**
     * Gets the requestedDateTimeUTC property value. The DateTime of the request
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestedDateTimeUTC() {
        return this._requestedDateTimeUTC;
    }
    /**
     * Gets the size property value. The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSize() {
        return this._size;
    }
    /**
     * Gets the status property value. The status of the log collection request
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
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
        writer.writeLongValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("expirationDateTimeUTC", this.getExpirationDateTimeUTC());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("receivedDateTimeUTC", this.getReceivedDateTimeUTC());
        writer.writeOffsetDateTimeValue("requestedDateTimeUTC", this.getRequestedDateTimeUTC());
        writer.writeDoubleValue("size", this.getSize());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the errorCode property value. The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Long value) {
        this._errorCode = value;
    }
    /**
     * Sets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs
     * @param value Value to set for the expirationDateTimeUTC property.
     * @return a void
     */
    public void setExpirationDateTimeUTC(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTimeUTC = value;
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. The UPN for who initiated the request
     * @param value Value to set for the initiatedByUserPrincipalName property.
     * @return a void
     */
    public void setInitiatedByUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._initiatedByUserPrincipalName = value;
    }
    /**
     * Sets the managedDeviceId property value. The device Id
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the receivedDateTimeUTC property value. The DateTime the request was received
     * @param value Value to set for the receivedDateTimeUTC property.
     * @return a void
     */
    public void setReceivedDateTimeUTC(@javax.annotation.Nullable final OffsetDateTime value) {
        this._receivedDateTimeUTC = value;
    }
    /**
     * Sets the requestedDateTimeUTC property value. The DateTime of the request
     * @param value Value to set for the requestedDateTimeUTC property.
     * @return a void
     */
    public void setRequestedDateTimeUTC(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestedDateTimeUTC = value;
    }
    /**
     * Sets the size property value. The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Double value) {
        this._size = value;
    }
    /**
     * Sets the status property value. The status of the log collection request
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
