package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Serializador {
	
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Conta.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Thiago Vieira");
		
		Conta conta = new Conta();
		conta.setLimite(2000);
		conta.setSaldo(2000);
		conta.setCliente(cliente);
		
		marshaller.marshal(conta, new File("conta.xml"));
	}

}
