package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum TermGroupScope implements ValuedEnum {
    Global("global"),
    System("system"),
    SiteCollection("siteCollection");
    public final String value;
    TermGroupScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TermGroupScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "global": return Global;
            case "system": return System;
            case "siteCollection": return SiteCollection;
            default: return null;
        }
    }
}
