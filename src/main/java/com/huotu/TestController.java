package com.huotu;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huotu.dataSource1.service.Service;
import com.huotu.dataSource2.service.Service2;
import com.huotu.dataSource3.service.Service3;
import com.huotu.entity.data1.Data1;
import com.huotu.entity.data2.Demo;
import com.huotu.entity.data3.Value;


@Controller
@RequestMapping(value="/")
public class TestController {
	@Resource
	private Service service;
	@Resource
	private Service2 service2;
	@Resource
	private Service3 service3;
	@RequestMapping(value="index")
	public Object index(Model model){
		Data1 data1 = new  Data1();
		Demo demo = new Demo();
		data1.setName("data1");
		service.save(data1);
		demo.setName("demo");
		demo.setValue("demo_value"); 
		data1.setName("data22222222");
		service.save(data1, demo);
		Value val = new Value();
		val.setValue("value_value");
		service3.save(val);
		return "index";
	}
}
