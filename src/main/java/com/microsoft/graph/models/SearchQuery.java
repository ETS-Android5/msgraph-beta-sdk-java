package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchQuery implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The query_string property */
    private SearchQueryString _query_string;
    /** The search query containing the search terms. Required. */
    private String _queryString;
    /** Provides a way to decorate the query string. Supports both KQL and query variables. Optional. */
    private String _queryTemplate;
    /**
     * Instantiates a new searchQuery and sets the default values.
     * @return a void
     */
    public SearchQuery() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchQuery
     */
    @javax.annotation.Nonnull
    public static SearchQuery createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchQuery();
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
        final SearchQuery currentObject = this;
        return new HashMap<>(3) {{
            this.put("query_string", (n) -> { currentObject.setQuery_string(n.getObjectValue(SearchQueryString::createFromDiscriminatorValue)); });
            this.put("queryString", (n) -> { currentObject.setQueryString(n.getStringValue()); });
            this.put("queryTemplate", (n) -> { currentObject.setQueryTemplate(n.getStringValue()); });
        }};
    }
    /**
     * Gets the query_string property value. The query_string property
     * @return a searchQueryString
     */
    @javax.annotation.Nullable
    public SearchQueryString getQuery_string() {
        return this._query_string;
    }
    /**
     * Gets the queryString property value. The search query containing the search terms. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryString() {
        return this._queryString;
    }
    /**
     * Gets the queryTemplate property value. Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryTemplate() {
        return this._queryTemplate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("query_string", this.getQuery_string());
        writer.writeStringValue("queryString", this.getQueryString());
        writer.writeStringValue("queryTemplate", this.getQueryTemplate());
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
     * Sets the query_string property value. The query_string property
     * @param value Value to set for the query_string property.
     * @return a void
     */
    public void setQuery_string(@javax.annotation.Nullable final SearchQueryString value) {
        this._query_string = value;
    }
    /**
     * Sets the queryString property value. The search query containing the search terms. Required.
     * @param value Value to set for the queryString property.
     * @return a void
     */
    public void setQueryString(@javax.annotation.Nullable final String value) {
        this._queryString = value;
    }
    /**
     * Sets the queryTemplate property value. Provides a way to decorate the query string. Supports both KQL and query variables. Optional.
     * @param value Value to set for the queryTemplate property.
     * @return a void
     */
    public void setQueryTemplate(@javax.annotation.Nullable final String value) {
        this._queryTemplate = value;
    }
}
