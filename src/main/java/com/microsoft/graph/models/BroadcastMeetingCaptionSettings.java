package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BroadcastMeetingCaptionSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether caption is enabled for this Teams live event. */
    private Boolean _isCaptionEnabled;
    /** The spoken language. */
    private String _spokenLanguage;
    /** The translation languages (choose up to 6). */
    private java.util.List<String> _translationLanguages;
    /**
     * Instantiates a new broadcastMeetingCaptionSettings and sets the default values.
     * @return a void
     */
    public BroadcastMeetingCaptionSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a broadcastMeetingCaptionSettings
     */
    @javax.annotation.Nonnull
    public static BroadcastMeetingCaptionSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BroadcastMeetingCaptionSettings();
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
        final BroadcastMeetingCaptionSettings currentObject = this;
        return new HashMap<>(3) {{
            this.put("isCaptionEnabled", (n) -> { currentObject.setIsCaptionEnabled(n.getBooleanValue()); });
            this.put("spokenLanguage", (n) -> { currentObject.setSpokenLanguage(n.getStringValue()); });
            this.put("translationLanguages", (n) -> { currentObject.setTranslationLanguages(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the isCaptionEnabled property value. Indicates whether caption is enabled for this Teams live event.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCaptionEnabled() {
        return this._isCaptionEnabled;
    }
    /**
     * Gets the spokenLanguage property value. The spoken language.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSpokenLanguage() {
        return this._spokenLanguage;
    }
    /**
     * Gets the translationLanguages property value. The translation languages (choose up to 6).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTranslationLanguages() {
        return this._translationLanguages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isCaptionEnabled", this.getIsCaptionEnabled());
        writer.writeStringValue("spokenLanguage", this.getSpokenLanguage());
        writer.writeCollectionOfPrimitiveValues("translationLanguages", this.getTranslationLanguages());
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
     * Sets the isCaptionEnabled property value. Indicates whether caption is enabled for this Teams live event.
     * @param value Value to set for the isCaptionEnabled property.
     * @return a void
     */
    public void setIsCaptionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCaptionEnabled = value;
    }
    /**
     * Sets the spokenLanguage property value. The spoken language.
     * @param value Value to set for the spokenLanguage property.
     * @return a void
     */
    public void setSpokenLanguage(@javax.annotation.Nullable final String value) {
        this._spokenLanguage = value;
    }
    /**
     * Sets the translationLanguages property value. The translation languages (choose up to 6).
     * @param value Value to set for the translationLanguages property.
     * @return a void
     */
    public void setTranslationLanguages(@javax.annotation.Nullable final java.util.List<String> value) {
        this._translationLanguages = value;
    }
}
