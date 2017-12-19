package demo.example.com.chineseuniversitystudentsonline.Entiy;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 丁军明 on 2017/12/5.
 */
@Entity
public class MyTab {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    @Generated(hash = 1456722063)
    public MyTab(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 304291139)
    public MyTab() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
