package microsoft.graph.officeconfiguration.clientconfigurations.updatepriorities;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updatePriorities method. */
public class UpdatePrioritiesRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The officeConfigurationPolicyIds property */
    private java.util.List<String> _officeConfigurationPolicyIds;
    /** The officeConfigurationPriorities property */
    private java.util.List<Integer> _officeConfigurationPriorities;
    /**
     * Instantiates a new updatePrioritiesRequestBody and sets the default values.
     * @return a void
     */
    public UpdatePrioritiesRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updatePrioritiesRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdatePrioritiesRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePrioritiesRequestBody();
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
        final UpdatePrioritiesRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("officeConfigurationPolicyIds", (n) -> { currentObject.setOfficeConfigurationPolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("officeConfigurationPriorities", (n) -> { currentObject.setOfficeConfigurationPriorities(n.getCollectionOfPrimitiveValues(Integer.class)); });
        }};
    }
    /**
     * Gets the officeConfigurationPolicyIds property value. The officeConfigurationPolicyIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOfficeConfigurationPolicyIds() {
        return this._officeConfigurationPolicyIds;
    }
    /**
     * Gets the officeConfigurationPriorities property value. The officeConfigurationPriorities property
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getOfficeConfigurationPriorities() {
        return this._officeConfigurationPriorities;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("officeConfigurationPolicyIds", this.getOfficeConfigurationPolicyIds());
        writer.writeCollectionOfPrimitiveValues("officeConfigurationPriorities", this.getOfficeConfigurationPriorities());
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
     * Sets the officeConfigurationPolicyIds property value. The officeConfigurationPolicyIds property
     * @param value Value to set for the officeConfigurationPolicyIds property.
     * @return a void
     */
    public void setOfficeConfigurationPolicyIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._officeConfigurationPolicyIds = value;
    }
    /**
     * Sets the officeConfigurationPriorities property value. The officeConfigurationPriorities property
     * @param value Value to set for the officeConfigurationPriorities property.
     * @return a void
     */
    public void setOfficeConfigurationPriorities(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._officeConfigurationPriorities = value;
    }
}
