package ZP_nasledovanye.daoimpl;



import ZP_nasledovanye.entity.EntEmployee;

import java.util.ArrayList;
import java.util.List;

public class DaoEmployeeImpl {
    private final List<EntEmployee> entEmployeeList;// список сотрудников

    public DaoEmployeeImpl() {
        entEmployeeList = new ArrayList<>();// инициализируем список, в котором будут храниться все сотрудники
    }

    /**
     * Добавляет нового сотрудника
     * @param employee объект сотрудника для добавления
     * @return true в случае успеха
     */
    public boolean addEmployee(EntEmployee employee) {
        return entEmployeeList.add(employee);
    }

    /**
     * Возвращает сотрудника с указанным номером в коллекции
     * @param index номер сотрудника в коллекции
     * @return сотрудник с указанным номером
     */
    public EntEmployee getEmployee(int index) {
        return entEmployeeList.get(index);
    }

    /**
     * Возвращает список всех сотрудников в коллекции
     * @return список всех сотрудников
     */
    public List<EntEmployee> getAllEmployee() {
        return entEmployeeList;
    }

    /**
     * Возвращет количество сотрудников в коллекции
     * @return целое количество сотрудников в коллекции
     */
    public int getCount() {
        return entEmployeeList.size();
    }

    /**
     * Удаляет сотрудника с указанным номером из коллекции
     * @param index номер сотрудника для удаления
     * @return объект сотрудника, который был удалён
     */
    public EntEmployee removeEntEmployee(int index) {
        return entEmployeeList.remove(index);
    }

    /**
     * Удаляет заданного сотрудника из коллекции
     * @param employee объект сотрудника для удаления
     * @return true в случае успеха
     */
    public boolean removeEntEmployee(EntEmployee employee) {
        return entEmployeeList.remove(employee);
    }
}
