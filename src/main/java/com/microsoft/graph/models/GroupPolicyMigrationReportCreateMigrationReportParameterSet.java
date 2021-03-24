// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.GroupPolicyObjectFile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Migration Report Create Migration Report Parameter Set.
 */
public class GroupPolicyMigrationReportCreateMigrationReportParameterSet {
    /**
     * The group Policy Object File.
     * 
     */
    @SerializedName(value = "groupPolicyObjectFile", alternate = {"GroupPolicyObjectFile"})
    @Expose
	@Nullable
    public GroupPolicyObjectFile groupPolicyObjectFile;


    /**
     * Instiaciates a new GroupPolicyMigrationReportCreateMigrationReportParameterSet
     */
    public GroupPolicyMigrationReportCreateMigrationReportParameterSet() {}
    /**
     * Instiaciates a new GroupPolicyMigrationReportCreateMigrationReportParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupPolicyMigrationReportCreateMigrationReportParameterSet(@Nonnull final GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder builder) {
        this.groupPolicyObjectFile = builder.groupPolicyObjectFile;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder newBuilder() {
        return new GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupPolicyMigrationReportCreateMigrationReportParameterSet
     */
    public static final class GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder {
        /**
         * The groupPolicyObjectFile parameter value
         */
        @Nullable
        protected GroupPolicyObjectFile groupPolicyObjectFile;
        /**
         * Sets the GroupPolicyObjectFile
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder withGroupPolicyObjectFile(@Nullable final GroupPolicyObjectFile val) {
            this.groupPolicyObjectFile = val;
            return this;
        }
        /**
         * Instanciates a new GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder
         */
        @Nullable
        protected GroupPolicyMigrationReportCreateMigrationReportParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupPolicyMigrationReportCreateMigrationReportParameterSet build() {
            return new GroupPolicyMigrationReportCreateMigrationReportParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupPolicyObjectFile != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupPolicyObjectFile", groupPolicyObjectFile));
        }
        return result;
    }
}
