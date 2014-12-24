package aufgabe3;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Statistics implements Reportable{
	private String header;
	private List<String> legend;
	private Map <String, List<Integer>> lines;
	
	Statistics(String header, String[] legend){
		this.header = header;
		
		this.legend = new LinkedList<String>();
		this.lines = new TreeMap<String, List<Integer>>();
		
		for(String s : legend){
			this.legend.add(s);
		}
	}
	
	public String getHeader(){
		return header;
	}
	
	public List<String> getLegend(){
		return legend;
	}
	
	public Map<String, List<Integer>> getLines(){
		return lines;
	}
	
	public void addLine(String land, int[] values){
		if (lines.keySet().contains(land)){
			return;
		}
		
		// ab hier land nicht vorhanden
		// Variante 1
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(Integer i: values){
			list.add(i);
		}
		
		lines.put(land, list);
		// Variante 1 ende
		
		// Variante 2:
		lines.put(land, new LinkedList<Integer>());
		for(Integer i: values){
			lines.get(land).add(i);
		}
		
	}
}
