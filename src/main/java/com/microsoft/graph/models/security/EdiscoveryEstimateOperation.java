package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryEstimateOperation extends CaseOperation implements Parsable {
    /** The indexedItemCount property */
    private Long _indexedItemCount;
    /** The indexedItemsSize property */
    private Long _indexedItemsSize;
    /** The mailboxCount property */
    private Integer _mailboxCount;
    /** The search property */
    private EdiscoverySearch _search;
    /** The siteCount property */
    private Integer _siteCount;
    /** The unindexedItemCount property */
    private Long _unindexedItemCount;
    /** The unindexedItemsSize property */
    private Long _unindexedItemsSize;
    /**
     * Instantiates a new ediscoveryEstimateOperation and sets the default values.
     * @return a void
     */
    public EdiscoveryEstimateOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryEstimateOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryEstimateOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryEstimateOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryEstimateOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("indexedItemCount", (n) -> { currentObject.setIndexedItemCount(n.getLongValue()); });
            this.put("indexedItemsSize", (n) -> { currentObject.setIndexedItemsSize(n.getLongValue()); });
            this.put("mailboxCount", (n) -> { currentObject.setMailboxCount(n.getIntegerValue()); });
            this.put("search", (n) -> { currentObject.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
            this.put("siteCount", (n) -> { currentObject.setSiteCount(n.getIntegerValue()); });
            this.put("unindexedItemCount", (n) -> { currentObject.setUnindexedItemCount(n.getLongValue()); });
            this.put("unindexedItemsSize", (n) -> { currentObject.setUnindexedItemsSize(n.getLongValue()); });
        }};
    }
    /**
     * Gets the indexedItemCount property value. The indexedItemCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemCount() {
        return this._indexedItemCount;
    }
    /**
     * Gets the indexedItemsSize property value. The indexedItemsSize property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getIndexedItemsSize() {
        return this._indexedItemsSize;
    }
    /**
     * Gets the mailboxCount property value. The mailboxCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMailboxCount() {
        return this._mailboxCount;
    }
    /**
     * Gets the search property value. The search property
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this._search;
    }
    /**
     * Gets the siteCount property value. The siteCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSiteCount() {
        return this._siteCount;
    }
    /**
     * Gets the unindexedItemCount property value. The unindexedItemCount property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemCount() {
        return this._unindexedItemCount;
    }
    /**
     * Gets the unindexedItemsSize property value. The unindexedItemsSize property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnindexedItemsSize() {
        return this._unindexedItemsSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("indexedItemCount", this.getIndexedItemCount());
        writer.writeLongValue("indexedItemsSize", this.getIndexedItemsSize());
        writer.writeIntegerValue("mailboxCount", this.getMailboxCount());
        writer.writeObjectValue("search", this.getSearch());
        writer.writeIntegerValue("siteCount", this.getSiteCount());
        writer.writeLongValue("unindexedItemCount", this.getUnindexedItemCount());
        writer.writeLongValue("unindexedItemsSize", this.getUnindexedItemsSize());
    }
    /**
     * Sets the indexedItemCount property value. The indexedItemCount property
     * @param value Value to set for the indexedItemCount property.
     * @return a void
     */
    public void setIndexedItemCount(@javax.annotation.Nullable final Long value) {
        this._indexedItemCount = value;
    }
    /**
     * Sets the indexedItemsSize property value. The indexedItemsSize property
     * @param value Value to set for the indexedItemsSize property.
     * @return a void
     */
    public void setIndexedItemsSize(@javax.annotation.Nullable final Long value) {
        this._indexedItemsSize = value;
    }
    /**
     * Sets the mailboxCount property value. The mailboxCount property
     * @param value Value to set for the mailboxCount property.
     * @return a void
     */
    public void setMailboxCount(@javax.annotation.Nullable final Integer value) {
        this._mailboxCount = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     * @return a void
     */
    public void setSearch(@javax.annotation.Nullable final EdiscoverySearch value) {
        this._search = value;
    }
    /**
     * Sets the siteCount property value. The siteCount property
     * @param value Value to set for the siteCount property.
     * @return a void
     */
    public void setSiteCount(@javax.annotation.Nullable final Integer value) {
        this._siteCount = value;
    }
    /**
     * Sets the unindexedItemCount property value. The unindexedItemCount property
     * @param value Value to set for the unindexedItemCount property.
     * @return a void
     */
    public void setUnindexedItemCount(@javax.annotation.Nullable final Long value) {
        this._unindexedItemCount = value;
    }
    /**
     * Sets the unindexedItemsSize property value. The unindexedItemsSize property
     * @param value Value to set for the unindexedItemsSize property.
     * @return a void
     */
    public void setUnindexedItemsSize(@javax.annotation.Nullable final Long value) {
        this._unindexedItemsSize = value;
    }
}
