package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDisplayScreenConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices. */
    private Integer _backlightBrightness;
    /** Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices. */
    private Period _backlightTimeout;
    /** True if high contrast mode is enabled. Not applicable for Teams Rooms devices. */
    private Boolean _isHighContrastEnabled;
    /** True if screensaver is enabled. Not applicable for Teams Rooms devices. */
    private Boolean _isScreensaverEnabled;
    /** Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices. */
    private Period _screensaverTimeout;
    /**
     * Instantiates a new teamworkDisplayScreenConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkDisplayScreenConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDisplayScreenConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkDisplayScreenConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayScreenConfiguration();
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
     * Gets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBacklightBrightness() {
        return this._backlightBrightness;
    }
    /**
     * Gets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getBacklightTimeout() {
        return this._backlightTimeout;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDisplayScreenConfiguration currentObject = this;
        return new HashMap<>(5) {{
            this.put("backlightBrightness", (n) -> { currentObject.setBacklightBrightness(n.getIntegerValue()); });
            this.put("backlightTimeout", (n) -> { currentObject.setBacklightTimeout(n.getPeriodValue()); });
            this.put("isHighContrastEnabled", (n) -> { currentObject.setIsHighContrastEnabled(n.getBooleanValue()); });
            this.put("isScreensaverEnabled", (n) -> { currentObject.setIsScreensaverEnabled(n.getBooleanValue()); });
            this.put("screensaverTimeout", (n) -> { currentObject.setScreensaverTimeout(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHighContrastEnabled() {
        return this._isHighContrastEnabled;
    }
    /**
     * Gets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScreensaverEnabled() {
        return this._isScreensaverEnabled;
    }
    /**
     * Gets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getScreensaverTimeout() {
        return this._screensaverTimeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("backlightBrightness", this.getBacklightBrightness());
        writer.writePeriodValue("backlightTimeout", this.getBacklightTimeout());
        writer.writeBooleanValue("isHighContrastEnabled", this.getIsHighContrastEnabled());
        writer.writeBooleanValue("isScreensaverEnabled", this.getIsScreensaverEnabled());
        writer.writePeriodValue("screensaverTimeout", this.getScreensaverTimeout());
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
     * Sets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @param value Value to set for the backlightBrightness property.
     * @return a void
     */
    public void setBacklightBrightness(@javax.annotation.Nullable final Integer value) {
        this._backlightBrightness = value;
    }
    /**
     * Sets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @param value Value to set for the backlightTimeout property.
     * @return a void
     */
    public void setBacklightTimeout(@javax.annotation.Nullable final Period value) {
        this._backlightTimeout = value;
    }
    /**
     * Sets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isHighContrastEnabled property.
     * @return a void
     */
    public void setIsHighContrastEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isHighContrastEnabled = value;
    }
    /**
     * Sets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isScreensaverEnabled property.
     * @return a void
     */
    public void setIsScreensaverEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isScreensaverEnabled = value;
    }
    /**
     * Sets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @param value Value to set for the screensaverTimeout property.
     * @return a void
     */
    public void setScreensaverTimeout(@javax.annotation.Nullable final Period value) {
        this._screensaverTimeout = value;
    }
}
