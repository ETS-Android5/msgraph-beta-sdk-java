package microsoft.graph.devicemanagement.grouppolicyconfigurations.item.updatedefinitionvalues;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.GroupPolicyDefinitionValue;
/** Provides operations to call the updateDefinitionValues method. */
public class UpdateDefinitionValuesRequestBody implements AdditionalDataHolder, Parsable {
    /** The added property */
    private java.util.List<GroupPolicyDefinitionValue> _added;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deletedIds property */
    private java.util.List<String> _deletedIds;
    /** The updated property */
    private java.util.List<GroupPolicyDefinitionValue> _updated;
    /**
     * Instantiates a new updateDefinitionValuesRequestBody and sets the default values.
     * @return a void
     */
    public UpdateDefinitionValuesRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateDefinitionValuesRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateDefinitionValuesRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateDefinitionValuesRequestBody();
    }
    /**
     * Gets the added property value. The added property
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getAdded() {
        return this._added;
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
     * Gets the deletedIds property value. The deletedIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeletedIds() {
        return this._deletedIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateDefinitionValuesRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("added", (n) -> { currentObject.setAdded(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
            this.put("deletedIds", (n) -> { currentObject.setDeletedIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("updated", (n) -> { currentObject.setUpdated(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the updated property value. The updated property
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getUpdated() {
        return this._updated;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("added", this.getAdded());
        writer.writeCollectionOfPrimitiveValues("deletedIds", this.getDeletedIds());
        writer.writeCollectionOfObjectValues("updated", this.getUpdated());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the added property value. The added property
     * @param value Value to set for the added property.
     * @return a void
     */
    public void setAdded(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this._added = value;
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
     * Sets the deletedIds property value. The deletedIds property
     * @param value Value to set for the deletedIds property.
     * @return a void
     */
    public void setDeletedIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deletedIds = value;
    }
    /**
     * Sets the updated property value. The updated property
     * @param value Value to set for the updated property.
     * @return a void
     */
    public void setUpdated(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this._updated = value;
    }
}
