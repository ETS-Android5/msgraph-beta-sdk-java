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
 * The class for the Group Lifecycle Policy Renew Group Parameter Set.
 */
public class GroupLifecyclePolicyRenewGroupParameterSet {
    /**
     * The group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;


    /**
     * Instiaciates a new GroupLifecyclePolicyRenewGroupParameterSet
     */
    public GroupLifecyclePolicyRenewGroupParameterSet() {}
    /**
     * Instiaciates a new GroupLifecyclePolicyRenewGroupParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupLifecyclePolicyRenewGroupParameterSet(@Nonnull final GroupLifecyclePolicyRenewGroupParameterSetBuilder builder) {
        this.groupId = builder.groupId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupLifecyclePolicyRenewGroupParameterSetBuilder newBuilder() {
        return new GroupLifecyclePolicyRenewGroupParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupLifecyclePolicyRenewGroupParameterSet
     */
    public static final class GroupLifecyclePolicyRenewGroupParameterSetBuilder {
        /**
         * The groupId parameter value
         */
        @Nullable
        protected String groupId;
        /**
         * Sets the GroupId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupLifecyclePolicyRenewGroupParameterSetBuilder withGroupId(@Nullable final String val) {
            this.groupId = val;
            return this;
        }
        /**
         * Instanciates a new GroupLifecyclePolicyRenewGroupParameterSetBuilder
         */
        @Nullable
        protected GroupLifecyclePolicyRenewGroupParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupLifecyclePolicyRenewGroupParameterSet build() {
            return new GroupLifecyclePolicyRenewGroupParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupId", groupId));
        }
        return result;
    }
}
