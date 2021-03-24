// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.graph.models.Permission;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Revoke Grants Parameter Set.
 */
public class PermissionRevokeGrantsParameterSet {
    /**
     * The grantees.
     * 
     */
    @SerializedName(value = "grantees", alternate = {"Grantees"})
    @Expose
	@Nullable
    public java.util.List<DriveRecipient> grantees;


    /**
     * Instiaciates a new PermissionRevokeGrantsParameterSet
     */
    public PermissionRevokeGrantsParameterSet() {}
    /**
     * Instiaciates a new PermissionRevokeGrantsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PermissionRevokeGrantsParameterSet(@Nonnull final PermissionRevokeGrantsParameterSetBuilder builder) {
        this.grantees = builder.grantees;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PermissionRevokeGrantsParameterSetBuilder newBuilder() {
        return new PermissionRevokeGrantsParameterSetBuilder();
    }
    /**
     * Fluent builder for the PermissionRevokeGrantsParameterSet
     */
    public static final class PermissionRevokeGrantsParameterSetBuilder {
        /**
         * The grantees parameter value
         */
        @Nullable
        protected java.util.List<DriveRecipient> grantees;
        /**
         * Sets the Grantees
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PermissionRevokeGrantsParameterSetBuilder withGrantees(@Nullable final java.util.List<DriveRecipient> val) {
            this.grantees = val;
            return this;
        }
        /**
         * Instanciates a new PermissionRevokeGrantsParameterSetBuilder
         */
        @Nullable
        protected PermissionRevokeGrantsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PermissionRevokeGrantsParameterSet build() {
            return new PermissionRevokeGrantsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.grantees != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("grantees", grantees));
        }
        return result;
    }
}
