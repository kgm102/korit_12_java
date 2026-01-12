package ch00_SelfStudy.정리1;

public class Prac014 {

    void print(){
        class TempPrinter{
            void printMsg() {
                System.out.println("임시 출력");
            }
        }

        TempPrinter printer = new TempPrinter();
        printer.printMsg();
    }
}
