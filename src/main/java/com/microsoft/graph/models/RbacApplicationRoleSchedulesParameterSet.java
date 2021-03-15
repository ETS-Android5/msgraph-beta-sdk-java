// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.UnifiedRoleScheduleBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application Role Schedules Parameter Set.
 */
public class RbacApplicationRoleSchedulesParameterSet {
    /**
     * The directory Scope Id.
     * 
     */
    @SerializedName(value = "directoryScopeId", alternate = {"DirectoryScopeId"})
    @Expose
	@Nullable
    public String directoryScopeId;

    /**
     * The app Scope Id.
     * 
     */
    @SerializedName(value = "appScopeId", alternate = {"AppScopeId"})
    @Expose
	@Nullable
    public String appScopeId;

    /**
     * The principal Id.
     * 
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public String principalId;

    /**
     * The role Definition Id.
     * 
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
	@Nullable
    public String roleDefinitionId;


    /**
     * Instiaciates a new RbacApplicationRoleSchedulesParameterSet
     */
    public RbacApplicationRoleSchedulesParameterSet() {}
    /**
     * Instiaciates a new RbacApplicationRoleSchedulesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected RbacApplicationRoleSchedulesParameterSet(@Nonnull final RbacApplicationRoleSchedulesParameterSetBuilder builder) {
        this.directoryScopeId = builder.directoryScopeId;
        this.appScopeId = builder.appScopeId;
        this.principalId = builder.principalId;
        this.roleDefinitionId = builder.roleDefinitionId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static RbacApplicationRoleSchedulesParameterSetBuilder newBuilder() {
        return new RbacApplicationRoleSchedulesParameterSetBuilder();
    }
    /**
     * Fluent builder for the RbacApplicationRoleSchedulesParameterSet
     */
    public static final class RbacApplicationRoleSchedulesParameterSetBuilder {
        /**
         * The directoryScopeId parameter value
         */
        @Nullable
        protected String directoryScopeId;
        /**
         * Sets the DirectoryScopeId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RbacApplicationRoleSchedulesParameterSetBuilder withDirectoryScopeId(@Nullable final String val) {
            this.directoryScopeId = val;
            return this;
        }
        /**
         * The appScopeId parameter value
         */
        @Nullable
        protected String appScopeId;
        /**
         * Sets the AppScopeId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RbacApplicationRoleSchedulesParameterSetBuilder withAppScopeId(@Nullable final String val) {
            this.appScopeId = val;
            return this;
        }
        /**
         * The principalId parameter value
         */
        @Nullable
        protected String principalId;
        /**
         * Sets the PrincipalId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RbacApplicationRoleSchedulesParameterSetBuilder withPrincipalId(@Nullable final String val) {
            this.principalId = val;
            return this;
        }
        /**
         * The roleDefinitionId parameter value
         */
        @Nullable
        protected String roleDefinitionId;
        /**
         * Sets the RoleDefinitionId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RbacApplicationRoleSchedulesParameterSetBuilder withRoleDefinitionId(@Nullable final String val) {
            this.roleDefinitionId = val;
            return this;
        }
        /**
         * Instanciates a new RbacApplicationRoleSchedulesParameterSetBuilder
         */
        @Nullable
        protected RbacApplicationRoleSchedulesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public RbacApplicationRoleSchedulesParameterSet build() {
            return new RbacApplicationRoleSchedulesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.directoryScopeId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("directoryScopeId", directoryScopeId));
        }
        if(this.appScopeId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("appScopeId", appScopeId));
        }
        if(this.principalId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("principalId", principalId));
        }
        if(this.roleDefinitionId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("roleDefinitionId", roleDefinitionId));
        }
        return result;
    }
}
