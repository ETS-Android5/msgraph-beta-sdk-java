// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ClassificationAttribute;
import com.microsoft.graph.models.ClassificationMethod;
import com.microsoft.graph.models.SensitiveContentLocation;
import com.microsoft.graph.models.SensitiveTypeScope;
import com.microsoft.graph.models.SensitiveTypeSource;
import com.microsoft.graph.models.DetectedSensitiveContentBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected Sensitive Content.
 */
public class DetectedSensitiveContent extends DetectedSensitiveContentBase implements IJsonBackedObject {


    /**
     * The Classification Attributes.
     * 
     */
    @SerializedName(value = "classificationAttributes", alternate = {"ClassificationAttributes"})
    @Expose
	@Nullable
    public java.util.List<ClassificationAttribute> classificationAttributes;

    /**
     * The Classification Method.
     * 
     */
    @SerializedName(value = "classificationMethod", alternate = {"ClassificationMethod"})
    @Expose
	@Nullable
    public ClassificationMethod classificationMethod;

    /**
     * The Matches.
     * 
     */
    @SerializedName(value = "matches", alternate = {"Matches"})
    @Expose
	@Nullable
    public java.util.List<SensitiveContentLocation> matches;

    /**
     * The Scope.
     * 
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public EnumSet<SensitiveTypeScope> scope;

    /**
     * The Sensitive Type Source.
     * 
     */
    @SerializedName(value = "sensitiveTypeSource", alternate = {"SensitiveTypeSource"})
    @Expose
	@Nullable
    public SensitiveTypeSource sensitiveTypeSource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
