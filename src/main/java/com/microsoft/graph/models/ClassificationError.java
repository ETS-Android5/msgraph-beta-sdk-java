package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassificationError extends ClassifcationErrorBase implements Parsable {
    /** The details property */
    private java.util.List<ClassifcationErrorBase> _details;
    /**
     * Instantiates a new classificationError and sets the default values.
     * @return a void
     */
    public ClassificationError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classificationError
     */
    @javax.annotation.Nonnull
    public static ClassificationError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationError();
    }
    /**
     * Gets the details property value. The details property
     * @return a classifcationErrorBase
     */
    @javax.annotation.Nullable
    public java.util.List<ClassifcationErrorBase> getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassificationError currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("details", (n) -> { currentObject.setDetails(n.getCollectionOfObjectValues(ClassifcationErrorBase::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final java.util.List<ClassifcationErrorBase> value) {
        this._details = value;
    }
}
