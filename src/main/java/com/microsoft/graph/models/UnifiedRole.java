package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRole implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The unified role definition ID of the directory role. Refer to unifiedRoleDefinition resource. */
    private String _roleDefinitionId;
    /**
     * Instantiates a new unifiedRole and sets the default values.
     * @return a void
     */
    public UnifiedRole() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRole
     */
    @javax.annotation.Nonnull
    public static UnifiedRole createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRole();
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
        final UnifiedRole currentObject = this;
        return new HashMap<>(1) {{
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the roleDefinitionId property value. The unified role definition ID of the directory role. Refer to unifiedRoleDefinition resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
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
     * Sets the roleDefinitionId property value. The unified role definition ID of the directory role. Refer to unifiedRoleDefinition resource.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
}
