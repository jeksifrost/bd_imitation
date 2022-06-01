import java.util.List;
import java.util.Map;

public class Entity {

    private List<String> data;
    private Map<Integer, List<String>> field;

    public Entity(List<String> data, Map<Integer, List<String>> field) {
        this.data = data;
        this.field = field;
    }

    public Map<Integer, List<String>> getField() {
        return field;
    }

    public void setField(Map<Integer, List<String>> field) {
        this.field = field;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
