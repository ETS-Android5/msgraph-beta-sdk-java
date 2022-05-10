package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchDataStore extends ExactMatchDataStoreBase implements Parsable {
    /** The sessions property */
    private java.util.List<ExactMatchSession> _sessions;
    /**
     * Instantiates a new exactMatchDataStore and sets the default values.
     * @return a void
     */
    public ExactMatchDataStore() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchDataStore
     */
    @javax.annotation.Nonnull
    public static ExactMatchDataStore createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchDataStore();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchDataStore currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("sessions", (n) -> { currentObject.setSessions(n.getCollectionOfObjectValues(ExactMatchSession::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the sessions property value. The sessions property
     * @return a exactMatchSession
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchSession> getSessions() {
        return this._sessions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
    }
    /**
     * Sets the sessions property value. The sessions property
     * @param value Value to set for the sessions property.
     * @return a void
     */
    public void setSessions(@javax.annotation.Nullable final java.util.List<ExactMatchSession> value) {
        this._sessions = value;
    }
}
