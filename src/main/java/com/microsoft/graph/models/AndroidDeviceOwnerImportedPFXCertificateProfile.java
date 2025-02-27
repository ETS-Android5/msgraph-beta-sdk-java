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
import com.microsoft.graph.models.IntendedPurpose;
import com.microsoft.graph.models.ManagedDeviceCertificateState;
import com.microsoft.graph.models.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Imported PFXCertificate Profile.
 */
public class AndroidDeviceOwnerImportedPFXCertificateProfile extends AndroidDeviceOwnerCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Intended Purpose.
     * Intended Purpose of the Certificate Profile - which could be Unassigned, SmimeEncryption, SmimeSigning etc. Possible values are: unassigned, smimeEncryption, smimeSigning, vpn, wifi.
     */
    @SerializedName(value = "intendedPurpose", alternate = {"IntendedPurpose"})
    @Expose
	@Nullable
    public IntendedPurpose intendedPurpose;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices. This collection can contain a maximum of 2147483647 elements.
     */
    @SerializedName(value = "managedDeviceCertificateStates", alternate = {"ManagedDeviceCertificateStates"})
    @Expose
	@Nullable
    public ManagedDeviceCertificateStateCollectionPage managedDeviceCertificateStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("managedDeviceCertificateStates")) {
            managedDeviceCertificateStates = serializer.deserializeObject(json.get("managedDeviceCertificateStates"), ManagedDeviceCertificateStateCollectionPage.class);
        }
    }
}
