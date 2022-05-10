package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class ExternalConnection extends Entity implements Parsable {
    /** Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional. */
    private Configuration _configuration;
    /** The Teams App ID. Optional. */
    private String _connectorId;
    /** Description of the connection displayed in the Microsoft 365 admin center. Optional. */
    private String _description;
    /** Read-only. Nullable. */
    private java.util.List<ExternalGroup> _groups;
    /** The ingestedItemsCount property */
    private Long _ingestedItemsCount;
    /** Read-only. Nullable. */
    private java.util.List<ExternalItem> _items;
    /** The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required. */
    private String _name;
    /** Read-only. Nullable. */
    private java.util.List<ConnectionOperation> _operations;
    /** The quota property */
    private ConnectionQuota _quota;
    /** Read-only. Nullable. */
    private Schema _schema;
    /** The settings configuring the search experience for content in this connection, such as the display templates for search results. */
    private SearchSettings _searchSettings;
    /** Indicates the current state of the connection. Possible values are draft, ready, obsolete, and limitExceeded. Required. */
    private ConnectionState _state;
    /**
     * Instantiates a new externalConnection and sets the default values.
     * @return a void
     */
    public ExternalConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalConnection
     */
    @javax.annotation.Nonnull
    public static ExternalConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalConnection();
    }
    /**
     * Gets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @return a configuration
     */
    @javax.annotation.Nullable
    public Configuration getConfiguration() {
        return this._configuration;
    }
    /**
     * Gets the connectorId property value. The Teams App ID. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorId() {
        return this._connectorId;
    }
    /**
     * Gets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalConnection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configuration", (n) -> { currentObject.setConfiguration(n.getObjectValue(Configuration::createFromDiscriminatorValue)); });
            this.put("connectorId", (n) -> { currentObject.setConnectorId(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("groups", (n) -> { currentObject.setGroups(n.getCollectionOfObjectValues(ExternalGroup::createFromDiscriminatorValue)); });
            this.put("ingestedItemsCount", (n) -> { currentObject.setIngestedItemsCount(n.getLongValue()); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(ExternalItem::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(ConnectionOperation::createFromDiscriminatorValue)); });
            this.put("quota", (n) -> { currentObject.setQuota(n.getObjectValue(ConnectionQuota::createFromDiscriminatorValue)); });
            this.put("schema", (n) -> { currentObject.setSchema(n.getObjectValue(Schema::createFromDiscriminatorValue)); });
            this.put("searchSettings", (n) -> { currentObject.setSearchSettings(n.getObjectValue(SearchSettings::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ConnectionState.class)); });
        }};
    }
    /**
     * Gets the groups property value. Read-only. Nullable.
     * @return a externalGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalGroup> getGroups() {
        return this._groups;
    }
    /**
     * Gets the ingestedItemsCount property value. The ingestedItemsCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIngestedItemsCount() {
        return this._ingestedItemsCount;
    }
    /**
     * Gets the items property value. Read-only. Nullable.
     * @return a externalItem
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalItem> getItems() {
        return this._items;
    }
    /**
     * Gets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the operations property value. Read-only. Nullable.
     * @return a connectionOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectionOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the quota property value. The quota property
     * @return a connectionQuota
     */
    @javax.annotation.Nullable
    public ConnectionQuota getQuota() {
        return this._quota;
    }
    /**
     * Gets the schema property value. Read-only. Nullable.
     * @return a schema
     */
    @javax.annotation.Nullable
    public Schema getSchema() {
        return this._schema;
    }
    /**
     * Gets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @return a searchSettings
     */
    @javax.annotation.Nullable
    public SearchSettings getSearchSettings() {
        return this._searchSettings;
    }
    /**
     * Gets the state property value. Indicates the current state of the connection. Possible values are draft, ready, obsolete, and limitExceeded. Required.
     * @return a connectionState
     */
    @javax.annotation.Nullable
    public ConnectionState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("connectorId", this.getConnectorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeLongValue("ingestedItemsCount", this.getIngestedItemsCount());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("quota", this.getQuota());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("searchSettings", this.getSearchSettings());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @param value Value to set for the configuration property.
     * @return a void
     */
    public void setConfiguration(@javax.annotation.Nullable final Configuration value) {
        this._configuration = value;
    }
    /**
     * Sets the connectorId property value. The Teams App ID. Optional.
     * @param value Value to set for the connectorId property.
     * @return a void
     */
    public void setConnectorId(@javax.annotation.Nullable final String value) {
        this._connectorId = value;
    }
    /**
     * Sets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the groups property value. Read-only. Nullable.
     * @param value Value to set for the groups property.
     * @return a void
     */
    public void setGroups(@javax.annotation.Nullable final java.util.List<ExternalGroup> value) {
        this._groups = value;
    }
    /**
     * Sets the ingestedItemsCount property value. The ingestedItemsCount property
     * @param value Value to set for the ingestedItemsCount property.
     * @return a void
     */
    public void setIngestedItemsCount(@javax.annotation.Nullable final Long value) {
        this._ingestedItemsCount = value;
    }
    /**
     * Sets the items property value. Read-only. Nullable.
     * @param value Value to set for the items property.
     * @return a void
     */
    public void setItems(@javax.annotation.Nullable final java.util.List<ExternalItem> value) {
        this._items = value;
    }
    /**
     * Sets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the operations property value. Read-only. Nullable.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<ConnectionOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the quota property value. The quota property
     * @param value Value to set for the quota property.
     * @return a void
     */
    public void setQuota(@javax.annotation.Nullable final ConnectionQuota value) {
        this._quota = value;
    }
    /**
     * Sets the schema property value. Read-only. Nullable.
     * @param value Value to set for the schema property.
     * @return a void
     */
    public void setSchema(@javax.annotation.Nullable final Schema value) {
        this._schema = value;
    }
    /**
     * Sets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @param value Value to set for the searchSettings property.
     * @return a void
     */
    public void setSearchSettings(@javax.annotation.Nullable final SearchSettings value) {
        this._searchSettings = value;
    }
    /**
     * Sets the state property value. Indicates the current state of the connection. Possible values are draft, ready, obsolete, and limitExceeded. Required.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ConnectionState value) {
        this._state = value;
    }
}
