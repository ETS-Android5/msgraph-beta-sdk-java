package microsoft.graph.serviceprincipals.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.ServicePrincipal;
import microsoft.graph.serviceprincipals.item.addtokensigningcertificate.AddTokenSigningCertificateRequestBuilder;
import microsoft.graph.serviceprincipals.item.appmanagementpolicies.AppManagementPoliciesRequestBuilder;
import microsoft.graph.serviceprincipals.item.appmanagementpolicies.item.AppManagementPolicyItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.approleassignedto.AppRoleAssignedToRequestBuilder;
import microsoft.graph.serviceprincipals.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import microsoft.graph.serviceprincipals.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import microsoft.graph.serviceprincipals.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import microsoft.graph.serviceprincipals.item.claimsmappingpolicies.ClaimsMappingPoliciesRequestBuilder;
import microsoft.graph.serviceprincipals.item.claimsmappingpolicies.item.ClaimsMappingPolicyItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.createdobjects.CreatedObjectsRequestBuilder;
import microsoft.graph.serviceprincipals.item.createpasswordsinglesignoncredentials.CreatePasswordSingleSignOnCredentialsRequestBuilder;
import microsoft.graph.serviceprincipals.item.delegatedpermissionclassifications.DelegatedPermissionClassificationsRequestBuilder;
import microsoft.graph.serviceprincipals.item.delegatedpermissionclassifications.item.DelegatedPermissionClassificationItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.deletepasswordsinglesignoncredentials.DeletePasswordSingleSignOnCredentialsRequestBuilder;
import microsoft.graph.serviceprincipals.item.endpoints.EndpointsRequestBuilder;
import microsoft.graph.serviceprincipals.item.endpoints.item.EndpointItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.federatedidentitycredentials.FederatedIdentityCredentialsRequestBuilder;
import microsoft.graph.serviceprincipals.item.federatedidentitycredentials.item.FederatedIdentityCredentialItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.getmembergroups.GetMemberGroupsRequestBuilder;
import microsoft.graph.serviceprincipals.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import microsoft.graph.serviceprincipals.item.getpasswordsinglesignoncredentials.GetPasswordSingleSignOnCredentialsRequestBuilder;
import microsoft.graph.serviceprincipals.item.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import microsoft.graph.serviceprincipals.item.homerealmdiscoverypolicies.item.HomeRealmDiscoveryPolicyItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.licensedetails.item.LicenseDetailsItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.licensedetails.LicenseDetailsRequestBuilder;
import microsoft.graph.serviceprincipals.item.memberof.MemberOfRequestBuilder;
import microsoft.graph.serviceprincipals.item.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import microsoft.graph.serviceprincipals.item.ownedobjects.OwnedObjectsRequestBuilder;
import microsoft.graph.serviceprincipals.item.owners.OwnersRequestBuilder;
import microsoft.graph.serviceprincipals.item.restore.RestoreRequestBuilder;
import microsoft.graph.serviceprincipals.item.synchronization.SynchronizationRequestBuilder;
import microsoft.graph.serviceprincipals.item.tokenissuancepolicies.item.TokenIssuancePolicyItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.item.TokenLifetimePolicyItemRequestBuilder;
import microsoft.graph.serviceprincipals.item.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import microsoft.graph.serviceprincipals.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import microsoft.graph.serviceprincipals.item.updatepasswordsinglesignoncredentials.UpdatePasswordSingleSignOnCredentialsRequestBuilder;
/** Provides operations to manage the collection of servicePrincipal entities. */
public class ServicePrincipalItemRequestBuilder {
    /** The addTokenSigningCertificate property */
    @javax.annotation.Nonnull
    public AddTokenSigningCertificateRequestBuilder addTokenSigningCertificate() {
        return new AddTokenSigningCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appManagementPolicies property */
    @javax.annotation.Nonnull
    public AppManagementPoliciesRequestBuilder appManagementPolicies() {
        return new AppManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignedTo property */
    @javax.annotation.Nonnull
    public AppRoleAssignedToRequestBuilder appRoleAssignedTo() {
        return new AppRoleAssignedToRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignments property */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberGroups property */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberObjects property */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The claimsMappingPolicies property */
    @javax.annotation.Nonnull
    public ClaimsMappingPoliciesRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createdObjects property */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createPasswordSingleSignOnCredentials property */
    @javax.annotation.Nonnull
    public CreatePasswordSingleSignOnCredentialsRequestBuilder createPasswordSingleSignOnCredentials() {
        return new CreatePasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The delegatedPermissionClassifications property */
    @javax.annotation.Nonnull
    public DelegatedPermissionClassificationsRequestBuilder delegatedPermissionClassifications() {
        return new DelegatedPermissionClassificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deletePasswordSingleSignOnCredentials property */
    @javax.annotation.Nonnull
    public DeletePasswordSingleSignOnCredentialsRequestBuilder deletePasswordSingleSignOnCredentials() {
        return new DeletePasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The endpoints property */
    @javax.annotation.Nonnull
    public EndpointsRequestBuilder endpoints() {
        return new EndpointsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The federatedIdentityCredentials property */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialsRequestBuilder federatedIdentityCredentials() {
        return new FederatedIdentityCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberGroups property */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberObjects property */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getPasswordSingleSignOnCredentials property */
    @javax.annotation.Nonnull
    public GetPasswordSingleSignOnCredentialsRequestBuilder getPasswordSingleSignOnCredentials() {
        return new GetPasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The homeRealmDiscoveryPolicies property */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The licenseDetails property */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The memberOf property */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The oauth2PermissionGrants property */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedObjects property */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The owners property */
    @javax.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The restore property */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The synchronization property */
    @javax.annotation.Nonnull
    public SynchronizationRequestBuilder synchronization() {
        return new SynchronizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tokenIssuancePolicies property */
    @javax.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tokenLifetimePolicies property */
    @javax.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveMemberOf property */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The updatePasswordSingleSignOnCredentials property */
    @javax.annotation.Nonnull
    public UpdatePasswordSingleSignOnCredentialsRequestBuilder updatePasswordSingleSignOnCredentials() {
        return new UpdatePasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.appManagementPolicies.item collection
     * @param id Unique identifier of the item
     * @return a appManagementPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppManagementPolicyItemRequestBuilder appManagementPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appManagementPolicy%2Did", id);
        return new AppManagementPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.appRoleAssignedTo.item collection
     * @param id Unique identifier of the item
     * @return a appRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.approleassignedto.item.AppRoleAssignmentItemRequestBuilder appRoleAssignedTo(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new microsoft.graph.serviceprincipals.item.approleassignedto.item.AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.appRoleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a appRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder appRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new microsoft.graph.serviceprincipals.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.claimsMappingPolicies.item collection
     * @param id Unique identifier of the item
     * @return a claimsMappingPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ClaimsMappingPolicyItemRequestBuilder claimsMappingPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("claimsMappingPolicy%2Did", id);
        return new ClaimsMappingPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ServicePrincipalItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ServicePrincipalItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ServicePrincipalItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public ServicePrincipalItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete servicePrincipal
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderDeleteRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.createdObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.serviceprincipals.item.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get servicePrincipal
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderGetRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Assign, update, or remove custom security attributes using the Microsoft Graph API (Preview)
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ServicePrincipal body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Assign, update, or remove custom security attributes using the Microsoft Graph API (Preview)
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ServicePrincipal body, @javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ServicePrincipalItemRequestBuilderPatchRequestConfiguration requestConfig = new ServicePrincipalItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.delegatedPermissionClassifications.item collection
     * @param id Unique identifier of the item
     * @return a delegatedPermissionClassificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DelegatedPermissionClassificationItemRequestBuilder delegatedPermissionClassifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("delegatedPermissionClassification%2Did", id);
        return new DelegatedPermissionClassificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete servicePrincipal
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.endpoints.item collection
     * @param id Unique identifier of the item
     * @return a endpointItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public EndpointItemRequestBuilder endpoints(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("endpoint%2Did", id);
        return new EndpointItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.federatedIdentityCredentials.item collection
     * @param id Unique identifier of the item
     * @return a federatedIdentityCredentialItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialItemRequestBuilder federatedIdentityCredentials(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("federatedIdentityCredential%2Did", id);
        return new FederatedIdentityCredentialItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get servicePrincipal
     * @return a CompletableFuture of servicePrincipal
     */
    public java.util.concurrent.CompletableFuture<ServicePrincipal> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of servicePrincipal
     */
    public java.util.concurrent.CompletableFuture<ServicePrincipal> get(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get servicePrincipal
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of servicePrincipal
     */
    public java.util.concurrent.CompletableFuture<ServicePrincipal> get(@javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ServicePrincipal::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.homeRealmDiscoveryPolicies.item collection
     * @param id Unique identifier of the item
     * @return a homeRealmDiscoveryPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPolicyItemRequestBuilder homeRealmDiscoveryPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("homeRealmDiscoveryPolicy%2Did", id);
        return new HomeRealmDiscoveryPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.licenseDetails.item collection
     * @param id Unique identifier of the item
     * @return a licenseDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LicenseDetailsItemRequestBuilder licenseDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("licenseDetails%2Did", id);
        return new LicenseDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.memberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.serviceprincipals.item.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.oauth2PermissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a oAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.ownedObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.serviceprincipals.item.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.owners.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.owners.item.DirectoryObjectItemRequestBuilder owners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.serviceprincipals.item.owners.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Assign, update, or remove custom security attributes using the Microsoft Graph API (Preview)
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ServicePrincipal body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Assign, update, or remove custom security attributes using the Microsoft Graph API (Preview)
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ServicePrincipal body, @javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Assign, update, or remove custom security attributes using the Microsoft Graph API (Preview)
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final ServicePrincipal body, @javax.annotation.Nullable final java.util.function.Consumer<ServicePrincipalItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.tokenIssuancePolicies.item collection
     * @param id Unique identifier of the item
     * @return a tokenIssuancePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenIssuancePolicyItemRequestBuilder tokenIssuancePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenIssuancePolicy%2Did", id);
        return new TokenIssuancePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.tokenLifetimePolicies.item collection
     * @param id Unique identifier of the item
     * @return a tokenLifetimePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenLifetimePolicyItemRequestBuilder tokenLifetimePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenLifetimePolicy%2Did", id);
        return new TokenLifetimePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.servicePrincipals.item.transitiveMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.serviceprincipals.item.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.serviceprincipals.item.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new servicePrincipalItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public ServicePrincipalItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get servicePrincipal */
    public class ServicePrincipalItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ServicePrincipalItemRequestBuilderGetQueryParameters queryParameters = new ServicePrincipalItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new servicePrincipalItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public ServicePrincipalItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ServicePrincipalItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new servicePrincipalItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public ServicePrincipalItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
