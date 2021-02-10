// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MobileAppDependencyType;
import com.microsoft.graph.models.extensions.MobileAppRelationship;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Dependency.
 */
public class MobileAppDependency extends MobileAppRelationship implements IJsonBackedObject {


    /**
     * The Dependency Type.
     * The type of dependency relationship between the parent and child apps. Possible values are: detect, autoInstall.
     */
    @SerializedName(value = "dependencyType", alternate = {"DependencyType"})
    @Expose
    public MobileAppDependencyType dependencyType;

    /**
     * The Dependent App Count.
     * The total number of apps that directly or indirectly depend on the parent app.
     */
    @SerializedName(value = "dependentAppCount", alternate = {"DependentAppCount"})
    @Expose
    public Integer dependentAppCount;

    /**
     * The Depends On App Count.
     * The total number of apps the child app directly or indirectly depends on.
     */
    @SerializedName(value = "dependsOnAppCount", alternate = {"DependsOnAppCount"})
    @Expose
    public Integer dependsOnAppCount;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
