package microsoft.graph.chats.item.markchatunreadforuser;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.TeamworkUserIdentity;
/** Provides operations to call the markChatUnreadForUser method. */
public class MarkChatUnreadForUserRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The lastMessageReadDateTime property */
    private OffsetDateTime _lastMessageReadDateTime;
    /** The tenantId property */
    private String _tenantId;
    /** The user property */
    private TeamworkUserIdentity _user;
    /**
     * Instantiates a new markChatUnreadForUserRequestBody and sets the default values.
     * @return a void
     */
    public MarkChatUnreadForUserRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a markChatUnreadForUserRequestBody
     */
    @javax.annotation.Nonnull
    public static MarkChatUnreadForUserRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkChatUnreadForUserRequestBody();
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
        final MarkChatUnreadForUserRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("lastMessageReadDateTime", (n) -> { currentObject.setLastMessageReadDateTime(n.getOffsetDateTimeValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastMessageReadDateTime property value. The lastMessageReadDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastMessageReadDateTime() {
        return this._lastMessageReadDateTime;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the user property value. The user property
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity getUser() {
        return this._user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastMessageReadDateTime", this.getLastMessageReadDateTime());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the lastMessageReadDateTime property value. The lastMessageReadDateTime property
     * @param value Value to set for the lastMessageReadDateTime property.
     * @return a void
     */
    public void setLastMessageReadDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastMessageReadDateTime = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     * @return a void
     */
    public void setUser(@javax.annotation.Nullable final TeamworkUserIdentity value) {
        this._user = value;
    }
}
