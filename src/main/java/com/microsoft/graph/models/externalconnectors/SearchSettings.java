package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Enables the developer to define the appearance of the content and configure conditions that dictate when the template should be displayed. */
    private java.util.List<DisplayTemplate> _searchResultTemplates;
    /**
     * Instantiates a new searchSettings and sets the default values.
     * @return a void
     */
    public SearchSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchSettings
     */
    @javax.annotation.Nonnull
    public static SearchSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchSettings();
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
        final SearchSettings currentObject = this;
        return new HashMap<>(1) {{
            this.put("searchResultTemplates", (n) -> { currentObject.setSearchResultTemplates(n.getCollectionOfObjectValues(DisplayTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the searchResultTemplates property value. Enables the developer to define the appearance of the content and configure conditions that dictate when the template should be displayed.
     * @return a displayTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DisplayTemplate> getSearchResultTemplates() {
        return this._searchResultTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("searchResultTemplates", this.getSearchResultTemplates());
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
     * Sets the searchResultTemplates property value. Enables the developer to define the appearance of the content and configure conditions that dictate when the template should be displayed.
     * @param value Value to set for the searchResultTemplates property.
     * @return a void
     */
    public void setSearchResultTemplates(@javax.annotation.Nullable final java.util.List<DisplayTemplate> value) {
        this._searchResultTemplates = value;
    }
}
