package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.Contoller.PayRollOperationController;
import com.nt.model.Hospital;

@SpringBootApplication
@ComponentScan(basePackages="com.nt")
public class BootProj03MiniProjectHospitalManagementApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03MiniProjectHospitalManagementApplication.class, args);
		PayRollOperationController controller=ctx.getBean("payroll",PayRollOperationController.class);
		try {
			List<Hospital> list=controller.showallhospitalbydesg("Mumbai", "Bangalore", "Chennai");
			list.forEach(hosp->
				System.out.println(hosp));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

	}


