package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilterGroup implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Filter clauses (conditions) of this group. All clauses in a group must be satisfied in order for the filter group to evaluate to true. */
    private java.util.List<FilterClause> _clauses;
    /** Human-readable name of the filter group. */
    private String _name;
    /**
     * Instantiates a new filterGroup and sets the default values.
     * @return a void
     */
    public FilterGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filterGroup
     */
    @javax.annotation.Nonnull
    public static FilterGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilterGroup();
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
     * Gets the clauses property value. Filter clauses (conditions) of this group. All clauses in a group must be satisfied in order for the filter group to evaluate to true.
     * @return a filterClause
     */
    @javax.annotation.Nullable
    public java.util.List<FilterClause> getClauses() {
        return this._clauses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FilterGroup currentObject = this;
        return new HashMap<>(2) {{
            this.put("clauses", (n) -> { currentObject.setClauses(n.getCollectionOfObjectValues(FilterClause::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. Human-readable name of the filter group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("clauses", this.getClauses());
        writer.writeStringValue("name", this.getName());
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
     * Sets the clauses property value. Filter clauses (conditions) of this group. All clauses in a group must be satisfied in order for the filter group to evaluate to true.
     * @param value Value to set for the clauses property.
     * @return a void
     */
    public void setClauses(@javax.annotation.Nullable final java.util.List<FilterClause> value) {
        this._clauses = value;
    }
    /**
     * Sets the name property value. Human-readable name of the filter group.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
}
