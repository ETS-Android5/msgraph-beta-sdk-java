package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Json;
public class DisplayTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The text identifier for the display template; for example, contosoTickets. */
    private String _id;
    /** The layout property */
    private Json _layout;
    /** Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported. */
    private Integer _priority;
    /** Specifies additional rules for selecting this display template based on the item schema. Optional. */
    private java.util.List<PropertyRule> _rules;
    /**
     * Instantiates a new displayTemplate and sets the default values.
     * @return a void
     */
    public DisplayTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a displayTemplate
     */
    @javax.annotation.Nonnull
    public static DisplayTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisplayTemplate();
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
        final DisplayTemplate currentObject = this;
        return new HashMap<>(4) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("layout", (n) -> { currentObject.setLayout(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("rules", (n) -> { currentObject.setRules(n.getCollectionOfObjectValues(PropertyRule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the id property value. The text identifier for the display template; for example, contosoTickets.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the layout property value. The layout property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLayout() {
        return this._layout;
    }
    /**
     * Gets the priority property value. Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the rules property value. Specifies additional rules for selecting this display template based on the item schema. Optional.
     * @return a propertyRule
     */
    @javax.annotation.Nullable
    public java.util.List<PropertyRule> getRules() {
        return this._rules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("layout", this.getLayout());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
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
     * Sets the id property value. The text identifier for the display template; for example, contosoTickets.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     * @return a void
     */
    public void setLayout(@javax.annotation.Nullable final Json value) {
        this._layout = value;
    }
    /**
     * Sets the priority property value. Defines the priority of a display template. A display template with priority 1 is evaluated before a template with priority 4. Gaps in priority values are supported.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the rules property value. Specifies additional rules for selecting this display template based on the item schema. Optional.
     * @param value Value to set for the rules property.
     * @return a void
     */
    public void setRules(@javax.annotation.Nullable final java.util.List<PropertyRule> value) {
        this._rules = value;
    }
}
