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
import com.microsoft.graph.models.SecurityProviderStatus;
import com.microsoft.graph.models.SubjectRightsRequest;
import com.microsoft.graph.security.models.CasesRoot;
import com.microsoft.graph.security.models.InformationProtection;
import com.microsoft.graph.models.AttackSimulationRoot;
import com.microsoft.graph.models.Alert;
import com.microsoft.graph.models.CloudAppSecurityProfile;
import com.microsoft.graph.models.DomainSecurityProfile;
import com.microsoft.graph.models.FileSecurityProfile;
import com.microsoft.graph.models.HostSecurityProfile;
import com.microsoft.graph.models.IpSecurityProfile;
import com.microsoft.graph.models.ProviderTenantSetting;
import com.microsoft.graph.models.SecureScoreControlProfile;
import com.microsoft.graph.models.SecureScore;
import com.microsoft.graph.models.SecurityAction;
import com.microsoft.graph.models.TiIndicator;
import com.microsoft.graph.models.UserSecurityProfile;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.SubjectRightsRequestCollectionPage;
import com.microsoft.graph.requests.AlertCollectionPage;
import com.microsoft.graph.requests.CloudAppSecurityProfileCollectionPage;
import com.microsoft.graph.requests.DomainSecurityProfileCollectionPage;
import com.microsoft.graph.requests.FileSecurityProfileCollectionPage;
import com.microsoft.graph.requests.HostSecurityProfileCollectionPage;
import com.microsoft.graph.requests.IpSecurityProfileCollectionPage;
import com.microsoft.graph.requests.ProviderTenantSettingCollectionPage;
import com.microsoft.graph.requests.SecureScoreControlProfileCollectionPage;
import com.microsoft.graph.requests.SecureScoreCollectionPage;
import com.microsoft.graph.requests.SecurityActionCollectionPage;
import com.microsoft.graph.requests.TiIndicatorCollectionPage;
import com.microsoft.graph.requests.UserSecurityProfileCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security.
 */
public class Security extends Entity implements IJsonBackedObject {


    /**
     * The Provider Status.
     * 
     */
    @SerializedName(value = "providerStatus", alternate = {"ProviderStatus"})
    @Expose
	@Nullable
    public java.util.List<SecurityProviderStatus> providerStatus;

    /**
     * The Subject Rights Requests.
     * 
     */
    @SerializedName(value = "subjectRightsRequests", alternate = {"SubjectRightsRequests"})
    @Expose
	@Nullable
    public SubjectRightsRequestCollectionPage subjectRightsRequests;

    /**
     * The Cases.
     * 
     */
    @SerializedName(value = "cases", alternate = {"Cases"})
    @Expose
	@Nullable
    public CasesRoot cases;

    /**
     * The Information Protection.
     * 
     */
    @SerializedName(value = "informationProtection", alternate = {"InformationProtection"})
    @Expose
	@Nullable
    public InformationProtection informationProtection;

    /**
     * The Attack Simulation.
     * Provides tenants capability to launch a simulated and realistic phishing attack and learn from it.
     */
    @SerializedName(value = "attackSimulation", alternate = {"AttackSimulation"})
    @Expose
	@Nullable
    public AttackSimulationRoot attackSimulation;

    /**
     * The Alerts.
     * Notifications for suspicious or potential security issues in a customer’s tenant.
     */
    @SerializedName(value = "alerts", alternate = {"Alerts"})
    @Expose
	@Nullable
    public AlertCollectionPage alerts;

    /**
     * The Cloud App Security Profiles.
     * 
     */
    @SerializedName(value = "cloudAppSecurityProfiles", alternate = {"CloudAppSecurityProfiles"})
    @Expose
	@Nullable
    public CloudAppSecurityProfileCollectionPage cloudAppSecurityProfiles;

    /**
     * The Domain Security Profiles.
     * 
     */
    @SerializedName(value = "domainSecurityProfiles", alternate = {"DomainSecurityProfiles"})
    @Expose
	@Nullable
    public DomainSecurityProfileCollectionPage domainSecurityProfiles;

    /**
     * The File Security Profiles.
     * 
     */
    @SerializedName(value = "fileSecurityProfiles", alternate = {"FileSecurityProfiles"})
    @Expose
	@Nullable
    public FileSecurityProfileCollectionPage fileSecurityProfiles;

    /**
     * The Host Security Profiles.
     * 
     */
    @SerializedName(value = "hostSecurityProfiles", alternate = {"HostSecurityProfiles"})
    @Expose
	@Nullable
    public HostSecurityProfileCollectionPage hostSecurityProfiles;

    /**
     * The Ip Security Profiles.
     * 
     */
    @SerializedName(value = "ipSecurityProfiles", alternate = {"IpSecurityProfiles"})
    @Expose
	@Nullable
    public IpSecurityProfileCollectionPage ipSecurityProfiles;

    /**
     * The Provider Tenant Settings.
     * 
     */
    @SerializedName(value = "providerTenantSettings", alternate = {"ProviderTenantSettings"})
    @Expose
	@Nullable
    public ProviderTenantSettingCollectionPage providerTenantSettings;

    /**
     * The Secure Score Control Profiles.
     * 
     */
    @SerializedName(value = "secureScoreControlProfiles", alternate = {"SecureScoreControlProfiles"})
    @Expose
	@Nullable
    public SecureScoreControlProfileCollectionPage secureScoreControlProfiles;

    /**
     * The Secure Scores.
     * 
     */
    @SerializedName(value = "secureScores", alternate = {"SecureScores"})
    @Expose
	@Nullable
    public SecureScoreCollectionPage secureScores;

    /**
     * The Security Actions.
     * 
     */
    @SerializedName(value = "securityActions", alternate = {"SecurityActions"})
    @Expose
	@Nullable
    public SecurityActionCollectionPage securityActions;

    /**
     * The Ti Indicators.
     * 
     */
    @SerializedName(value = "tiIndicators", alternate = {"TiIndicators"})
    @Expose
	@Nullable
    public TiIndicatorCollectionPage tiIndicators;

    /**
     * The User Security Profiles.
     * 
     */
    @SerializedName(value = "userSecurityProfiles", alternate = {"UserSecurityProfiles"})
    @Expose
	@Nullable
    public UserSecurityProfileCollectionPage userSecurityProfiles;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("subjectRightsRequests")) {
            subjectRightsRequests = serializer.deserializeObject(json.get("subjectRightsRequests"), SubjectRightsRequestCollectionPage.class);
        }

        if (json.has("alerts")) {
            alerts = serializer.deserializeObject(json.get("alerts"), AlertCollectionPage.class);
        }

        if (json.has("cloudAppSecurityProfiles")) {
            cloudAppSecurityProfiles = serializer.deserializeObject(json.get("cloudAppSecurityProfiles"), CloudAppSecurityProfileCollectionPage.class);
        }

        if (json.has("domainSecurityProfiles")) {
            domainSecurityProfiles = serializer.deserializeObject(json.get("domainSecurityProfiles"), DomainSecurityProfileCollectionPage.class);
        }

        if (json.has("fileSecurityProfiles")) {
            fileSecurityProfiles = serializer.deserializeObject(json.get("fileSecurityProfiles"), FileSecurityProfileCollectionPage.class);
        }

        if (json.has("hostSecurityProfiles")) {
            hostSecurityProfiles = serializer.deserializeObject(json.get("hostSecurityProfiles"), HostSecurityProfileCollectionPage.class);
        }

        if (json.has("ipSecurityProfiles")) {
            ipSecurityProfiles = serializer.deserializeObject(json.get("ipSecurityProfiles"), IpSecurityProfileCollectionPage.class);
        }

        if (json.has("providerTenantSettings")) {
            providerTenantSettings = serializer.deserializeObject(json.get("providerTenantSettings"), ProviderTenantSettingCollectionPage.class);
        }

        if (json.has("secureScoreControlProfiles")) {
            secureScoreControlProfiles = serializer.deserializeObject(json.get("secureScoreControlProfiles"), SecureScoreControlProfileCollectionPage.class);
        }

        if (json.has("secureScores")) {
            secureScores = serializer.deserializeObject(json.get("secureScores"), SecureScoreCollectionPage.class);
        }

        if (json.has("securityActions")) {
            securityActions = serializer.deserializeObject(json.get("securityActions"), SecurityActionCollectionPage.class);
        }

        if (json.has("tiIndicators")) {
            tiIndicators = serializer.deserializeObject(json.get("tiIndicators"), TiIndicatorCollectionPage.class);
        }

        if (json.has("userSecurityProfiles")) {
            userSecurityProfiles = serializer.deserializeObject(json.get("userSecurityProfiles"), UserSecurityProfileCollectionPage.class);
        }
    }
}
