package org.codefromhell.test.repoloading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private static final long serialVersionUID = -2196474439743112850L;

    @Id
    @GeneratedValue
    private Long id;

    private String key;

    private String val01;

    private String val02;

    public Long getId() {
        return id;
    }

    public Data() {
    }

    public Data(String key, String val01, String val02) {
        this.key = key;
        this.val01 = val01;
        this.val02 = val02;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVal01() {
        return val01;
    }

    public void setVal01(String val01) {
        this.val01 = val01;
    }

    public String getVal02() {
        return val02;
    }

    public void setVal02(String val02) {
        this.val02 = val02;
    }
}
