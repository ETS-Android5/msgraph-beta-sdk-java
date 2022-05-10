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
public class ClassificationInnerError implements AdditionalDataHolder, Parsable {
    /** The activityId property */
    private String _activityId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The clientRequestId property */
    private String _clientRequestId;
    /** The code property */
    private String _code;
    /** The errorDateTime property */
    private OffsetDateTime _errorDateTime;
    /**
     * Instantiates a new classificationInnerError and sets the default values.
     * @return a void
     */
    public ClassificationInnerError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classificationInnerError
     */
    @javax.annotation.Nonnull
    public static ClassificationInnerError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationInnerError();
    }
    /**
     * Gets the activityId property value. The activityId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityId() {
        return this._activityId;
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
     * Gets the clientRequestId property value. The clientRequestId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientRequestId() {
        return this._clientRequestId;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * Gets the errorDateTime property value. The errorDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getErrorDateTime() {
        return this._errorDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassificationInnerError currentObject = this;
        return new HashMap<>(4) {{
            this.put("activityId", (n) -> { currentObject.setActivityId(n.getStringValue()); });
            this.put("clientRequestId", (n) -> { currentObject.setClientRequestId(n.getStringValue()); });
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("errorDateTime", (n) -> { currentObject.setErrorDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityId", this.getActivityId());
        writer.writeStringValue("clientRequestId", this.getClientRequestId());
        writer.writeStringValue("code", this.getCode());
        writer.writeOffsetDateTimeValue("errorDateTime", this.getErrorDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityId property value. The activityId property
     * @param value Value to set for the activityId property.
     * @return a void
     */
    public void setActivityId(@javax.annotation.Nullable final String value) {
        this._activityId = value;
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
     * Sets the clientRequestId property value. The clientRequestId property
     * @param value Value to set for the clientRequestId property.
     * @return a void
     */
    public void setClientRequestId(@javax.annotation.Nullable final String value) {
        this._clientRequestId = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the errorDateTime property value. The errorDateTime property
     * @param value Value to set for the errorDateTime property.
     * @return a void
     */
    public void setErrorDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._errorDateTime = value;
    }
}
