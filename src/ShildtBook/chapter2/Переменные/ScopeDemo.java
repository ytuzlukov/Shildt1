package ShildtBook.chapter2.����������;

public class ScopeDemo {
    public static void main(String[] args) {
        int x; // ��� ���������� �������� ��� ����� ���� � ������ main

        x = 10;
        if (x == 10) { //������ ����� ������� ��������

            int y = 20; //��� ���������� �������� ������ � ���� �����

            // ��� ���������� , � � � �������� � ������ ����� ����

            System.out.print("x & y : " + x + " " + y);
            x = y * 2; // x �������� ���� �������� � ��� �������� ��� ���
        }
       // y = 100; // y ����������
        System.out.println("\nx = " + x);//x ��������

    }
}