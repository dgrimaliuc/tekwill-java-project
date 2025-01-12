package main.java.cristinamocanu.exceptions;

class PersonalNumberException extends RuntimeException {

        public PersonalNumberException(String message) {
            super(message);
        }


        public PersonalNumberException() {
            super();
        }
    }

class Scanner {
    public Scanner(String s) {

    }

    public static void main(String[] args) {

            java.util.Scanner scanner = new java.util.Scanner(System.in);


            System.out.print("Write a number: ");
            String input = scanner.nextLine();

            try {

                int numar = Integer.parseInt(input);
                System.out.println("Number is: " + numar);
            } catch (NumberFormatException e) {
                throw new PersonalNumberException ("Impossible to parse int from string: " + input);
            } finally {
                scanner.close();
            }
        }
    }


