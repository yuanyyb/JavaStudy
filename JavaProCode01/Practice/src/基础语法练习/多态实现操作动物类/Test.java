package 基础语法练习.多态实现操作动物类;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        AbstractAnimalOperator aOp = new AbstractAnimalOperator();
        aOp.opAnimal(c);

        InterfaceAnimalOperator iOp = new InterfaceAnimalOperator();
        iOp.opAnimal(c);
    }

}
