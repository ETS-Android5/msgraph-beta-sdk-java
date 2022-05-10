package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessDeviceStates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. */
    private java.util.List<String> _excludeStates;
    /** States in the scope of the policy. All is the only allowed value. */
    private java.util.List<String> _includeStates;
    /**
     * Instantiates a new conditionalAccessDeviceStates and sets the default values.
     * @return a void
     */
    public ConditionalAccessDeviceStates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessDeviceStates
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessDeviceStates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessDeviceStates();
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
     * Gets the excludeStates property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeStates() {
        return this._excludeStates;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessDeviceStates currentObject = this;
        return new HashMap<>(2) {{
            this.put("excludeStates", (n) -> { currentObject.setExcludeStates(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeStates", (n) -> { currentObject.setIncludeStates(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the includeStates property value. States in the scope of the policy. All is the only allowed value.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeStates() {
        return this._includeStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeStates", this.getExcludeStates());
        writer.writeCollectionOfPrimitiveValues("includeStates", this.getIncludeStates());
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
     * Sets the excludeStates property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined.
     * @param value Value to set for the excludeStates property.
     * @return a void
     */
    public void setExcludeStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeStates = value;
    }
    /**
     * Sets the includeStates property value. States in the scope of the policy. All is the only allowed value.
     * @param value Value to set for the includeStates property.
     * @return a void
     */
    public void setIncludeStates(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeStates = value;
    }
}
