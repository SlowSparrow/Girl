package imooc.domain;



/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
public class Girl {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return id+"/"+name;
    }

}
