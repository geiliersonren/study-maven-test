import org.junit.Test;

/**
 * ClassName: TestProxy
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 12:22
 * @Version 1.0
 */
public class TestProxy {

    @Test
    public void testProxy01() {

        BigStar star = new BigStar("玫瑰花的葬礼","劲舞团");

        star bigStarProxy = ProxyUtil.bigStarProxy(star);
        bigStarProxy.sing();
        bigStarProxy.dance();
    }
}
