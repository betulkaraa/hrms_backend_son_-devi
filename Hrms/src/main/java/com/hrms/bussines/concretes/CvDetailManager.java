package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvDetailService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.CvDetailsDao;
import com.hrms.entity.concretes.CvDetail;

@Service
public class CvDetailManager implements CvDetailService{
	private CvDetailsDao cvDetailsDto;
	@Autowired
	public CvDetailManager(CvDetailsDao cvDetailsDto) {
		super();
		this.cvDetailsDto = cvDetailsDto;

}
	@Override
	public DataResult<List<CvDetail>> getAll() {
 		return new SuccessDataResult<List<CvDetail>>(this.cvDetailsDto.findAll(),"İşlem Başarılı");

	}
	@Override
	public Result add(CvDetail cvDetail) {
		this.cvDetailsDto.save(cvDetail);
		return new  SuccessResult("İşlem Başarılı");
	}
	@Override
	public DataResult<List<CvDetail>> getByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<CvDetail>>(this.cvDetailsDto.getByEmployee_employeeId(employeeId),"İşlem Başarılı");

	}
	 
}