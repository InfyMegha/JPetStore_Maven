package com.olam.score.cost.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olam.score.common.dto.Link;
import com.olam.score.common.dto.ResponseData;
import com.olam.score.common.service.UtilService;
import com.olam.score.common.util.Mapping;
import com.olam.score.cost.dto.MasterCostDto;
import com.olam.score.cost.service.BasicCostService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@Mapping(featureName = "COST")
@RequestMapping(value = "/cost/costService/basicCost")
@Api(value = "COST", description = "Basic Cost Realted Information")
public class BasicCostController {
	@Autowired
	BasicCostService service;
	@Autowired
	UtilService utilService;
	@ApiOperation(value = "Create a Cost Master", response = MasterCostDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "User is not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource user is trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource user is trying to reach is not found") })
	@RequestMapping(value = "", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<ResponseData<String>> addCost(@Valid @RequestBody MasterCostDto body)throws ParseException  {
		ResponseData<String> rsp = new ResponseData<>();
    	rsp.setBody(service.create(body));
    	return new ResponseEntity<>(rsp, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Update a Cost Master", response = MasterCostDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "User is not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource user is trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource user is trying to reach is not found") })
	@RequestMapping(value="", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<ResponseData<String>> updateCost(@Valid @RequestBody MasterCostDto body) {

		ResponseData<String> rsp = new ResponseData<>();
	   	rsp.setBody(service.update(body));
	   	return new ResponseEntity<>(rsp, HttpStatus.OK);
	}
	
	@ApiOperation(value = "view a Cost Master", response = MasterCostDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "User is not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource user is trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource user is trying to reach is not found") })
	@RequestMapping(value = "", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseData<List<MasterCostDto>>> getBasicCostDetails() {
		ResponseData<List<MasterCostDto>> rsp = new ResponseData<>();
		rsp.setBody(service.readAll());
		return new ResponseEntity<ResponseData<List<MasterCostDto>>>(rsp, HttpStatus.OK);
    
	}
	
	
	
	
	@RequestMapping(value = "/{costId}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseData<List<MasterCostDto>>> getCnfCostDetailsById(
			@PathVariable("costId") Integer costId) {
		
		ResponseData<List<MasterCostDto>> rsp = new ResponseData<>();
		List<Link<?>> links = utilService.getFeatures(this.getClass());
		try {
		List<MasterCostDto> dtoList=service.readById(costId);
		rsp.setBody(service.readById(costId));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		rsp.setLinks(links);
		return new ResponseEntity<ResponseData<List<MasterCostDto>>>(rsp, HttpStatus.OK);
	}
	@RequestMapping(value = "/basicDetails/{costId}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseData<MasterCostDto>> getCostBasicDetailsById(
			@PathVariable("costId") Integer costId) {
		
		ResponseData<MasterCostDto> rsp = new ResponseData<>();
		List<Link<?>> links = utilService.getFeatures(this.getClass());
		rsp.setBody(service.returnBasicDetailsOfCost(costId));
		rsp.setLinks(links);
		return new ResponseEntity<ResponseData<MasterCostDto>>(rsp, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Delete secPack based on the id in Cost Master", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "User is not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource user is trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource user is trying to reach is not found") })
	@RequestMapping(value = "/{costId}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseData<String>>  deleteCost(@PathVariable("costId") int costId) throws ParseException {

		ResponseData<String> rsp = new ResponseData<>();
		List<Link<?>> links = utilService.getFeatures(this.getClass());
		rsp.setBody(service.delete(costId));
		rsp.setLinks(links);
		return new ResponseEntity<>(rsp, HttpStatus.OK);
	}
	
	

}
