package com.frugalbin.common.rest.client;

import play.libs.F.Promise;
import play.libs.Json;
import play.libs.WS;
import play.libs.WS.Response;
import play.libs.WS.WSRequestHolder;

import com.fasterxml.jackson.databind.JsonNode;
import com.frugalbin.common.exceptions.BusinessException;

public class RestClient
{
	public static Promise<Response> sendRequest(RestClientProtocolInterface restClientProtocol, String... params)
			throws BusinessException
	{
		if (!RequestType.GET.equals(restClientProtocol.getReqType()))
		{
			throw new BusinessException(1001, "Requests other than GET requires reqNode");
		}

		String finalUrl = getFinalUrl(restClientProtocol, params);

		WSRequestHolder requestHolder = WS.url(finalUrl);

		Promise<Response> res = requestHolder.get();

		return res;
	}

	public static Promise<Response> sendRequest(RestClientProtocolInterface restClientProtocol, JsonNode reqNode,
			String... params) throws BusinessException
	{
		String finalUrl = getFinalUrl(restClientProtocol, params);
		WSRequestHolder requestHolder = WS.url(finalUrl);

		Promise<Response> res = null;
		switch (restClientProtocol.getReqType())
		{
			case POST:
				res = requestHolder.post(reqNode);
				break;
			case PUT:
				res = requestHolder.put(reqNode);
				break;
			default:
				break;
		}

		return res;
	}

	public static Promise<Response> sendRequest(RestClientProtocolInterface restClientProtocol, Object reqObject,
			String... params) throws BusinessException
	{
		return sendRequest(restClientProtocol, Json.toJson(reqObject), params);
	}

	private static String getFinalUrl(RestClientProtocolInterface restClientProtocol, String[] paramsValue)
			throws BusinessException
	{
		String[] params = restClientProtocol.getParams();
		if (params.length > paramsValue.length)
		{
			throw new BusinessException(1001, "Less num of params passed for " + restClientProtocol.getName()
					+ " : req=" + params.length + ", passed=" + paramsValue.length);
		}

		String finalUrl = restClientProtocol.getUrl();

		if (params.length > 0)
		{
			for (int i = 0; i < params.length && i < paramsValue.length; i++)
			{
				finalUrl = finalUrl.replace(params[i], paramsValue[i]);
			}
		}

		return finalUrl;
	}
}
