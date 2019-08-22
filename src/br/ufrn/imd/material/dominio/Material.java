package br.ufrn.imd.material.dominio;

import java.sql.Date;

public class Material 
{
	private int id;
	private String codigo;
	private Date dataCadastro;
	private Usuario usuarioCadastro;
	
	public Usuario getUsuarioCadastro() 
	{
		return usuarioCadastro;
	}
	
	public void setUsuarioCadastro(Usuario usuarioCadastro)
	{
		this.usuarioCadastro = usuarioCadastro;
	}
	
}
