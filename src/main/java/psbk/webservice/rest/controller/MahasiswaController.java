package psbk.webservice.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import psbk.webservice.rest.model.Mahasiswa;
import psbk.webservice.rest.model.Status;

@RestController
public class MahasiswaController {

	private Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
	private Map<String, Mahasiswa> map = new HashMap<String, Mahasiswa>();

	@ResponseBody
	@RequestMapping(value = "/mhs/insert", method = RequestMethod.POST)
	public String insert(HttpServletRequest servletRequest,
			@RequestBody String json) {

		Mahasiswa mhs = gson.fromJson(json, Mahasiswa.class);
		map.put(mhs.getNrp(), mhs);

		Status status = new Status();
		status.setKode("200");
		status.setPesan("Mahasiswa Telah Berhasil Ditambahkan");

		return gson.toJson(status);
	}

	@ResponseBody
	@RequestMapping(value = "/mhs/find/{nrp}", method = RequestMethod.GET)
	public String find(HttpServletRequest servletRequest,
			@PathVariable("nrp") String nrp) {
		Mahasiswa mhs = map.get(nrp);
		if (mhs == null) {
			Status status = new Status();
			status.setKode("403");
			status.setPesan("Data tidak ditemukan");
			return gson.toJson(status);
		} else {
			return gson.toJson(mhs);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/mhs/findAll", method = RequestMethod.GET)
	public String findAll(HttpServletRequest servletRequest) {
		List<Mahasiswa> list = new ArrayList<Mahasiswa>();
		list.addAll(map.values());
		return gson.toJson(list);
	}

}
