import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

import com.zjrodger.e3mall.common.util.FastDFSClient;




public class FastDFSTest {

//	@Test
	public void testUpload() throws Exception {
		//创建一个配置文件。文件名任意。内容就是tracker服务器的地址。
		//使用全局对象加载配置文件。
		ClientGlobal.init("C:/WorkSpace4E3Mall/E3Mall/e3-manager-web/src/main/resources/conf/client.conf");
		//创建一个TrackerClient对象
		TrackerClient trackerClient = new TrackerClient();
		//通过TrackClient获得一个TrackerServer对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建一个StrorageServer的引用，可以是null
		StorageServer storageServer = null;
		//创建一个StorageClient，参数需要TrackerServer和StrorageServer
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		//使用StorageClient上传文件。
		String[] strings = storageClient.upload_file("C:/Tmp/01.png", "png", null);
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) throws Exception {
		FastDFSTest obj = new FastDFSTest();
		obj.testUpload();
	}
	
	@Test
	public void testFastDfsClient() throws Exception {
		
		FastDFSClient fastDFSClient = new FastDFSClient("C:/WorkSpace4E3Mall/E3Mall/e3-manager-web/src/main/resources/conf/client.conf");
		String string01 = fastDFSClient.uploadFile("C:/Tmp/01.jpg");
		System.out.println(string01);
		
		String string02 = fastDFSClient.uploadFile("C:/Tmp/02.jpg");
		System.out.println(string02);
		
	}	
	
}
