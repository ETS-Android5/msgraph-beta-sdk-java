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
 * The class for the User Unblock Managed Apps Parameter Set.
 */
public class UserUnblockManagedAppsParameterSet {

    /**
     * Instiaciates a new UserUnblockManagedAppsParameterSet
     */
    public UserUnblockManagedAppsParameterSet() {}
    /**
     * Instiaciates a new UserUnblockManagedAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserUnblockManagedAppsParameterSet(@Nonnull final UserUnblockManagedAppsParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserUnblockManagedAppsParameterSetBuilder newBuilder() {
        return new UserUnblockManagedAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserUnblockManagedAppsParameterSet
     */
    public static final class UserUnblockManagedAppsParameterSetBuilder {
        /**
         * Instanciates a new UserUnblockManagedAppsParameterSetBuilder
         */
        @Nullable
        protected UserUnblockManagedAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserUnblockManagedAppsParameterSet build() {
            return new UserUnblockManagedAppsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
