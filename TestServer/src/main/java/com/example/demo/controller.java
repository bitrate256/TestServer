package com.example.demo;

import com.example.domain.Assets;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {
    // 작동여부 확인
    @RequestMapping("/")
    public String getMesssage(){
        return "Hello";
    }
    
    // true false 로 리턴할 것
    @GetMapping("/MobData")
    public List<Assets> search() {
        ArrayList<Assets> arrayList = new ArrayList<Assets>();

        Assets assets = new Assets();
        // 데모 데이터
        assets.setAsset_no("BNO_0000_T");
        assets.setAsset_type_code("1");
        assets.setUser_name("1");

        arrayList.add(assets);
        return arrayList;
    }
}
