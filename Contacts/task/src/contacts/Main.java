package contacts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Contacts {
    final ArrayList<String> firstName = new ArrayList<>();
    final ArrayList<String> lastName = new ArrayList<>();
    final ArrayList<String> phoneNumber = new ArrayList<>();

    public Contacts() {
    }

    public void addContact(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> phoneNumber) {
        this.firstName.addAll(firstName);
        this.lastName.addAll(lastName);
        this.phoneNumber.addAll(phoneNumber);
        System.out.println("The record added.");

    }

    public void editFirstName(int number, String firstName) {
        this.firstName.set(number - 1, firstName);
        System.out.println("The record updated!");
    }

    public void editLastName(int number, String lastName) {
        this.lastName.set(number - 1, lastName);
        System.out.println("The record updated!");
    }

    public void editPhoneNumber(int number, String phoneNumber) {
        this.phoneNumber.set(number - 1, phoneNumber);
        System.out.println("The record updated!");
    }

    public int countRecords() {
        return this.firstName.size();
    }

    public void removeContact(int number) {
        this.firstName.remove(number - 1);
        this.lastName.remove(number - 1);
        this.phoneNumber.remove(number - 1);
        System.out.println("The record removed!");
    }

    public boolean hasNumber(String phoneNumber) {
        boolean hasNumber = true;
        String number = phoneNumber;

        number = number.replace("-", " ");
        String[] numberByParts = number.split(" ");

        Pattern moreThenOneParentheses = Pattern.compile(".*\\(.*\\(.*");
        Pattern firstGroupPattern = Pattern.compile("(^\\+?\\([0-9a-zA-Z]+\\))|(^\\+?[0-9a-zA-Z]+)");
        Pattern secondGroupPattern = Pattern.compile("(^\\([0-9a-zA-Z]{2,}\\))|(^\\+?[0-9a-zA-Z]{2,})");
        Pattern otherGroupPattern = Pattern.compile("^[0-9a-zA-Z]{2,}$");

        Matcher matcher;
        matcher = moreThenOneParentheses.matcher(number);
        hasNumber = !matcher.matches();

        for (int i = 0; i < numberByParts.length; i++) {
            if (hasNumber == false) {
                break;
            }
            switch (i) {
                case 0: {
                    matcher = firstGroupPattern.matcher(numberByParts[i]);
                    hasNumber = matcher.matches();
                    break;
                }
                case 1: {
                    matcher = secondGroupPattern.matcher(numberByParts[i]);
                    hasNumber = matcher.matches();
                    break;
                }
                default: {
                    matcher = otherGroupPattern.matcher(numberByParts[i]);
                    hasNumber = matcher.matches();
                    break;
                }
            }
        }
        return hasNumber;
    }

    @Override
    public String toString() {
        String output = "";
        int lineNumber = 1;
        for (int i = 0; i < firstName.size(); i++) {
            output = output.concat(lineNumber + ". " + firstName.get(i) + " " + lastName.get(i) + ", " + phoneNumber.get(i) + "\n");
            lineNumber++;
        }
        return output;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contacts contacts = new Contacts();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

        String phoneNumber;
        String inputAction;
        boolean exit = false;
        String actionText = "Enter action (add, remove, edit, count, list, exit):";
        int selectedNumber = -1;


        do {
            System.out.println(actionText);
            inputAction = scanner.nextLine();

            switch (inputAction) {
                case "add": {
                    System.out.println("Enter the name:");
                    firstNames.add(scanner.nextLine());
                    System.out.println("Enter the surname:");
                    lastNames.add(scanner.nextLine());
                    System.out.println("Enter the number:");
                    phoneNumber = scanner.nextLine();

                    if (!contacts.hasNumber(phoneNumber)) {
                        phoneNumber = "[no number]";
                        System.out.println("Wrong number format!");
                    }
                    phoneNumbers.add(phoneNumber);

                    contacts.addContact(firstNames, lastNames, phoneNumbers);
                    firstNames.clear();
                    lastNames.clear();
                    phoneNumbers.clear();

                    break;
                }
                case "remove": {
                    if (contacts.countRecords() == 0) {
                        System.out.println("No records to remove!");
                        break;
                    }
                    System.out.print(contacts.toString());
                    System.out.println("Select a record:");
                    selectedNumber = scanner.nextInt();
                    scanner.nextLine();
                    contacts.removeContact(selectedNumber);
                    selectedNumber = -1;
                    break;
                }

                case "edit": {
                    if (contacts.countRecords() == 0) {
                        System.out.println("No records to edit!");
                        break;
                    }
                    System.out.print(contacts.toString());
                    System.out.println("Select a record:");
                    selectedNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Select a field (name, surname, number):");
                    switch (scanner.nextLine()) {
                        case "name": {
                            System.out.println("Enter name:");
                            contacts.editFirstName(selectedNumber, scanner.nextLine());
                            break;
                        }
                        case "surname": {
                            System.out.println("Enter surname:");
                            contacts.editLastName(selectedNumber, scanner.nextLine());
                            break;

                        }
                        case "number": {
                            System.out.println("Enter number:");
                            phoneNumber = scanner.nextLine();
                            if (!contacts.hasNumber(phoneNumber)) {
                                phoneNumber = "[no number]";
                                System.out.println("Wrong number format!");
                            }
                            contacts.editPhoneNumber(selectedNumber, phoneNumber);
                            break;

                        }
                        default: {
                            System.out.println("Wrong field!");
                            break;
                        }
                    }
                    selectedNumber = -1;
                    break;
                }
                case "count": {
                    System.out.println("The Phone Book has " + contacts.countRecords() + " records.");
                    break;
                }

                case "list": {
                    System.out.print(contacts.toString());
                    break;
                }

                case "exit": {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Wrong action!");
                    break;
                }

            }


        } while (!exit);

    }

}
