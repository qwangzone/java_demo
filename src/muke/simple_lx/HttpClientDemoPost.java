package muke.simple_lx;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class HttpClientDemoPost {
    public static void main(String[] args) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;
        String url = "http://kunlun.gzns-waimai-dcloud34.gzns.iwm.name:19215/openapi/api/skuupdate";

        URIBuilder builder = new URIBuilder(url);
        URI uri = builder.build();
//        builder.addParameter("shop_id","")
        HttpPost httpPost = new HttpPost(uri);

        httpResponse = httpClient.execute(httpPost);
        String respongsestring = EntityUtils.toString(httpResponse.getEntity());
        JSONObject jsonObject = JSONObject.parseObject(respongsestring);
        System.out.println(jsonObject);
    }
}
