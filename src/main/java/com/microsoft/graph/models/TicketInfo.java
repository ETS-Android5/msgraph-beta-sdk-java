package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TicketInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Ticket number meta data */
    private String _ticketNumber;
    /** Ticket system meta data */
    private String _ticketSystem;
    /**
     * Instantiates a new ticketInfo and sets the default values.
     * @return a void
     */
    public TicketInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ticketInfo
     */
    @javax.annotation.Nonnull
    public static TicketInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TicketInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TicketInfo currentObject = this;
        return new HashMap<>(2) {{
            this.put("ticketNumber", (n) -> { currentObject.setTicketNumber(n.getStringValue()); });
            this.put("ticketSystem", (n) -> { currentObject.setTicketSystem(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ticketNumber property value. Ticket number meta data
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketNumber() {
        return this._ticketNumber;
    }
    /**
     * Gets the ticketSystem property value. Ticket system meta data
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketSystem() {
        return this._ticketSystem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ticketNumber", this.getTicketNumber());
        writer.writeStringValue("ticketSystem", this.getTicketSystem());
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
     * Sets the ticketNumber property value. Ticket number meta data
     * @param value Value to set for the ticketNumber property.
     * @return a void
     */
    public void setTicketNumber(@javax.annotation.Nullable final String value) {
        this._ticketNumber = value;
    }
    /**
     * Sets the ticketSystem property value. Ticket system meta data
     * @param value Value to set for the ticketSystem property.
     * @return a void
     */
    public void setTicketSystem(@javax.annotation.Nullable final String value) {
        this._ticketSystem = value;
    }
}
