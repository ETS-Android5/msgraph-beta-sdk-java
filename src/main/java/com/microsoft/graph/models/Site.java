package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.termstore.Store;
public class Site extends BaseItem implements Parsable {
    /** Analytics about the view activities that took place in this site. */
    private ItemAnalytics _analytics;
    /** The collection of column definitions reusable across lists under this site. */
    private java.util.List<ColumnDefinition> _columns;
    /** The collection of content types defined for this site. */
    private java.util.List<ContentType> _contentTypes;
    /** The deleted property */
    private Deleted _deleted;
    /** The full title for the site. Read-only. */
    private String _displayName;
    /** The default drive (document library) for this site. */
    private Drive _drive;
    /** The collection of drives (document libraries) under this site. */
    private java.util.List<Drive> _drives;
    /** The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site. */
    private java.util.List<ColumnDefinition> _externalColumns;
    /** Used to address any item contained in this site. This collection cannot be enumerated. */
    private java.util.List<BaseItem> _items;
    /** The collection of lists under this site. */
    private java.util.List<List> _lists;
    /** Calls the OneNote service for notebook related operations. */
    private Onenote _onenote;
    /** The collection of long running operations for the site. */
    private java.util.List<RichLongRunningOperation> _operations;
    /** The collection of pages in the SitePages list in this site. */
    private java.util.List<SitePage> _pages;
    /** The permissions associated with the site. Nullable. */
    private java.util.List<Permission> _permissions;
    /** If present, indicates that this is the root site in the site collection. Read-only. */
    private Root _root;
    /** The settings on this site. Read-only. */
    private SiteSettings _settings;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds _sharepointIds;
    /** Provides details about the site's site collection. Available only on the root site. Read-only. */
    private SiteCollection _siteCollection;
    /** The collection of the sub-sites under this site. */
    private java.util.List<Site> _sites;
    /** The termStore under this site. */
    private Store _termStore;
    /**
     * Instantiates a new site and sets the default values.
     * @return a void
     */
    public Site() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a site
     */
    @javax.annotation.Nonnull
    public static Site createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Site();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place in this site.
     * @return a itemAnalytics
     */
    @javax.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this._analytics;
    }
    /**
     * Gets the columns property value. The collection of column definitions reusable across lists under this site.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this._columns;
    }
    /**
     * Gets the contentTypes property value. The collection of content types defined for this site.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this._contentTypes;
    }
    /**
     * Gets the deleted property value. The deleted property
     * @return a deleted
     */
    @javax.annotation.Nullable
    public Deleted getDeleted() {
        return this._deleted;
    }
    /**
     * Gets the displayName property value. The full title for the site. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the drive property value. The default drive (document library) for this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this._drive;
    }
    /**
     * Gets the drives property value. The collection of drives (document libraries) under this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this._drives;
    }
    /**
     * Gets the externalColumns property value. The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getExternalColumns() {
        return this._externalColumns;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Site currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("analytics", (n) -> { currentObject.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
            this.put("columns", (n) -> { currentObject.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("contentTypes", (n) -> { currentObject.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
            this.put("deleted", (n) -> { currentObject.setDeleted(n.getObjectValue(Deleted::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("drive", (n) -> { currentObject.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
            this.put("drives", (n) -> { currentObject.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
            this.put("externalColumns", (n) -> { currentObject.setExternalColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(BaseItem::createFromDiscriminatorValue)); });
            this.put("lists", (n) -> { currentObject.setLists(n.getCollectionOfObjectValues(List::createFromDiscriminatorValue)); });
            this.put("onenote", (n) -> { currentObject.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
            this.put("pages", (n) -> { currentObject.setPages(n.getCollectionOfObjectValues(SitePage::createFromDiscriminatorValue)); });
            this.put("permissions", (n) -> { currentObject.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
            this.put("root", (n) -> { currentObject.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(SiteSettings::createFromDiscriminatorValue)); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("siteCollection", (n) -> { currentObject.setSiteCollection(n.getObjectValue(SiteCollection::createFromDiscriminatorValue)); });
            this.put("sites", (n) -> { currentObject.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
            this.put("termStore", (n) -> { currentObject.setTermStore(n.getObjectValue(Store::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the items property value. Used to address any item contained in this site. This collection cannot be enumerated.
     * @return a baseItem
     */
    @javax.annotation.Nullable
    public java.util.List<BaseItem> getItems() {
        return this._items;
    }
    /**
     * Gets the lists property value. The collection of lists under this site.
     * @return a list
     */
    @javax.annotation.Nullable
    public java.util.List<List> getLists() {
        return this._lists;
    }
    /**
     * Gets the onenote property value. Calls the OneNote service for notebook related operations.
     * @return a onenote
     */
    @javax.annotation.Nullable
    public Onenote getOnenote() {
        return this._onenote;
    }
    /**
     * Gets the operations property value. The collection of long running operations for the site.
     * @return a richLongRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the pages property value. The collection of pages in the SitePages list in this site.
     * @return a sitePage
     */
    @javax.annotation.Nullable
    public java.util.List<SitePage> getPages() {
        return this._pages;
    }
    /**
     * Gets the permissions property value. The permissions associated with the site. Nullable.
     * @return a permission
     */
    @javax.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this._permissions;
    }
    /**
     * Gets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @return a root
     */
    @javax.annotation.Nullable
    public Root getRoot() {
        return this._root;
    }
    /**
     * Gets the settings property value. The settings on this site. Read-only.
     * @return a siteSettings
     */
    @javax.annotation.Nullable
    public SiteSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this._sharepointIds;
    }
    /**
     * Gets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @return a siteCollection
     */
    @javax.annotation.Nullable
    public SiteCollection getSiteCollection() {
        return this._siteCollection;
    }
    /**
     * Gets the sites property value. The collection of the sub-sites under this site.
     * @return a site
     */
    @javax.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this._sites;
    }
    /**
     * Gets the termStore property value. The termStore under this site.
     * @return a store
     */
    @javax.annotation.Nullable
    public Store getTermStore() {
        return this._termStore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeCollectionOfObjectValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("deleted", this.getDeleted());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeCollectionOfObjectValues("externalColumns", this.getExternalColumns());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("lists", this.getLists());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("pages", this.getPages());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeObjectValue("siteCollection", this.getSiteCollection());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("termStore", this.getTermStore());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place in this site.
     * @param value Value to set for the analytics property.
     * @return a void
     */
    public void setAnalytics(@javax.annotation.Nullable final ItemAnalytics value) {
        this._analytics = value;
    }
    /**
     * Sets the columns property value. The collection of column definitions reusable across lists under this site.
     * @param value Value to set for the columns property.
     * @return a void
     */
    public void setColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._columns = value;
    }
    /**
     * Sets the contentTypes property value. The collection of content types defined for this site.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this._contentTypes = value;
    }
    /**
     * Sets the deleted property value. The deleted property
     * @param value Value to set for the deleted property.
     * @return a void
     */
    public void setDeleted(@javax.annotation.Nullable final Deleted value) {
        this._deleted = value;
    }
    /**
     * Sets the displayName property value. The full title for the site. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the drive property value. The default drive (document library) for this site.
     * @param value Value to set for the drive property.
     * @return a void
     */
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this._drive = value;
    }
    /**
     * Sets the drives property value. The collection of drives (document libraries) under this site.
     * @param value Value to set for the drives property.
     * @return a void
     */
    public void setDrives(@javax.annotation.Nullable final java.util.List<Drive> value) {
        this._drives = value;
    }
    /**
     * Sets the externalColumns property value. The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site.
     * @param value Value to set for the externalColumns property.
     * @return a void
     */
    public void setExternalColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._externalColumns = value;
    }
    /**
     * Sets the items property value. Used to address any item contained in this site. This collection cannot be enumerated.
     * @param value Value to set for the items property.
     * @return a void
     */
    public void setItems(@javax.annotation.Nullable final java.util.List<BaseItem> value) {
        this._items = value;
    }
    /**
     * Sets the lists property value. The collection of lists under this site.
     * @param value Value to set for the lists property.
     * @return a void
     */
    public void setLists(@javax.annotation.Nullable final java.util.List<List> value) {
        this._lists = value;
    }
    /**
     * Sets the onenote property value. Calls the OneNote service for notebook related operations.
     * @param value Value to set for the onenote property.
     * @return a void
     */
    public void setOnenote(@javax.annotation.Nullable final Onenote value) {
        this._onenote = value;
    }
    /**
     * Sets the operations property value. The collection of long running operations for the site.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the pages property value. The collection of pages in the SitePages list in this site.
     * @param value Value to set for the pages property.
     * @return a void
     */
    public void setPages(@javax.annotation.Nullable final java.util.List<SitePage> value) {
        this._pages = value;
    }
    /**
     * Sets the permissions property value. The permissions associated with the site. Nullable.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    public void setPermissions(@javax.annotation.Nullable final java.util.List<Permission> value) {
        this._permissions = value;
    }
    /**
     * Sets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    public void setRoot(@javax.annotation.Nullable final Root value) {
        this._root = value;
    }
    /**
     * Sets the settings property value. The settings on this site. Read-only.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final SiteSettings value) {
        this._settings = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @param value Value to set for the siteCollection property.
     * @return a void
     */
    public void setSiteCollection(@javax.annotation.Nullable final SiteCollection value) {
        this._siteCollection = value;
    }
    /**
     * Sets the sites property value. The collection of the sub-sites under this site.
     * @param value Value to set for the sites property.
     * @return a void
     */
    public void setSites(@javax.annotation.Nullable final java.util.List<Site> value) {
        this._sites = value;
    }
    /**
     * Sets the termStore property value. The termStore under this site.
     * @param value Value to set for the termStore property.
     * @return a void
     */
    public void setTermStore(@javax.annotation.Nullable final Store value) {
        this._termStore = value;
    }
}
