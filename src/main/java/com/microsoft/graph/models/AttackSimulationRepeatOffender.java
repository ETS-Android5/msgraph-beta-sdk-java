package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttackSimulationRepeatOffender implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** User in an attack simulation and training campaign. */
    private AttackSimulationUser _attackSimulationUser;
    /** Number of repeat offences of the user in attack simulation and training campaigns. */
    private Integer _repeatOffenceCount;
    /**
     * Instantiates a new attackSimulationRepeatOffender and sets the default values.
     * @return a void
     */
    public AttackSimulationRepeatOffender() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attackSimulationRepeatOffender
     */
    @javax.annotation.Nonnull
    public static AttackSimulationRepeatOffender createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttackSimulationRepeatOffender();
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
     * Gets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @return a attackSimulationUser
     */
    @javax.annotation.Nullable
    public AttackSimulationUser getAttackSimulationUser() {
        return this._attackSimulationUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttackSimulationRepeatOffender currentObject = this;
        return new HashMap<>(2) {{
            this.put("attackSimulationUser", (n) -> { currentObject.setAttackSimulationUser(n.getObjectValue(AttackSimulationUser::createFromDiscriminatorValue)); });
            this.put("repeatOffenceCount", (n) -> { currentObject.setRepeatOffenceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the repeatOffenceCount property value. Number of repeat offences of the user in attack simulation and training campaigns.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRepeatOffenceCount() {
        return this._repeatOffenceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attackSimulationUser", this.getAttackSimulationUser());
        writer.writeIntegerValue("repeatOffenceCount", this.getRepeatOffenceCount());
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
     * Sets the attackSimulationUser property value. User in an attack simulation and training campaign.
     * @param value Value to set for the attackSimulationUser property.
     * @return a void
     */
    public void setAttackSimulationUser(@javax.annotation.Nullable final AttackSimulationUser value) {
        this._attackSimulationUser = value;
    }
    /**
     * Sets the repeatOffenceCount property value. Number of repeat offences of the user in attack simulation and training campaigns.
     * @param value Value to set for the repeatOffenceCount property.
     * @return a void
     */
    public void setRepeatOffenceCount(@javax.annotation.Nullable final Integer value) {
        this._repeatOffenceCount = value;
    }
}
