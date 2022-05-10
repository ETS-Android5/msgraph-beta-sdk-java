package microsoft.graph.admin.windows.updates.deployments.item.audience.updateaudiencebyid;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateAudienceById method. */
public class UpdateAudienceByIdRequestBody implements AdditionalDataHolder, Parsable {
    /** The addExclusions property */
    private java.util.List<String> _addExclusions;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The addMembers property */
    private java.util.List<String> _addMembers;
    /** The memberEntityType property */
    private String _memberEntityType;
    /** The removeExclusions property */
    private java.util.List<String> _removeExclusions;
    /** The removeMembers property */
    private java.util.List<String> _removeMembers;
    /**
     * Instantiates a new updateAudienceByIdRequestBody and sets the default values.
     * @return a void
     */
    public UpdateAudienceByIdRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateAudienceByIdRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateAudienceByIdRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAudienceByIdRequestBody();
    }
    /**
     * Gets the addExclusions property value. The addExclusions property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAddExclusions() {
        return this._addExclusions;
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
     * Gets the addMembers property value. The addMembers property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAddMembers() {
        return this._addMembers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateAudienceByIdRequestBody currentObject = this;
        return new HashMap<>(5) {{
            this.put("addExclusions", (n) -> { currentObject.setAddExclusions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("addMembers", (n) -> { currentObject.setAddMembers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("memberEntityType", (n) -> { currentObject.setMemberEntityType(n.getStringValue()); });
            this.put("removeExclusions", (n) -> { currentObject.setRemoveExclusions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("removeMembers", (n) -> { currentObject.setRemoveMembers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the memberEntityType property value. The memberEntityType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberEntityType() {
        return this._memberEntityType;
    }
    /**
     * Gets the removeExclusions property value. The removeExclusions property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRemoveExclusions() {
        return this._removeExclusions;
    }
    /**
     * Gets the removeMembers property value. The removeMembers property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRemoveMembers() {
        return this._removeMembers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("addExclusions", this.getAddExclusions());
        writer.writeCollectionOfPrimitiveValues("addMembers", this.getAddMembers());
        writer.writeStringValue("memberEntityType", this.getMemberEntityType());
        writer.writeCollectionOfPrimitiveValues("removeExclusions", this.getRemoveExclusions());
        writer.writeCollectionOfPrimitiveValues("removeMembers", this.getRemoveMembers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addExclusions property value. The addExclusions property
     * @param value Value to set for the addExclusions property.
     * @return a void
     */
    public void setAddExclusions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._addExclusions = value;
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
     * Sets the addMembers property value. The addMembers property
     * @param value Value to set for the addMembers property.
     * @return a void
     */
    public void setAddMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._addMembers = value;
    }
    /**
     * Sets the memberEntityType property value. The memberEntityType property
     * @param value Value to set for the memberEntityType property.
     * @return a void
     */
    public void setMemberEntityType(@javax.annotation.Nullable final String value) {
        this._memberEntityType = value;
    }
    /**
     * Sets the removeExclusions property value. The removeExclusions property
     * @param value Value to set for the removeExclusions property.
     * @return a void
     */
    public void setRemoveExclusions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._removeExclusions = value;
    }
    /**
     * Sets the removeMembers property value. The removeMembers property
     * @param value Value to set for the removeMembers property.
     * @return a void
     */
    public void setRemoveMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._removeMembers = value;
    }
}
