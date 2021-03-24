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
import com.microsoft.graph.models.HashAlgorithms;
import com.microsoft.graph.models.KeySize;
import com.microsoft.graph.models.KeyUsages;
import com.microsoft.graph.models.ManagedDeviceCertificateState;
import com.microsoft.graph.models.AndroidCertificateProfileBase;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Scep Certificate Profile.
 */
public class AndroidScepCertificateProfile extends AndroidCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Hash Algorithm.
     * SCEP Hash Algorithm. Possible values are: sha1, sha2.
     */
    @SerializedName(value = "hashAlgorithm", alternate = {"HashAlgorithm"})
    @Expose
	@Nullable
    public EnumSet<HashAlgorithms> hashAlgorithm;

    /**
     * The Key Size.
     * SCEP Key Size. Possible values are: size1024, size2048, size4096.
     */
    @SerializedName(value = "keySize", alternate = {"KeySize"})
    @Expose
	@Nullable
    public KeySize keySize;

    /**
     * The Key Usage.
     * SCEP Key Usage. Possible values are: keyEncipherment, digitalSignature.
     */
    @SerializedName(value = "keyUsage", alternate = {"KeyUsage"})
    @Expose
	@Nullable
    public EnumSet<KeyUsages> keyUsage;

    /**
     * The Scep Server Urls.
     * SCEP Server Url(s)
     */
    @SerializedName(value = "scepServerUrls", alternate = {"ScepServerUrls"})
    @Expose
	@Nullable
    public java.util.List<String> scepServerUrls;

    /**
     * The Subject Alternative Name Format String.
     * Custom String that defines the AAD Attribute.
     */
    @SerializedName(value = "subjectAlternativeNameFormatString", alternate = {"SubjectAlternativeNameFormatString"})
    @Expose
	@Nullable
    public String subjectAlternativeNameFormatString;

    /**
     * The Subject Name Format String.
     * Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    @SerializedName(value = "subjectNameFormatString", alternate = {"SubjectNameFormatString"})
    @Expose
	@Nullable
    public String subjectNameFormatString;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices
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
