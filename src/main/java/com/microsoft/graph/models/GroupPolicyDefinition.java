package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyDefinition extends Entity implements Parsable {
    /** The group policy category associated with the definition. */
    private GroupPolicyCategory _category;
    /** The localized full category path for the policy. */
    private String _categoryPath;
    /** Identifies the type of groups the policy can be applied to. Possible values are: user, machine. */
    private GroupPolicyDefinitionClassType _classType;
    /** The group policy file associated with the definition. */
    private GroupPolicyDefinitionFile _definitionFile;
    /** The localized policy name. */
    private String _displayName;
    /** The localized explanation or help text associated with the policy. The default value is empty. */
    private String _explainText;
    /** The category id of the parent category */
    private String _groupPolicyCategoryId;
    /** Signifies whether or not there are related definitions to this definition */
    private Boolean _hasRelatedDefinitions;
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Minimum required CSP version for device configuration in this definition */
    private String _minDeviceCspVersion;
    /** Minimum required CSP version for user configuration in this definition */
    private String _minUserCspVersion;
    /** Definition of the next version of this definition */
    private GroupPolicyDefinition _nextVersionDefinition;
    /** Specifies the type of group policy. Possible values are: admxBacked, admxIngested. */
    private GroupPolicyType _policyType;
    /** The group policy presentations associated with the definition. */
    private java.util.List<GroupPolicyPresentation> _presentations;
    /** Definition of the previous version of this definition */
    private GroupPolicyDefinition _previousVersionDefinition;
    /** Localized string used to specify what operating system or application version is affected by the policy. */
    private String _supportedOn;
    /** Setting definition version */
    private String _version;
    /**
     * Instantiates a new groupPolicyDefinition and sets the default values.
     * @return a void
     */
    public GroupPolicyDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nonnull
    public static GroupPolicyDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinition();
    }
    /**
     * Gets the category property value. The group policy category associated with the definition.
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public GroupPolicyCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the categoryPath property value. The localized full category path for the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryPath() {
        return this._categoryPath;
    }
    /**
     * Gets the classType property value. Identifies the type of groups the policy can be applied to. Possible values are: user, machine.
     * @return a groupPolicyDefinitionClassType
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionClassType getClassType() {
        return this._classType;
    }
    /**
     * Gets the definitionFile property value. The group policy file associated with the definition.
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this._definitionFile;
    }
    /**
     * Gets the displayName property value. The localized policy name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExplainText() {
        return this._explainText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
            this.put("categoryPath", (n) -> { currentObject.setCategoryPath(n.getStringValue()); });
            this.put("classType", (n) -> { currentObject.setClassType(n.getEnumValue(GroupPolicyDefinitionClassType.class)); });
            this.put("definitionFile", (n) -> { currentObject.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("explainText", (n) -> { currentObject.setExplainText(n.getStringValue()); });
            this.put("groupPolicyCategoryId", (n) -> { currentObject.setGroupPolicyCategoryId(n.getStringValue()); });
            this.put("hasRelatedDefinitions", (n) -> { currentObject.setHasRelatedDefinitions(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("minDeviceCspVersion", (n) -> { currentObject.setMinDeviceCspVersion(n.getStringValue()); });
            this.put("minUserCspVersion", (n) -> { currentObject.setMinUserCspVersion(n.getStringValue()); });
            this.put("nextVersionDefinition", (n) -> { currentObject.setNextVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("policyType", (n) -> { currentObject.setPolicyType(n.getEnumValue(GroupPolicyType.class)); });
            this.put("presentations", (n) -> { currentObject.setPresentations(n.getCollectionOfObjectValues(GroupPolicyPresentation::createFromDiscriminatorValue)); });
            this.put("previousVersionDefinition", (n) -> { currentObject.setPreviousVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("supportedOn", (n) -> { currentObject.setSupportedOn(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupPolicyCategoryId property value. The category id of the parent category
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupPolicyCategoryId() {
        return this._groupPolicyCategoryId;
    }
    /**
     * Gets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasRelatedDefinitions() {
        return this._hasRelatedDefinitions;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinDeviceCspVersion() {
        return this._minDeviceCspVersion;
    }
    /**
     * Gets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinUserCspVersion() {
        return this._minUserCspVersion;
    }
    /**
     * Gets the nextVersionDefinition property value. Definition of the next version of this definition
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getNextVersionDefinition() {
        return this._nextVersionDefinition;
    }
    /**
     * Gets the policyType property value. Specifies the type of group policy. Possible values are: admxBacked, admxIngested.
     * @return a groupPolicyType
     */
    @javax.annotation.Nullable
    public GroupPolicyType getPolicyType() {
        return this._policyType;
    }
    /**
     * Gets the presentations property value. The group policy presentations associated with the definition.
     * @return a groupPolicyPresentation
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyPresentation> getPresentations() {
        return this._presentations;
    }
    /**
     * Gets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getPreviousVersionDefinition() {
        return this._previousVersionDefinition;
    }
    /**
     * Gets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportedOn() {
        return this._supportedOn;
    }
    /**
     * Gets the version property value. Setting definition version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("category", this.getCategory());
        writer.writeStringValue("categoryPath", this.getCategoryPath());
        writer.writeEnumValue("classType", this.getClassType());
        writer.writeObjectValue("definitionFile", this.getDefinitionFile());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("explainText", this.getExplainText());
        writer.writeStringValue("groupPolicyCategoryId", this.getGroupPolicyCategoryId());
        writer.writeBooleanValue("hasRelatedDefinitions", this.getHasRelatedDefinitions());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("minDeviceCspVersion", this.getMinDeviceCspVersion());
        writer.writeStringValue("minUserCspVersion", this.getMinUserCspVersion());
        writer.writeObjectValue("nextVersionDefinition", this.getNextVersionDefinition());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeCollectionOfObjectValues("presentations", this.getPresentations());
        writer.writeObjectValue("previousVersionDefinition", this.getPreviousVersionDefinition());
        writer.writeStringValue("supportedOn", this.getSupportedOn());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the category property value. The group policy category associated with the definition.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final GroupPolicyCategory value) {
        this._category = value;
    }
    /**
     * Sets the categoryPath property value. The localized full category path for the policy.
     * @param value Value to set for the categoryPath property.
     * @return a void
     */
    public void setCategoryPath(@javax.annotation.Nullable final String value) {
        this._categoryPath = value;
    }
    /**
     * Sets the classType property value. Identifies the type of groups the policy can be applied to. Possible values are: user, machine.
     * @param value Value to set for the classType property.
     * @return a void
     */
    public void setClassType(@javax.annotation.Nullable final GroupPolicyDefinitionClassType value) {
        this._classType = value;
    }
    /**
     * Sets the definitionFile property value. The group policy file associated with the definition.
     * @param value Value to set for the definitionFile property.
     * @return a void
     */
    public void setDefinitionFile(@javax.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this._definitionFile = value;
    }
    /**
     * Sets the displayName property value. The localized policy name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @param value Value to set for the explainText property.
     * @return a void
     */
    public void setExplainText(@javax.annotation.Nullable final String value) {
        this._explainText = value;
    }
    /**
     * Sets the groupPolicyCategoryId property value. The category id of the parent category
     * @param value Value to set for the groupPolicyCategoryId property.
     * @return a void
     */
    public void setGroupPolicyCategoryId(@javax.annotation.Nullable final String value) {
        this._groupPolicyCategoryId = value;
    }
    /**
     * Sets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @param value Value to set for the hasRelatedDefinitions property.
     * @return a void
     */
    public void setHasRelatedDefinitions(@javax.annotation.Nullable final Boolean value) {
        this._hasRelatedDefinitions = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @param value Value to set for the minDeviceCspVersion property.
     * @return a void
     */
    public void setMinDeviceCspVersion(@javax.annotation.Nullable final String value) {
        this._minDeviceCspVersion = value;
    }
    /**
     * Sets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @param value Value to set for the minUserCspVersion property.
     * @return a void
     */
    public void setMinUserCspVersion(@javax.annotation.Nullable final String value) {
        this._minUserCspVersion = value;
    }
    /**
     * Sets the nextVersionDefinition property value. Definition of the next version of this definition
     * @param value Value to set for the nextVersionDefinition property.
     * @return a void
     */
    public void setNextVersionDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this._nextVersionDefinition = value;
    }
    /**
     * Sets the policyType property value. Specifies the type of group policy. Possible values are: admxBacked, admxIngested.
     * @param value Value to set for the policyType property.
     * @return a void
     */
    public void setPolicyType(@javax.annotation.Nullable final GroupPolicyType value) {
        this._policyType = value;
    }
    /**
     * Sets the presentations property value. The group policy presentations associated with the definition.
     * @param value Value to set for the presentations property.
     * @return a void
     */
    public void setPresentations(@javax.annotation.Nullable final java.util.List<GroupPolicyPresentation> value) {
        this._presentations = value;
    }
    /**
     * Sets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @param value Value to set for the previousVersionDefinition property.
     * @return a void
     */
    public void setPreviousVersionDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this._previousVersionDefinition = value;
    }
    /**
     * Sets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @param value Value to set for the supportedOn property.
     * @return a void
     */
    public void setSupportedOn(@javax.annotation.Nullable final String value) {
        this._supportedOn = value;
    }
    /**
     * Sets the version property value. Setting definition version
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
