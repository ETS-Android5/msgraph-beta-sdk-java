package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActionStat implements AdditionalDataHolder, Parsable {
    /** The number of times the action took place. Read-only. */
    private Integer _actionCount;
    /** The number of distinct actors that performed the action. Read-only. */
    private Integer _actorCount;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /**
     * Instantiates a new itemActionStat and sets the default values.
     * @return a void
     */
    public ItemActionStat() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActionStat
     */
    @javax.annotation.Nonnull
    public static ItemActionStat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActionStat();
    }
    /**
     * Gets the actionCount property value. The number of times the action took place. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActionCount() {
        return this._actionCount;
    }
    /**
     * Gets the actorCount property value. The number of distinct actors that performed the action. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActorCount() {
        return this._actorCount;
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
        final ItemActionStat currentObject = this;
        return new HashMap<>(2) {{
            this.put("actionCount", (n) -> { currentObject.setActionCount(n.getIntegerValue()); });
            this.put("actorCount", (n) -> { currentObject.setActorCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("actionCount", this.getActionCount());
        writer.writeIntegerValue("actorCount", this.getActorCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionCount property value. The number of times the action took place. Read-only.
     * @param value Value to set for the actionCount property.
     * @return a void
     */
    public void setActionCount(@javax.annotation.Nullable final Integer value) {
        this._actionCount = value;
    }
    /**
     * Sets the actorCount property value. The number of distinct actors that performed the action. Read-only.
     * @param value Value to set for the actorCount property.
     * @return a void
     */
    public void setActorCount(@javax.annotation.Nullable final Integer value) {
        this._actorCount = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
}
