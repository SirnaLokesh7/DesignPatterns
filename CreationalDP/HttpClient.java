//Builder DP

public class HttpClient{
    public String method;
    public String url;
    public String username;
    public String password;
    public String headers;
    public String body; 
    public HttpClient(String method, String url, String username, String password, String headers, String body) {
        this.method = method;
        this.url = url;
        this.username = username;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }
    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }
    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;
        public HttpClientBuilder method(String method){
            this.method=method;
            return this;
        }
        public HttpClientBuilder url(String url){
            this.url=url;
            return this;
        }
        public HttpClientBuilder username(String username){
            this.username=username;
            return this;
        }
        public HttpClientBuilder password(String password){
            this.password=password;
            return this;
        }
        public HttpClientBuilder headers(String headers){
            this.headers=headers;
            return this;
        }
        public HttpClientBuilder body(String body){
            this.body=body;
            return this;
        }
        public HttpClient build(){
            return new HttpClient(this);
        }
    }
    public String getMethod() {
        return this.method;
    }
    public String getUrl() {
        return this.url;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getHeaders() {
        return this.headers;
    }
    public String getBody() {
        return this.body;
    }


    @Override
    public String toString() {
        return "{" +
            " method='" + getMethod() + "'" +
            ", url='" + getUrl() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", headers='" + getHeaders() + "'" +
            ", body='" + getBody() + "'" +
            "}";
    }
}

class Test{
    public static void main(String[] args) {
        HttpClient obj=new HttpClient("method", "url", "username", "password", "headers", "body");
        obj.getClass();
        HttpClient.HttpClientBuilder builder=new HttpClient.HttpClientBuilder();
        HttpClient client=builder.method("method").url("url").build();
        System.out.println(client);
    }
}
