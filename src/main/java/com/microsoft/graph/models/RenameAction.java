package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RenameAction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The new name of the item. */
    private String _newName;
    /** The previous name of the item. */
    private String _oldName;
    /**
     * Instantiates a new renameAction and sets the default values.
     * @return a void
     */
    public RenameAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a renameAction
     */
    @javax.annotation.Nonnull
    public static RenameAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RenameAction();
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
        final RenameAction currentObject = this;
        return new HashMap<>(2) {{
            this.put("newName", (n) -> { currentObject.setNewName(n.getStringValue()); });
            this.put("oldName", (n) -> { currentObject.setOldName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the newName property value. The new name of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewName() {
        return this._newName;
    }
    /**
     * Gets the oldName property value. The previous name of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldName() {
        return this._oldName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("newName", this.getNewName());
        writer.writeStringValue("oldName", this.getOldName());
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
     * Sets the newName property value. The new name of the item.
     * @param value Value to set for the newName property.
     * @return a void
     */
    public void setNewName(@javax.annotation.Nullable final String value) {
        this._newName = value;
    }
    /**
     * Sets the oldName property value. The previous name of the item.
     * @param value Value to set for the oldName property.
     * @return a void
     */
    public void setOldName(@javax.annotation.Nullable final String value) {
        this._oldName = value;
    }
}
