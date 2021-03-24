// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ItemActivityStat;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Get Activities By Interval Parameter Set.
 */
public class DriveItemGetActivitiesByIntervalParameterSet {
    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public String startDateTime;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public String endDateTime;

    /**
     * The interval.
     * 
     */
    @SerializedName(value = "interval", alternate = {"Interval"})
    @Expose
	@Nullable
    public String interval;


    /**
     * Instiaciates a new DriveItemGetActivitiesByIntervalParameterSet
     */
    public DriveItemGetActivitiesByIntervalParameterSet() {}
    /**
     * Instiaciates a new DriveItemGetActivitiesByIntervalParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemGetActivitiesByIntervalParameterSet(@Nonnull final DriveItemGetActivitiesByIntervalParameterSetBuilder builder) {
        this.startDateTime = builder.startDateTime;
        this.endDateTime = builder.endDateTime;
        this.interval = builder.interval;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemGetActivitiesByIntervalParameterSetBuilder newBuilder() {
        return new DriveItemGetActivitiesByIntervalParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemGetActivitiesByIntervalParameterSet
     */
    public static final class DriveItemGetActivitiesByIntervalParameterSetBuilder {
        /**
         * The startDateTime parameter value
         */
        @Nullable
        protected String startDateTime;
        /**
         * Sets the StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemGetActivitiesByIntervalParameterSetBuilder withStartDateTime(@Nullable final String val) {
            this.startDateTime = val;
            return this;
        }
        /**
         * The endDateTime parameter value
         */
        @Nullable
        protected String endDateTime;
        /**
         * Sets the EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemGetActivitiesByIntervalParameterSetBuilder withEndDateTime(@Nullable final String val) {
            this.endDateTime = val;
            return this;
        }
        /**
         * The interval parameter value
         */
        @Nullable
        protected String interval;
        /**
         * Sets the Interval
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemGetActivitiesByIntervalParameterSetBuilder withInterval(@Nullable final String val) {
            this.interval = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemGetActivitiesByIntervalParameterSetBuilder
         */
        @Nullable
        protected DriveItemGetActivitiesByIntervalParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemGetActivitiesByIntervalParameterSet build() {
            return new DriveItemGetActivitiesByIntervalParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        if(this.interval != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("interval", interval));
        }
        return result;
    }
}
