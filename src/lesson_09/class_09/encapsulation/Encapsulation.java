package lesson_09.class_09.encapsulation;

public class Encapsulation {
        private String privateEncapsulation = "private";
        public String publicEncapsulation = "public";
        final String defaultEncapsulation = "default = package private"; // package private
        protected String protectedEncapsulation = "protected";

        final int[] arr = {1, 2, 3, 4, 5, 6};
        final int CONSTANT_5 = 5; // use capital letters for constants

        private void privateMethod() {
            System.out.println(privateEncapsulation);
        }

        public void publicMethod() {
            System.out.println(publicEncapsulation);
            privateMethod();
        }

        void defaultMethod() {
            System.out.println(defaultEncapsulation);
        }

        protected void protectedMethod() {
            System.out.println(protectedEncapsulation);
        }
        // Getters and Setters
        public String getPrivateEncapsulation() {
            return privateEncapsulation;
        }

        public void setPrivateEncapsulation(String privateEncapsulation) {
            this.privateEncapsulation = privateEncapsulation;
        }

}
