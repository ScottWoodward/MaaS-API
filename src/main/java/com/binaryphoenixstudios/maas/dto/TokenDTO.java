package com.binaryphoenixstudios.maas.dto;

import java.util.ArrayList;
import java.util.List;

public class TokenDTO
{
	protected String tokenValue;
	protected List<String> previousTokens = new ArrayList<>();
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	// Getters & Setters
	//
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getTokenValue()
	{
		return tokenValue;
	}
	
	public void setTokenValue(String tokenValue)
	{
		this.tokenValue = tokenValue;
	}
	
	public List<String> getPreviousTokens()
	{
		return previousTokens;
	}
	
	public void setPreviousTokens(List<String> previousTokens)
	{
		this.previousTokens = previousTokens;
	}
}
