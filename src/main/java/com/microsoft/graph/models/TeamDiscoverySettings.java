package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamDiscoverySettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If set to true, the team is visible via search and suggestions from the Teams client. */
    private Boolean _showInTeamsSearchAndSuggestions;
    /**
     * Instantiates a new teamDiscoverySettings and sets the default values.
     * @return a void
     */
    public TeamDiscoverySettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamDiscoverySettings
     */
    @javax.annotation.Nonnull
    public static TeamDiscoverySettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamDiscoverySettings();
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
        final TeamDiscoverySettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("showInTeamsSearchAndSuggestions", (n) -> { currentObject.setShowInTeamsSearchAndSuggestions(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the showInTeamsSearchAndSuggestions property value. If set to true, the team is visible via search and suggestions from the Teams client.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInTeamsSearchAndSuggestions() {
        return this._showInTeamsSearchAndSuggestions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("showInTeamsSearchAndSuggestions", this.getShowInTeamsSearchAndSuggestions());
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
     * Sets the showInTeamsSearchAndSuggestions property value. If set to true, the team is visible via search and suggestions from the Teams client.
     * @param value Value to set for the showInTeamsSearchAndSuggestions property.
     * @return a void
     */
    public void setShowInTeamsSearchAndSuggestions(@javax.annotation.Nullable final Boolean value) {
        this._showInTeamsSearchAndSuggestions = value;
    }
}
