/**
 * 
 */
package com.pigihi.library.dataConverter.service;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * @author Ashish Sam T George
 *
 */
@Component
public class DataConverter {
	
	public String convertToJson(Object userModel) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(userModel);
		return jsonString;
	}

}
