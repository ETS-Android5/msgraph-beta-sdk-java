package microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage;

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
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageassignmentpolicies.AccessPackageAssignmentPoliciesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageassignmentpolicies.item.AccessPackageAssignmentPolicyItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackagecatalog.AccessPackageCatalogRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageresourcerolescopes.AccessPackageResourceRoleScopesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageresourcerolescopes.item.AccessPackageResourceRoleScopeItemRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackagesincompatiblewith.AccessPackagesIncompatibleWithRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.getapplicablepolicyrequirements.GetApplicablePolicyRequirementsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatibleaccesspackages.IncompatibleAccessPackagesRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatiblegroups.IncompatibleGroupsRequestBuilder;
import microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatiblegroups.item.GroupItemRequestBuilder;
import microsoft.graph.models.AccessPackage;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the accessPackage property of the microsoft.graph.accessPackageAssignment entity. */
public class AccessPackageRequestBuilder {
    /** The accessPackageAssignmentPolicies property */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentPoliciesRequestBuilder accessPackageAssignmentPolicies() {
        return new AccessPackageAssignmentPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageCatalog property */
    @javax.annotation.Nonnull
    public AccessPackageCatalogRequestBuilder accessPackageCatalog() {
        return new AccessPackageCatalogRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackageResourceRoleScopes property */
    @javax.annotation.Nonnull
    public AccessPackageResourceRoleScopesRequestBuilder accessPackageResourceRoleScopes() {
        return new AccessPackageResourceRoleScopesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The accessPackagesIncompatibleWith property */
    @javax.annotation.Nonnull
    public AccessPackagesIncompatibleWithRequestBuilder accessPackagesIncompatibleWith() {
        return new AccessPackagesIncompatibleWithRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getApplicablePolicyRequirements property */
    @javax.annotation.Nonnull
    public GetApplicablePolicyRequirementsRequestBuilder getApplicablePolicyRequirements() {
        return new GetApplicablePolicyRequirementsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The incompatibleAccessPackages property */
    @javax.annotation.Nonnull
    public IncompatibleAccessPackagesRequestBuilder incompatibleAccessPackages() {
        return new IncompatibleAccessPackagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The incompatibleGroups property */
    @javax.annotation.Nonnull
    public IncompatibleGroupsRequestBuilder incompatibleGroups() {
        return new IncompatibleGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item.accessPackage.accessPackageAssignmentPolicies.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageAssignmentPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageAssignmentPolicyItemRequestBuilder accessPackageAssignmentPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageAssignmentPolicy%2Did", id);
        return new AccessPackageAssignmentPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item.accessPackage.accessPackageResourceRoleScopes.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageResourceRoleScopeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessPackageResourceRoleScopeItemRequestBuilder accessPackageResourceRoleScopes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackageResourceRoleScope%2Did", id);
        return new AccessPackageResourceRoleScopeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item.accessPackage.accessPackagesIncompatibleWith.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackagesincompatiblewith.item.AccessPackageItemRequestBuilder accessPackagesIncompatibleWith(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did", id);
        return new microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackagesincompatiblewith.item.AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AccessPackageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AccessPackageRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AccessPackageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public AccessPackageRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property accessPackage for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property accessPackage for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AccessPackageRequestBuilderDeleteRequestConfiguration requestConfig = new AccessPackageRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final AccessPackageRequestBuilderGetRequestConfiguration requestConfig = new AccessPackageRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property accessPackage in identityGovernance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AccessPackage body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property accessPackage in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AccessPackage body, @javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AccessPackageRequestBuilderPatchRequestConfiguration requestConfig = new AccessPackageRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property accessPackage for identityGovernance
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
     * Delete navigation property accessPackage for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Delete navigation property accessPackage for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a CompletableFuture of accessPackage
     */
    public java.util.concurrent.CompletableFuture<AccessPackage> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessPackage
     */
    public java.util.concurrent.CompletableFuture<AccessPackage> get(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of accessPackage
     */
    public java.util.concurrent.CompletableFuture<AccessPackage> get(@javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AccessPackage::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item.accessPackage.incompatibleAccessPackages.item collection
     * @param id Unique identifier of the item
     * @return a accessPackageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatibleaccesspackages.item.AccessPackageItemRequestBuilder incompatibleAccessPackages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessPackage%2Did", id);
        return new microsoft.graph.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.incompatibleaccesspackages.item.AccessPackageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.identityGovernance.entitlementManagement.accessPackageAssignments.item.accessPackage.incompatibleGroups.item collection
     * @param id Unique identifier of the item
     * @return a groupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder incompatibleGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property accessPackage in identityGovernance
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AccessPackage body) {
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
     * Update the navigation property accessPackage in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AccessPackage body, @javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update the navigation property accessPackage in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final AccessPackage body, @javax.annotation.Nullable final java.util.function.Consumer<AccessPackageRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AccessPackageRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new accessPackageRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public AccessPackageRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters. */
    public class AccessPackageRequestBuilderGetQueryParameters {
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
    public class AccessPackageRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public AccessPackageRequestBuilderGetQueryParameters queryParameters = new AccessPackageRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new accessPackageRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public AccessPackageRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AccessPackageRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new accessPackageRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public AccessPackageRequestBuilderPatchRequestConfiguration() {
        }
    }
}
