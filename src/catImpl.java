public class catImpl implements Comparable<cat> {
        private String name;
        private int age;

        public catImpl(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    @Override
    public int compareTo(cat o) {
        return 0;
    }
}
