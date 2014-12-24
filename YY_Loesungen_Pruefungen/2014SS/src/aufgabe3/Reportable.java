package aufgabe3;

import java.util.List;
import java.util.Map;

public interface Reportable {
	String getHeader();
	List<String> getLegend();
	Map <String, List<Integer>> getLines();
}
