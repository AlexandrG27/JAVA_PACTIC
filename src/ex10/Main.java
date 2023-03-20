package ex10;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private Comparator<Student10> cmp;
    private Student10[] idNumber;
    public Main(Comparator<Student10> comp, Student10[] s) {
        cmp=comp.reversed();
        idNumber =s;
    }

    public void setCmp(Comparator<Student10> cmp) {
        this.cmp = cmp.reversed();
    }
    public void setArray(Student10[] s){
        idNumber =s;
    }
    public void outArray(){
        for(Student10 s : idNumber)
            System.out.println(s);
    }
    private int partition(Student10[] s, int left, int right){
        Student10 pivot = s[(left+right)/2];
        int i=left;
        int j=right;
        for(;;){
            while(cmp.compare(s[i], pivot)<0)
                i++;
            while(cmp.compare(pivot, s[j])<0)
                j--;
            if(i>=j) break;
            Student10 tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
        }
        return j;
    }
    private void _qsort(Student10[] s, int left, int right){
        if(left<right) {
            int p = partition(s, left, right);
            _qsort(s, left, p);
            _qsort(s, p + 1, right);
        }
    }
    private void merge(Student10[] s, Student10[] a, Student10[] b, int left, int right){
        int i=0, j=0, k=0;
        while(i<left && j<right){
            if(cmp.compare(a[i], b[j])<0)
                s[k++]=a[i++];
            else
                s[k++]=b[j++];
        }
        while(i<left)
            s[k++]=a[i++];
        while(j<right)
            s[k++]=b[j++];
    }
    private void msort(Student10[] s, int n){
        if(n<2) return;
        int mid = n/2;

        Student10[] left = new Student10[mid];
        Student10[] right = new Student10[n-mid];

        for(int i=0;i<mid;++i)
            left[i]=s[i];
        for(int i=mid;i<n;++i)
            right[i-mid]=s[i];
        msort(left, mid);
        msort(right, n-mid);
        merge(s, left, right, mid, n-mid);
    }
    public void quicksort(){
        _qsort(idNumber, 0, idNumber.length-1);
    }
    public void mergeSort(){
        msort(idNumber, idNumber.length);
    }
    public void mergeAndSort(Student10[] s1, Student10[] s2){
        merge(new Student10[s1.length+s2.length], s1, s2, s1.length, s2.length);
        mergeSort();
    }


    public static void main(String[] args) {
        Student10[] students = new Student10[5];
        students[0]=new Student10("Александр", "Гилас", "Тестировщик", 2, "ИВБО-03-21");
        students[1]=new Student10("Дмитрий", "Булкин", "Программист", 4, "ИВБО-03-19");
        students[2]=new Student10("Марк ", "Совел     ", "Инфобез    ", 5, "БСБО-08-18");
        students[3]=new Student10("Иван  ", "Иванов     ", "Филолог    ", 3, "ИВБО-09-20");
        students[4]=new Student10("Витя  ", "Тудзинков", "Историк    ", 1, "ИВБО-07-22");
        System.out.println("Выберите по какому полю сортировать:");
        System.out.println("1) имя\n2) Фамилия\n3) Специальность\n4) Курс\n5) Группа");
        Scanner scanner = new Scanner(System.in);

        Comparator<Student10> cmp;
        while(true){
            int choice = scanner.nextInt();
            if(choice==1) {
                cmp = Comparator.comparing(Student10::getFirstName);
                break;
            }else if(choice==2) {
                cmp = Comparator.comparing(Student10::getLastName);
                break;
            }else if(choice==3) {
                cmp = Comparator.comparing(Student10::getSpeciality);
                break;
            }else if(choice==4) {
                cmp = Comparator.comparing(Student10::getGrade);
                break;
            }else if(choice==5) {
                cmp = Comparator.comparing(Student10::getGroup);
                break;
            }else System.out.println("Нет такого варианта");
        }
        Main main = new Main(cmp, students);
        main.quicksort();
        //main.mergeSort();

        main.outArray();
    }
}