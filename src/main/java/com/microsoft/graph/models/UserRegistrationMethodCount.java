package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationMethodCount implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of authentication method. */
    private String _authenticationMethod;
    /** Number of users registered. */
    private Long _userCount;
    /**
     * Instantiates a new userRegistrationMethodCount and sets the default values.
     * @return a void
     */
    public UserRegistrationMethodCount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationMethodCount
     */
    @javax.annotation.Nonnull
    public static UserRegistrationMethodCount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationMethodCount();
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
     * Gets the authenticationMethod property value. Name of authentication method.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserRegistrationMethodCount currentObject = this;
        return new HashMap<>(2) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getStringValue()); });
            this.put("userCount", (n) -> { currentObject.setUserCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the userCount property value. Number of users registered.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUserCount() {
        return this._userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeLongValue("userCount", this.getUserCount());
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
     * Sets the authenticationMethod property value. Name of authentication method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final String value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the userCount property value. Number of users registered.
     * @param value Value to set for the userCount property.
     * @return a void
     */
    public void setUserCount(@javax.annotation.Nullable final Long value) {
        this._userCount = value;
    }
}
