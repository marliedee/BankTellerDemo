package org.pursuit;

import java.util.*;


public class BankTeller {
    Scanner sc = new Scanner(System.in);

    String newClient;

    public void setNewClient(String newClient) {
        this.newClient = newClient;
    }

    public String getNewClient() {
        return newClient;
    }

    int newClientBalance;

    public int getNewClientBalance() {
        return newClientBalance;
    }

    public void setNewClientBalance(int newClientBalance) {
        this.newClientBalance = newClientBalance;
    }

    private HashMap<String, Integer> clientsData = new HashMap<String, Integer>();

    public HashMap<String, Integer> getClientsData() {
        return clientsData;
    }

    public void setClientsData(HashMap<String, Integer> clientsData) {
        this.clientsData = clientsData;
    }


    private HashSet<String> user = new HashSet<>();

    public HashSet<String> getUser() {
        return user;
    }

    private ArrayList<String> listOfClients = new ArrayList<>();

    public ArrayList<String> getListOfClients() {
        return listOfClients;
    }

    public void setListOfClients(ArrayList<String> listOfClients) {
        this.listOfClients = listOfClients;
    }


    public void initialize() {
        getCredentials();
        accountNames();
        makeAccountName();
        addToClientBalance();
        viewClientAccounts();
        depositWithdrawAccounts();
        changeClientBalances();
        userSignout();

    }

    private void getCredentials() {
        System.out.println("Please enter your UserName and Password:");
        user.add("OLIVIA POPE");
        Scanner userNameInput = new Scanner(System.in);
        String username = userNameInput.nextLine();
        String id = "OLIVIA POPE";
        Scanner passwordInput = new Scanner(System.in);
        String password = passwordInput.nextLine();
        String pw = "GLADIATOR";

        if (password.equals(pw) && username.equals(id)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= 5; i++) {
                sb.append("*");
            }
            System.out.println("UserName entered correct." + "\t Password: " + sb);

        }

        while (!password.equals(pw) && !username.equals(id)) {
            System.out.println("Wrong input. Try again.");
            getCredentials();
            break;
        }

    }


    private String accountNames() {
        listOfClients.add("FITZGERALD GRANT");
        listOfClients.add("MELLIE GRANT");
        listOfClients.add("CYRUS BEENE");
        listOfClients.add("ROWAN POPE");
        listOfClients.add("JAKE BALLARD");
        System.out.println("\n Current list of clients are: " + "\n" + listOfClients);

        return "";


    }

    private String makeAccountName() {
        System.out.println("\nEnter First and Last name to create a new account: ");
        newClient = String.valueOf(listOfClients.add(sc.nextLine()));

        for (String newClientError : listOfClients) {
            if (newClient.equals(String.valueOf(listOfClients.contains(4)))) {
                System.out.println("\nClient exists. Retry entry.");
                return makeAccountName();
            }
        }
        System.out.println("\n" + getUser() + " has created a new account: " + listOfClients.get(5));
        System.out.println("\nNumber of clients is now : " + listOfClients.size());
        System.out.println(listOfClients);
        return "";
    }

    private String accountBalances() {


        return "";

    }

    private void addToClientBalance() {

        System.out.println("\nEnter balance amount for " + listOfClients.get(5) + ":");
        newClientBalance = sc.nextInt();

        clientsData.put("FITZGERALD GRANT", 14000000);
        clientsData.put("MELLIE GRANT", 10000000);
        clientsData.put("CYRUS BEENE", 540000);
        clientsData.put("ROWAN POPE", 614000000);
        clientsData.put("JAKE BALLARD", 760000);
        clientsData.put(listOfClients.get(5), newClientBalance);

        System.out.println("CURRENT ACCOUNT BALANCES ARE NOW: " + clientsData.entrySet());
    }


    private void viewClientAccounts() {

        System.out.println("\nEnter First and Last name to view account balance: ");
        Scanner getInfo = new Scanner(System.in);
        String userEntry = getInfo.nextLine();

        if (clientsData.containsKey(userEntry)) {
            System.out.println("CLIENT BALANCE: " + clientsData.get(userEntry));
        }
        if (!clientsData.containsKey(userEntry)) {
            System.out.println("\nClient does not exist. Retry entry.");
            System.out.println(clientsData.keySet());
            viewClientAccounts();
        }

    }

    private void depositWithdrawAccounts() {
        int result = 0;
        boolean viewBalanceInfoFitz = clientsData.containsValue(14000000);
        boolean viewBalanceInfoMellie = clientsData.containsValue(10000000);
        boolean viewBalanceInfoCyrus = clientsData.containsValue(540000);
        boolean viewBalanceInfoRowan = clientsData.containsValue(614000000);
        boolean viewBalanceInfoJake = clientsData.containsValue(760000);
        boolean viewBalanceInfoNewClient = clientsData.containsValue(newClientBalance);

        System.out.println("\nEnter First and Last name to enter DEPOSIT/WITHDRAW from account balance: ");
        Scanner getInfo = new Scanner(System.in);
        String userInput = getInfo.nextLine();

        System.out.println("\nEnter amount to DEPOSIT/WITHDRAW from " + userInput + " balance: ");
        int userInputChangeAccountBal = getInfo.nextInt();


        if (Boolean.parseBoolean(userInput) == clientsData.containsKey("FITZGERALD GRANT")) {
            result = 14000000 - userInputChangeAccountBal;

        } else {
            result = 14000000 + userInputChangeAccountBal;

        }
        System.out.println(userInput + " new balance is: " + result);

        if (Boolean.parseBoolean(userInput) == clientsData.containsKey("MELLIE GRANT")) {
            result = 10000000 - userInputChangeAccountBal;

        } else {
            result = 10000000 + userInputChangeAccountBal;

        }

        System.out.println(userInput + " new balance is: " + result);

        if (Boolean.parseBoolean(userInput) == clientsData.containsKey("CYRUS BEENE")) {
            result = 540000 - userInputChangeAccountBal;

        } else {
            result = 540000 + userInputChangeAccountBal;

        }

        System.out.println(userInput + " new balance is: " + result);

        if (Boolean.parseBoolean(userInput) == (clientsData.containsKey("ROWAN POPE"))) {
            result = 614000000 - userInputChangeAccountBal;

        } else {
            result = 614000000 + userInputChangeAccountBal;

        }
        System.out.println(userInput + " new balance is: " + result);


        if (Boolean.parseBoolean(userInput) == (clientsData.containsKey("JAKE BALLARD"))) {
            result = 760000 - userInputChangeAccountBal;

        } else {
            result = 760000 + userInputChangeAccountBal;

        }
        System.out.println(userInput + " new balance is: " + result);


        if (Boolean.parseBoolean(userInput) == (clientsData.containsKey(newClient))) {
            result = newClientBalance - userInputChangeAccountBal;

        } else {
            result = newClientBalance + userInputChangeAccountBal;

        }


        System.out.println(userInput + " new balance is: " + result);

    }


    private void changeClientBalances() {
        Scanner getInfo = new Scanner(System.in);

        System.out.println("\nEnter First and Last name to enter new account balance: ");
        String userEntryNew = getInfo.nextLine();

        System.out.println("\nEnter new account balance: ");
        int userEntryNewBal = getInfo.nextInt();

        if (clientsData.containsKey(userEntryNew)) {
            clientsData.put(userEntryNew, userEntryNewBal);

            System.out.println("\n" + clientsData.entrySet());

        }

    }

    private void userSignout() {
        System.out.println("\n Please type EXIT to sign out.");
        String userSignoutEntry = sc.nextLine();
        while (!userSignoutEntry.equals("EXIT")) {
            userSignout();
            break;
        }
    }
}





