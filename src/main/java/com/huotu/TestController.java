package com.huotu;

import javax.annotation.Resource;

import org.hibernate.engine.transaction.internal.jta.JtaTransactionFactory;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
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
		data1.setName("data1data1data1data1data1data1data1data1data1");
		//service.save(data1);
		service.upadte("data1data1data1data1data1data1data1data1data1", 1);
		//System.out.println(service.findById(1).getName());
		/*// 
		demo.setName("demo");
		demo.setValue("demo_value"); 
		service2.save(demo);
		data1.setName("data22222222"); 
		//service.save(data1, demo);
		Value val = new Value(); 
		val.setValue("value_value");   
		service3.save(val);*/
		model.addAttribute("data1", service.findById(1));
		return "index";
	}
}
