package com.poly.service;

import java.util.List;

import com.poly.entity.Account;


public interface AccountService {
	
	public Account findById(String username);
	public List<Account> getAdministrators();
	public List<Account> findAll();
	public Account create(Account account);
	public Account update(Account account);
	public void delete(String username);
}	
