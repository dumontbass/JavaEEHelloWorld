package mybeans;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: guilherme
 * Date: 2/27/14
 * Time: 2:19 AM
 * To change this template use File | Settings | File Templates.
 */
@Stateless(name = "HelloWorldEJB")
public class HelloWorldBean {
    public HelloWorldBean() {
    }
    public String sayHello() {
        return "Hello, World! sdfsdf";
    }
}
