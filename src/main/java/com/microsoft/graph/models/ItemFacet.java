package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemFacet extends Entity implements Parsable {
    /** The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue. */
    private AllowedAudiences _allowedAudiences;
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** Provides the dateTimeOffset for when the entity was created. */
    private OffsetDateTime _createdDateTime;
    /** Contains inference detail if the entity is inferred by the creating or modifying application. */
    private InferenceData _inference;
    /** The isSearchable property */
    private Boolean _isSearchable;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** Provides the dateTimeOffset for when the entity was created. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Where the values within an entity originated if synced from another service. */
    private PersonDataSources _source;
    /**
     * Instantiates a new itemFacet and sets the default values.
     * @return a void
     */
    public ItemFacet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemFacet
     */
    @javax.annotation.Nonnull
    public static ItemFacet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemFacet();
    }
    /**
     * Gets the allowedAudiences property value. The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue.
     * @return a allowedAudiences
     */
    @javax.annotation.Nullable
    public AllowedAudiences getAllowedAudiences() {
        return this._allowedAudiences;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemFacet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedAudiences", (n) -> { currentObject.setAllowedAudiences(n.getEnumValue(AllowedAudiences.class)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("inference", (n) -> { currentObject.setInference(n.getObjectValue(InferenceData::createFromDiscriminatorValue)); });
            this.put("isSearchable", (n) -> { currentObject.setIsSearchable(n.getBooleanValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("source", (n) -> { currentObject.setSource(n.getObjectValue(PersonDataSources::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @return a inferenceData
     */
    @javax.annotation.Nullable
    public InferenceData getInference() {
        return this._inference;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this._isSearchable;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the source property value. Where the values within an entity originated if synced from another service.
     * @return a personDataSources
     */
    @javax.annotation.Nullable
    public PersonDataSources getSource() {
        return this._source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowedAudiences", this.getAllowedAudiences());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("inference", this.getInference());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("source", this.getSource());
    }
    /**
     * Sets the allowedAudiences property value. The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue.
     * @param value Value to set for the allowedAudiences property.
     * @return a void
     */
    public void setAllowedAudiences(@javax.annotation.Nullable final AllowedAudiences value) {
        this._allowedAudiences = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @param value Value to set for the inference property.
     * @return a void
     */
    public void setInference(@javax.annotation.Nullable final InferenceData value) {
        this._inference = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this._isSearchable = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the source property value. Where the values within an entity originated if synced from another service.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final PersonDataSources value) {
        this._source = value;
    }
}
