public class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx;

    public void add(Lecturer lecturer){
        if (idx < lecturerData.length) {
            lecturerData[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    public void print(){
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingAsc(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDsc(){
        for (int i = 1; i < idx; i++) {
            Lecturer temp = lecturerData[i];
            int j = i;
            while (j > 0 && lecturerData[j-1].age < temp.age) {
                lecturerData[j] = lecturerData[j-1];
                j--;
            }
            lecturerData[j] = temp;
        }
    }


}
