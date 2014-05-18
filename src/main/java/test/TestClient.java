/**
 * 
 */
package test;

import my.code.jax.ws.userService.UserServiceAgent;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author pud
 * 
 */
public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"file:/workspace/rock/jax-ws-test/src/main/webapp/WEB-INF/spring/jax-ws-client.xml");
		UserServiceAgent service = (UserServiceAgent) context
				.getBean("UserServiceClient");
		String response = service.addPerson("haha");
		System.out.println(response);
	}

}
