package microsoft.graph.privilegedsignupstatus;

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
import microsoft.graph.models.PrivilegedSignupStatus;
import microsoft.graph.models.PrivilegedSignupStatusCollectionResponse;
import microsoft.graph.privilegedsignupstatus.cansignup.CanSignUpRequestBuilder;
import microsoft.graph.privilegedsignupstatus.completesetup.CompleteSetupRequestBuilder;
import microsoft.graph.privilegedsignupstatus.count.CountRequestBuilder;
import microsoft.graph.privilegedsignupstatus.issignedup.IsSignedUpRequestBuilder;
import microsoft.graph.privilegedsignupstatus.signup.SignUpRequestBuilder;
/** Provides operations to manage the collection of privilegedSignupStatus entities. */
public class PrivilegedSignupStatusRequestBuilder {
    /** The completeSetup property */
    @javax.annotation.Nonnull
    public CompleteSetupRequestBuilder completeSetup() {
        return new CompleteSetupRequestBuilder(pathParameters, requestAdapter);
    }
    /** The count property */
    @javax.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The signUp property */
    @javax.annotation.Nonnull
    public SignUpRequestBuilder signUp() {
        return new SignUpRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Provides operations to call the canSignUp method.
     * @return a canSignUpRequestBuilder
     */
    @javax.annotation.Nonnull
    public CanSignUpRequestBuilder canSignUp() {
        return new CanSignUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PrivilegedSignupStatusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public PrivilegedSignupStatusRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/privilegedSignupStatus{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new PrivilegedSignupStatusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public PrivilegedSignupStatusRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/privilegedSignupStatus{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get entities from privilegedSignupStatus
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entities from privilegedSignupStatus
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final PrivilegedSignupStatusRequestBuilderGetRequestConfiguration requestConfig = new PrivilegedSignupStatusRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final PrivilegedSignupStatus body) throws URISyntaxException {
        return createPostRequestInformation(body, null);
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPostRequestInformation(@javax.annotation.Nonnull final PrivilegedSignupStatus body, @javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderPostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.POST;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PrivilegedSignupStatusRequestBuilderPostRequestConfiguration requestConfig = new PrivilegedSignupStatusRequestBuilderPostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entities from privilegedSignupStatus
     * @return a CompletableFuture of PrivilegedSignupStatusCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatusCollectionResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatusCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entities from privilegedSignupStatus
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of PrivilegedSignupStatusCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatusCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatusCollectionResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entities from privilegedSignupStatus
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of PrivilegedSignupStatusCollectionResponse
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatusCollectionResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatusCollectionResponse::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Provides operations to call the isSignedUp method.
     * @return a isSignedUpRequestBuilder
     */
    @javax.annotation.Nonnull
    public IsSignedUpRequestBuilder isSignedUp() {
        return new IsSignedUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body 
     * @return a CompletableFuture of privilegedSignupStatus
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatus> post(@javax.annotation.Nonnull final PrivilegedSignupStatus body) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatus::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of privilegedSignupStatus
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatus> post(@javax.annotation.Nonnull final PrivilegedSignupStatus body, @javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderPostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatus::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of privilegedSignupStatus
     */
    public java.util.concurrent.CompletableFuture<PrivilegedSignupStatus> post(@javax.annotation.Nonnull final PrivilegedSignupStatus body, @javax.annotation.Nullable final java.util.function.Consumer<PrivilegedSignupStatusRequestBuilderPostRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, PrivilegedSignupStatus::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Get entities from privilegedSignupStatus */
    public class PrivilegedSignupStatusRequestBuilderGetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PrivilegedSignupStatusRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public PrivilegedSignupStatusRequestBuilderGetQueryParameters queryParameters = new PrivilegedSignupStatusRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new privilegedSignupStatusRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public PrivilegedSignupStatusRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PrivilegedSignupStatusRequestBuilderPostRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new privilegedSignupStatusRequestBuilderPostRequestConfiguration and sets the default values.
         * @return a void
         */
        public PrivilegedSignupStatusRequestBuilderPostRequestConfiguration() {
        }
    }
}
