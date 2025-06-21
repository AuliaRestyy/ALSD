public class BinaryTreeArray04 {
    Student04[] data;
    int idxLast;

    public BinaryTreeArray04() {
        data = new Student04[10];
        idxLast = -1;
    }

    void populateData(Student04[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Student04 student) {
        if (idxLast == -1) {
            idxLast = 0;
            data[idxLast] = student;
            return;
        }

        int idx = 0;
        while (idx <= idxLast && idx < data.length) {
            if (student.ipk < data[idx].ipk) {
                int leftIdx = 2 * idx + 1;
                if (leftIdx >= data.length) break;
                if (data[leftIdx] == null) {
                    data[leftIdx] = student;
                    if (leftIdx > idxLast) idxLast = leftIdx;
                    return;
                } else {
                    idx = leftIdx;
                }
            } else if (student.ipk > data[idx].ipk) {
                int rightIdx = 2 * idx + 2;
                if (rightIdx >= data.length) break;
                if (data[rightIdx] == null) {
                    data[rightIdx] = student;
                    if (rightIdx > idxLast) idxLast = rightIdx;
                    return;
                } else {
                    idx = rightIdx;
                }
            } else {
                return;
            }
        }
        System.out.println("Tree is full or structure too deep for array size");
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
