package com.frugalbin.common.utils;

import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.frugalbin.common.exceptions.BusinessException;
import com.frugalbin.common.exceptions.ErrorConstants;

public interface Utils
{
	/**
	 * Converts RequestBody to ObjectDto
	 * 
	 * @param requestBody
	 * @param clazz
	 * @return
	 * @throws BusinessException1
	 */
	public static <A> A convertJsonNodeToObject(JsonNode jsonNode, Class<A> clazz) throws BusinessException
	{
		try
		{
			return Json.fromJson(jsonNode, clazz);
		}
		catch (Exception ex)
		{
			ErrorConstants error = ErrorConstants.INVALID_REQUEST_DATA;
			throw new BusinessException(error.errorCode, error.errorMessage, ex.getCause());
		}
	}
}
