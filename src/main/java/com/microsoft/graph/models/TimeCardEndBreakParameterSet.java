// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.TimeCard;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card End Break Parameter Set.
 */
public class TimeCardEndBreakParameterSet {
    /**
     * The at Approved Location.
     * 
     */
    @SerializedName(value = "atApprovedLocation", alternate = {"AtApprovedLocation"})
    @Expose
	@Nullable
    public Boolean atApprovedLocation;

    /**
     * The notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public ItemBody notes;


    /**
     * Instiaciates a new TimeCardEndBreakParameterSet
     */
    public TimeCardEndBreakParameterSet() {}
    /**
     * Instiaciates a new TimeCardEndBreakParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TimeCardEndBreakParameterSet(@Nonnull final TimeCardEndBreakParameterSetBuilder builder) {
        this.atApprovedLocation = builder.atApprovedLocation;
        this.notes = builder.notes;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TimeCardEndBreakParameterSetBuilder newBuilder() {
        return new TimeCardEndBreakParameterSetBuilder();
    }
    /**
     * Fluent builder for the TimeCardEndBreakParameterSet
     */
    public static final class TimeCardEndBreakParameterSetBuilder {
        /**
         * The atApprovedLocation parameter value
         */
        @Nullable
        protected Boolean atApprovedLocation;
        /**
         * Sets the AtApprovedLocation
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TimeCardEndBreakParameterSetBuilder withAtApprovedLocation(@Nullable final Boolean val) {
            this.atApprovedLocation = val;
            return this;
        }
        /**
         * The notes parameter value
         */
        @Nullable
        protected ItemBody notes;
        /**
         * Sets the Notes
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TimeCardEndBreakParameterSetBuilder withNotes(@Nullable final ItemBody val) {
            this.notes = val;
            return this;
        }
        /**
         * Instanciates a new TimeCardEndBreakParameterSetBuilder
         */
        @Nullable
        protected TimeCardEndBreakParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TimeCardEndBreakParameterSet build() {
            return new TimeCardEndBreakParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.atApprovedLocation != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("atApprovedLocation", atApprovedLocation));
        }
        if(this.notes != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notes", notes));
        }
        return result;
    }
}
