package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationReport implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Overview of an attack simulation and training campaign. */
    private SimulationReportOverview _overview;
    /** Represents users of a tenant and their online actions in an attack simulation and training campaign. */
    private java.util.List<UserSimulationDetails> _simulationUsers;
    /**
     * Instantiates a new simulationReport and sets the default values.
     * @return a void
     */
    public SimulationReport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationReport
     */
    @javax.annotation.Nonnull
    public static SimulationReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationReport();
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
        final SimulationReport currentObject = this;
        return new HashMap<>(2) {{
            this.put("overview", (n) -> { currentObject.setOverview(n.getObjectValue(SimulationReportOverview::createFromDiscriminatorValue)); });
            this.put("simulationUsers", (n) -> { currentObject.setSimulationUsers(n.getCollectionOfObjectValues(UserSimulationDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the overview property value. Overview of an attack simulation and training campaign.
     * @return a simulationReportOverview
     */
    @javax.annotation.Nullable
    public SimulationReportOverview getOverview() {
        return this._overview;
    }
    /**
     * Gets the simulationUsers property value. Represents users of a tenant and their online actions in an attack simulation and training campaign.
     * @return a userSimulationDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserSimulationDetails> getSimulationUsers() {
        return this._simulationUsers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("overview", this.getOverview());
        writer.writeCollectionOfObjectValues("simulationUsers", this.getSimulationUsers());
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
     * Sets the overview property value. Overview of an attack simulation and training campaign.
     * @param value Value to set for the overview property.
     * @return a void
     */
    public void setOverview(@javax.annotation.Nullable final SimulationReportOverview value) {
        this._overview = value;
    }
    /**
     * Sets the simulationUsers property value. Represents users of a tenant and their online actions in an attack simulation and training campaign.
     * @param value Value to set for the simulationUsers property.
     * @return a void
     */
    public void setSimulationUsers(@javax.annotation.Nullable final java.util.List<UserSimulationDetails> value) {
        this._simulationUsers = value;
    }
}
