package muke.simple_lx;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class HttpClientDemo {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8000";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            //创建uri
            URIBuilder builder = new URIBuilder(url);

            URI uri = builder.build();

            //创建get请求
            HttpGet httpGet = new HttpGet(uri);
            //执行请求
            //背后还是用url封装的
            //HttpGet httpGet = new HttpGet(url);
            HttpPost httpPost = new HttpPost();
            response = httpClient.execute(httpGet);
            System.out.println(EntityUtils.toString(response.getEntity(), "UTF-8"));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
