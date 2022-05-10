package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkMicrophoneConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The defaultMicrophone property */
    private TeamworkPeripheral _defaultMicrophone;
    /** True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed. */
    private Boolean _isMicrophoneOptional;
    /** The microphones property */
    private java.util.List<TeamworkPeripheral> _microphones;
    /**
     * Instantiates a new teamworkMicrophoneConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkMicrophoneConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkMicrophoneConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkMicrophoneConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkMicrophoneConfiguration();
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
     * Gets the defaultMicrophone property value. The defaultMicrophone property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getDefaultMicrophone() {
        return this._defaultMicrophone;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkMicrophoneConfiguration currentObject = this;
        return new HashMap<>(3) {{
            this.put("defaultMicrophone", (n) -> { currentObject.setDefaultMicrophone(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
            this.put("isMicrophoneOptional", (n) -> { currentObject.setIsMicrophoneOptional(n.getBooleanValue()); });
            this.put("microphones", (n) -> { currentObject.setMicrophones(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMicrophoneOptional() {
        return this._isMicrophoneOptional;
    }
    /**
     * Gets the microphones property value. The microphones property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getMicrophones() {
        return this._microphones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultMicrophone", this.getDefaultMicrophone());
        writer.writeBooleanValue("isMicrophoneOptional", this.getIsMicrophoneOptional());
        writer.writeCollectionOfObjectValues("microphones", this.getMicrophones());
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
     * Sets the defaultMicrophone property value. The defaultMicrophone property
     * @param value Value to set for the defaultMicrophone property.
     * @return a void
     */
    public void setDefaultMicrophone(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._defaultMicrophone = value;
    }
    /**
     * Sets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @param value Value to set for the isMicrophoneOptional property.
     * @return a void
     */
    public void setIsMicrophoneOptional(@javax.annotation.Nullable final Boolean value) {
        this._isMicrophoneOptional = value;
    }
    /**
     * Sets the microphones property value. The microphones property
     * @param value Value to set for the microphones property.
     * @return a void
     */
    public void setMicrophones(@javax.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this._microphones = value;
    }
}
