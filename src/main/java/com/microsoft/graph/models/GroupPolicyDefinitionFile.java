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
import com.microsoft.graph.models.GroupPolicyType;
import com.microsoft.graph.models.GroupPolicyDefinition;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File.
 */
public class GroupPolicyDefinitionFile extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The localized description of the policy settings in the ADMX file. The default value is empty.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The localized friendly name of the ADMX file.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The File Name.
     * The file name of the ADMX file without the path. For example: edge.admx
     */
    @SerializedName(value = "fileName", alternate = {"FileName"})
    @Expose
	@Nullable
    public String fileName;

    /**
     * The Language Codes.
     * The supported language codes for the ADMX file.
     */
    @SerializedName(value = "languageCodes", alternate = {"LanguageCodes"})
    @Expose
	@Nullable
    public java.util.List<String> languageCodes;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Policy Type.
     * Specifies the type of group policy. Possible values are: admxBacked, admxIngested.
     */
    @SerializedName(value = "policyType", alternate = {"PolicyType"})
    @Expose
	@Nullable
    public GroupPolicyType policyType;

    /**
     * The Revision.
     * The revision version associated with the file.
     */
    @SerializedName(value = "revision", alternate = {"Revision"})
    @Expose
	@Nullable
    public String revision;

    /**
     * The Target Namespace.
     * Specifies the URI used to identify the namespace within the ADMX file.
     */
    @SerializedName(value = "targetNamespace", alternate = {"TargetNamespace"})
    @Expose
	@Nullable
    public String targetNamespace;

    /**
     * The Target Prefix.
     * Specifies the logical name that refers to the namespace within the ADMX file.
     */
    @SerializedName(value = "targetPrefix", alternate = {"TargetPrefix"})
    @Expose
	@Nullable
    public String targetPrefix;

    /**
     * The Definitions.
     * The group policy definitions associated with the file.
     */
	@Nullable
    public GroupPolicyDefinitionCollectionPage definitions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("definitions")) {
            definitions = serializer.deserializeObject(json.get("definitions"), GroupPolicyDefinitionCollectionPage.class);
        }
    }
}
