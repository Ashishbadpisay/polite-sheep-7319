package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EngineerDao;
import com.masai.dao.EngineerDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class LoginEngineerUseCase {
	
	public static void main(String[] args)throws EmployeeException, MyException, HodException, ComplainException {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Username : ");
		String username = sc.next();
		
		System.out.println("Enter Your Password : ");
		String password = sc.next();
		
		
		EngineerDao ed = new EngineerDaoImpl();
		
		
		
		try {
			
			String res = ed.loginEngineer(username, password);
			System.out.println(res);
			EngineerDriver.main(args);
		} catch (EngineerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
