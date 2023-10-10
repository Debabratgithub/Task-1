package in.springboot.web.user;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

	@Column(name="dist")
	private String dist;
	
	@Column(name="block")
	private String block;
	
	@Column(name="gramaPanchayat")
	private String gramaPanchayat;
	
	@Column(name="grama")
	private String grama;
	
	@Column(name="pinCode")
	private int pinCode;
	
	@Column(name="abedankariName")
	private String abedankariName;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="motherName")
	private String motherName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="maritalSatus")
	private String maritalSatus;
	
	@Column(name="samajikaBarga")
	private String samajikaBarga;
	
	@Column(name="vinnakhyama")
	private String vinnakhyama;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="mNo")
	private Long mNo;
	
	@Id
	@Column(name="adharNo")
	private Long adharNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="occupation")
	private String occupation;
	
}
