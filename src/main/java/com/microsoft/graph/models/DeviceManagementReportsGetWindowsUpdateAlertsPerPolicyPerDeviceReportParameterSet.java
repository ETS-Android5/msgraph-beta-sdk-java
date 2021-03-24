// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Windows Update Alerts Per Policy Per Device Report Parameter Set.
 */
public class DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet {
    /**
     * The name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The select.
     * 
     */
    @SerializedName(value = "select", alternate = {"Select"})
    @Expose
	@Nullable
    public java.util.List<String> select;

    /**
     * The search.
     * 
     */
    @SerializedName(value = "search", alternate = {"Search"})
    @Expose
	@Nullable
    public String search;

    /**
     * The group By.
     * 
     */
    @SerializedName(value = "groupBy", alternate = {"GroupBy"})
    @Expose
	@Nullable
    public java.util.List<String> groupBy;

    /**
     * The order By.
     * 
     */
    @SerializedName(value = "orderBy", alternate = {"OrderBy"})
    @Expose
	@Nullable
    public java.util.List<String> orderBy;

    /**
     * The skip.
     * 
     */
    @SerializedName(value = "skip", alternate = {"Skip"})
    @Expose
	@Nullable
    public Integer skip;

    /**
     * The top.
     * 
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
	@Nullable
    public Integer top;

    /**
     * The session Id.
     * 
     */
    @SerializedName(value = "sessionId", alternate = {"SessionId"})
    @Expose
	@Nullable
    public String sessionId;

    /**
     * The filter.
     * 
     */
    @SerializedName(value = "filter", alternate = {"Filter"})
    @Expose
	@Nullable
    public String filter;


    /**
     * Instiaciates a new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet
     */
    public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet(@Nonnull final DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder builder) {
        this.name = builder.name;
        this.select = builder.select;
        this.search = builder.search;
        this.groupBy = builder.groupBy;
        this.orderBy = builder.orderBy;
        this.skip = builder.skip;
        this.top = builder.top;
        this.sessionId = builder.sessionId;
        this.filter = builder.filter;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder newBuilder() {
        return new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet
     */
    public static final class DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder {
        /**
         * The name parameter value
         */
        @Nullable
        protected String name;
        /**
         * Sets the Name
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withName(@Nullable final String val) {
            this.name = val;
            return this;
        }
        /**
         * The select parameter value
         */
        @Nullable
        protected java.util.List<String> select;
        /**
         * Sets the Select
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withSelect(@Nullable final java.util.List<String> val) {
            this.select = val;
            return this;
        }
        /**
         * The search parameter value
         */
        @Nullable
        protected String search;
        /**
         * Sets the Search
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withSearch(@Nullable final String val) {
            this.search = val;
            return this;
        }
        /**
         * The groupBy parameter value
         */
        @Nullable
        protected java.util.List<String> groupBy;
        /**
         * Sets the GroupBy
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withGroupBy(@Nullable final java.util.List<String> val) {
            this.groupBy = val;
            return this;
        }
        /**
         * The orderBy parameter value
         */
        @Nullable
        protected java.util.List<String> orderBy;
        /**
         * Sets the OrderBy
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withOrderBy(@Nullable final java.util.List<String> val) {
            this.orderBy = val;
            return this;
        }
        /**
         * The skip parameter value
         */
        @Nullable
        protected Integer skip;
        /**
         * Sets the Skip
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withSkip(@Nullable final Integer val) {
            this.skip = val;
            return this;
        }
        /**
         * The top parameter value
         */
        @Nullable
        protected Integer top;
        /**
         * Sets the Top
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withTop(@Nullable final Integer val) {
            this.top = val;
            return this;
        }
        /**
         * The sessionId parameter value
         */
        @Nullable
        protected String sessionId;
        /**
         * Sets the SessionId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withSessionId(@Nullable final String val) {
            this.sessionId = val;
            return this;
        }
        /**
         * The filter parameter value
         */
        @Nullable
        protected String filter;
        /**
         * Sets the Filter
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder withFilter(@Nullable final String val) {
            this.filter = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet build() {
            return new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.name != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("name", name));
        }
        if(this.select != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("select", select));
        }
        if(this.search != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("search", search));
        }
        if(this.groupBy != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupBy", groupBy));
        }
        if(this.orderBy != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("orderBy", orderBy));
        }
        if(this.skip != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("skip", skip));
        }
        if(this.top != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("top", top));
        }
        if(this.sessionId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sessionId", sessionId));
        }
        if(this.filter != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("filter", filter));
        }
        return result;
    }
}
