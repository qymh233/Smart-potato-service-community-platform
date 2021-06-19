package yamplatform.spscp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "upload")
public class UploadProperties {
    private Qiniu qiniu = new Qiniu();
    public Qiniu getQiniu() {
        return qiniu;
    }
    /**
     * 七牛云上传配置
     */
    public class Qiniu {
        /**
         * 域名
         */
        private String domain;
        private String accessKey;
        private String secretKey;
        /**
         * 存储空间名
         */
        private String bucket;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }
    }
}
