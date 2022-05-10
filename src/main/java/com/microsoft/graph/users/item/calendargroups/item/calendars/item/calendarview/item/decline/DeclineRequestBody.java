package microsoft.graph.users.item.calendargroups.item.calendars.item.calendarview.item.decline;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.TimeSlot;
/** Provides operations to call the decline method. */
public class DeclineRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Comment property */
    private String _comment;
    /** The ProposedNewTime property */
    private TimeSlot _proposedNewTime;
    /** The SendResponse property */
    private Boolean _sendResponse;
    /**
     * Instantiates a new declineRequestBody and sets the default values.
     * @return a void
     */
    public DeclineRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a declineRequestBody
     */
    @javax.annotation.Nonnull
    public static DeclineRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeclineRequestBody();
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
     * Gets the comment property value. The Comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeclineRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("proposedNewTime", (n) -> { currentObject.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
            this.put("sendResponse", (n) -> { currentObject.setSendResponse(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the proposedNewTime property value. The ProposedNewTime property
     * @return a timeSlot
     */
    @javax.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this._proposedNewTime;
    }
    /**
     * Gets the sendResponse property value. The SendResponse property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendResponse() {
        return this._sendResponse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeObjectValue("proposedNewTime", this.getProposedNewTime());
        writer.writeBooleanValue("sendResponse", this.getSendResponse());
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
     * Sets the comment property value. The Comment property
     * @param value Value to set for the Comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the proposedNewTime property value. The ProposedNewTime property
     * @param value Value to set for the ProposedNewTime property.
     * @return a void
     */
    public void setProposedNewTime(@javax.annotation.Nullable final TimeSlot value) {
        this._proposedNewTime = value;
    }
    /**
     * Sets the sendResponse property value. The SendResponse property
     * @param value Value to set for the SendResponse property.
     * @return a void
     */
    public void setSendResponse(@javax.annotation.Nullable final Boolean value) {
        this._sendResponse = value;
    }
}
