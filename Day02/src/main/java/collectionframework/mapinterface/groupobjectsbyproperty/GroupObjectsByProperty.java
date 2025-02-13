package collectionframework.mapinterface.groupobjectsbyproperty;
import java.util.*;

public class GroupObjectsByProperty {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentMap.putIfAbsent(employee.department, new ArrayList<>());
            departmentMap.get(employee.department).add(employee);
        }

        return departmentMap;
    }
}
