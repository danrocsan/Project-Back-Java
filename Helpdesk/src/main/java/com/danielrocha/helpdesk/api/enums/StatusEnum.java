package com.danielrocha.helpdesk.api.enums;

public enum StatusEnum {
	
	New,
	Assingned,
	Resolved,
	Aprovado,
	Disaproved,
	Closed
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "New":return New;
		break;			
		case "Assingned":return Assingned;
		break;
		case "Resolved":return Resolved;
		break;
		case "Aprovado":return Aprovado;
		break;
		case "Disaproved":return Disaproved;
		break;
		case "Closed":return Closed;
		break;

		default:
			break;
		}
	}
	
	

}
