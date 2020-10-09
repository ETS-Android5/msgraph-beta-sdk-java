// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryAudit;
import com.microsoft.graph.models.extensions.ProvisioningObjectSummary;
import com.microsoft.graph.models.extensions.RestrictedSignIn;
import com.microsoft.graph.models.extensions.SignIn;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionPage;
import com.microsoft.graph.requests.extensions.ProvisioningObjectSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionPage;
import com.microsoft.graph.requests.extensions.SignInCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root.
 */
public class AuditLogRoot extends Entity implements IJsonBackedObject {


    /**
     * The Directory Audits.
     * Read-only. Nullable.
     */
    @SerializedName(value = "directoryAudits", alternate = {"DirectoryAudits"})
    @Expose
    public DirectoryAuditCollectionPage directoryAudits;

    /**
     * The Directory Provisioning.
     * 
     */
    @SerializedName(value = "directoryProvisioning", alternate = {"DirectoryProvisioning"})
    @Expose
    public ProvisioningObjectSummaryCollectionPage directoryProvisioning;

    /**
     * The Provisioning.
     * 
     */
    @SerializedName(value = "provisioning", alternate = {"Provisioning"})
    @Expose
    public ProvisioningObjectSummaryCollectionPage provisioning;

    /**
     * The Restricted Sign Ins.
     * 
     */
    @SerializedName(value = "restrictedSignIns", alternate = {"RestrictedSignIns"})
    @Expose
    public RestrictedSignInCollectionPage restrictedSignIns;

    /**
     * The Sign Ins.
     * Read-only. Nullable.
     */
    @SerializedName(value = "signIns", alternate = {"SignIns"})
    @Expose
    public SignInCollectionPage signIns;


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


        if (json.has("directoryAudits")) {
            directoryAudits = serializer.deserializeObject(json.get("directoryAudits").toString(), DirectoryAuditCollectionPage.class);
        }

        if (json.has("directoryProvisioning")) {
            directoryProvisioning = serializer.deserializeObject(json.get("directoryProvisioning").toString(), ProvisioningObjectSummaryCollectionPage.class);
        }

        if (json.has("provisioning")) {
            provisioning = serializer.deserializeObject(json.get("provisioning").toString(), ProvisioningObjectSummaryCollectionPage.class);
        }

        if (json.has("restrictedSignIns")) {
            restrictedSignIns = serializer.deserializeObject(json.get("restrictedSignIns").toString(), RestrictedSignInCollectionPage.class);
        }

        if (json.has("signIns")) {
            signIns = serializer.deserializeObject(json.get("signIns").toString(), SignInCollectionPage.class);
        }
    }
}
