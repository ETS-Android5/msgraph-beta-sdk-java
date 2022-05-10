package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of bookingBusiness entities. */
public enum BookingReminderRecipients implements ValuedEnum {
    AllAttendees("allAttendees"),
    Staff("staff"),
    Customer("customer");
    public final String value;
    BookingReminderRecipients(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingReminderRecipients forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAttendees": return AllAttendees;
            case "staff": return Staff;
            case "customer": return Customer;
            default: return null;
        }
    }
}
