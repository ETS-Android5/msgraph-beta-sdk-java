package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeClockSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The aprroved location of the timeClock. */
    private GeoCoordinates _approvedLocation;
    /**
     * Instantiates a new timeClockSettings and sets the default values.
     * @return a void
     */
    public TimeClockSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeClockSettings
     */
    @javax.annotation.Nonnull
    public static TimeClockSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeClockSettings();
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
     * Gets the approvedLocation property value. The aprroved location of the timeClock.
     * @return a geoCoordinates
     */
    @javax.annotation.Nullable
    public GeoCoordinates getApprovedLocation() {
        return this._approvedLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeClockSettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("approvedLocation", (n) -> { currentObject.setApprovedLocation(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("approvedLocation", this.getApprovedLocation());
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
     * Sets the approvedLocation property value. The aprroved location of the timeClock.
     * @param value Value to set for the approvedLocation property.
     * @return a void
     */
    public void setApprovedLocation(@javax.annotation.Nullable final GeoCoordinates value) {
        this._approvedLocation = value;
    }
}
