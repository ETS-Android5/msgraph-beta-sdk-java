package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementComplianceActionType implements ValuedEnum {
    /** No Action */
    NoAction("noAction"),
    /** Send Notification */
    Notification("notification"),
    /** Block the device in AAD */
    Block("block"),
    /** Retire the device */
    Retire("retire"),
    /** Wipe the device */
    Wipe("wipe"),
    /** Remove Resource Access Profiles from the device */
    RemoveResourceAccessProfiles("removeResourceAccessProfiles"),
    /** Send push notification to device */
    PushNotification("pushNotification"),
    /** Remotely lock the device */
    RemoteLock("remoteLock");
    public final String value;
    DeviceManagementComplianceActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementComplianceActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noAction": return NoAction;
            case "notification": return Notification;
            case "block": return Block;
            case "retire": return Retire;
            case "wipe": return Wipe;
            case "removeResourceAccessProfiles": return RemoveResourceAccessProfiles;
            case "pushNotification": return PushNotification;
            case "remoteLock": return RemoteLock;
            default: return null;
        }
    }
}
