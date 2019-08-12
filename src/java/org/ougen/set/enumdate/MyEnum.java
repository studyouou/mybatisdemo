package org.ougen.set.enumdate;

import org.ougen.set.model.Student;

/**
 * Author: OuGen
 * Discription:
 * Date: 22:18 2019/7/22
 */
public enum MyEnum {
    fale(0,"男"),
    famele(1,"女");
    MyEnum(int code,String gender){
        this.code=code;
        this.gender=gender;
    }
    private String gender;
    private int code;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static MyEnum getFamat(int code){
        for (MyEnum myEnum:MyEnum.values()){
            if (myEnum.getCode()==0){
                return MyEnum.fale;
            }
            if (myEnum.getCode()==1){
                return MyEnum.famele;
            }
        }
        return null;
    }
}
