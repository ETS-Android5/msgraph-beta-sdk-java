package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TranslationLanguageOverride implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The language to apply the override.Returned by default. Not nullable. */
    private String _languageTag;
    /** The translation override behavior for the language, if any.Returned by default. Not nullable. */
    private TranslationBehavior _translationBehavior;
    /**
     * Instantiates a new translationLanguageOverride and sets the default values.
     * @return a void
     */
    public TranslationLanguageOverride() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a translationLanguageOverride
     */
    @javax.annotation.Nonnull
    public static TranslationLanguageOverride createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TranslationLanguageOverride();
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
        final TranslationLanguageOverride currentObject = this;
        return new HashMap<>(2) {{
            this.put("languageTag", (n) -> { currentObject.setLanguageTag(n.getStringValue()); });
            this.put("translationBehavior", (n) -> { currentObject.setTranslationBehavior(n.getEnumValue(TranslationBehavior.class)); });
        }};
    }
    /**
     * Gets the languageTag property value. The language to apply the override.Returned by default. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguageTag() {
        return this._languageTag;
    }
    /**
     * Gets the translationBehavior property value. The translation override behavior for the language, if any.Returned by default. Not nullable.
     * @return a translationBehavior
     */
    @javax.annotation.Nullable
    public TranslationBehavior getTranslationBehavior() {
        return this._translationBehavior;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeEnumValue("translationBehavior", this.getTranslationBehavior());
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
     * Sets the languageTag property value. The language to apply the override.Returned by default. Not nullable.
     * @param value Value to set for the languageTag property.
     * @return a void
     */
    public void setLanguageTag(@javax.annotation.Nullable final String value) {
        this._languageTag = value;
    }
    /**
     * Sets the translationBehavior property value. The translation override behavior for the language, if any.Returned by default. Not nullable.
     * @param value Value to set for the translationBehavior property.
     * @return a void
     */
    public void setTranslationBehavior(@javax.annotation.Nullable final TranslationBehavior value) {
        this._translationBehavior = value;
    }
}
