package modulo3.exercicio.xml;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class LeitorDeXml {
	
	private XStream xs;

	public LeitorDeXml() {
		xs = new XStream(new DomDriver());
	}

	@SuppressWarnings("unchecked")
	public List<Negocio> le(Reader reader) {
		xs.alias("negocio", Negocio.class);
		return (List<Negocio>) xs.fromXML(reader);
	}

	public void escreve(Negocio negocio, Writer writer) {
		try {
			xs.alias("negocio", Negocio.class);
			writer.write(xs.toXML(negocio));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
