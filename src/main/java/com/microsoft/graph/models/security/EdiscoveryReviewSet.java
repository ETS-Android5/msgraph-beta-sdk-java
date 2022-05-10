package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryReviewSet extends DataSet implements Parsable {
    /** The files property */
    private java.util.List<EdiscoveryFile> _files;
    /** The queries property */
    private java.util.List<EdiscoveryReviewSetQuery> _queries;
    /**
     * Instantiates a new ediscoveryReviewSet and sets the default values.
     * @return a void
     */
    public EdiscoveryReviewSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nonnull
    public static EdiscoveryReviewSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryReviewSet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryReviewSet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("files", (n) -> { currentObject.setFiles(n.getCollectionOfObjectValues(EdiscoveryFile::createFromDiscriminatorValue)); });
            this.put("queries", (n) -> { currentObject.setQueries(n.getCollectionOfObjectValues(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the files property value. The files property
     * @return a ediscoveryFile
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryFile> getFiles() {
        return this._files;
    }
    /**
     * Gets the queries property value. The queries property
     * @return a ediscoveryReviewSetQuery
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewSetQuery> getQueries() {
        return this._queries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeCollectionOfObjectValues("queries", this.getQueries());
    }
    /**
     * Sets the files property value. The files property
     * @param value Value to set for the files property.
     * @return a void
     */
    public void setFiles(@javax.annotation.Nullable final java.util.List<EdiscoveryFile> value) {
        this._files = value;
    }
    /**
     * Sets the queries property value. The queries property
     * @param value Value to set for the queries property.
     * @return a void
     */
    public void setQueries(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewSetQuery> value) {
        this._queries = value;
    }
}
