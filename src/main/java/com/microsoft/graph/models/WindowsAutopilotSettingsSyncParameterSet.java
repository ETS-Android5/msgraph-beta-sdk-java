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
 * The class for the Windows Autopilot Settings Sync Parameter Set.
 */
public class WindowsAutopilotSettingsSyncParameterSet {

    /**
     * Instiaciates a new WindowsAutopilotSettingsSyncParameterSet
     */
    public WindowsAutopilotSettingsSyncParameterSet() {}
    /**
     * Instiaciates a new WindowsAutopilotSettingsSyncParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WindowsAutopilotSettingsSyncParameterSet(@Nonnull final WindowsAutopilotSettingsSyncParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WindowsAutopilotSettingsSyncParameterSetBuilder newBuilder() {
        return new WindowsAutopilotSettingsSyncParameterSetBuilder();
    }
    /**
     * Fluent builder for the WindowsAutopilotSettingsSyncParameterSet
     */
    public static final class WindowsAutopilotSettingsSyncParameterSetBuilder {
        /**
         * Instanciates a new WindowsAutopilotSettingsSyncParameterSetBuilder
         */
        @Nullable
        protected WindowsAutopilotSettingsSyncParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WindowsAutopilotSettingsSyncParameterSet build() {
            return new WindowsAutopilotSettingsSyncParameterSet(this);
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
