/**
 * ClassName: BigStar
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 12:11
 * @Version 1.0
 */
public class BigStar implements star{

    private String singName;
    private String danceName;

    public BigStar(String singName, String danceName) {
        this.singName = singName;
        this.danceName = danceName;
    }

    public String getSingName() {
        return singName;
    }

    public void setSingName(String singName) {
        this.singName = singName;
    }

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    @Override
    public void sing() {

        System.out.println("正在唱" + this.singName);
    }

    @Override
    public void dance() {
        System.out.println("正在跳" + this.danceName);
    }
}
