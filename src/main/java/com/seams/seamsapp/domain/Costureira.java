package com.seams.seamsapp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Costureira {
	
	private Integer id;
	private String nome; 
	private List<MaquinaCostura> maquinas = new ArrayList<>();
	private String ninscricaoMei;
	private Date dataIncricaoApp;
	private String protocoloTermoDeUso;
	
	
}
