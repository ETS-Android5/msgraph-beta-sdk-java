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
import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.models.GroupPolicyUploadedDefinitionFileStatus;
import com.microsoft.graph.models.GroupPolicyOperation;
import com.microsoft.graph.models.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.GroupPolicyOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File.
 */
public class GroupPolicyUploadedDefinitionFile extends GroupPolicyDefinitionFile implements IJsonBackedObject {


    /**
     * The Content.
     * The contents of the uploaded ADMX file.
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
	@Nullable
    public byte[] content;

    /**
     * The Default Language Code.
     * The default language of the uploaded ADMX file.
     */
    @SerializedName(value = "defaultLanguageCode", alternate = {"DefaultLanguageCode"})
    @Expose
	@Nullable
    public String defaultLanguageCode;

    /**
     * The Group Policy Uploaded Language Files.
     * The list of ADML files associated with the uploaded ADMX file.
     */
    @SerializedName(value = "groupPolicyUploadedLanguageFiles", alternate = {"GroupPolicyUploadedLanguageFiles"})
    @Expose
	@Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;

    /**
     * The Status.
     * The upload status of the uploaded ADMX file. Possible values are: none, uploadInProgress, available, assigned, removalInProgress, uploadFailed, removalFailed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public GroupPolicyUploadedDefinitionFileStatus status;

    /**
     * The Upload Date Time.
     * The uploaded time of the uploaded ADMX file.
     */
    @SerializedName(value = "uploadDateTime", alternate = {"UploadDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime uploadDateTime;

    /**
     * The Group Policy Operations.
     * The list of operations on the uploaded ADMX file.
     */
    @SerializedName(value = "groupPolicyOperations", alternate = {"GroupPolicyOperations"})
    @Expose
	@Nullable
    public GroupPolicyOperationCollectionPage groupPolicyOperations;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("groupPolicyOperations")) {
            groupPolicyOperations = serializer.deserializeObject(json.get("groupPolicyOperations"), GroupPolicyOperationCollectionPage.class);
        }
    }
}
