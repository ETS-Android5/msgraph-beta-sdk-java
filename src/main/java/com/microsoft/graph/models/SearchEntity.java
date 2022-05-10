package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.search.Acronym;
import microsoft.graph.models.search.Bookmark;
import microsoft.graph.models.search.Qna;
/** Provides operations to manage the searchEntity singleton. */
public class SearchEntity extends Entity implements Parsable {
    /** Administrative answer in Microsoft Search results to define common acronyms in a organization. */
    private java.util.List<Acronym> _acronyms;
    /** Administrative answer in Microsoft Search results for common search queries in an organization. */
    private java.util.List<Bookmark> _bookmarks;
    /** Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization. */
    private java.util.List<Qna> _qnas;
    /**
     * Instantiates a new searchEntity and sets the default values.
     * @return a void
     */
    public SearchEntity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchEntity
     */
    @javax.annotation.Nonnull
    public static SearchEntity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchEntity();
    }
    /**
     * Gets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in a organization.
     * @return a acronym
     */
    @javax.annotation.Nullable
    public java.util.List<Acronym> getAcronyms() {
        return this._acronyms;
    }
    /**
     * Gets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @return a bookmark
     */
    @javax.annotation.Nullable
    public java.util.List<Bookmark> getBookmarks() {
        return this._bookmarks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchEntity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acronyms", (n) -> { currentObject.setAcronyms(n.getCollectionOfObjectValues(Acronym::createFromDiscriminatorValue)); });
            this.put("bookmarks", (n) -> { currentObject.setBookmarks(n.getCollectionOfObjectValues(Bookmark::createFromDiscriminatorValue)); });
            this.put("qnas", (n) -> { currentObject.setQnas(n.getCollectionOfObjectValues(Qna::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the qnas property value. Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization.
     * @return a qna
     */
    @javax.annotation.Nullable
    public java.util.List<Qna> getQnas() {
        return this._qnas;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acronyms", this.getAcronyms());
        writer.writeCollectionOfObjectValues("bookmarks", this.getBookmarks());
        writer.writeCollectionOfObjectValues("qnas", this.getQnas());
    }
    /**
     * Sets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in a organization.
     * @param value Value to set for the acronyms property.
     * @return a void
     */
    public void setAcronyms(@javax.annotation.Nullable final java.util.List<Acronym> value) {
        this._acronyms = value;
    }
    /**
     * Sets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @param value Value to set for the bookmarks property.
     * @return a void
     */
    public void setBookmarks(@javax.annotation.Nullable final java.util.List<Bookmark> value) {
        this._bookmarks = value;
    }
    /**
     * Sets the qnas property value. Administrative answer in Microsoft Search results which provide answers for specific search keywords in an organization.
     * @param value Value to set for the qnas property.
     * @return a void
     */
    public void setQnas(@javax.annotation.Nullable final java.util.List<Qna> value) {
        this._qnas = value;
    }
}
