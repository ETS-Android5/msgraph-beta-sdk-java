package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationEventsContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign. */
    private Double _compromisedRate;
    /** List of simulation events in an attack simulation and training campaign. */
    private java.util.List<SimulationEvent> _events;
    /**
     * Instantiates a new simulationEventsContent and sets the default values.
     * @return a void
     */
    public SimulationEventsContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationEventsContent
     */
    @javax.annotation.Nonnull
    public static SimulationEventsContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationEventsContent();
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
     * Gets the compromisedRate property value. Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCompromisedRate() {
        return this._compromisedRate;
    }
    /**
     * Gets the events property value. List of simulation events in an attack simulation and training campaign.
     * @return a simulationEvent
     */
    @javax.annotation.Nullable
    public java.util.List<SimulationEvent> getEvents() {
        return this._events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SimulationEventsContent currentObject = this;
        return new HashMap<>(2) {{
            this.put("compromisedRate", (n) -> { currentObject.setCompromisedRate(n.getDoubleValue()); });
            this.put("events", (n) -> { currentObject.setEvents(n.getCollectionOfObjectValues(SimulationEvent::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("compromisedRate", this.getCompromisedRate());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
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
     * Sets the compromisedRate property value. Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
     * @param value Value to set for the compromisedRate property.
     * @return a void
     */
    public void setCompromisedRate(@javax.annotation.Nullable final Double value) {
        this._compromisedRate = value;
    }
    /**
     * Sets the events property value. List of simulation events in an attack simulation and training campaign.
     * @param value Value to set for the events property.
     * @return a void
     */
    public void setEvents(@javax.annotation.Nullable final java.util.List<SimulationEvent> value) {
        this._events = value;
    }
}
